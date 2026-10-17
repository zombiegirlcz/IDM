package yy0;

import android.content.Context;
import android.widget.ImageView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.NotImplementedError;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public interface d {
    void a(Image image, ImageView imageView, Function1 function1, Function0 function0);

    void b(ImageView imageView);

    default Clause c(Image image) {
        Intrinsics.checkNotNullParameter(image, "image");
        return image.getE();
    }

    default boolean d() {
        return false;
    }

    boolean e(Image image);

    default void f(Image image, Context context, int i, int i2, v1.m mVar, a3l.b bVar) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(context, "context");
        throw new NotImplementedError("Not implemented yet");
    }
}
