package x28;

import com.revolut.core.ui_kit.delegates.widgets.ErrorWidgetDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.wealth.resources.R$string;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import op0.q;
import org.bouncycastle.asn1.BERTags;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f302525a;

    public h(j jVar, String str) {
        this.f302525a = str;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        ((Boolean) obj2).getClass();
        String id10 = this.f302525a;
        Intrinsics.checkNotNullParameter(id10, "id");
        return new ErrorWidgetDelegate.Model(id10, com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D018", null, null, null, 30), new TextLocalisedClause(R$string.wealth_invest_widget_popular_first_buys_error_title, null, null, 14), new TextLocalisedClause(R$string.wealth_invest_widget_common_error_action, null, null, 14), q.LARGE, null, null, BERTags.FLAGS);
    }
}
