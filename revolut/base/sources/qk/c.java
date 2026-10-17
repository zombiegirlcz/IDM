package qk;

import com.meshconnect.link.entity.LinkTheme;

/* JADX INFO: loaded from: classes17.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f246925a;

    static {
        int[] iArr = new int[LinkTheme.values().length];
        try {
            iArr[LinkTheme.DARK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[LinkTheme.LIGHT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[LinkTheme.SYSTEM.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f246925a = iArr;
    }
}
