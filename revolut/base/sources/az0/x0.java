package az0;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes20.dex */
public final class x0 extends v8.f {
    public final /* synthetic */ Function1 e;
    public final /* synthetic */ Function0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(ImageView imageView, Function1 function1, Function0 function0) {
        super(imageView);
        this.e = function1;
        this.f = function0;
    }

    @Override // v8.h, v8.a, v8.l
    public final void g(Drawable drawable) {
        super.g(drawable);
        Function0 function0 = this.f;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // v8.f, v8.h
    /* JADX INFO: renamed from: i */
    public final void h(Drawable drawable) {
        Function1 function1;
        super.h(drawable);
        if (drawable == null || (function1 = this.e) == null) {
            return;
        }
        function1.invoke(drawable);
    }
}
