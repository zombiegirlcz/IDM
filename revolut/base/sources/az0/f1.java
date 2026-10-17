package az0;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.drawables.SmoothEdgesBitmapDrawable;
import com.revolut.core.ui_kit_core.displayers.image.models.SmoothEdgesUrlImage;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class f1 extends v8.c {
    public final /* synthetic */ ImageView d;
    public final /* synthetic */ Image e;
    public final /* synthetic */ Function1 f;

    public f1(ImageView imageView, Image image, Function1 function1) {
        this.d = imageView;
        this.e = image;
        this.f = function1;
    }

    @Override // v8.l
    public final void b(Drawable drawable) {
        this.d.setBackground(null);
    }

    @Override // v8.l
    public final void d(Object obj2, w8.d dVar) {
        Bitmap resource = (Bitmap) obj2;
        Intrinsics.checkNotNullParameter(resource, "resource");
        SmoothEdgesBitmapDrawable smoothEdgesBitmapDrawable = new SmoothEdgesBitmapDrawable(resource);
        ImageView imageView = this.d;
        Context context = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        float fK = kli.a.k(context, ((SmoothEdgesUrlImage) this.e).f60004b);
        if (smoothEdgesBitmapDrawable.f59833h != fK && fK >= BitmapDescriptorFactory.HUE_RED) {
            smoothEdgesBitmapDrawable.f59833h = fK;
            Path path = smoothEdgesBitmapDrawable.f59831c;
            path.reset();
            float f = smoothEdgesBitmapDrawable.f59833h;
            path.addRoundRect(smoothEdgesBitmapDrawable.d, f, f, Path.Direction.CW);
            smoothEdgesBitmapDrawable.invalidateSelf();
        }
        imageView.setImageDrawable(smoothEdgesBitmapDrawable);
        Function1 function1 = this.f;
        if (function1 != null) {
            function1.invoke(smoothEdgesBitmapDrawable);
        }
    }
}
