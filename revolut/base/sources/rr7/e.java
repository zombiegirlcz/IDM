package rr7;

import aw0.o9;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.feature.insurance_common.data.model.Document;
import com.revolut.feature_web_view.declaration.WebViewControllerDescriptor;
import com.revolut.feature_web_view.declaration.WebViewInputData;
import com.revolut.feature_web_view.declaration.WebViewScreenTitleSource;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.common.ControllerDestination;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zh9.u0;

/* JADX INFO: loaded from: classes4.dex */
public abstract class e {
    public static final c a(Document document) {
        Intrinsics.checkNotNullParameter(document, "<this>");
        nr7.a aVar = document.e;
        String str = document.d;
        int i = d.f256734a[aVar.ordinal()];
        if (i == 1) {
            return new b(new f9i.c(new f9i.e(str, document.f)));
        }
        if (i == 2) {
            return new a(new BridgeDestination(u0.f(new ControllerDestination.Stack(new WebViewControllerDescriptor(new WebViewInputData(str, new WebViewScreenTitleSource.Static(new TextClause(document.f75713a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), false)), null, true))));
        }
        throw new NoWhenBranchMatchedException();
    }
}
