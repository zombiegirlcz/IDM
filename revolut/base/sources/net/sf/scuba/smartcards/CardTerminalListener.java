package net.sf.scuba.smartcards;

import java.util.EventListener;

/* JADX INFO: loaded from: classes14.dex */
public interface CardTerminalListener extends EventListener {
    void cardInserted(CardEvent cardEvent);

    void cardRemoved(CardEvent cardEvent);
}
