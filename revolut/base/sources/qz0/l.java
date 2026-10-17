package qz0;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.bumptech.glide.load.engine.GlideException;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class l implements u8.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ UrlImage f250328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ImageView f250329b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function0 f250330c;
    public final /* synthetic */ Function1 d;

    public l(n nVar, UrlImage urlImage, ImageView imageView, Function0 function0, Function1 function1) {
        this.f250328a = urlImage;
        this.f250329b = imageView;
        this.f250330c = function0;
        this.d = function1;
    }

    @Override // u8.g
    public final boolean onLoadFailed(GlideException glideException, Object obj2, v8.l target, boolean z) {
        Intrinsics.checkNotNullParameter(target, "target");
        Integer num = this.f250328a.f60020g;
        if (num != null) {
            this.f250329b.setImageResource(num.intValue());
        }
        Function0 function0 = this.f250330c;
        if (function0 == null) {
            return true;
        }
        function0.invoke();
        return true;
    }

    @Override // u8.g
    public final boolean onResourceReady(Object obj2, Object model, v8.l lVar, c8.a dataSource, boolean z) {
        Drawable resource = (Drawable) obj2;
        Intrinsics.checkNotNullParameter(resource, "resource");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        Function1 function1 = this.d;
        if (function1 == null) {
            return false;
        }
        function1.invoke(resource);
        return false;
    }
}
