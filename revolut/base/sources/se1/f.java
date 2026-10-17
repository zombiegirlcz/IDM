package se1;

import h30.l;
import java.util.List;
import jki.m;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class f implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f262083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f262084b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f262085c;
    public final boolean d;

    public f(long j2, List actionItems, xi0.b currency, boolean z) {
        Intrinsics.checkNotNullParameter(actionItems, "actionItems");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f262083a = actionItems;
        this.f262084b = currency;
        this.f262085c = j2;
        this.d = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f262083a, fVar.f262083a) && Intrinsics.f(this.f262084b, fVar.f262084b) && this.f262085c == fVar.f262085c && this.d == fVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + a0.d.c(l.j(this.f262084b, this.f262083a.hashCode() * 31, 31), 31, this.f262085c);
    }
}
