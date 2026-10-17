package uh8;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class m {

    @NotNull
    public static final l Companion = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f280156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f280157b;

    public /* synthetic */ m(int i, String str, boolean z) {
        if (3 != (i & 3)) {
            j1.f(k.f280155a.getDescriptor(), i, 3);
            throw null;
        }
        this.f280156a = str;
        this.f280157b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f280156a, mVar.f280156a) && this.f280157b == mVar.f280157b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f280157b) + (this.f280156a.hashCode() * 31);
    }

    public m(String code, boolean z) {
        Intrinsics.checkNotNullParameter(code, "code");
        this.f280156a = code;
        this.f280157b = z;
    }
}
