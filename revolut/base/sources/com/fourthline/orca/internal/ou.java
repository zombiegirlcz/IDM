package com.fourthline.orca.internal;

import android.content.Context;
import com.fourthline.core.eid.EidServiceProvider;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes23.dex */
public final class ou implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final nu f31768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f31769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f31770c;

    private ou(nu nuVar, e4m.e eVar, e4m.e eVar2) {
        this.f31768a = nuVar;
        this.f31769b = eVar;
        this.f31770c = eVar2;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public EidServiceProvider get() {
        return a(this.f31768a, (Context) this.f31769b.get(), (CoroutineScope) this.f31770c.get());
    }

    public static ou a(nu nuVar, e4m.e eVar, e4m.e eVar2) {
        return new ou(nuVar, eVar, eVar2);
    }

    public static EidServiceProvider a(nu nuVar, Context context, CoroutineScope coroutineScope) {
        EidServiceProvider eidServiceProviderA = nuVar.a(context, coroutineScope);
        vc.s.k(eidServiceProviderA);
        return eidServiceProviderA;
    }
}
