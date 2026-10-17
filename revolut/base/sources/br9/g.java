package br9;

import ar9.s;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import oq9.p;
import oq9.q;
import oq9.r;

/* JADX INFO: loaded from: classes5.dex */
public abstract class g {
    public static final r a(s sVar) {
        Intrinsics.checkNotNullParameter(sVar, "<this>");
        return sVar.getCode() != null ? new p(sVar.getCode(), sVar.getUsername()) : sVar.getPhone() != null ? new oq9.s(sVar.getPhone()) : sVar.getEmail() != null ? new q(sVar.getEmail()) : r.a.f227851a;
    }

    public static final s b(r rVar) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        if (rVar instanceof p) {
            p pVar = (p) rVar;
            return new s(pVar.f227849b, pVar.f227848a, null, null);
        }
        if (rVar instanceof oq9.s) {
            return new s(null, null, ((oq9.s) rVar).f227852a, null);
        }
        if (rVar instanceof q) {
            return new s(null, null, null, ((q) rVar).f227850a);
        }
        if (rVar instanceof r.a) {
            return new s(null, null, null, null);
        }
        throw new NoWhenBranchMatchedException();
    }
}
