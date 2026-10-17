package mk8;

import ang.f;
import com.revolut.core.ui_kit.delegates.t;
import com.revolut.feature.junior_progression.api.navigation.JuniorProgressionDestination;
import j49.i;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import rd0.e;
import vkm.v1;
import zhm.h0;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements ek8.a {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jx0.a f206209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f206210b;

    public d(jx0.a availabilityInteractor, f userInteractor) {
        Intrinsics.checkNotNullParameter(availabilityInteractor, "availabilityInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.f206209a = availabilityInteractor;
        this.f206210b = userInteractor;
    }

    @Override // i49.c
    public final boolean a(t data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return Intrinsics.f(data.f54722b.f51590a, "JUNIOR_PROGRESSION_PENDING_ACTION");
    }

    @Override // i49.c
    public final Flow f(i params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return e.e(new v1(new b(this, null)), h0.f322473a, new c(3, null));
    }

    @Override // i49.c
    public final Object g(t tVar, Continuation continuation) {
        return new j49.b(JuniorProgressionDestination.f77141a);
    }
}
