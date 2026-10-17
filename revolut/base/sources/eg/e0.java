package eg;

/* JADX INFO: loaded from: classes.dex */
public enum e0 implements xe.f {
    LOG_ENVIRONMENT_UNKNOWN(0),
    LOG_ENVIRONMENT_AUTOPUSH(1),
    LOG_ENVIRONMENT_STAGING(2),
    LOG_ENVIRONMENT_PROD(3);

    private final int number;

    e0(int i) {
        this.number = i;
    }

    @Override // xe.f
    public final int getNumber() {
        return this.number;
    }
}
