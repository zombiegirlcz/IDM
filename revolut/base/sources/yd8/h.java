package yd8;

import ax9.o;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.t;
import com.revolut.feature.junior_coparent.api.navigation.CoparentFeatureConfig$ConfirmCoparent;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import vkm.q;
import zhm.h0;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements td8.a {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a5h.g f312645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jla.h f312646b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ao.h f312647c;

    public h(a5h.g juniorCoparentInvitationInteractor, jla.h productCatalogueInteractor, ao.h coparentInteractor) {
        Intrinsics.checkNotNullParameter(juniorCoparentInvitationInteractor, "juniorCoparentInvitationInteractor");
        Intrinsics.checkNotNullParameter(productCatalogueInteractor, "productCatalogueInteractor");
        Intrinsics.checkNotNullParameter(coparentInteractor, "coparentInteractor");
        this.f312645a = juniorCoparentInvitationInteractor;
        this.f312646b = productCatalogueInteractor;
        this.f312647c = coparentInteractor;
    }

    @Override // i49.c
    public final boolean a(t data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return data.f54722b.f51596l instanceof vd8.f;
    }

    @Override // i49.c
    public final Flow f(j49.i params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return rd0.e.e(q.Q(new o(yh5.b.d(bla.b.b(this.f312646b, ne8.a.f214420c.a()), mo3.a.g(zi0.c.w(this.f312647c.q(vd8.g.d)), null, new a(0), 1)), 22), new y4f.o(null, this, 10)), h0.f322473a, new g(3, null));
    }

    @Override // i49.c
    public final Object g(t tVar, Continuation continuation) {
        Object obj2 = tVar.f54722b.f51596l;
        Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.feature.junior_coparent.api.models.InvitationApplication");
        vd8.f fVar = (vd8.f) obj2;
        ActionWidgetDelegate.a aVar = tVar.f54721a;
        if (Intrinsics.f(aVar, ActionWidgetDelegate.a.d.f51610a)) {
            return new j49.b(new CoparentFeatureConfig$ConfirmCoparent(fVar));
        }
        if ((aVar instanceof com.revolut.core.ui_kit.delegates.h) || Intrinsics.f(aVar, ActionWidgetDelegate.a.c.f51609a) || Intrinsics.f(aVar, ActionWidgetDelegate.a.C0395a.f51607a) || Intrinsics.f(aVar, ActionWidgetDelegate.a.b.f51608a)) {
            return j49.c.f171322a;
        }
        throw new NoWhenBranchMatchedException();
    }
}
