package mib;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.retail.salary_account.impl.R$string;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import nii.h0;
import nii.j0;
import nii.u1;
import nii.y0;
import skm.e0;
import skm.p0;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class j extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k f205642w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f205643x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(k kVar, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f205642w = kVar;
        this.f205643x = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new j(this.f205642w, this.f205643x, continuation, 0);
            default:
                return new j(this.f205642w, this.f205643x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((j) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        int i = this.u;
        String str = this.f205643x;
        Continuation continuation = null;
        switch (i) {
            case 0:
                Object obj3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                k kVar = this.f205642w;
                if (i2 == 0) {
                    o.b(obj2);
                    zjh.f fVar = kVar.o;
                    this.v = 1;
                    fVar.getClass();
                    dib.a aVar = new dib.a(1, str, null, fVar);
                    p0 p0Var = p0.f264001a;
                    Object objJ = e0.J(elm.f.f127540b, aVar, this);
                    if (objJ != obj3) {
                        objJ = Unit.f186387a;
                    }
                    if (objJ == obj3) {
                        return obj3;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                kVar.s1();
                kVar.f205644p.getClass();
                yji.l.a1(kVar, kVar.X1(new y0("ID_VERIFY_EMPLOYMENT_VERIFICATION_SUCCESS", new j0((Clause) new TextLocalisedClause(R$string.salaried_growth_work_email_verification_bottom_sheet_success_title, null, null, 14), (Clause) null, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4094), false, 4)), null, null, new m9d.y0(kVar, continuation, 13), 3);
                return Unit.f186387a;
            default:
                Object obj4 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                k kVar2 = this.f205642w;
                if (i3 == 0) {
                    o.b(obj2);
                    zjh.f fVar2 = kVar2.o;
                    this.v = 1;
                    fVar2.getClass();
                    dib.a aVar2 = new dib.a(0, str, null, fVar2);
                    p0 p0Var2 = p0.f264001a;
                    Object objJ2 = e0.J(elm.f.f127540b, aVar2, this);
                    if (objJ2 != obj4) {
                        objJ2 = Unit.f186387a;
                    }
                    if (objJ2 == obj4) {
                        return obj4;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                kVar2.s1();
                kVar2.f205644p.getClass();
                kVar2.X1(new y0("ID_REQUEST_NEW_LINK_SUCCESS", new j0((Clause) new TextLocalisedClause(R$string.salaried_growth_work_email_verification_bottom_sheet_request_new_link_success_title, null, null, 14), (Clause) null, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4094), false, 4));
                return Unit.f186387a;
        }
    }
}
