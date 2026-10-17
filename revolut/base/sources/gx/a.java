package gx;

import android.content.Context;
import ecm.q;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes16.dex */
public final class a extends b60.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f147605b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f147606c;
    public final q d;
    public final a31.a e;
    public final a31.a f;

    public /* synthetic */ a(q qVar, q qVar2, a31.a aVar, a31.a aVar2, int i) {
        this.f147605b = i;
        this.f147606c = qVar;
        this.d = qVar2;
        this.e = aVar;
        this.f = aVar2;
    }

    @Override // b60.a
    public final Object a() {
        switch (this.f147605b) {
            case 0:
                Context context = (Context) ((Function0) this.f147606c.f124861b).invoke();
                th0.a aVar = (th0.a) ((Function0) this.d.f124861b).invoke();
                ri0.a aVar2 = (ri0.a) ((phm.a) this.e.f955b).get();
                sw.c cVar = (sw.c) ((phm.a) this.f.f955b).get();
                context.getClass();
                aVar.getClass();
                aVar2.getClass();
                cVar.getClass();
                return new c(aVar, aVar2, cVar, context);
            case 1:
                Context context2 = (Context) ((Function0) this.f147606c.f124861b).invoke();
                th0.a aVar3 = (th0.a) ((Function0) this.d.f124861b).invoke();
                n0m.a aVar4 = (n0m.a) ((phm.a) this.e.f955b).get();
                sw.c cVar2 = (sw.c) ((phm.a) this.f.f955b).get();
                context2.getClass();
                aVar3.getClass();
                aVar4.getClass();
                cVar2.getClass();
                return new u00.d(aVar3, aVar4, cVar2);
            default:
                Context context3 = (Context) ((Function0) this.f147606c.f124861b).invoke();
                xwh.a aVar5 = (xwh.a) ((Function0) this.d.f124861b).invoke();
                nj0.a aVar6 = (nj0.a) ((phm.a) this.e.f955b).get();
                jm0.a aVar7 = (jm0.a) ((phm.a) this.f.f955b).get();
                context3.getClass();
                aVar5.getClass();
                aVar6.getClass();
                aVar7.getClass();
                return new zwh.c(aVar6, aVar7, context3, aVar5);
        }
    }
}
