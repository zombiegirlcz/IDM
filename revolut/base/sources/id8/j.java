package id8;

import ax9.o;
import com.revolut.core.ui_kit.delegates.t;
import com.revolut.feature.junior_consent.api.navigation.ConsentTypeId;
import com.revolut.feature.junior_consent.impl.ui.screen.JuniorConsentRequestPromptScreen;
import com.revolut.kompot.common.ModalDestination;
import i83.m;
import kd8.x;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import nj8.n;
import org.jetbrains.annotations.NotNull;
import te8.z;
import vkm.q;

/* JADX INFO: loaded from: classes4.dex */
public final class j implements uc8.b {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f160445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hj8.a f160446b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z f160447c;

    public j(x juniorConsentRequestInteractor, hj8.a juniorProfileInteractor, z juniorProductsInteractor) {
        Intrinsics.checkNotNullParameter(juniorConsentRequestInteractor, "juniorConsentRequestInteractor");
        Intrinsics.checkNotNullParameter(juniorProfileInteractor, "juniorProfileInteractor");
        Intrinsics.checkNotNullParameter(juniorProductsInteractor, "juniorProductsInteractor");
        this.f160445a = juniorConsentRequestInteractor;
        this.f160446b = juniorProfileInteractor;
        this.f160447c = juniorProductsInteractor;
    }

    @Override // i49.c
    public final boolean a(t data) {
        Intrinsics.checkNotNullParameter(data, "data");
        Object obj2 = data.f54722b.f51596l;
        return (obj2 instanceof xc8.f) && ((xc8.f) obj2).f304106c == xc8.d.PAYMENT_LINKS;
    }

    @Override // i49.c
    public final Flow f(j49.i params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return q.Q(new o(yh5.b.d(mo3.a.e(((n) this.f160446b).k(null, w4l.h.f294642c), new m(19), new m(20)), mo3.a.e(rd0.e.b(this.f160447c.a(null, false)), new m(21), new m(22))), 7), new hcj.o((Continuation) null, this, 21));
    }

    @Override // i49.c
    public final Object g(t tVar, Continuation continuation) {
        Object obj2 = tVar.f54722b.f51596l;
        Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.feature.junior_consent.api.model.consent.JuniorConsentRequest");
        xc8.f fVar = (xc8.f) obj2;
        return new j49.e(new JuniorConsentRequestPromptScreen(new md8.d(fVar.f304105b, new ConsentTypeId.ConsentRequestId(fVar.f304104a, fVar.f304106c), com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D352", null, null, null, 30))), ModalDestination.Style.POPUP.f98311a);
    }
}
