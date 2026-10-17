package nld;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f217120a;

    static {
        int[] iArr = new int[com.revolut.feature.slot_manager.api.model.checklist.b.values().length];
        try {
            iArr[com.revolut.feature.slot_manager.api.model.checklist.b.COMPLETED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[com.revolut.feature.slot_manager.api.model.checklist.b.PENDING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[com.revolut.feature.slot_manager.api.model.checklist.b.LOCKED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[com.revolut.feature.slot_manager.api.model.checklist.b.ACTIVE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[com.revolut.feature.slot_manager.api.model.checklist.b.ATTENTION_REQUIRED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f217120a = iArr;
    }
}
