package com.fourthline.orca.internal;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes23.dex */
public final class jd implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final gd f29855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f29856b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f29857c;
    private final e4m.e d;

    private jd(gd gdVar, e4m.e eVar, e4m.e eVar2, e4m.e eVar3) {
        this.f29855a = gdVar;
        this.f29856b = eVar;
        this.f29857c = eVar2;
        this.d = eVar3;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public rx get() {
        return a(this.f29855a, (cd) this.f29856b.get(), (bd) this.f29857c.get(), (Function0) this.d.get());
    }

    public static jd a(gd gdVar, e4m.e eVar, e4m.e eVar2, e4m.e eVar3) {
        return new jd(gdVar, eVar, eVar2, eVar3);
    }

    public static rx a(gd gdVar, cd cdVar, bd bdVar, Function0 function0) {
        rx rxVarA = gdVar.a(cdVar, bdVar, function0);
        vc.s.k(rxVarA);
        return rxVarA;
    }
}
