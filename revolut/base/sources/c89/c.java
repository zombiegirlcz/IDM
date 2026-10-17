package c89;

import android.content.Context;
import ecm.q;
import kotlin.jvm.functions.Function0;
import lal.j;
import ms1.h;
import ms1.i;

/* JADX INFO: loaded from: classes13.dex */
public final class c extends b60.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f22149b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a31.a f22150c;
    public final phm.a d;
    public final Object e;

    public c(a31.a aVar, a31.a aVar2, a1j.a aVar3) {
        this.f22150c = aVar;
        this.e = aVar2;
        this.d = aVar3;
    }

    @Override // b60.a
    public final Object a() {
        switch (this.f22149b) {
            case 0:
                fqk.a aVar = (fqk.a) ((phm.a) this.f22150c.f955b).get();
                uy5.e eVar = (uy5.e) ((phm.a) ((a31.a) this.e).f955b).get();
                b bVar = (b) this.d.get();
                aVar.getClass();
                eVar.getClass();
                bVar.getClass();
                return new a(aVar, eVar, bVar);
            default:
                Context context = (Context) ((Function0) ((q) this.e).f124861b).invoke();
                uw1.b bVar2 = (uw1.b) ((phm.a) this.f22150c.f955b).get();
                i iVar = (i) this.d.get();
                context.getClass();
                bVar2.getClass();
                iVar.getClass();
                return new h(bVar2, iVar);
        }
    }

    public c(q qVar, a31.a aVar, j jVar) {
        this.e = qVar;
        this.f22150c = aVar;
        this.d = jVar;
    }
}
