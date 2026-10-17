package ta3;

import com.revolut.feature.shared.help_centre.api.faq.SharedFaqDestination;
import efm.d0;
import jf0.c;
import jf0.d;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import q06.h;
import q06.k;
import sri.m;
import wp5.y;

/* JADX INFO: loaded from: classes21.dex */
public final class b implements d, k {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f269086a;

    public b(m navigator) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f269086a = navigator;
    }

    @Override // jf0.d, q06.k
    public final boolean a(c cVar) {
        return y.D(cVar, "deeplink", 1, "troubleshooting") && Intrinsics.f(cVar.e(2), "cards");
    }

    @Override // q06.k
    public final Object e(c cVar, Continuation continuation) {
        String str = (String) cVar.d.get("cardId");
        return new h(new SharedFaqDestination(str != null ? new SharedFaqDestination.StartPoint.CardTroubleshooter(str, "category.card-payments", false) : new SharedFaqDestination.StartPoint.CardsTroubleshooter("category.card-payments"), (SharedFaqDestination.PassthroughData) null, false, 14), null);
    }

    @Override // jf0.d
    public final d0 f(c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        String str = (String) deeplink.d.get("cardId");
        ufm.c cVar = new ufm.c(new pu9.a(this, str != null ? new SharedFaqDestination.StartPoint.CardTroubleshooter(str, "category.card-payments", false) : new SharedFaqDestination.StartPoint.CardsTroubleshooter("category.card-payments"), 27), 2);
        Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
        return cVar;
    }
}
