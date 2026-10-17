package com.fourthline.orca.internal;

import android.content.Context;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes23.dex */
public final class q implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f32151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f32152b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f32153c;
    private final e4m.e d;

    private q(d dVar, e4m.e eVar, e4m.e eVar2, e4m.e eVar3) {
        this.f32151a = dVar;
        this.f32152b = eVar;
        this.f32153c = eVar2;
        this.d = eVar3;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public v90 get() {
        return a(this.f32151a, (Context) this.f32152b.get(), (fh0) this.f32153c.get(), (CoroutineScope) this.d.get());
    }

    public static q a(d dVar, e4m.e eVar, e4m.e eVar2, e4m.e eVar3) {
        return new q(dVar, eVar, eVar2, eVar3);
    }

    public static v90 a(d dVar, Context context, fh0 fh0Var, CoroutineScope coroutineScope) {
        v90 v90VarA = dVar.a(context, fh0Var, coroutineScope);
        vc.s.k(v90VarA);
        return v90VarA;
    }
}
