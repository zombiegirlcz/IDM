package com.google.zxing;

/* JADX INFO: loaded from: classes17.dex */
public final class FormatException extends ReaderException {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final FormatException f49841c;

    static {
        FormatException formatException = new FormatException();
        f49841c = formatException;
        formatException.setStackTrace(ReaderException.f49843b);
    }

    private FormatException() {
    }

    public static FormatException a() {
        return ReaderException.f49842a ? new FormatException() : f49841c;
    }
}
