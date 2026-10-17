package zb;

import android.content.Context;

/* JADX INFO: loaded from: classes16.dex */
public final class k extends t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final phm.a f320783a = bc.a.a(n.f320788a);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ac.e f320784b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final phm.a f320785c;
    public final gc.e d;
    public final phm.a e;
    public final phm.a f;

    public k(Context context) {
        if (context == null) {
            throw new NullPointerException("instance cannot be null");
        }
        ac.e eVar = new ac.e(context, 1);
        this.f320784b = eVar;
        this.f320785c = bc.a.a(new ac.g(eVar, new ac.e(eVar, 0), 0));
        ac.e eVar2 = this.f320784b;
        this.d = new gc.e(eVar2, 1);
        int i = 1;
        phm.a aVarA = bc.a.a(new ac.g(this.d, bc.a.a(new gc.e(eVar2, 0)), i));
        this.e = aVarA;
        ec.e eVar3 = new ec.e(0);
        ac.e eVar4 = this.f320784b;
        ec.f fVar = new ec.f(eVar4, aVarA, eVar3, 0);
        phm.a aVar = this.f320783a;
        phm.a aVar2 = this.f320785c;
        this.f = bc.a.a(new ec.f(new ec.c(aVar, aVar2, fVar, aVarA, aVarA), new fc.h(eVar4, aVar2, aVarA, fVar, aVar, aVarA, aVarA), new fc.i(aVar, aVarA, fVar, aVarA), i));
    }

    @Override // zb.t
    public final gc.d d() {
        return (gc.d) this.e.get();
    }

    public final s f() {
        return (s) this.f.get();
    }
}
