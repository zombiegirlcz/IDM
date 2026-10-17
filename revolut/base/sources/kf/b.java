package kf;

/* JADX INFO: loaded from: classes17.dex */
public enum b implements ye.c {
    UNKNOWN_EVENT(0),
    MESSAGE_DELIVERED(1),
    MESSAGE_OPEN(2);

    private final int number_;

    b(int i) {
        this.number_ = i;
    }

    @Override // ye.c
    public final int getNumber() {
        return this.number_;
    }
}
