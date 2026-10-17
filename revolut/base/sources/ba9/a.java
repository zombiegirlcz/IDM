package ba9;

import b79.g;
import efm.d0;
import efm.r;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlin.text.a0;
import te0.e;
import te0.j;
import te0.s;
import te0.w;
import y99.g0;
import y99.i;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements n89.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f13994a;

    public a(i state, fk3.b configurationRepository) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(configurationRepository, "configurationRepository");
        this.f13994a = state;
    }

    @Override // n89.b
    public final r A() {
        g0 g0Var = (g0) this.f13994a;
        j jVar = g0Var.k;
        KProperty[] kPropertyArr = g0.f311775p;
        e value = jVar.getValue(g0Var, kPropertyArr[9]);
        s sVar = s.f270018a;
        r map = w.m(value.c(sVar), g0Var.f311780j.getValue(g0Var, kPropertyArr[8]).c(sVar), D1()).map(new g(new b96.a(15), 19));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    @Override // n89.b
    public final r D1() {
        return ((g0) this.f13994a).A0().c(s.f270018a);
    }

    @Override // n89.b
    public final d0 i2() {
        g0 g0Var = (g0) this.f13994a;
        d0 d0VarFirstOrError = g0Var.f311781l.getValue(g0Var, g0.f311775p[10]).c(s.f270018a).firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
        return d0VarFirstOrError;
    }

    @Override // n89.b
    public final void y(String code, boolean z) {
        Intrinsics.checkNotNullParameter(code, "code");
        g0 g0Var = (g0) this.f13994a;
        j jVar = g0Var.f311780j;
        KProperty[] kPropertyArr = g0.f311775p;
        jVar.getValue(g0Var, kPropertyArr[8]).set(a0.H(code, "9", false) ? n89.a.ITIN : n89.a.SSN);
        g0Var.A0().set(code);
        g0Var.k.getValue(g0Var, kPropertyArr[9]).set(Boolean.valueOf(z));
    }
}
