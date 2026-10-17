package na1;

import ha1.v;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import n4d.a0;
import n8i.q0;
import pfm.t;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f213672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f213673b;

    public /* synthetic */ b(g gVar, int i) {
        this.f213672a = i;
        this.f213673b = gVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f213672a) {
            case 0:
                this.f213673b.a();
                return Unit.f186387a;
            default:
                qa1.h firmwareFile = (qa1.h) obj2;
                Intrinsics.checkNotNullParameter(firmwareFile, "firmwareFile");
                g gVar = this.f213673b;
                v vVar = gVar.d;
                pfm.a aVarE = vVar.e(firmwareFile.d, firmwareFile.f243941c).e(vVar.f(firmwareFile.e).filter(new a0(new q0(3), 27)).doOnNext(new a0(new b(gVar, 0), 28)).ignoreElements());
                a0 a0Var = new a0(new c(firmwareFile, 0), 29);
                dfm.c cVar = mfm.f.d;
                en.a aVar = mfm.f.f205043c;
                return new t(aVarE, a0Var, cVar, aVar, aVar, aVar, aVar).l(new d(firmwareFile, 0));
        }
    }
}
