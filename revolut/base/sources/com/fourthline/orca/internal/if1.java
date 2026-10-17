package com.fourthline.orca.internal;

import android.content.Context;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes23.dex */
public final class if1 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final hf1 f29570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f29571b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f29572c;
    private final e4m.e d;
    private final e4m.e e;
    private final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final e4m.e f29573g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final e4m.e f29574h;
    private final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final e4m.e f29575j;
    private final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final e4m.e f29576l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final e4m.e f29577m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final e4m.e f29578n;

    private if1(hf1 hf1Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4, e4m.e eVar5, e4m.e eVar6, e4m.e eVar7, e4m.e eVar8, e4m.e eVar9, e4m.e eVar10, e4m.e eVar11, e4m.e eVar12, e4m.e eVar13) {
        this.f29570a = hf1Var;
        this.f29571b = eVar;
        this.f29572c = eVar2;
        this.d = eVar3;
        this.e = eVar4;
        this.f = eVar5;
        this.f29573g = eVar6;
        this.f29574h = eVar7;
        this.i = eVar8;
        this.f29575j = eVar9;
        this.k = eVar10;
        this.f29576l = eVar11;
        this.f29577m = eVar12;
        this.f29578n = eVar13;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public fg1 get() {
        return a(this.f29570a, (Context) this.f29571b.get(), (t9) this.f29572c.get(), (t90) this.d.get(), (gh1) this.e.get(), (yg1) this.f.get(), (bf1) this.f29573g.get(), (kh1) this.f29574h.get(), (lz) this.i.get(), (mb.d) this.f29575j.get(), (sg0) this.k.get(), (u21) this.f29576l.get(), (h2) this.f29577m.get(), (CoroutineScope) this.f29578n.get());
    }

    public static if1 a(hf1 hf1Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4, e4m.e eVar5, e4m.e eVar6, e4m.e eVar7, e4m.e eVar8, e4m.e eVar9, e4m.e eVar10, e4m.e eVar11, e4m.e eVar12, e4m.e eVar13) {
        return new if1(hf1Var, eVar, eVar2, eVar3, eVar4, eVar5, eVar6, eVar7, eVar8, eVar9, eVar10, eVar11, eVar12, eVar13);
    }

    public static fg1 a(hf1 hf1Var, Context context, t9 t9Var, t90 t90Var, gh1 gh1Var, yg1 yg1Var, bf1 bf1Var, kh1 kh1Var, lz lzVar, mb.d dVar, sg0 sg0Var, u21 u21Var, h2 h2Var, CoroutineScope coroutineScope) {
        fg1 fg1VarA = hf1Var.a(context, t9Var, t90Var, gh1Var, yg1Var, bf1Var, kh1Var, lzVar, dVar, sg0Var, u21Var, h2Var, coroutineScope);
        vc.s.k(fg1VarA);
        return fg1VarA;
    }
}
