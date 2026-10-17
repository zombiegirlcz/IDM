package com.fourthline.orca.internal;

import com.fourthline.core.location.LocationProvider;
import com.fourthline.orca.internal.e40;
import java.util.Locale;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes23.dex */
public final class cu0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final lt0 f27553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f27554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f27555c;
    private final e4m.e d;
    private final e4m.e e;
    private final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final e4m.e f27556g;

    private cu0(lt0 lt0Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4, e4m.e eVar5, e4m.e eVar6) {
        this.f27553a = lt0Var;
        this.f27554b = eVar;
        this.f27555c = eVar2;
        this.d = eVar3;
        this.e = eVar4;
        this.f = eVar5;
        this.f27556g = eVar6;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public e40.c get() {
        return a(this.f27553a, (kt0) this.f27554b.get(), (LocationProvider) this.f27555c.get(), (fx0) this.d.get(), (kw) this.e.get(), (Locale) this.f.get(), (CoroutineScope) this.f27556g.get());
    }

    public static cu0 a(lt0 lt0Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4, e4m.e eVar5, e4m.e eVar6) {
        return new cu0(lt0Var, eVar, eVar2, eVar3, eVar4, eVar5, eVar6);
    }

    public static e40.c a(lt0 lt0Var, kt0 kt0Var, LocationProvider locationProvider, fx0 fx0Var, kw kwVar, Locale locale, CoroutineScope coroutineScope) {
        e40.c cVarA = lt0Var.a(kt0Var, locationProvider, fx0Var, kwVar, locale, coroutineScope);
        vc.s.k(cVarA);
        return cVarA;
    }
}
