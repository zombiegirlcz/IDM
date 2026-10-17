package v25;

import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.credit.loan.api.models.rev10.Loan;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o45.x1;
import o55.q;
import pfm.r;
import rp0.a1;
import rp0.f1;
import te0.w;
import uyh.s;

/* JADX INFO: loaded from: classes22.dex */
public final class b extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ o f285646w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f285647x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(o oVar, String str, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f285646w = oVar;
        this.f285647x = str;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new b(this.f285646w, this.f285647x, continuation, 0);
            case 1:
                return new b(this.f285646w, this.f285647x, continuation, 1);
            case 2:
                return new b(this.f285646w, this.f285647x, continuation, 2);
            case 3:
                return new b(this.f285646w, this.f285647x, continuation, 3);
            default:
                return new b(this.f285646w, this.f285647x, continuation, 4);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((b) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objC;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    y45.f fVar = (y45.f) this.f285646w.f285664m;
                    fVar.getClass();
                    final String loanId = this.f285647x;
                    Intrinsics.checkNotNullParameter(loanId, "loanId");
                    y45.i iVar = fVar.f310796c;
                    Intrinsics.checkNotNullParameter(loanId, "loanId");
                    final q qVar = (q) iVar.f310803a;
                    qVar.getClass();
                    Intrinsics.checkNotNullParameter(loanId, "loanId");
                    final int i2 = 0;
                    pfm.h hVar = new pfm.h(new kfm.a() { // from class: o55.m
                        @Override // kfm.a
                        public final void run() {
                            switch (i2) {
                                case 0:
                                    q qVar2 = qVar;
                                    RoomDatabase roomDatabase = qVar2.e.f212295a;
                                    String str = loanId;
                                    x1 x1Var = (x1) DBUtil.performBlocking(roomDatabase, true, false, new mll.h(str, 11));
                                    if (x1Var == null) {
                                        x1Var = new x1(str, false);
                                    }
                                    n45.c cVar = qVar2.e;
                                    DBUtil.performBlocking(cVar.f212295a, false, true, new n09.j0(cVar, x1.a(x1Var, false), 27));
                                    break;
                                default:
                                    q qVar3 = qVar;
                                    RoomDatabase roomDatabase2 = qVar3.e.f212295a;
                                    String str2 = loanId;
                                    x1 x1Var2 = (x1) DBUtil.performBlocking(roomDatabase2, true, false, new mll.h(str2, 11));
                                    if (x1Var2 == null) {
                                        x1Var2 = new x1(str2, false);
                                    }
                                    n45.c cVar2 = qVar3.e;
                                    DBUtil.performBlocking(cVar2.f212295a, false, true, new n09.j0(cVar2, x1.a(x1Var2, true), 27));
                                    break;
                            }
                        }
                    }, 2);
                    Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
                    r rVarG0 = w.g0(hVar);
                    this.v = 1;
                    if (nim.a.a(rVarG0, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                final String loanId2 = this.f285647x;
                o oVar = this.f285646w;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    y45.f fVar2 = (y45.f) oVar.f285664m;
                    fVar2.getClass();
                    Intrinsics.checkNotNullParameter(loanId2, "loanId");
                    y45.i iVar2 = fVar2.f310796c;
                    Intrinsics.checkNotNullParameter(loanId2, "loanId");
                    final q qVar2 = (q) iVar2.f310803a;
                    qVar2.getClass();
                    Intrinsics.checkNotNullParameter(loanId2, "loanId");
                    final int i5 = 1;
                    pfm.h hVar2 = new pfm.h(new kfm.a() { // from class: o55.m
                        @Override // kfm.a
                        public final void run() {
                            switch (i5) {
                                case 0:
                                    q qVar22 = qVar2;
                                    RoomDatabase roomDatabase = qVar22.e.f212295a;
                                    String str = loanId2;
                                    x1 x1Var = (x1) DBUtil.performBlocking(roomDatabase, true, false, new mll.h(str, 11));
                                    if (x1Var == null) {
                                        x1Var = new x1(str, false);
                                    }
                                    n45.c cVar = qVar22.e;
                                    DBUtil.performBlocking(cVar.f212295a, false, true, new n09.j0(cVar, x1.a(x1Var, false), 27));
                                    break;
                                default:
                                    q qVar3 = qVar2;
                                    RoomDatabase roomDatabase2 = qVar3.e.f212295a;
                                    String str2 = loanId2;
                                    x1 x1Var2 = (x1) DBUtil.performBlocking(roomDatabase2, true, false, new mll.h(str2, 11));
                                    if (x1Var2 == null) {
                                        x1Var2 = new x1(str2, false);
                                    }
                                    n45.c cVar2 = qVar3.e;
                                    DBUtil.performBlocking(cVar2.f212295a, false, true, new n09.j0(cVar2, x1.a(x1Var2, true), 27));
                                    break;
                            }
                        }
                    }, 2);
                    Intrinsics.checkNotNullExpressionValue(hVar2, "fromAction(...)");
                    r rVarG02 = w.g0(hVar2);
                    this.v = 1;
                    if (nim.a.a(rVarG02, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                Continuation continuation = null;
                b bVar = new b(oVar, loanId2, continuation, 0);
                yji.n.l2(oVar, oVar.L2(new mii.f("loan-hidden-tooltip", new TextLocalisedClause(R$string.loan_repaid_hide_loan_toast_message, null, null, 14), new TextLocalisedClause(R$string.loan_repaid_hide_loan_toast_action_undo, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_eye_hide, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), f1.ABOVE_ANCHOR_VIEW, a1.LONG, 8)), null, new v06.i(bVar, continuation, 3), 3);
                return Unit.f186387a;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    yhm.o.b(obj2);
                    o oVar2 = this.f285646w;
                    f9i.c cVar = new f9i.c(new f9i.e(oVar2.o.a(this.f285647x), true));
                    this.v = 1;
                    if (oVar2.C2(cVar, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 3:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                o oVar3 = this.f285646w;
                if (i21 == 0) {
                    yhm.o.b(obj2);
                    efm.r rVarG = m70.a.g(oVar3.f285665n.a(this.f285647x, w4l.h.f294642c), null, new s(29), 1);
                    this.v = 1;
                    objC = nim.a.c(rVarG, this);
                    if (objC == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objC = obj2;
                }
                Loan loan = (Loan) objC;
                Intrinsics.h(loan);
                oVar3.f285668r.O(oVar3.f285667q.a(loan));
                return Unit.f186387a;
            default:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i22 = this.v;
                if (i22 == 0) {
                    yhm.o.b(obj2);
                    r35.c cVar2 = new r35.c(this.f285647x);
                    this.v = 1;
                    if (this.f285646w.C2(cVar2, this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
