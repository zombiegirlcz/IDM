package hde;

import com.revolut.chat.domain.model.NewTicketContext;
import com.revolut.feature.shared.help_centre.api.main.SharedHelpDestination;
import efm.d0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import sri.m;
import vce.l;
import wp5.y;

/* JADX INFO: loaded from: classes8.dex */
public final class j implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f151423a;

    public j(m navigator) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f151423a = navigator;
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        return y.D(cVar, "deeplink", 1, "help") && Intrinsics.f(cVar.e(2), "quick-action") && Intrinsics.f(cVar.e(3), "view-card-pin");
    }

    @Override // q06.k
    public final Object e(jf0.c cVar, Continuation continuation) {
        return new q06.h(new SharedHelpDestination(new SharedHelpDestination.InputData(SharedHelpDestination.StartPoint.ViewCardPin.f86151a, (NewTicketContext) null, 6), 2), null);
    }

    @Override // jf0.d
    public final d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        ufm.c cVar = new ufm.c(new h4d.d(this, 3), 2);
        Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
        return cVar;
    }
}
