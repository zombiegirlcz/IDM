package az0;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.util.Base64;
import android.widget.ImageView;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.Base64Image;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class f implements yy0.d {
    @Override // yy0.d
    public final void a(Image image, ImageView to6, Function1 function1, Function0 function0) {
        List list;
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(to6, "to");
        if (!(image instanceof Base64Image)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        Base64Image base64Image = (Base64Image) image;
        gz0.b bVar = base64Image.f59845b.d;
        if (bVar == gz0.b.CenterInside || bVar == null) {
            to6.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        }
        byte[] bArrDecode = Base64.decode(base64Image.f59844a, 0);
        Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
        c8.o[] oVarArr = null;
        BitmapDrawable bitmapDrawable = bitmapDecodeByteArray != null ? new BitmapDrawable(to6.getContext().getResources(), bitmapDecodeByteArray) : null;
        Context context = to6.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        List listJ = te0.w.J((gz0.c) image, context);
        if (listJ != null && (list = (List) ue0.e.M(te0.w.C0(listJ))) != null) {
            oVarArr = (c8.o[]) list.toArray(new c8.o[0]);
        }
        if (oVarArr == null) {
            to6.setImageDrawable(bitmapDrawable);
            if (function1 != null) {
                function1.invoke(bitmapDrawable);
                return;
            }
            return;
        }
        com.bumptech.glide.j jVarQ = com.bumptech.glide.b.d(to6.getContext()).q(bitmapDrawable);
        u8.h hVar = new u8.h();
        hVar.L((c8.o[]) Arrays.copyOf(oVarArr, oVarArr.length));
        com.bumptech.glide.j jVarA = jVarQ.a(hVar);
        Intrinsics.checkNotNullExpressionValue(jVarA, "apply(...)");
        v04.b.b(jVarA, function1, function0).R(to6);
    }

    @Override // yy0.d
    public final void b(ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        com.bumptech.glide.n nVarD = com.bumptech.glide.b.d(imageView.getContext());
        nVarD.getClass();
        a0.d.z(imageView, nVarD);
    }

    @Override // yy0.d
    public final boolean e(Image image) {
        Intrinsics.checkNotNullParameter(image, "image");
        return image instanceof Base64Image;
    }
}
