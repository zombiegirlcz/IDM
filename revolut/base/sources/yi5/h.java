package yi5;

import com.revolut.core.ui_kit.delegates.widgets.ErrorWidgetDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.crypto.orders_widget.impl.R$string;
import com.youTransactor.uCube.rpc.Constants;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import op0.q;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f314249a;

    public h(j jVar, String str) {
        this.f314249a = str;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
        return new ErrorWidgetDelegate.Model(this.f314249a, null, new TextLocalisedClause(R$string.crypto_home_feed_widget_orders_error_title, null, null, 14), new TextLocalisedClause(R$string.crypto_orders_widget_error_action, null, null, 14), q.MEDIUM, null, null, Constants.TAG_E2_CONFIGURATION_PAYMENT_SCHEME_CUSTOMIZATION);
    }
}
