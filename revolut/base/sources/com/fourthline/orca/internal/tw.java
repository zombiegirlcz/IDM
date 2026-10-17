package com.fourthline.orca.internal;

import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes23.dex */
public final class tw implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ow f33883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f33884b;

    private tw(ow owVar, e4m.e eVar) {
        this.f33883a = owVar;
        this.f33884b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public iq0 get() {
        return a(this.f33883a, (CoroutineScope) this.f33884b.get());
    }

    public static tw a(ow owVar, e4m.e eVar) {
        return new tw(owVar, eVar);
    }

    public static iq0 a(ow owVar, CoroutineScope coroutineScope) {
        iq0 iq0VarA = owVar.a(coroutineScope);
        vc.s.k(iq0VarA);
        return iq0VarA;
    }
}
