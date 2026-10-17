package com.fourthline.orca.internal;

import com.fourthline.core.internal.TimestampProvider;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes23.dex */
public final class ak implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final rj f26825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f26826b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f26827c;
    private final e4m.e d;
    private final e4m.e e;
    private final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final e4m.e f26828g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final e4m.e f26829h;
    private final e4m.e i;

    private ak(rj rjVar, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4, e4m.e eVar5, e4m.e eVar6, e4m.e eVar7, e4m.e eVar8) {
        this.f26825a = rjVar;
        this.f26826b = eVar;
        this.f26827c = eVar2;
        this.d = eVar3;
        this.e = eVar4;
        this.f = eVar5;
        this.f26828g = eVar6;
        this.f26829h = eVar7;
        this.i = eVar8;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public qi get() {
        return a(this.f26825a, (fj) this.f26826b.get(), (uk) this.f26827c.get(), (oi) this.d.get(), (ei) this.e.get(), (TimestampProvider) this.f.get(), (wd1) this.f26828g.get(), (aq0) this.f26829h.get(), (CoroutineScope) this.i.get());
    }

    public static ak a(rj rjVar, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4, e4m.e eVar5, e4m.e eVar6, e4m.e eVar7, e4m.e eVar8) {
        return new ak(rjVar, eVar, eVar2, eVar3, eVar4, eVar5, eVar6, eVar7, eVar8);
    }

    public static qi a(rj rjVar, fj fjVar, uk ukVar, oi oiVar, ei eiVar, TimestampProvider timestampProvider, wd1 wd1Var, aq0 aq0Var, CoroutineScope coroutineScope) {
        qi qiVarA = rjVar.a(fjVar, ukVar, oiVar, eiVar, timestampProvider, wd1Var, aq0Var, coroutineScope);
        vc.s.k(qiVarA);
        return qiVarA;
    }
}
