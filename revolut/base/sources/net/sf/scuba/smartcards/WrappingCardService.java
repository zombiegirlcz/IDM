package net.sf.scuba.smartcards;

/* JADX INFO: loaded from: classes14.dex */
public class WrappingCardService extends CardService {
    private boolean enabled;
    private CardService service;
    private APDUWrapper wrapper;

    public WrappingCardService(CardService cardService, APDUWrapper aPDUWrapper) {
        this.service = cardService;
        this.wrapper = aPDUWrapper;
    }

    @Override // net.sf.scuba.smartcards.CardService
    public void close() {
        this.service.close();
    }

    public void disable() {
        this.enabled = false;
    }

    public void enable() {
        this.enabled = true;
    }

    @Override // net.sf.scuba.smartcards.CardService
    public byte[] getATR() throws CardServiceException {
        return this.service.getATR();
    }

    @Override // net.sf.scuba.smartcards.CardService
    public boolean isConnectionLost(Exception exc2) {
        return this.service.isConnectionLost(exc2);
    }

    public boolean isEnabled() {
        return this.enabled;
    }

    @Override // net.sf.scuba.smartcards.CardService
    public boolean isOpen() {
        return this.service.isOpen();
    }

    @Override // net.sf.scuba.smartcards.CardService
    public void open() throws CardServiceException {
        this.service.open();
    }

    @Override // net.sf.scuba.smartcards.CardService
    public ResponseAPDU transmit(CommandAPDU commandAPDU) throws CardServiceException {
        if (!isEnabled()) {
            return this.service.transmit(commandAPDU);
        }
        return this.wrapper.unwrap(this.service.transmit(this.wrapper.wrap(commandAPDU)));
    }
}
