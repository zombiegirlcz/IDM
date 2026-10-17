package dj5;

import android.content.Context;
import da3.j;
import ecm.q;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends b60.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f115096b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f115097c;
    public final a31.a d;
    public final q e;

    public /* synthetic */ b(q qVar, a31.a aVar, q qVar2, int i) {
        this.f115096b = i;
        this.f115097c = qVar;
        this.d = aVar;
        this.e = qVar2;
    }

    @Override // b60.a
    public final Object a() {
        switch (this.f115096b) {
            case 0:
                Context context = (Context) ((Function0) this.f115097c.f124861b).invoke();
                l70.e eVar = (l70.e) ((phm.a) this.d.f955b).get();
                th0.a aVar = (th0.a) ((Function0) this.e.f124861b).invoke();
                context.getClass();
                eVar.getClass();
                aVar.getClass();
                return new e(eVar, aVar);
            case 1:
                Context context2 = (Context) ((Function0) this.f115097c.f124861b).invoke();
                poi.b bVar = (poi.b) ((phm.a) this.d.f955b).get();
                th0.a aVar2 = (th0.a) ((Function0) this.e.f124861b).invoke();
                context2.getClass();
                bVar.getClass();
                aVar2.getClass();
                return new ini.f(bVar, aVar2, context2);
            case 2:
                Context context3 = (Context) ((Function0) this.f115097c.f124861b).invoke();
                l70.e eVar2 = (l70.e) ((phm.a) this.d.f955b).get();
                th0.a aVar3 = (th0.a) ((Function0) this.e.f124861b).invoke();
                context3.getClass();
                eVar2.getClass();
                aVar3.getClass();
                return new pqi.a(eVar2, aVar3, context3);
            default:
                Context context4 = (Context) ((Function0) this.f115097c.f124861b).invoke();
                j jVar = (j) ((phm.a) this.d.f955b).get();
                th0.a aVar4 = (th0.a) ((Function0) this.e.f124861b).invoke();
                context4.getClass();
                jVar.getClass();
                aVar4.getClass();
                return new uc9.b(jVar, aVar4);
        }
    }
}
