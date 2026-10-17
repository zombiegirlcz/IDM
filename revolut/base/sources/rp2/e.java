package rp2;

import android.os.Parcelable;
import aw0.c7;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.LocalDateClause$DateFormat;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.j;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.bank_account_switching.api.R$string;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import do3.q;
import gim.i;
import java.time.LocalDate;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nii.h0;
import nii.j0;
import nii.u1;
import nii.y0;
import yhm.o;
import yji.l;
import zhm.u;

/* JADX INFO: loaded from: classes21.dex */
public final class e extends i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.bank_account_switching.impl.ui.switch_out.a f256251w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f256252x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ mn2.a f256253y;
    public final /* synthetic */ LocalDate z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(com.revolut.feature.bank_account_switching.impl.ui.switch_out.a aVar, String str, mn2.a aVar2, LocalDate localDate, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f256251w = aVar;
        this.f256252x = str;
        this.f256253y = aVar2;
        this.z = localDate;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new e(this.f256251w, this.f256252x, this.f256253y, this.z, continuation, 0);
            default:
                return new e(this.f256251w, this.f256252x, this.f256253y, this.z, continuation, 1);
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
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                com.revolut.feature.bank_account_switching.impl.ui.switch_out.a aVar2 = this.f256251w;
                if (i == 0) {
                    o.b(obj2);
                    bp2.c cVar = aVar2.f64051r;
                    this.v = 1;
                    if (cVar.a(this.f256252x, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                aVar2.f64050q.getClass();
                LocalDate switchDate = this.z;
                Intrinsics.checkNotNullParameter(switchDate, "switchDate");
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.account_switch_accept_title, null, null, 14);
                int i2 = R$string.account_switch_account_closure_confirmation_success_description;
                j jVar = c7.Companion;
                LocalDateClause$DateFormat.INSTANCE.getClass();
                l.b1(aVar2, aVar2.X1(new y0("ID_CONFIRM_DIALOG_SUCCESS", new j0((Clause) textLocalisedClause, (Clause) new TextLocalisedClause(i2, u.c(j.b(jVar, switchDate, LocalDateClause$DateFormat.Companion.f57815b)), null, 12), (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4092), false, 4)), null, new rk9.d(this.f256253y, aVar2, null, 13), 3);
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    o.b(obj2);
                    com.revolut.feature.bank_account_switching.impl.ui.switch_out.a aVar4 = this.f256251w;
                    e eVar = new e(aVar4, this.f256252x, this.f256253y, this.z, null, 0);
                    this.v = 1;
                    if (q.t(aVar4, eVar, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
