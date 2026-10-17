package ta5;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes21.dex */
@mlm.g
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f269098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f269099b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f269100c;
    public final long d;
    public final Long e;
    public final Long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Integer f269101g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f269102h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final i f269103j;

    public /* synthetic */ c(int i, String str, String str2, String str3, long j2, Long l2, Long l3, Integer num, int i2, String str4, i iVar) {
        if (1023 != (i & 1023)) {
            j1.f(a.f269097a.getDescriptor(), i, 1023);
            throw null;
        }
        this.f269098a = str;
        this.f269099b = str2;
        this.f269100c = str3;
        this.d = j2;
        this.e = l2;
        this.f = l3;
        this.f269101g = num;
        this.f269102h = i2;
        this.i = str4;
        this.f269103j = iVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f269098a, cVar.f269098a) && Intrinsics.f(this.f269099b, cVar.f269099b) && Intrinsics.f(this.f269100c, cVar.f269100c) && this.d == cVar.d && Intrinsics.f(this.e, cVar.e) && Intrinsics.f(this.f, cVar.f) && Intrinsics.f(this.f269101g, cVar.f269101g) && this.f269102h == cVar.f269102h && Intrinsics.f(this.i, cVar.i) && Intrinsics.f(this.f269103j, cVar.f269103j);
    }

    public final int hashCode() {
        int iC = a0.d.c(p.a.c(p.a.c(this.f269098a.hashCode() * 31, 31, this.f269099b), 31, this.f269100c), 31, this.d);
        Long l2 = this.e;
        int iHashCode = (iC + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.f;
        int iHashCode2 = (iHashCode + (l3 == null ? 0 : l3.hashCode())) * 31;
        Integer num = this.f269101g;
        return this.f269103j.hashCode() + p.a.c(j6.a.b(this.f269102h, (iHashCode2 + (num != null ? num.hashCode() : 0)) * 31, 31), 31, this.i);
    }
}
