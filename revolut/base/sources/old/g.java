package old;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f226380a;

    static {
        int[] iArr = new int[com.revolut.feature.slot_manager.api.model.checklist.f.values().length];
        try {
            iArr[com.revolut.feature.slot_manager.api.model.checklist.f.DEFAULT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[com.revolut.feature.slot_manager.api.model.checklist.f.PENDING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[com.revolut.feature.slot_manager.api.model.checklist.f.ATTENTION_REQUIRED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f226380a = iArr;
    }
}
