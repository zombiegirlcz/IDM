package v60;

import com.revolut.data.model.Data;
import efm.d0;
import ihm.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class f implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f286248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f286249b;

    public /* synthetic */ f(g gVar, int i) {
        this.f286248a = i;
        this.f286249b = gVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f286248a) {
            case 0:
                ((j) this.f286249b.d).onNext(new Data(null, null, true, 3, null));
                return Unit.f186387a;
            case 1:
                ((j) this.f286249b.d).onNext(new Data(obj2, null, false, 6, null));
                return Unit.f186387a;
            case 2:
                ((j) this.f286249b.d).onNext(new Data(null, (Throwable) obj2, false, 5, null));
                return Unit.f186387a;
            default:
                g gVar = this.f286249b;
                Function1 function1 = (Function1) gVar.f286251b;
                Intrinsics.h(obj2);
                d0 d0Var = (d0) function1.invoke(obj2);
                v4a.i iVar = new v4a.i(18, new f(gVar, 0));
                d0Var.getClass();
                pfm.h hVar = new pfm.h(new ufm.f(new ufm.f(new ufm.f(d0Var, iVar, 2), new v4a.i(19, new f(gVar, 1)), 3), new v4a.i(20, new f(gVar, 2)), 1), 4);
                Intrinsics.checkNotNullExpressionValue(hVar, "ignoreElement(...)");
                return ue0.e.v(hVar);
        }
    }
}
