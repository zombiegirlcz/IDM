package com.fourthline.orca.internal;

import com.google.common.base.Optional;

/* JADX INFO: loaded from: classes23.dex */
public final class hg implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final eg f29241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f29242b;

    private hg(eg egVar, e4m.e eVar) {
        this.f29241a = egVar;
        this.f29242b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public wf get() {
        return a(this.f29241a, (Optional) this.f29242b.get());
    }

    public static hg a(eg egVar, e4m.e eVar) {
        return new hg(egVar, eVar);
    }

    public static wf a(eg egVar, Optional optional) {
        wf wfVarA = egVar.a(optional);
        vc.s.k(wfVarA);
        return wfVarA;
    }
}
