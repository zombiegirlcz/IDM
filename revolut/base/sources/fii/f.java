package fii;

import com.revolut.kompot.common.bottom_sheet.status.StatusSheetController;
import dii.m;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nii.j1;
import nii.k1;
import nii.m0;
import yhm.o;

/* JADX INFO: loaded from: classes10.dex */
public final class f extends i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ StatusSheetController f135429w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(StatusSheetController statusSheetController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f135429w = statusSheetController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                f fVar = new f(this.f135429w, continuation, 0);
                fVar.v = obj2;
                return fVar;
            default:
                f fVar2 = new f(this.f135429w, continuation, 1);
                fVar2.v = obj2;
                return fVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((f) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((f) create((gy0.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        StatusSheetController statusSheetController = this.f135429w;
        switch (i) {
            case 0:
                ty0.a aVar = (ty0.a) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                m mVar = statusSheetController.O;
                m0 m0VarD3 = statusSheetController.d3();
                Intrinsics.h(aVar);
                mVar.I2(new j1(m0VarD3, aVar));
                break;
            default:
                gy0.b bVar = (gy0.b) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                if (bVar == gy0.b.FINISHED) {
                    statusSheetController.O.I2(new k1(statusSheetController.d3()));
                }
                break;
        }
        return Unit.f186387a;
    }
}
