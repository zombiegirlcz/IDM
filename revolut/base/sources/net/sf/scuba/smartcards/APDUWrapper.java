package net.sf.scuba.smartcards;

/* JADX INFO: loaded from: classes14.dex */
public interface APDUWrapper {
    String getType();

    ResponseAPDU unwrap(ResponseAPDU responseAPDU);

    CommandAPDU wrap(CommandAPDU commandAPDU);
}
