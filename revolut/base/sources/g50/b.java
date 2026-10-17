package g50;

import android.view.View;
import androidx.viewbinding.ViewBindings;
import com.revolut.chat_core.R$id;
import com.revolut.core.ui_kit.views.video.ZoomableFullScreenVideoView;
import com.revolut.kompot.view.ControllerContainerFrameLayout;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class b extends q implements Function1 {
    public static final b f = new b();

    public b() {
        super(1, a60.b.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/chat_core/databinding/ScreenChatIntroVideoBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        int i = R$id.zoomablePlayerView;
        ZoomableFullScreenVideoView zoomableFullScreenVideoView = (ZoomableFullScreenVideoView) ViewBindings.findChildViewById(p0, i);
        if (zoomableFullScreenVideoView != null) {
            return new a60.b((ControllerContainerFrameLayout) p0, zoomableFullScreenVideoView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
