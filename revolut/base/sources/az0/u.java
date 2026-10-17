package az0;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.revolut.core.ui_kit_core.R$id;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import ix0.f2;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import skm.c2;

/* JADX INFO: loaded from: classes.dex */
public abstract class u implements yy0.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineScope f11359a;

    public u() {
        c2 c2VarE = skm.e0.e();
        skm.p0 p0Var = skm.p0.f264001a;
        this.f11359a = skm.e0.c(kotlin.coroutines.e.d(c2VarE, zkm.o.f323119a.e));
    }

    @Override // yy0.d
    public final void a(Image image, ImageView to6, Function1 function1, Function0 function0) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(to6, "to");
        f2 f2Var = new f2(to6, new ag.c(this, this.f11359a, to6, function1, function0, image));
        to6.setTag(R$id.internal_view_tag_composite_loader, f2Var);
        f2Var.a();
    }

    @Override // yy0.d
    public final void b(ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        Object tag2 = imageView.getTag(R$id.internal_view_tag_composite_loader);
        f2 f2Var = tag2 instanceof f2 ? (f2) tag2 : null;
        if (f2Var != null) {
            View view = f2Var.f169234a;
            if (f2Var.d) {
                f2Var.d = false;
                view.removeOnAttachStateChangeListener(f2Var);
                f2Var.onViewDetachedFromWindow(view);
            }
        }
        imageView.setTag(R$id.internal_view_tag_composite_loader, null);
    }

    @Override // yy0.d
    public final void f(Image image, Context context, int i, int i2, v1.m mVar, a3l.b bVar) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(context, "context");
        skm.e0.C(this.f11359a, null, null, new a31.w(this, context, image, mVar, bVar, (Continuation) null, 6), 3);
    }

    public abstract Object g(Context context, Image image, Continuation continuation);
}
