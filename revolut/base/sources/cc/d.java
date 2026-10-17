package cc;

/* JADX INFO: loaded from: classes16.dex */
public enum d implements ye.c {
    REASON_UNKNOWN(0),
    MESSAGE_TOO_OLD(1),
    CACHE_FULL(2),
    PAYLOAD_TOO_BIG(3),
    MAX_RETRIES_REACHED(4),
    INVALID_PAYLOD(5),
    SERVER_ERROR(6);

    private final int number_;

    d(int i) {
        this.number_ = i;
    }

    @Override // ye.c
    public final int getNumber() {
        return this.number_;
    }
}
