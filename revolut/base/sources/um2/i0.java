package um2;

import com.revolut.feature.backgroundpicker.impl.flow.theme_customisation_v2.ThemeCustomisationContract$Page;

/* JADX INFO: loaded from: classes21.dex */
public abstract /* synthetic */ class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f281201a;

    static {
        int[] iArr = new int[ThemeCustomisationContract$Page.values().length];
        try {
            iArr[ThemeCustomisationContract$Page.MODE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ThemeCustomisationContract$Page.THEME.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ThemeCustomisationContract$Page.ACCENT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f281201a = iArr;
    }
}
