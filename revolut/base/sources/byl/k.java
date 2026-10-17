package byl;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import au0.q4;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class k extends FrameLayout {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f19877b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f19878c;
    public final float d;
    public final int e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f19879g;

    public static final class a {
        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final Pair a(j jVar) {
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setPivotX(this.f19876a / 2.0f);
        imageView.setPivotY(this.f19877b);
        imageView.setRotation(30.0f);
        imageView.setTranslationX(this.f19878c);
        imageView.setTranslationY(jVar.f19875b + this.d);
        imageView.setScaleX(BitmapDescriptorFactory.HUE_RED);
        imageView.setScaleY(BitmapDescriptorFactory.HUE_RED);
        imageView.setOutlineProvider(new bs9.i(imageView));
        imageView.setClipToOutline(true);
        imageView.setClickable(false);
        Pair pair = new Pair(imageView, jVar);
        this.f19879g.add(pair);
        return pair;
    }

    public final void b(UrlImage urlImage, ImageView imageView) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        yy0.f.e(jh.d.f(context).Q(), urlImage, imageView, null, null, 12);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iK = kli.a.k(context, 168.0f);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        int iK2 = kli.a.k(context2, 68.0f);
        measureChildren(View.MeasureSpec.makeMeasureSpec(this.f19876a, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f19877b, 1073741824));
        setMeasuredDimension(View.resolveSize(iK, i), View.resolveSize(iK2, i2));
    }

    public final void setModel(@NotNull l model) {
        Intrinsics.checkNotNullParameter(model, "model");
        UrlImage urlImage = model.f19880a;
        ArrayList arrayList = this.f19879g;
        b(urlImage, (ImageView) ((Pair) arrayList.get(2)).f186385a);
        b(model.f19881b, (ImageView) ((Pair) arrayList.get(1)).f186385a);
        b(model.f19882c, (ImageView) ((Pair) arrayList.get(0)).f186385a);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        int iK = kli.a.k(context, 48.0f);
        this.f19876a = iK;
        int iK2 = kli.a.k(context, 68.0f);
        this.f19877b = iK2;
        int iK3 = kli.a.k(context, 4.0f);
        this.f19878c = kli.a.l(context, 32.0f);
        float fL = kli.a.l(context, 4.0f);
        float fL2 = kli.a.l(context, 16.0f);
        this.d = iK2;
        this.e = kli.a.k(context, 168.0f);
        this.f = kli.a.k(context, 68.0f);
        this.f19879g = new ArrayList();
        setClipChildren(true);
        setClipToPadding(true);
        setClipToOutline(true);
        setOutlineProvider(new q4(this, 1));
        Pair pairA = a(new j(30.0f, fL2));
        Pair pairA2 = a(new j(BitmapDescriptorFactory.HUE_RED, fL));
        Pair pairA3 = a(new j(-30.0f, fL2));
        View view = (View) pairA.f186385a;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iK, iK2);
        layoutParams.gravity = 8388659;
        layoutParams.leftMargin = iK3 * 2;
        addView(view, layoutParams);
        View view2 = (View) pairA2.f186385a;
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(iK, iK2);
        layoutParams2.gravity = 8388659;
        layoutParams2.leftMargin = iK3;
        addView(view2, layoutParams2);
        View view3 = (View) pairA3.f186385a;
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(iK, iK2);
        layoutParams3.gravity = 8388659;
        layoutParams3.leftMargin = 0;
        addView(view3, layoutParams3);
    }

    public /* synthetic */ k(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
