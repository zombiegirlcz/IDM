package a54;

import android.os.Parcelable;
import c84.t;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.credit.core.R$string;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import nii.h0;
import nii.j0;
import nii.u1;
import nii.y0;
import yhm.o;
import yji.l;

/* JADX INFO: loaded from: classes22.dex */
public final class e extends gim.i implements Function1 {
    public final /* synthetic */ int u = 0;
    public it3.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f1320w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.agreements.v2.a f1321x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.revolut.feature.credit.application.plugins.impl.ui.agreements.v2.a aVar, it3.d dVar, Continuation continuation) {
        super(1, continuation);
        this.f1321x = aVar;
        this.v = dVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new e(this.f1321x, this.v, continuation);
            default:
                return new e(this.f1321x, continuation);
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
        Object objP2;
        it3.d dVar;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.f1320w;
                if (i == 0) {
                    o.b(obj2);
                    it3.d dVar2 = this.v;
                    this.f1320w = 1;
                    if (t.N2(this.f1321x, dVar2, this, 2) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.f1320w;
                com.revolut.feature.credit.application.plugins.impl.ui.agreements.v2.a aVar3 = this.f1321x;
                if (i2 == 0) {
                    o.b(obj2);
                    h hVar = new h(aVar3, null, 1);
                    this.f1320w = 1;
                    objP2 = aVar3.p2(this, hVar);
                    if (objP2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        dVar = this.v;
                        o.b(obj2);
                        return l.a1(aVar3, aVar3.X1(new y0("agreements_signed", new j0((Clause) new TextLocalisedClause(R$string.credit_agreements_finish_documents_signed, null, null, 14), (Clause) null, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4094), false, 4)), null, null, new a1a.a(aVar3, dVar, null, 9), 3);
                    }
                    o.b(obj2);
                    objP2 = obj2;
                }
                it3.d dVar3 = (it3.d) objP2;
                sp3.a aVar4 = aVar3.f67018r;
                bs3.i iVar = new bs3.i("application-finished", a0.d.x("application_status", "AUTHORIZED"), bs3.g.INCOGNIA);
                this.v = dVar3;
                this.f1320w = 2;
                if (((qq3.g) aVar4).a(iVar, this) == aVar2) {
                    return aVar2;
                }
                dVar = dVar3;
                return l.a1(aVar3, aVar3.X1(new y0("agreements_signed", new j0((Clause) new TextLocalisedClause(R$string.credit_agreements_finish_documents_signed, null, null, 14), (Clause) null, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4094), false, 4)), null, null, new a1a.a(aVar3, dVar, null, 9), 3);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.revolut.feature.credit.application.plugins.impl.ui.agreements.v2.a aVar, Continuation continuation) {
        super(1, continuation);
        this.f1321x = aVar;
    }
}
