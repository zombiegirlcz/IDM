package j4h;

import com.revolut.core.ui_kit.delegates.ChatContextualChartDelegate;
import com.revolut.core.ui_kit.delegates.ChatItemsDelegate;
import com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate;
import com.revolut.core.ui_kit.delegates.k3;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.kompot.common.R$string;
import gw0.t;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class p implements cli.n {

    @NotNull
    public static final o Companion = new o();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final gw0.i f171398a = new gw0.i(t.SINGLE);

    public static ChatItemsDelegate.Model a(String str) {
        return new ChatItemsDelegate.Model(new k3(new TextLocalisedClause(R$string.common_error_state_title, null, null, 14), new TextLocalisedClause(R$string.common_error_state_action, null, null, 14), (ComplexImage.Regular) null, (Object) null, 28), str, f171398a, null, gw0.l.LARGE, null, null, 131048);
    }

    public final ChatContextualChartDelegate.Model b(eel.c selectedPeriod, String widgetId, List chartPeriods) {
        Intrinsics.checkNotNullParameter(widgetId, "widgetId");
        Intrinsics.checkNotNullParameter(selectedPeriod, "selectedPeriod");
        Intrinsics.checkNotNullParameter(chartPeriods, "chartPeriods");
        gw0.i chatPosition = f171398a;
        Intrinsics.checkNotNullParameter(chatPosition, "chatPosition");
        return a.a(widgetId, null, null, false, l4h.i.c(null, selectedPeriod, chartPeriods.indexOf(selectedPeriod), oi0.d.x(null), true, null), selectedPeriod, chartPeriods, chatPosition);
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Data data = domainState.f171383b;
        Data data2 = domainState.f171384c;
        BaseChatBubbleDelegate.BaseModel baseModelB = (data == null || data2 == null) ? null : (BaseChatBubbleDelegate.BaseModel) iii.c.f(data, new m(this, domainState), new n(this, domainState, 1), new a0i.a(data2, this, domainState));
        if (baseModelB == null) {
            baseModelB = b(domainState.e, domainState.f171382a, domainState.d);
        }
        return new y50.c(baseModelB);
    }
}
