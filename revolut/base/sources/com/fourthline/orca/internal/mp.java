package com.fourthline.orca.internal;

import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public final class mp implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final hp f31239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f31240b;

    private mp(hp hpVar, e4m.e eVar) {
        this.f31239a = hpVar;
        this.f31240b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public od get() {
        return a(this.f31239a, (List) this.f31240b.get());
    }

    public static mp a(hp hpVar, e4m.e eVar) {
        return new mp(hpVar, eVar);
    }

    public static od a(hp hpVar, List list) {
        od odVarA = hpVar.a(list);
        vc.s.k(odVarA);
        return odVarA;
    }
}
