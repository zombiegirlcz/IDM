package kf;

/* JADX INFO: loaded from: classes17.dex */
public enum c implements ye.c {
    UNKNOWN(0),
    DATA_MESSAGE(1),
    TOPIC(2),
    DISPLAY_NOTIFICATION(3);

    private final int number_;

    c(int i) {
        this.number_ = i;
    }

    @Override // ye.c
    public final int getNumber() {
        return this.number_;
    }
}
