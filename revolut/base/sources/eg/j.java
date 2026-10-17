package eg;

/* JADX INFO: loaded from: classes.dex */
public enum j implements xe.f {
    COLLECTION_UNKNOWN(0),
    COLLECTION_SDK_NOT_INSTALLED(1),
    COLLECTION_ENABLED(2),
    COLLECTION_DISABLED(3),
    COLLECTION_DISABLED_REMOTE(4),
    COLLECTION_SAMPLED(5);

    private final int number;

    j(int i) {
        this.number = i;
    }

    @Override // xe.f
    public final int getNumber() {
        return this.number;
    }
}
