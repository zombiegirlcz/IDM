package t70;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f268399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f268400b;

    public s(int i, Object[] params) {
        Intrinsics.checkNotNullParameter(params, "params");
        this.f268399a = i;
        this.f268400b = params;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!s.class.equals(obj2 != null ? obj2.getClass() : null)) {
            return false;
        }
        Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.core.android.localization.StringKey");
        s sVar = (s) obj2;
        return this.f268399a == sVar.f268399a && Arrays.equals(this.f268400b, sVar.f268400b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f268400b) + (this.f268399a * 31);
    }
}
