package net.sf.scuba.smartcards;

import java.util.EventListener;

/* JADX INFO: loaded from: classes14.dex */
public interface APDUListener extends EventListener {
    void exchangedAPDU(APDUEvent aPDUEvent);
}
