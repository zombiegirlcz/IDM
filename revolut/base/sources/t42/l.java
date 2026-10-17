package t42;

import aw0.f4;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.apm.core.models.transfers.ApmTransferPayerSettings;
import com.revolut.feature.apm.core.ui.impl.ui.transfer.amount.TransferAmountScreen;
import com.revolut.feature.apm.core.ui.impl.ui.transfer.amount_settings.TransferSettingsContract$InputData;
import com.revolut.feature.apm.core.ui.impl.ui.transfer.amount_settings.TransferSettingsScreen;
import com.revolut.feature.transfer.core.api.schedule.ScheduleTransferInputData;
import java.time.LocalDate;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class l extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ TransferAmountScreen f267857w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(TransferAmountScreen transferAmountScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f267857w = transferAmountScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                l lVar = new l(this.f267857w, continuation, 0);
                lVar.v = obj2;
                return lVar;
            case 1:
                l lVar2 = new l(this.f267857w, continuation, 1);
                lVar2.v = obj2;
                return lVar2;
            case 2:
                l lVar3 = new l(this.f267857w, continuation, 2);
                lVar3.v = obj2;
                return lVar3;
            default:
                l lVar4 = new l(this.f267857w, continuation, 3);
                lVar4.v = obj2;
                return lVar4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((l) create((yof.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((l) create((f4) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((l) create((a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((l) create((CharSequence) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        Continuation continuation = null;
        int i2 = 0;
        TransferAmountScreen transferAmountScreen = this.f267857w;
        switch (i) {
            case 0:
                yof.b payload = (yof.b) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                h hVarF3 = transferAmountScreen.R2();
                Intrinsics.h(payload);
                com.revolut.feature.apm.core.ui.impl.ui.transfer.amount.c cVar = (com.revolut.feature.apm.core.ui.impl.ui.transfer.amount.c) hVarF3;
                cVar.getClass();
                Intrinsics.checkNotNullParameter(payload, "payload");
                cVar.l2(new sx2.r(cVar, payload, continuation, 10), new yi5.b(26));
                return Unit.f186387a;
            case 1:
                f4 focusData = (f4) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                h hVarF32 = transferAmountScreen.R2();
                Intrinsics.h(focusData);
                com.revolut.feature.apm.core.ui.impl.ui.transfer.amount.c cVar2 = (com.revolut.feature.apm.core.ui.impl.ui.transfer.amount.c) hVarF32;
                cVar2.getClass();
                Intrinsics.checkNotNullParameter(focusData, "focusData");
                cVar2.v.b(focusData);
                return Unit.f186387a;
            case 2:
                a button = (a) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                h hVarF33 = transferAmountScreen.R2();
                Intrinsics.h(button);
                com.revolut.feature.apm.core.ui.impl.ui.transfer.amount.c cVar3 = (com.revolut.feature.apm.core.ui.impl.ui.transfer.amount.c) hVarF33;
                cVar3.getClass();
                Intrinsics.checkNotNullParameter(button, "button");
                int i3 = t.f267866a[button.ordinal()];
                int i5 = 2;
                int i6 = 1;
                if (i3 == 1) {
                    cVar3.u.Q();
                    cVar3.l2(new x(cVar3, continuation, i5), new yi5.b(26));
                } else if (i3 == 2) {
                    System.out.println((Object) "TODO: DRAFT CLICKED");
                } else if (i3 == 3) {
                    ApmTransferPayerSettings apmTransferPayerSettings = cVar3.N2().f;
                    if (apmTransferPayerSettings != null) {
                        yji.l.j2(cVar3, new TransferSettingsScreen(new TransferSettingsContract$InputData(apmTransferPayerSettings)), null, new q(cVar3, i2), 1);
                    }
                } else {
                    if (i3 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    yji.l.g2(cVar3, ((qpf.h) cVar3.C).d(new ScheduleTransferInputData((TextLocalisedClause) null, cVar3.N2().f62456g, m1l.a.SCHEDULE_ENABLED, (TextLocalisedClause) null, (List) null, false, (AnalyticsContext) null, (LocalDate) null, (LocalDate) null, false, false, false, 8185)), null, new q(cVar3, i6), 1);
                }
                return Unit.f186387a;
            default:
                CharSequence charSequence = (CharSequence) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                h hVarF34 = transferAmountScreen.R2();
                String amount = charSequence.toString();
                com.revolut.feature.apm.core.ui.impl.ui.transfer.amount.c cVar4 = (com.revolut.feature.apm.core.ui.impl.ui.transfer.amount.c) hVarF34;
                cVar4.getClass();
                Intrinsics.checkNotNullParameter(amount, "amount");
                cVar4.O2(new r(cVar4, amount, 0));
                return Unit.f186387a;
        }
    }
}
