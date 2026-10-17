package org.jmrtd;

import j6.a;
import net.sf.scuba.smartcards.CardServiceException;

/* JADX INFO: loaded from: classes14.dex */
public class CardServiceProtocolException extends CardServiceException {
    private static final long serialVersionUID = 8527846223511524125L;
    private int step;

    public CardServiceProtocolException(String str, int i) {
        super(str);
        this.step = i;
    }

    @Override // net.sf.scuba.smartcards.CardServiceException, java.lang.Throwable
    public String getMessage() {
        StringBuilder sb6 = new StringBuilder();
        sb6.append(super.getMessage());
        sb6.append(" (step: ");
        return a.v(sb6, ")", this.step);
    }

    public int getStep() {
        return this.step;
    }

    public CardServiceProtocolException(String str, int i, Throwable th10) {
        super(str, th10);
        this.step = i;
    }

    public CardServiceProtocolException(String str, int i, int i2) {
        super(str, i2);
        this.step = i;
    }

    public CardServiceProtocolException(String str, int i, Throwable th10, int i2) {
        super(str, th10, i2);
        this.step = i;
    }
}
