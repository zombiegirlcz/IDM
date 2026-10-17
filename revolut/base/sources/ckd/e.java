package ckd;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class e {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f24803b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f24804c;
    public final h d;

    public /* synthetic */ e(int i, String str, String str2, String str3, h hVar) {
        if (13 != (i & 13)) {
            j1.f(c.f24801a.getDescriptor(), i, 13);
            throw null;
        }
        this.f24802a = str;
        if ((i & 2) == 0) {
            this.f24803b = null;
        } else {
            this.f24803b = str2;
        }
        this.f24804c = str3;
        this.d = hVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f24802a, eVar.f24802a) && Intrinsics.f(this.f24803b, eVar.f24803b) && Intrinsics.f(this.f24804c, eVar.f24804c) && Intrinsics.f(this.d, eVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f24802a.hashCode() * 31;
        String str = this.f24803b;
        return this.d.hashCode() + p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f24804c);
    }
}
