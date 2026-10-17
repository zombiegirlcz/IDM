package qzb;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.rev_points.api.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import efm.d0;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import nii.y;
import nii.y0;
import pfm.z;
import zh9.u0;
import zhm.h0;

/* JADX INFO: loaded from: classes6.dex */
public final class t extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.rev_points.impl.ui.opt_in.screen.a f250513w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(int i, com.revolut.feature.rev_points.impl.ui.opt_in.screen.a aVar, Continuation continuation) {
        super(1, continuation);
        this.u = i;
        this.f250513w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new t(0, this.f250513w, continuation);
            case 1:
                return new t(1, this.f250513w, continuation);
            case 2:
                return new t(2, this.f250513w, continuation);
            default:
                return new t(3, this.f250513w, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((t) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objB;
        int i = this.u;
        int i2 = 2;
        Continuation continuation = null;
        com.revolut.feature.rev_points.impl.ui.opt_in.screen.a aVar = this.f250513w;
        int i3 = 1;
        switch (i) {
            case 0:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                com.revolut.feature.rev_points.impl.ui.opt_in.screen.a aVar3 = this.f250513w;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    ((jxb.l) aVar3.f83821q.f220804a).e.h(Unit.f186387a);
                    d0 d0VarE = ((nyb.o) aVar3.f83820p).e(true);
                    qza.a aVar4 = new qza.a(6, new qz9.b(19));
                    d0VarE.getClass();
                    z zVar = new z(new ufm.i(d0VarE, aVar4, 1), 1, new q2j.k(12), null);
                    Intrinsics.checkNotNullExpressionValue(zVar, "onErrorReturn(...)");
                    this.v = 1;
                    objB = nim.a.b(zVar, this);
                    if (objB == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objB = obj2;
                }
                IllegalStateException illegalStateException = new IllegalStateException(j6.a.q("NoInfo state received. New opt-in state after refreshing points account: ", (String) objB));
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                return yji.l.a1(aVar3, aVar3.X1(new y0(null, new nii.z(new TextLocalisedClause(R$string.rev_points_opt_in_generic_error, null, null, 14), null, new TextLocalisedClause(R.string.common_action_got_it, null, null, 14), null, null, null, false, null, null, null, null, new y(2, com.google.android.gms.internal.mlkit_vision_face.a.o(o0.f186429a.b(illegalStateException.getClass()).m(), ": ", illegalStateException.getMessage()), null), null, 24566), false, 5)), null, null, new p(i3, aVar3, continuation), 3);
            case 1:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    if (aVar.J2(this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                if (i21 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    if (com.revolut.feature.rev_points.impl.ui.opt_in.screen.a.I2(aVar, this) == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                int i22 = this.v;
                if (i22 == 0) {
                    yhm.o.b(obj2);
                    t tVar = new t(i2, aVar, continuation);
                    this.v = 1;
                    if (u0.b0(aVar.X(), "ACTION_FOOTER_BUTTON_TAG", tVar, this) == aVar7) {
                        return aVar7;
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
