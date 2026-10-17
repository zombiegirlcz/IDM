package id8;

import com.revolut.core.ui_kit.delegates.t;
import com.revolut.feature.junior_consent.api.navigation.ConsentTypeId;
import com.revolut.feature.junior_consent.impl.ui.screen.JuniorConsentRequestPromptScreen;
import com.revolut.kompot.common.ModalDestination;
import kd8.x;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import vkm.q;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements uc8.a {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f160440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hj8.a f160441b;

    public e(x juniorConsentRequestInteractor, hj8.a juniorProfileInteractor) {
        Intrinsics.checkNotNullParameter(juniorConsentRequestInteractor, "juniorConsentRequestInteractor");
        Intrinsics.checkNotNullParameter(juniorProfileInteractor, "juniorProfileInteractor");
        this.f160440a = juniorConsentRequestInteractor;
        this.f160441b = juniorProfileInteractor;
    }

    @Override // i49.c
    public final boolean a(t data) {
        Intrinsics.checkNotNullParameter(data, "data");
        Object obj2 = data.f54722b.f51596l;
        return (obj2 instanceof xc8.f) && ((xc8.f) obj2).f304106c == xc8.d.PERSONAL_DATA_PROCESSING;
    }

    @Override // i49.c
    public final Flow f(j49.i params) {
        Intrinsics.checkNotNullParameter(params, "params");
        x xVar = this.f160440a;
        xVar.getClass();
        w4l.i loadingStrategy = w4l.i.f294643c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return yoj.b.e(q.Q(new ae8.c(bla.b.b(xVar.f182860b, "YOUTH"), 13), new a67.c((Continuation) null, xVar, loadingStrategy, xc8.d.PERSONAL_DATA_PROCESSING, 26)), new hnc.a(this, 25), new i83.b(23), new a(0));
    }

    @Override // i49.c
    public final Object g(t tVar, Continuation continuation) {
        Object obj2 = tVar.f54722b.f51596l;
        Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.feature.junior_consent.api.model.consent.JuniorConsentRequest");
        xc8.f fVar = (xc8.f) obj2;
        return new j49.e(new JuniorConsentRequestPromptScreen(new md8.d(fVar.f304105b, new ConsentTypeId.ConsentRequestId(fVar.f304104a, fVar.f304106c), com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D254", null, null, null, 30))), ModalDestination.Style.POPUP.f98311a);
    }
}
