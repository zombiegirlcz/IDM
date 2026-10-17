package xv0;

import android.view.View;
import android.widget.ImageView;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public interface m {
    static /* synthetic */ void e0(m mVar, Image image, ImageView imageView, Function1 function1, int i) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        mVar.f(image, imageView, function1, null, (i & 8) == 0);
    }

    default void f(Image image, ImageView to6, Function1 function1, Function0 function0, boolean z) {
        Intrinsics.checkNotNullParameter(to6, "to");
        setItemRenderState(f.f309149a);
        if (z) {
            to6.setVisibility(image != null ? 0 : 8);
        }
        or0.u.k(to6).Q().a(image, to6, new xpe.c(this, function1, 18), new xfj.a(this, function0, 22));
    }

    i getItemRenderState();

    View getRenderView();

    void setItemRenderState(i iVar);
}
