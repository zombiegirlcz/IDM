package lh6;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f195170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e7l.f f195171b;

    public /* synthetic */ k(e7l.f fVar, int i) {
        this.f195170a = i;
        this.f195171b = fVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        e7l.k kVar;
        switch (this.f195170a) {
            case 0:
                h hVar = (h) obj2;
                e7l.f fVar = this.f195171b;
                dj0.d dVar = fVar.O0;
                return h.a(hVar, (dj0.d) kotlin.ranges.f.d(hVar.f195165a, dVar), (dj0.d) kotlin.ranges.f.d(hVar.f195166b, fVar.O0), dVar, 28);
            default:
                wb3.d dVar2 = (wb3.d) obj2;
                e7l.f fVar2 = this.f195171b;
                dj0.d dVar3 = fVar2.T0;
                if (dVar3 == null) {
                    xi0.b.Companion.getClass();
                    dVar3 = new dj0.d(100000L, xi0.b.f306272g);
                }
                e7l.j jVar = fVar2.U0;
                wb3.f fVar3 = (jVar == null || (kVar = jVar.f123412b) == null) ? null : new wb3.f(kVar);
                dVar2.getClass();
                return new wb3.d(dVar3, fVar3);
        }
    }
}
