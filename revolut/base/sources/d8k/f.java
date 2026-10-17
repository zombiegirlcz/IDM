package d8k;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.d0;

/* JADX INFO: loaded from: classes11.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f112294a;

    public f(gte.a featureToggleInteractor, int i) {
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
                this.f112294a = featureToggleInteractor;
                break;
            default:
                Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
                this.f112294a = featureToggleInteractor;
                break;
        }
    }

    public static Integer a(int i, String str) {
        int iX;
        if (i <= 0 || i > str.length() || (iX = d0.X(str, '@', i - 1, 4)) < 0) {
            return null;
        }
        if (iX > 0 && !CharsKt.e(str.charAt(iX - 1))) {
            return null;
        }
        for (int i2 = iX + 1; i2 < i; i2++) {
            if (CharsKt.e(str.charAt(i2))) {
                return null;
            }
        }
        return Integer.valueOf(iX);
    }

    public static int b(int i, String str) {
        Object next;
        vim.f it8 = kotlin.ranges.f.o(i + 1, str.length()).iterator();
        while (true) {
            if (!it8.f289625c) {
                next = null;
                break;
            }
            next = it8.next();
            if (CharsKt.e(str.charAt(((Number) next).intValue()))) {
                break;
            }
        }
        Integer num = (Integer) next;
        return num != null ? num.intValue() : str.length();
    }
}
