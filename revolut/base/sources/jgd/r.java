package jgd;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.vh;
import com.revolut.feature.shared_separate_favourites.domain.converter.SharedConverterItem;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import skm.e0;
import skm.p0;

/* JADX INFO: loaded from: classes7.dex */
public final class r extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ vh v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ x f173983w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(vh vhVar, x xVar, Continuation continuation) {
        super(1, continuation);
        this.v = vhVar;
        this.f173983w = xVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new r(this.v, this.f173983w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((r) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        Object obj3 = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            vh vhVar = this.v;
            if (Intrinsics.f(vhVar.f54883a.f53505a, "LIST_ID_DELETE_ACTION")) {
                Object obj4 = ((RowDelegate.Model) vhVar.f54884b).u;
                SharedConverterItem sharedConverterItem = obj4 instanceof SharedConverterItem ? (SharedConverterItem) obj4 : null;
                if (sharedConverterItem == null) {
                    return Unit.f186387a;
                }
                d3d.g gVar = this.f173983w.f173987p;
                this.u = 1;
                h4d.f fVar = new h4d.f(gVar.f111093a, ifk.b.J(sharedConverterItem), null, 1);
                p0 p0Var = p0.f264001a;
                Object objJ = e0.J(elm.f.f127540b, fVar, this);
                if (objJ != obj3) {
                    objJ = Unit.f186387a;
                }
                if (objJ != obj3) {
                    objJ = Unit.f186387a;
                }
                if (objJ == obj3) {
                    return obj3;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return Unit.f186387a;
    }
}
