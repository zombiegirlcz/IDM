package nj4;

import android.os.Parcelable;
import au3.m;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.credit.application.plugins.impl.ui.waiting_list.WaitingListFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.waiting_list.WaitingListFlowContract$Step;
import com.revolut.feature.credit.core.R$string;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import ft3.j1;
import hw3.n;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import nii.g0;
import nii.h0;
import nii.j0;
import nii.u1;
import nii.v1;
import nii.y0;
import yhm.o;
import yji.l;

/* JADX INFO: loaded from: classes22.dex */
public final class e extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.waiting_list.a f216359w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(com.revolut.feature.credit.application.plugins.impl.ui.waiting_list.a aVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f216359w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new e(this.f216359w, continuation, 0);
            case 1:
                return new e(this.f216359w, continuation, 1);
            default:
                return new e(this.f216359w, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((e) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objA;
        int i = this.u;
        com.revolut.feature.credit.application.plugins.impl.ui.waiting_list.a aVar = this.f216359w;
        Continuation continuation = null;
        int i2 = 1;
        switch (i) {
            case 0:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    o.b(obj2);
                    n nVar = aVar.o;
                    j1 j1Var = aVar.f68520p.f68517a;
                    this.v = 1;
                    if (nVar.b(j1Var, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return l.b1(aVar, aVar.X1(new y0(null, new j0((Clause) new TextLocalisedClause(R$string.credit_waiting_list_subscribed_title_just_subscribed, null, null, 14), (Clause) new TextLocalisedClause(R$string.credit_waiting_list_subscribed_subtitle, null, null, 14), (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) new v1(new TextLocalisedClause(R$string.credit_waiting_list_subscribed_button_got_it, null, null, 14), null), false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4076), false, 5)), null, new d(aVar, null, 0), 3);
            case 1:
                com.revolut.feature.credit.application.plugins.impl.ui.waiting_list.a aVar3 = this.f216359w;
                WaitingListFlowContract$InputData waitingListFlowContract$InputData = aVar3.f68520p;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    o.b(obj2);
                    n nVar2 = aVar3.o;
                    j1 j1Var2 = waitingListFlowContract$InputData.f68517a;
                    this.v = 1;
                    objA = n.a(nVar2, j1Var2, this);
                    if (objA == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i5 != 1) {
                        if (i5 == 2) {
                            o.b(obj2);
                            return Unit.f186387a;
                        }
                        if (i5 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o.b(obj2);
                        Unit unit = Unit.f186387a;
                        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Unsupported WaitingListSubscriptionStatus");
                        zhm.h0 h0Var = zhm.h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
                        return Unit.f186387a;
                    }
                    o.b(obj2);
                    objA = obj2;
                }
                int i6 = h.f216362a[((m) objA).ordinal()];
                if (i6 == 1) {
                    switch (c.f216357a[waitingListFlowContract$InputData.f68517a.ordinal()]) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                            oki.h.t2(aVar3, aVar3.f68522r, WaitingListFlowContract$Step.WaitingListSubscribed.f68519a, false, null, false, 12);
                            break;
                        case 16:
                        case 17:
                            l.b1(aVar3, aVar3.X1(new y0("already_in_waitlist_dialog", new g0(new TextLocalisedClause(R$string.credit_waiting_list_already_subscribed_dialog_title, null, null, 14), new TextLocalisedClause(R$string.credit_waiting_list_already_subscribed_dialog_subtitle, null, null, 14), null, new TextLocalisedClause(R$string.credit_common_got_it, null, null, 14), null, null, null, null, false, null, false, null, 16372), false, 4)), null, new d(aVar3, null, 1), 3);
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                } else if (i6 == 2) {
                    this.v = 2;
                    if (com.revolut.feature.credit.application.plugins.impl.ui.waiting_list.a.I2(aVar3, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i6 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    this.v = 3;
                    if (com.revolut.feature.credit.application.plugins.impl.ui.waiting_list.a.I2(aVar3, this) == aVar4) {
                        return aVar4;
                    }
                    Unit unit2 = Unit.f186387a;
                    IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException("Unsupported WaitingListSubscriptionStatus");
                    zhm.h0 h0Var2 = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException2, h0Var2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                if (i21 == 0) {
                    o.b(obj2);
                    e eVar = new e(aVar, continuation, i2);
                    this.v = 1;
                    if (aVar.p2(this, eVar) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
