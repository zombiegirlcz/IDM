package ckg;

import android.content.Context;
import ecm.q;
import jqa.m;
import kotlin.jvm.functions.Function0;
import ld1.l;
import xb1.t;

/* JADX INFO: loaded from: classes13.dex */
public final class e extends b60.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f24844b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f24845c;
    public final a31.a d;
    public final a31.a e;
    public final a31.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f24846g;

    public e(a31.a aVar, a31.a aVar2, a31.a aVar3, q qVar, m mVar) {
        this.f24845c = qVar;
        this.d = aVar;
        this.e = aVar2;
        this.f = aVar3;
        this.f24846g = mVar;
    }

    @Override // b60.a
    public final Object a() {
        switch (this.f24844b) {
            case 0:
                Context context = (Context) ((Function0) this.f24845c.f124861b).invoke();
                ip.b bVar = (ip.b) ((Function0) ((q) this.f24846g).f124861b).invoke();
                l70.e eVar = (l70.e) ((phm.a) this.d.f955b).get();
                ee0.a aVar = (ee0.a) ((phm.a) this.e.f955b).get();
                rk0.c cVar = (rk0.c) ((phm.a) this.f.f955b).get();
                context.getClass();
                bVar.getClass();
                eVar.getClass();
                aVar.getClass();
                cVar.getClass();
                return new a(eVar, aVar, cVar, context, bVar);
            default:
                Context context2 = (Context) ((Function0) this.f24845c.f124861b).invoke();
                l70.e eVar2 = (l70.e) ((phm.a) this.d.f955b).get();
                rfc.a aVar2 = (rfc.a) ((phm.a) this.e.f955b).get();
                t tVar = (t) ((phm.a) this.f.f955b).get();
                ld1.a aVar3 = (ld1.a) ((phm.a) this.f24846g).get();
                context2.getClass();
                eVar2.getClass();
                aVar2.getClass();
                tVar.getClass();
                aVar3.getClass();
                return new l(eVar2, aVar2, tVar, aVar3, context2);
        }
    }

    public e(q qVar, q qVar2, a31.a aVar, a31.a aVar2, a31.a aVar3) {
        this.f24845c = qVar;
        this.f24846g = qVar2;
        this.d = aVar;
        this.e = aVar2;
        this.f = aVar3;
    }
}
