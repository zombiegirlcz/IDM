package l25;

import com.revolut.feature.credit.core.ui.bottom_sheet.action.ActionsBottomSheetController;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes22.dex */
public final class i extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ u f191634w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f191635x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(u uVar, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f191634w = uVar;
        this.f191635x = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new i(this.f191634w, this.f191635x, continuation, 0);
            case 1:
                return new i(this.f191634w, this.f191635x, continuation, 1);
            case 2:
                return new i(this.f191634w, this.f191635x, continuation, 2);
            default:
                return new i(this.f191634w, this.f191635x, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((i) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                u uVar = this.f191634w;
                h hVar = new h(uVar, this.f191635x, null, 0);
                this.v = 1;
                Object objB = pu7.a.B(uVar.e, "Start credit card limit decrease application", hVar, this);
                return objB == aVar ? aVar : objB;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                String str = this.f191635x;
                u uVar2 = this.f191634w;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    v15.k kVar = uVar2.v;
                    this.v = 1;
                    obj2 = kVar.a(str, this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                v15.g gVar = (v15.g) obj2;
                pm4.e eVar = uVar2.f191651q;
                boolean z = gVar instanceof v15.d;
                ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
                if (z) {
                    v15.d dVar = (v15.d) gVar;
                    ActionsBottomSheetController actionsBottomSheetControllerC = eVar.c(dVar.f285230b, dVar.f285231c);
                    a block = new a(uVar2, str, 0);
                    Intrinsics.checkNotNullParameter(block, "block");
                    actionsBottomSheetControllerC.H = block;
                    yji.n.P2(uVar2, actionsBottomSheetControllerC, bottom_dialog, null, 2);
                } else if (gVar instanceof v15.f) {
                    v15.f fVar = (v15.f) gVar;
                    ActionsBottomSheetController actionsBottomSheetControllerD = eVar.d(fVar.f285234b, fVar.f285235c);
                    a block2 = new a(uVar2, str, 1);
                    Intrinsics.checkNotNullParameter(block2, "block");
                    actionsBottomSheetControllerD.H = block2;
                    yji.n.P2(uVar2, actionsBottomSheetControllerD, bottom_dialog, null, 2);
                } else if (gVar instanceof v15.c) {
                    v15.c cVar = (v15.c) gVar;
                    ActionsBottomSheetController actionsBottomSheetControllerB = eVar.b(cVar.f285228c, cVar.f285227b, cVar.d);
                    a block3 = new a(uVar2, str, 2);
                    Intrinsics.checkNotNullParameter(block3, "block");
                    actionsBottomSheetControllerB.H = block3;
                    yji.n.P2(uVar2, actionsBottomSheetControllerB, bottom_dialog, null, 2);
                } else if (gVar instanceof v15.e) {
                    yji.n.P2(uVar2, eVar.a(), bottom_dialog, null, 2);
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    u uVar3 = this.f191634w;
                    h hVar2 = new h(uVar3, this.f191635x, null, 1);
                    this.v = 1;
                    if (uVar3.Y2(this, hVar2) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    u uVar4 = this.f191634w;
                    h hVar3 = new h(uVar4, this.f191635x, null, 2);
                    this.v = 1;
                    if (uVar4.Y2(this, hVar3) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
