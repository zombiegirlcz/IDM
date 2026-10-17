package ls5;

import com.revolut.feature.separate_favourites.api.alerts.widget.AlertsWidgetContext;
import go.g;
import kotlinx.coroutines.flow.Flow;
import mgd.d;
import org.jetbrains.annotations.NotNull;
import zhm.u;
import zhm.y0;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements o1d.a {

    @NotNull
    public static final C1133a Companion = new C1133a();

    /* JADX INFO: renamed from: ls5.a$a, reason: collision with other inner class name */
    public static final class C1133a {
        private C1133a() {
        }
    }

    @Override // o1d.a
    public final Flow a() {
        return new g(Boolean.TRUE, 2);
    }

    @Override // o1d.a
    public final AlertsWidgetContext b() {
        y1d.b.Companion.getClass();
        return new AlertsWidgetContext(y0.b(y1d.a.f310359c), null, null, null, u.c(d.ACTIVE), null, 7918);
    }
}
