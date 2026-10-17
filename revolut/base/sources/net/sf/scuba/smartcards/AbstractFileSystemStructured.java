package net.sf.scuba.smartcards;

/* JADX INFO: loaded from: classes14.dex */
public abstract class AbstractFileSystemStructured implements FileSystemStructured {
    public static final short MF_ID = 16128;
    private ISOFileInfo fileInfo;
    private int length;
    private int p2;
    private int selectLe;
    private short selectedFID;
    private CardService service;

    public AbstractFileSystemStructured(CardService cardService) {
        this.selectedFID = (short) 0;
        this.length = -1;
        this.p2 = 0;
        this.selectLe = 256;
        this.fileInfo = null;
        this.service = cardService;
    }

    private CommandAPDU createSelectFileAPDU(int i, int i2, byte[] bArr, int i3) {
        return i3 == 0 ? new CommandAPDU(0, -92, i, i2, bArr) : new CommandAPDU(0, -92, i, i2, bArr, i3);
    }

    private void selectFile(byte[] bArr, int i) throws CardServiceException {
        ResponseAPDU responseAPDUTransmit = this.service.transmit(createSelectFileAPDU(i, this.p2, bArr, this.selectLe));
        int sw10 = responseAPDUTransmit.getSW();
        byte[] data = responseAPDUTransmit.getData();
        if (sw10 != -28672) {
            throw new CardServiceException("File could not be selected.", sw10);
        }
        ISOFileInfo iSOFileInfo = new ISOFileInfo(data);
        this.fileInfo = iSOFileInfo;
        short s2 = iSOFileInfo.f214658fid;
        if (s2 != -1) {
            this.selectedFID = s2;
        }
        int i2 = iSOFileInfo.fileLength;
        if (i2 != -1) {
            this.length = i2;
        }
    }

    public int getFileLength() throws CardServiceException {
        return this.length;
    }

    public short getSelectedFID() {
        return this.selectedFID;
    }

    @Override // net.sf.scuba.smartcards.FileSystemStructured
    public abstract byte[] readBinary(int i, int i2);

    public void selectAID(byte[] bArr) throws CardServiceException {
        selectFile(bArr, 4);
    }

    public void selectDFRelative(short s2) throws CardServiceException {
        selectFile(s2, 1);
    }

    public void selectEFRelative(short s2) throws CardServiceException {
        selectFile(s2, 2);
    }

    public void selectMF() throws CardServiceException {
        selectFile((short) 0, 0);
    }

    public void selectParent() throws CardServiceException {
        selectFile((short) 0, 3);
    }

    public void selectPath(byte[] bArr) throws CardServiceException {
        selectFile(bArr, 8);
    }

    public void selectPathRelative(byte[] bArr) throws CardServiceException {
        selectFile(bArr, 9);
    }

    public AbstractFileSystemStructured(CardService cardService, boolean z) {
        this.selectedFID = (short) 0;
        this.length = -1;
        this.p2 = 0;
        this.selectLe = 256;
        this.fileInfo = null;
        this.service = cardService;
        this.p2 = z ? 0 : 12;
        this.selectLe = z ? 256 : 0;
    }

    private void selectFile(short s2, int i) throws CardServiceException {
        selectFile(s2 == 0 ? new byte[0] : new byte[]{(byte) ((s2 >> 8) & 255), (byte) (s2 & 255)}, i);
    }

    @Override // net.sf.scuba.smartcards.FileSystemStructured
    public void selectFile(short s2) throws CardServiceException {
        selectFile(s2, 0);
    }
}
