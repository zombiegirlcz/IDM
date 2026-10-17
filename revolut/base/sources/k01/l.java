package k01;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.glance.BitmapImageProvider;
import com.revolut.core.ui_kit_remote.R$style;
import ix6.l0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import skm.e0;

/* JADX INFO: loaded from: classes20.dex */
public final class l {

    @NotNull
    private static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ContextThemeWrapper f179911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ty0.c f179912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yy0.f f179913c;
    public final BitmapImageProvider d;

    public l(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f179911a = new ContextThemeWrapper(context, R$style.UiKitTheme_Widgets);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        this.d = new BitmapImageProvider(bitmapCreateBitmap);
        Object applicationContext = context.getApplicationContext();
        Intrinsics.i(applicationContext, "null cannot be cast to non-null type com.revolut.core.ui_kit_core.context.UIKitContext");
        wy0.a aVar = (wy0.a) applicationContext;
        this.f179912b = aVar.b0();
        this.f179913c = aVar.Q();
    }

    public final Object a(e eVar, gim.c cVar) {
        return e0.G(new l0((Object) eVar, (Object) this, false, (Continuation) null, 28), cVar);
    }
}
