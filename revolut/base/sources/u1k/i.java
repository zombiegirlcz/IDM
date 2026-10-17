package u1k;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import com.revolut.retail.feature.payment_options.impl.R$string;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nii.h0;
import nii.j0;
import nii.u1;
import nii.y0;
import pfm.z;
import yhm.o;
import yji.l;
import ypg.p;
import zhm.u;

/* JADX INFO: loaded from: classes11.dex */
public final class i extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ j f276424w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ dj0.d f276425x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f276426y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(j jVar, dj0.d dVar, String str, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f276424w = jVar;
        this.f276425x = dVar;
        this.f276426y = str;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new i(this.f276424w, this.f276425x, this.f276426y, continuation, 0);
            default:
                return new i(this.f276424w, this.f276425x, this.f276426y, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((i) create(continuation)).invokeSuspend(Unit.f186387a);
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
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                j jVar = this.f276424w;
                ppg.b bVar = jVar.f276428q;
                dj0.d dVar = this.f276425x;
                long j2 = dVar.f115082a;
                p pVar = (p) bVar;
                pVar.getClass();
                String vaultId = this.f276426y;
                Intrinsics.checkNotNullParameter(vaultId, "vaultId");
                z zVar = new z(odd.a.a(pVar.f, vaultId, j2).h(sjg.a.b(jVar.f276429r)), 0, new s2i.i(dVar, 5), null);
                Intrinsics.checkNotNullExpressionValue(zVar, "toSingle(...)");
                this.v = 1;
                Object objB = nim.a.b(zVar, this);
                return objB == aVar ? aVar : objB;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                Continuation continuation = null;
                j jVar2 = this.f276424w;
                if (i2 == 0) {
                    o.b(obj2);
                    i iVar = new i(jVar2, this.f276425x, this.f276426y, continuation, 0);
                    this.v = 1;
                    if (ue8.c.f0(jVar2, iVar, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                dj0.d dVar2 = ((e) jVar2.t2()).f276420b;
                if (dVar2 != null) {
                    l.a1(jVar2, jVar2.X1(new y0("WITHDRAW_SUCCESS_DIALOG_ID", new j0((Clause) new TextLocalisedClause(R$string.payment_options_pocket_withdrawal_success_title, u.c(new MoneyClause(dVar2, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12), (Clause) null, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4094), false, 4)), null, null, new tz6.e(jVar2, dVar2, (Continuation) null), 3);
                }
                return Unit.f186387a;
        }
    }
}
