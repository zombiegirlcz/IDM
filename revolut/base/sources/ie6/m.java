package ie6;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.extension_auth.api.model.ExtensionAuthRequestData;
import com.revolut.feature.extension_auth.impl.R$string;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import nii.h0;
import nii.j0;
import nii.u1;
import nii.y0;

/* JADX INFO: loaded from: classes3.dex */
public final class m extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ r f160642w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ ExtensionAuthRequestData f160643x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(r rVar, ExtensionAuthRequestData extensionAuthRequestData, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f160642w = rVar;
        this.f160643x = extensionAuthRequestData;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new m(this.f160642w, this.f160643x, continuation, 0);
            default:
                return new m(this.f160642w, this.f160643x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((m) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        TextLocalisedClause textLocalisedClause;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                ExtensionAuthRequestData extensionAuthRequestData = this.f160643x;
                r rVar = this.f160642w;
                if (i == 0) {
                    yhm.o.b(obj2);
                    pfm.t tVarA = rVar.o.a(extensionAuthRequestData);
                    this.v = 1;
                    if (nim.a.a(tVarA, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                rVar.H2(rVar.f160648q, new id8.a(14));
                if (extensionAuthRequestData instanceof ExtensionAuthRequestData.Verification) {
                    zd6.b bVar = ((ExtensionAuthRequestData.Verification) extensionAuthRequestData).i;
                    int i2 = bVar == null ? -1 : l.f160641a[bVar.ordinal()];
                    if (i2 == -1 || i2 == 1 || i2 == 2 || i2 == 3) {
                        textLocalisedClause = new TextLocalisedClause(R$string.revolut_secure_sign_in_success_subtitle, null, null, 14);
                        yji.l.b1(rVar, rVar.X1(new y0("STATUS_DIALOG_ID", new j0((Clause) new TextLocalisedClause(R$string.revolut_secure_sign_in_success_title, null, null, 14), (Clause) textLocalisedClause, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4092), false, 4)), null, new p(rVar, null, 3), 3);
                        return Unit.f186387a;
                    }
                    if (i2 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else if (!(extensionAuthRequestData instanceof ExtensionAuthRequestData.AppChallenge)) {
                    throw new NoWhenBranchMatchedException();
                }
                textLocalisedClause = null;
                yji.l.b1(rVar, rVar.X1(new y0("STATUS_DIALOG_ID", new j0((Clause) new TextLocalisedClause(R$string.revolut_secure_sign_in_success_title, null, null, 14), (Clause) textLocalisedClause, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4092), false, 4)), null, new p(rVar, null, 3), 3);
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                r rVar2 = this.f160642w;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    pfm.a aVarC = rVar2.o.c(this.f160643x);
                    this.v = 1;
                    if (nim.a.a(aVarC, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                rVar2.H2(rVar2.f160648q, new id8.a(15));
                return Unit.f186387a;
        }
    }
}
