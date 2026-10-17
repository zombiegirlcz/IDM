package uie;

import kotlin.jvm.functions.Function0;
import us6.x1;

/* JADX INFO: loaded from: classes8.dex */
public final class c extends b60.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f280388b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f280389c;
    public final Object d;

    public /* synthetic */ c(Object obj2, Object obj3, int i) {
        this.f280388b = i;
        this.f280389c = obj2;
        this.d = obj3;
    }

    @Override // b60.a
    public final Object a() {
        switch (this.f280388b) {
            case 0:
                j jVar = (j) ((phm.a) this.f280389c).get();
                l lVar = (l) ((phm.a) this.d).get();
                jVar.getClass();
                lVar.getClass();
                return new i(jVar, lVar);
            case 1:
                us6.q qVar = (us6.q) ((phm.a) this.f280389c).get();
                xs6.b bVar = (xs6.b) ((phm.a) this.d).get();
                qVar.getClass();
                bVar.getClass();
                return new x1(qVar, bVar);
            default:
                ui0.d dVar = (ui0.d) ((Function0) ((ecm.q) this.f280389c).f124861b).invoke();
                ui0.f fVar = (ui0.f) ((Function0) ((ecm.q) this.d).f124861b).invoke();
                dVar.getClass();
                fVar.getClass();
                return new kf0.c(dVar, fVar);
        }
    }
}
