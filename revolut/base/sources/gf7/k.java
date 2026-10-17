package gf7;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes22.dex */
@mlm.g
public final class k {

    @NotNull
    public static final j Companion = new j();
    public static final Lazy[] f = {null, null, null, null, yhm.j.c(yhm.k.PUBLICATION, new gaa.b(13))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f143363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f143364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f143365c;
    public final String d;
    public final List e;

    public /* synthetic */ k(int i, String str, String str2, String str3, String str4, List list) {
        if (31 != (i & 31)) {
            j1.f(i.f143362a.getDescriptor(), i, 31);
            throw null;
        }
        this.f143363a = str;
        this.f143364b = str2;
        this.f143365c = str3;
        this.d = str4;
        this.e = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f143363a, kVar.f143363a) && Intrinsics.f(this.f143364b, kVar.f143364b) && Intrinsics.f(this.f143365c, kVar.f143365c) && Intrinsics.f(this.d, kVar.d) && Intrinsics.f(this.e, kVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + p.a.c(p.a.c(p.a.c(this.f143363a.hashCode() * 31, 31, this.f143364b), 31, this.f143365c), 31, this.d);
    }
}
