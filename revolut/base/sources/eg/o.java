package eg;

/* JADX INFO: loaded from: classes.dex */
public enum o implements xe.f {
    EVENT_TYPE_UNKNOWN(0),
    SESSION_START(1);

    private final int number;

    o(int i) {
        this.number = i;
    }

    @Override // xe.f
    public final int getNumber() {
        return this.number;
    }
}
