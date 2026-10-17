package ecd;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class v4 {

    @NotNull
    public static final u4 Companion = new u4();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f124693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f124694b;

    public /* synthetic */ v4(int i, String str, boolean z) {
        if (3 != (i & 3)) {
            qlm.j1.f(t4.f124680a.getDescriptor(), i, 3);
            throw null;
        }
        this.f124693a = str;
        this.f124694b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v4)) {
            return false;
        }
        v4 v4Var = (v4) obj2;
        return Intrinsics.f(this.f124693a, v4Var.f124693a) && this.f124694b == v4Var.f124694b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f124694b) + (this.f124693a.hashCode() * 31);
    }

    public v4(String code, boolean z) {
        Intrinsics.checkNotNullParameter(code, "code");
        this.f124693a = code;
        this.f124694b = z;
    }
}
