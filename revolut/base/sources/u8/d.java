package u8;

/* JADX INFO: loaded from: classes16.dex */
public enum d {
    RUNNING(false),
    PAUSED(false),
    CLEARED(false),
    SUCCESS(true),
    FAILED(true);

    private final boolean isComplete;

    d(boolean z) {
        this.isComplete = z;
    }

    public final boolean a() {
        return this.isComplete;
    }
}
