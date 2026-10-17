package az0;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import androidx.core.view.ViewCompat;
import com.bumptech.glide.load.engine.GlideException;
import com.revolut.core.ui_kit_core.displayers.image.models.UserAvatarImage;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import skm.a2;
import skm.c2;

/* JADX INFO: loaded from: classes.dex */
public final class s1 implements View.OnAttachStateChangeListener, u8.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UserAvatarImage f11348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView f11349b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a01.b f11350c;
    public final Function1 d;
    public final Function0 e;
    public a2 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final CoroutineScope f11351g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f11352h;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final androidx.view.d f11353j;
    public final /* synthetic */ t1 k;

    public s1(t1 t1Var, UserAvatarImage image, ImageView view, a01.b avatarStorage, Function1 function1, Function0 function0) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(avatarStorage, "avatarStorage");
        this.k = t1Var;
        this.f11348a = image;
        this.f11349b = view;
        this.f11350c = avatarStorage;
        this.d = function1;
        this.e = function0;
        c2 c2VarE = skm.e0.e();
        skm.p0 p0Var = skm.p0.f264001a;
        zkm.d dVarC = skm.e0.c(kotlin.coroutines.e.d(c2VarE, zkm.o.f323119a.e));
        this.f11351g = dVarC;
        this.f11352h = -1;
        this.f11353j = new androidx.view.d(this, 4);
        view.addOnAttachStateChangeListener(this);
        if (ViewCompat.isAttachedToWindow(view) && this.f == null) {
            this.f = skm.e0.C(dVarC, null, null, new r1(this, null, 0), 3);
        }
    }

    @Override // u8.g
    public final boolean onLoadFailed(GlideException glideException, Object obj2, v8.l target, boolean z) {
        Intrinsics.checkNotNullParameter(target, "target");
        Function0 function0 = this.e;
        if (function0 != null) {
            function0.invoke();
        }
        if (this.i || ((a01.f) this.f11350c).e != 1) {
            return false;
        }
        this.i = true;
        this.f11349b.post(this.f11353j);
        return false;
    }

    @Override // u8.g
    public final boolean onResourceReady(Object obj2, Object model, v8.l lVar, c8.a dataSource, boolean z) {
        Drawable resource = (Drawable) obj2;
        Intrinsics.checkNotNullParameter(resource, "resource");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        Function1 function1 = this.d;
        if (function1 != null) {
            function1.invoke(resource);
        }
        ((a01.f) this.f11350c).f103a = resource instanceof BitmapDrawable ? new BitmapDrawable(this.f11349b.getContext().getResources(), Bitmap.createBitmap(((BitmapDrawable) resource).getBitmap())) : resource.mutate();
        return false;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (this.f == null) {
            this.f = skm.e0.C(this.f11351g, null, null, new r1(this, null, 0), 3);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        a2 a2Var = this.f;
        if (a2Var != null) {
            a2Var.f(null);
        }
        this.f = null;
    }
}
