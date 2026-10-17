package cnb;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class f {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f25378b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jo3.a f25379c;
    public final String d;
    public final long e;
    public final e f;

    public /* synthetic */ f(int i, String str, String str2, jo3.a aVar, String str3, long j2, e eVar) {
        if (63 != (i & 63)) {
            j1.f(a.f25374a.getDescriptor(), i, 63);
            throw null;
        }
        this.f25377a = str;
        this.f25378b = str2;
        this.f25379c = aVar;
        this.d = str3;
        this.e = j2;
        this.f = eVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f25377a, fVar.f25377a) && Intrinsics.f(this.f25378b, fVar.f25378b) && Intrinsics.f(this.f25379c, fVar.f25379c) && Intrinsics.f(this.d, fVar.d) && this.e == fVar.e && Intrinsics.f(this.f, fVar.f);
    }

    public final int hashCode() {
        return this.f.f25376a.hashCode() + a0.d.c(p.a.c(v7.j(this.f25379c, p.a.c(this.f25377a.hashCode() * 31, 31, this.f25378b), 31), 31, this.d), 31, this.e);
    }

    public f(String id10, String name, jo3.a balance, String state, long j2, e product) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(balance, "balance");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(product, "product");
        this.f25377a = id10;
        this.f25378b = name;
        this.f25379c = balance;
        this.d = state;
        this.e = j2;
        this.f = product;
    }
}
