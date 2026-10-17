package yy0;

import android.content.Context;
import android.widget.ImageView;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public interface f {

    @NotNull
    public static final e Companion = e.f317749a;

    static /* synthetic */ void e(f fVar, Image image, ImageView imageView, Function1 function1, Function0 function0, int i) {
        if ((i & 4) != 0) {
            function1 = null;
        }
        if ((i & 8) != 0) {
            function0 = null;
        }
        fVar.a(image, imageView, function1, function0);
    }

    void a(Image image, ImageView imageView, Function1 function1, Function0 function0);

    void b(ImageView imageView);

    void c(Image image, Context context, int i, int i2, Function1 function1, Function0 function0);

    Image d(ImageView imageView);

    void f(ImageView imageView, boolean z);
}
