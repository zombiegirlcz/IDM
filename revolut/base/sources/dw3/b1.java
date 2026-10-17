package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.application.CreditApplicationFlowContract$InputData;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class b1 implements i54.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditApplicationFlowContract$InputData f118317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c1 f118318b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b1 f118319c = this;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f118320g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f118321h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f118322j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f118323l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f118324m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f118325n;
    public final e4m.e o;

    public b1(c1 c1Var, CreditApplicationFlowContract$InputData creditApplicationFlowContract$InputData) {
        this.f118318b = c1Var;
        this.f118317a = creditApplicationFlowContract$InputData;
        this.d = e4m.b.b(new dmc.b0(c1Var, this, 4, 27));
        this.e = e4m.b.b(new dmc.b0(c1Var, this, 5, 27));
        this.f = e4m.b.b(new dmc.b0(c1Var, this, 3, 27));
        this.f118320g = e4m.b.b(new dmc.b0(c1Var, this, 2, 27));
        this.f118321h = e4m.b.b(new dmc.b0(c1Var, this, 6, 27));
        this.i = e4m.b.b(new dmc.b0(c1Var, this, 7, 27));
        this.f118322j = e4m.b.b(new dmc.b0(c1Var, this, 1, 27));
        this.k = e4m.b.b(new dmc.b0(c1Var, this, 0, 27));
        this.f118323l = e4m.b.b(new dmc.b0(c1Var, this, 8, 27));
        this.f118324m = e4m.b.b(new dmc.b0(c1Var, this, 9, 27));
        this.f118325n = e4m.b.b(new dmc.b0(c1Var, this, 11, 27));
        this.o = e4m.b.b(new dmc.b0(c1Var, this, 10, 27));
    }

    @Override // xki.e
    public final Set f() {
        Object extension = (j54.s0) this.k.get();
        i54.c.Companion.getClass();
        Intrinsics.checkNotNullParameter(extension, "extension");
        yji.n nVar = (yji.n) extension;
        vc.s.k(nVar);
        Object extension2 = (j54.i0) this.f118322j.get();
        Intrinsics.checkNotNullParameter(extension2, "extension");
        yji.n nVar2 = (yji.n) extension2;
        vc.s.k(nVar2);
        Object extension3 = (j54.f) this.i.get();
        Intrinsics.checkNotNullParameter(extension3, "extension");
        yji.n nVar3 = (yji.n) extension3;
        vc.s.k(nVar3);
        Object extension4 = (j54.v) this.f118321h.get();
        Intrinsics.checkNotNullParameter(extension4, "extension");
        yji.n nVar4 = (yji.n) extension4;
        vc.s.k(nVar4);
        Object extension5 = (j54.z) this.f118323l.get();
        Intrinsics.checkNotNullParameter(extension5, "extension");
        yji.n nVar5 = (yji.n) extension5;
        vc.s.k(nVar5);
        j54.s extension6 = (j54.s) this.f118324m.get();
        Intrinsics.checkNotNullParameter(extension6, "extension");
        vc.s.k(extension6);
        return ImmutableSet.of((j54.s) nVar, (j54.s) nVar2, (j54.s) nVar3, (j54.s) nVar4, (j54.s) nVar5, extension6, (j54.s[]) new yji.n[0]);
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
