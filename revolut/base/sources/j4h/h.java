package j4h;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes9.dex */
@mlm.g
public final class h {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f171386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f171387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f171388c;
    public final String d;
    public final String e;

    public /* synthetic */ h(int i, String str, String str2, String str3, String str4, String str5) {
        if (31 != (i & 31)) {
            j1.f(f.f171385a.getDescriptor(), i, 31);
            throw null;
        }
        this.f171386a = str;
        this.f171387b = str2;
        this.f171388c = str3;
        this.d = str4;
        this.e = str5;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f171386a, hVar.f171386a) && Intrinsics.f(this.f171387b, hVar.f171387b) && Intrinsics.f(this.f171388c, hVar.f171388c) && Intrinsics.f(this.d, hVar.d) && Intrinsics.f(this.e, hVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + p.a.c(p.a.c(p.a.c(this.f171386a.hashCode() * 31, 31, this.f171387b), 31, this.f171388c), 31, this.d);
    }
}
