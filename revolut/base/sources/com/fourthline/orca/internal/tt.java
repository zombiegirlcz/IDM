package com.fourthline.orca.internal;

import com.fourthline.core.eid.EidServiceProvider;
import com.fourthline.orca.internal.e40;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes23.dex */
public final class tt implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ot f33865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f33866b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f33867c;
    private final e4m.e d;
    private final e4m.e e;

    private tt(ot otVar, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4) {
        this.f33865a = otVar;
        this.f33866b = eVar;
        this.f33867c = eVar2;
        this.d = eVar3;
        this.e = eVar4;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public e40.e get() {
        return a(this.f33865a, (vt) this.f33866b.get(), (bs) this.f33867c.get(), (CoroutineScope) this.d.get(), (EidServiceProvider) this.e.get());
    }

    public static tt a(ot otVar, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4) {
        return new tt(otVar, eVar, eVar2, eVar3, eVar4);
    }

    public static e40.e a(ot otVar, vt vtVar, bs bsVar, CoroutineScope coroutineScope, EidServiceProvider eidServiceProvider) {
        e40.e eVarA = otVar.a(vtVar, bsVar, coroutineScope, eidServiceProvider);
        vc.s.k(eVarA);
        return eVarA;
    }
}
