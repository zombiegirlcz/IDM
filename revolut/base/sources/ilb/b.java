package ilb;

import aw0.n6;
import com.revolut.feature.retail.savings.impl.core.info_sheets.presentation.screens.bottom_sheet.BottomInfoSheetScreen;
import gim.i;
import koi.j;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import qv0.p;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ BottomInfoSheetScreen f162215w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(BottomInfoSheetScreen bottomInfoSheetScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f162215w = bottomInfoSheetScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                b bVar = new b(this.f162215w, continuation, 0);
                bVar.v = obj2;
                return bVar;
            case 1:
                b bVar2 = new b(this.f162215w, continuation, 1);
                bVar2.v = obj2;
                return bVar2;
            default:
                b bVar3 = new b(this.f162215w, continuation, 2);
                bVar3.v = obj2;
                return bVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((b) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((b) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((b) create(obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r10v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        BottomInfoSheetScreen bottomInfoSheetScreen = this.f162215w;
        switch (i) {
            case 0:
                n6 n6Var = (n6) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                d dVar = (d) bottomInfoSheetScreen.Y.getValue();
                Object obj3 = n6Var.k;
                dVar.getClass();
                Intrinsics.checkNotNullParameter("", "listId");
                dVar.l2(new hsd.c(dVar, obj3, "", (Continuation) null, 19), new yi5.b(26));
                break;
            case 1:
                ty0.a aVar2 = (ty0.a) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                d dVar2 = (d) bottomInfoSheetScreen.Y.getValue();
                Object obj4 = aVar2.d;
                String listId = aVar2.f275445a;
                dVar2.getClass();
                Intrinsics.checkNotNullParameter(listId, "listId");
                dVar2.l2(new hsd.c(dVar2, obj4, listId, (Continuation) null, 19), new yi5.b(26));
                break;
            default:
                Object obj5 = this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                d dVar3 = (d) bottomInfoSheetScreen.Y.getValue();
                Object f55256g = ((p) obj5).getF55256g();
                String listId2 = ((j) obj5).getF55254b();
                dVar3.getClass();
                Intrinsics.checkNotNullParameter(listId2, "listId");
                dVar3.l2(new hsd.c(dVar3, f55256g, listId2, (Continuation) null, 19), new yi5.b(26));
                break;
        }
        return Unit.f186387a;
    }
}
