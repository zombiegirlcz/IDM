package r2d;

import com.revolut.feature.separate_favourites.api.alerts.widget.AlertsWidgetContext;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;

/* JADX INFO: loaded from: classes7.dex */
public final class p {

    @NotNull
    public static final m Companion = new m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final efd.a f251116a;

    public p(efd.a alertsInteractor) {
        Intrinsics.checkNotNullParameter(alertsInteractor, "alertsInteractor");
        this.f251116a = alertsInteractor;
    }

    public final ufm.i a(AlertsWidgetContext widgetContext) {
        Intrinsics.checkNotNullParameter(widgetContext, "widgetContext");
        List listD1 = d0.d1(widgetContext.f86005a);
        efm.d0 d0VarFirstOrError = rd0.e.c(new qna.n(new d78.c(((l2d.n) this.f251116a).b(listD1), 2), listD1, 5), kotlin.coroutines.g.f186406a).firstOrError();
        r25.c cVar = new r25.c(6, new qtb.c(widgetContext, 25));
        d0VarFirstOrError.getClass();
        ufm.i iVar = new ufm.i(d0VarFirstOrError, cVar, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return iVar;
    }
}
