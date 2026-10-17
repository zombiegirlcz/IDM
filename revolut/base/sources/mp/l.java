package mp;

import android.content.Context;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class l implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f207703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f207704b;

    public /* synthetic */ l(p pVar, int i) {
        this.f207703a = i;
        this.f207704b = pVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f207703a) {
            case 0:
                return new n(this.f207704b);
            case 1:
                return ((voi.h) this.f207704b.f207709b).f290972a;
            case 2:
                return new o(this.f207704b);
            case 3:
                ui0.c cVar = ui0.d.Companion;
                ((voi.h) this.f207704b.f207709b).getClass();
                cVar.getClass();
                return ui0.c.a("10.151");
            case 4:
                ((voi.h) this.f207704b.f207709b).getClass();
                return new dm0.c();
            case 5:
                return new m(this.f207704b);
            case 6:
                phm.a aVar = (phm.a) j6.a.i((Context) this.f207704b.f207710c, h51.a.class);
                b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                if (aVar2 != null) {
                    return (qz0.b) ((h51.a) aVar2.b()).f149423j.get();
                }
                throw new IllegalStateException(a0.d.q("Api ", h51.a.class, " is not found"));
            case 7:
                return ((voi.h) this.f207704b.f207709b).d;
            case 8:
                return ((nj0.d) this.f207704b.j()).f();
            case 9:
                ((voi.h) this.f207704b.f207709b).getClass();
                return "com.revolut.revolut";
            case 10:
                return (List) this.f207704b.d;
            case 11:
                ((voi.h) this.f207704b.f207709b).getClass();
                return new ui0.f();
            default:
                return ((voi.h) this.f207704b.f207709b).f290973b;
        }
    }
}
