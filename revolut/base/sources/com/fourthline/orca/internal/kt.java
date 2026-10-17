package com.fourthline.orca.internal;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes23.dex */
public final class kt implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ct f30384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f30385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f30386c;
    private final e4m.e d;

    private kt(ct ctVar, e4m.e eVar, e4m.e eVar2, e4m.e eVar3) {
        this.f30384a = ctVar;
        this.f30385b = eVar;
        this.f30386c = eVar2;
        this.d = eVar3;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ez get() {
        return a(this.f30384a, (bs) this.f30385b.get(), (Function0) this.f30386c.get(), (us) this.d.get());
    }

    public static kt a(ct ctVar, e4m.e eVar, e4m.e eVar2, e4m.e eVar3) {
        return new kt(ctVar, eVar, eVar2, eVar3);
    }

    public static ez a(ct ctVar, bs bsVar, Function0 function0, us usVar) {
        ez ezVarA = ctVar.a(bsVar, function0, usVar);
        vc.s.k(ezVarA);
        return ezVarA;
    }
}
