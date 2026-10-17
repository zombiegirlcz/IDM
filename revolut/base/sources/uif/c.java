package uif;

import efm.d0;
import efm.k;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import pfm.l;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f280425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function0 f280426b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f280427c;

    public /* synthetic */ c(Function0 function0, g gVar, int i) {
        this.f280425a = i;
        this.f280426b = function0;
        this.f280427c = gVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Long id10 = (Long) obj2;
        switch (this.f280425a) {
            case 0:
                Intrinsics.checkNotNullParameter(id10, "id");
                k kVar = (k) this.f280426b.invoke();
                int i = 0;
                e eVar = new e(this.f280427c, id10, i);
                kVar.getClass();
                return new rfm.f(kVar, eVar, i);
            case 1:
                Intrinsics.checkNotNullParameter(id10, "id");
                efm.b bVar = (efm.b) this.f280426b.invoke();
                e eVar2 = new e(this.f280427c, id10, 3);
                bVar.getClass();
                return new l(bVar, eVar2, 0);
            default:
                Intrinsics.checkNotNullParameter(id10, "id");
                d0 d0Var = (d0) this.f280426b.invoke();
                e eVar3 = new e(this.f280427c, id10, 2);
                d0Var.getClass();
                return new rfm.l(d0Var, eVar3, 5);
        }
    }
}
