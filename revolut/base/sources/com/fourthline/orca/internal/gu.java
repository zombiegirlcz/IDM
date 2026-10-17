package com.fourthline.orca.internal;

import android.content.Context;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes23.dex */
public final class gu implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final cu f29000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f29001b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f29002c;
    private final e4m.e d;
    private final e4m.e e;
    private final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final e4m.e f29003g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final e4m.e f29004h;
    private final e4m.e i;

    private gu(cu cuVar, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4, e4m.e eVar5, e4m.e eVar6, e4m.e eVar7, e4m.e eVar8) {
        this.f29000a = cuVar;
        this.f29001b = eVar;
        this.f29002c = eVar2;
        this.d = eVar3;
        this.e = eVar4;
        this.f = eVar5;
        this.f29003g = eVar6;
        this.f29004h = eVar7;
        this.i = eVar8;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public mu get() {
        return a(this.f29000a, (Context) this.f29001b.get(), (lu) this.f29002c.get(), (ws) this.d.get(), (hu) this.e.get(), (yt) this.f.get(), (v10) this.f29003g.get(), (bq0) this.f29004h.get(), (CoroutineScope) this.i.get());
    }

    public static gu a(cu cuVar, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4, e4m.e eVar5, e4m.e eVar6, e4m.e eVar7, e4m.e eVar8) {
        return new gu(cuVar, eVar, eVar2, eVar3, eVar4, eVar5, eVar6, eVar7, eVar8);
    }

    public static mu a(cu cuVar, Context context, lu luVar, ws wsVar, hu huVar, yt ytVar, v10 v10Var, bq0 bq0Var, CoroutineScope coroutineScope) {
        mu muVarA = cuVar.a(context, luVar, wsVar, huVar, ytVar, v10Var, bq0Var, coroutineScope);
        vc.s.k(muVarA);
        return muVarA;
    }
}
