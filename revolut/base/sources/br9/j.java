package br9;

import fr9.a;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import oq9.t;
import oq9.u;
import oq9.v;

/* JADX INFO: loaded from: classes5.dex */
public abstract class j {
    public static final fr9.a a(v vVar) {
        Intrinsics.checkNotNullParameter(vVar, "<this>");
        if (vVar instanceof t) {
            t tVar = (t) vVar;
            Intrinsics.checkNotNullParameter(tVar, "<this>");
            return new a.b(tVar.d.getMillis(), tVar.f227853a, tVar.f227854b, tVar.e.getMillis(), tVar.f227855c.b());
        }
        if (!(vVar instanceof u)) {
            throw new NoWhenBranchMatchedException();
        }
        u uVar = (u) vVar;
        Intrinsics.checkNotNullParameter(uVar, "<this>");
        return new a.c(uVar.d.getMillis(), uVar.f227856a, uVar.f227857b, uVar.e.getMillis(), uVar.f227858c.b());
    }
}
