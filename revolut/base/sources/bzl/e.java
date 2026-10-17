package bzl;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.jetbrains.annotations.NotNull;
import zsc.p;

/* JADX INFO: loaded from: classes12.dex */
public final class e {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f20059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f20060b;

    public final f a(int i, String formattedValue) {
        Intrinsics.checkNotNullParameter(formattedValue, "formattedValue");
        String strD = a0.D(formattedValue, String.valueOf(p.SPACE_CHAR), "", false);
        int i2 = 0;
        for (int i3 = 0; i3 < formattedValue.length() && i3 < i; i3++) {
            if (formattedValue.charAt(i3) == ' ') {
                i2++;
            }
        }
        return new f(strD, i - i2);
    }
}
