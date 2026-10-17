package ro0;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.view.ViewCompat;
import az0.v0;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class t implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f255774a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f255775b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f255776c;
    public final /* synthetic */ View d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ t(prl.e eVar, FrameLayout frameLayout, tv0.e eVar2, int i, sv0.a aVar) {
        this.f255776c = eVar;
        this.d = frameLayout;
        this.e = eVar2;
        this.f255775b = i;
        this.f = aVar;
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f255774a) {
            case 0:
                u uVar = (u) this.f255776c;
                ImageView imageView = (ImageView) this.d;
                Drawable drawable = (Drawable) this.e;
                String str = (String) this.f;
                int i = uVar.e;
                int i2 = this.f255775b;
                if (i == i2) {
                    int width = imageView.getWidth();
                    int height = imageView.getHeight();
                    if (width > 0 && height > 0) {
                        if (drawable.getIntrinsicWidth() > 0 && drawable.getIntrinsicHeight() > 0) {
                            imageView.setForeground(((to0.f) ((to0.d) uVar.f255779c.getValue())).a(str, imageView, i2, new v0(width, uVar, drawable, height, 2)));
                        }
                    }
                }
                break;
            default:
                prl.e eVar = (prl.e) this.f255776c;
                FrameLayout frameLayout = (FrameLayout) this.d;
                tv0.e eVar2 = (tv0.e) this.e;
                sv0.a aVar = (sv0.a) this.f;
                eVar.e = null;
                frameLayout.setTranslationY(BitmapDescriptorFactory.HUE_RED);
                eVar2.b(this.f255775b, true);
                ViewCompat.requestApplyInsets((View) eVar.f239325b);
                aVar.invoke();
                break;
        }
        return Unit.f186387a;
    }

    public /* synthetic */ t(u uVar, int i, ImageView imageView, Drawable drawable, String str) {
        this.f255776c = uVar;
        this.f255775b = i;
        this.d = imageView;
        this.e = drawable;
        this.f = str;
    }
}
