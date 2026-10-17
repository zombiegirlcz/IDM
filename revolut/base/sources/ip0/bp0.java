package ip0;

import android.view.View;
import android.widget.FrameLayout;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.views.WebView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class bp0 extends koi.b {
    public final FrameLayout f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final WebView f163653g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bp0(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        this.f = (FrameLayout) itemView.findViewById(R$id.web_container);
        this.f163653g = (WebView) itemView.findViewById(R$id.web_view);
    }
}
