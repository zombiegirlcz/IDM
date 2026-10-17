package pj3;

import android.view.View;
import com.revolut.kompot.view.ControllerContainerFrameLayout;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class e extends kotlin.jvm.internal.q implements Function1 {
    public static final e f = new e();

    public e() {
        super(1, kj3.a.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/cms/stories/impl/databinding/ScreenCmsStoriesBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        if (p0 != null) {
            return new kj3.a((ControllerContainerFrameLayout) p0);
        }
        throw new NullPointerException("rootView");
    }
}
