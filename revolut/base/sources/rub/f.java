package rub;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class f implements j {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f257513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f257514b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f257515c;
    public final double d;

    public /* synthetic */ f(int i, double d, dj0.d dVar, String str, double d5) {
        if (15 != (i & 15)) {
            j1.f(d.f257512a.getDescriptor(), i, 15);
            throw null;
        }
        this.f257513a = d;
        this.f257514b = dVar;
        this.f257515c = str;
        this.d = d5;
    }

    @Override // rub.j
    public final double a() {
        return this.f257513a;
    }

    @Override // rub.j
    public final String b() {
        return this.f257515c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Double.compare(this.f257513a, fVar.f257513a) == 0 && Intrinsics.f(this.f257514b, fVar.f257514b) && Intrinsics.f(this.f257515c, fVar.f257515c) && Double.compare(this.d, fVar.d) == 0;
    }

    @Override // rub.j
    public final dj0.d getPrice() {
        return this.f257514b;
    }

    public final int hashCode() {
        return Double.hashCode(this.d) + p.a.c(v7.c(Double.hashCode(this.f257513a) * 31, 31, this.f257514b), 31, this.f257515c);
    }
}
