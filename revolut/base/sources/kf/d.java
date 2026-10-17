package kf;

/* JADX INFO: loaded from: classes17.dex */
public enum d implements ye.c {
    UNKNOWN_OS(0),
    ANDROID(1),
    IOS(2),
    WEB(3);

    private final int number_;

    d(int i) {
        this.number_ = i;
    }

    @Override // ye.c
    public final int getNumber() {
        return this.number_;
    }
}
