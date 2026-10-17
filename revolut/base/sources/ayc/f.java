package ayc;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f11126a;

    static {
        int[] iArr = new int[com.revolut.feature.be_driven_design.models.domain.d.values().length];
        try {
            iArr[com.revolut.feature.be_driven_design.models.domain.d.POST.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[com.revolut.feature.be_driven_design.models.domain.d.PUT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[com.revolut.feature.be_driven_design.models.domain.d.PATCH.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[com.revolut.feature.be_driven_design.models.domain.d.DELETE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f11126a = iArr;
    }
}
