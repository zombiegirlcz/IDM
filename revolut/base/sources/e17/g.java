package e17;

import android.os.Parcelable;
import au6.n2;
import au6.o2;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.freelancer.impl.R$string;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import et6.k3;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import nii.h0;
import nii.j0;
import nii.u1;
import nii.y0;
import skm.e0;
import skm.p0;
import yhm.o;
import yji.n;
import zh9.u0;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ j f121904w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f121905x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(j jVar, String str, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f121904w = jVar;
        this.f121905x = str;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new g(this.f121904w, this.f121905x, continuation, 0);
            default:
                return new g(this.f121904w, this.f121905x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((g) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objB3;
        int i = this.u;
        int i2 = 0;
        Continuation continuation = null;
        String str = this.f121905x;
        j jVar = this.f121904w;
        int i3 = 1;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                try {
                    if (i5 == 0) {
                        o.b(obj2);
                        this.v = 1;
                        objB3 = j.b3(jVar, str, this);
                        if (objB3 == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i5 != 1) {
                            if (i5 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            o.b(obj2);
                            return n.j2(jVar, jVar.L2(new y0(null, new j0((Clause) new TextLocalisedClause(R$string.freelancer_popup_website_url_status_dialog_title, null, null, 14), (Clause) null, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4094), false, 5)), null, new h(jVar, null), 3);
                        }
                        o.b(obj2);
                        objB3 = obj2;
                    }
                    if (!((Boolean) objB3).booleanValue()) {
                        return j.Z2(jVar);
                    }
                    k3 k3Var = jVar.f121907l;
                    this.v = 2;
                    o2 o2Var = k3Var.f129262a;
                    o2Var.getClass();
                    n2 n2Var = new n2(o2Var, str, continuation, i3);
                    p0 p0Var = p0.f264001a;
                    Object objJ = e0.J(elm.f.f127540b, n2Var, this);
                    if (objJ != aVar) {
                        objJ = Unit.f186387a;
                    }
                    if (objJ != aVar) {
                        objJ = Unit.f186387a;
                    }
                    if (objJ == aVar) {
                        return aVar;
                    }
                    return n.j2(jVar, jVar.L2(new y0(null, new j0((Clause) new TextLocalisedClause(R$string.freelancer_popup_website_url_status_dialog_title, null, null, 14), (Clause) null, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4094), false, 5)), null, new h(jVar, null), 3);
                } catch (Throwable unused) {
                    return j.Z2(jVar);
                }
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 != 0) {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                tji.f fVarQ2 = jVar.q2();
                g gVar = new g(jVar, str, continuation, i2);
                this.v = 1;
                Object objB0 = u0.b0(fVarQ2, "SAVE_BUTTON_TAG", gVar, this);
                return objB0 == aVar2 ? aVar2 : objB0;
        }
    }
}
