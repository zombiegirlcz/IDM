package net.sf.scuba.smartcards;

/* JADX INFO: loaded from: classes14.dex */
public interface FileSystemStructured {
    FileInfo[] getSelectedPath() throws CardServiceException;

    byte[] readBinary(int i, int i2) throws CardServiceException;

    void selectFile(short s2) throws CardServiceException;
}
