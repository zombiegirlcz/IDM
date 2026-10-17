package ie;

/* JADX INFO: loaded from: classes.dex */
public enum v {
    DEVELOPER(1),
    USER_SIDELOAD(2),
    TEST_DISTRIBUTION(3),
    APP_STORE(4);


    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final int f160576id;

    v(int i) {
        this.f160576id = i;
    }

    public final int a() {
        return this.f160576id;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f160576id);
    }
}
