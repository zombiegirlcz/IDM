package l28;

import com.revolut.core.ui_kit.delegates.widgets.ErrorWidgetDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.wealth.resources.R$string;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import op0.q;
import org.bouncycastle.asn1.BERTags;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f191706a;

    public f(h hVar, String str) {
        this.f191706a = str;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
        String id10 = this.f191706a;
        Intrinsics.checkNotNullParameter(id10, "id");
        return new ErrorWidgetDelegate.Model(id10, com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D018", null, null, null, 30), new TextLocalisedClause(R$string.wealth_invest_widget_collections_error_header_title, null, null, 14), new TextLocalisedClause(R$string.wealth_invest_widget_common_error_action, null, null, 14), q.MEDIUM, null, null, BERTags.FLAGS);
    }
}
