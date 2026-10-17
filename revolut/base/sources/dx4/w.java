package dx4;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class w implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f120805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f120806b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f120807c;
    public final long d;
    public final int e;
    public final t f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f120808g;

    public w(String title, long j2, long j3, long j5, int i, t amountType) {
        zhm.f0 infoRanges = zhm.f0.f322471a;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(amountType, "amountType");
        Intrinsics.checkNotNullParameter(infoRanges, "infoRanges");
        this.f120805a = title;
        this.f120806b = j2;
        this.f120807c = j3;
        this.d = j5;
        this.e = i;
        this.f = amountType;
        this.f120808g = infoRanges;
    }

    @Override // dx4.z
    public final long N5() {
        return this.f120806b;
    }

    @Override // dx4.z
    public final List P6() {
        return this.f120808g;
    }

    @Override // dx4.z
    public final Long Q1() {
        return Long.valueOf(this.d);
    }

    @Override // dx4.z
    public final int S6() {
        return this.e;
    }

    @Override // dx4.z
    public final x V8() {
        return null;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w)) {
            return false;
        }
        w wVar = (w) obj2;
        return Intrinsics.f(this.f120805a, wVar.f120805a) && this.f120806b == wVar.f120806b && this.f120807c == wVar.f120807c && this.d == wVar.d && this.e == wVar.e && this.f.equals(wVar.f) && Intrinsics.f(this.f120808g, wVar.f120808g);
    }

    @Override // dx4.z
    public final String getTitle() {
        return this.f120805a;
    }

    public final int hashCode() {
        return this.f120808g.hashCode() + ((this.f.hashCode() + j6.a.b(this.e, a0.d.c(a0.d.c(a0.d.c(this.f120805a.hashCode() * 961, 31, this.f120806b), 31, this.f120807c), 31, this.d), 31)) * 31);
    }

    @Override // dx4.z
    public final t t6() {
        return this.f;
    }

    @Override // dx4.z
    public final long v8() {
        return this.f120807c;
    }
}
