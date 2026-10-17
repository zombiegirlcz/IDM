package org.jmrtd;

import java.io.Serializable;
import net.sf.scuba.smartcards.APDUEvent;
import net.sf.scuba.smartcards.CommandAPDU;
import net.sf.scuba.smartcards.ResponseAPDU;

/* JADX INFO: loaded from: classes14.dex */
public class WrappedAPDUEvent extends APDUEvent {
    private static final long serialVersionUID = 5958662425525890224L;
    private CommandAPDU plainTextCommandAPDU;
    private ResponseAPDU plainTextResponseAPDU;

    public WrappedAPDUEvent(Object obj2, Serializable serializable, int i, CommandAPDU commandAPDU, ResponseAPDU responseAPDU, CommandAPDU commandAPDU2, ResponseAPDU responseAPDU2) {
        super(obj2, serializable, i, commandAPDU2, responseAPDU2);
        this.plainTextCommandAPDU = commandAPDU;
        this.plainTextResponseAPDU = responseAPDU;
    }

    public CommandAPDU getPlainTextCommandAPDU() {
        return this.plainTextCommandAPDU;
    }

    public ResponseAPDU getPlainTextResponseAPDU() {
        return this.plainTextResponseAPDU;
    }
}
