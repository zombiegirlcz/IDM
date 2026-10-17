package mx0;

import android.content.Context;
import android.graphics.Outline;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import androidx.core.view.ViewGroupKt;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import com.revolut.core.ui_kit.internal.views.CutoutImageView;
import com.revolut.core.ui_kit.models.avatar.AvatarModel;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class a1 extends ViewGroup implements xv0.m {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public skm.a2 f209567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AvatarModel.AvatarImage.GridImage f209568b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f209569c;
    public int d;
    public int e;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b f209570g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final GradientDrawable f209571h;
    public final CutoutImageView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public xv0.i f209572j;
    public final a1 k;

    public static final class a {
        private a() {
        }
    }

    public static final class b extends ViewOutlineProvider {
        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(outline, "outline");
            outline.setOval(0, 0, view.getWidth(), view.getHeight());
        }
    }

    public static final class c implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f209573a = new c();

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            return Boolean.valueOf(obj2 instanceof ix0.h0);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a1(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @NotNull
    public final Sequence<ix0.h0> getCutoutReceivers() {
        return nkm.y.n(ViewGroupKt.getChildren(this), c.f209573a);
    }

    @Override // xv0.m
    @NotNull
    public xv0.i getItemRenderState() {
        return this.f209572j;
    }

    @Override // xv0.m
    @NotNull
    public View getRenderView() {
        return this.k;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        AvatarModel.AvatarImage.GridImage gridImage = this.f209568b;
        if (gridImage == null) {
            return;
        }
        setImages(gridImage);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i5) {
        this.i.layout(0, 0, i3 - i, i5 - i2);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        boolean zK = jh.d.k(context);
        int i6 = zK ? this.f : this.e;
        int i21 = zK ? this.e : this.f;
        ArrayList arrayList = this.f209569c;
        ImageView imageView = (ImageView) zhm.d0.e0(0, arrayList);
        if (imageView != null) {
            int i22 = this.e;
            int i32 = this.d;
            imageView.layout(i6, i22, i6 + i32, i32 + i22);
        }
        ImageView imageView2 = (ImageView) zhm.d0.e0(1, arrayList);
        if (imageView2 != null) {
            int i33 = this.e;
            int i43 = this.d;
            imageView2.layout(i21, i33, i21 + i43, i43 + i33);
        }
        ImageView imageView3 = (ImageView) zhm.d0.e0(2, arrayList);
        if (imageView3 != null) {
            int i59 = this.f;
            int i66 = this.d;
            imageView3.layout(i6, i59, i6 + i66, i66 + i59);
        }
        ImageView imageView4 = (ImageView) zhm.d0.e0(3, arrayList);
        if (imageView4 != null) {
            int i74 = this.f;
            int i92 = this.d;
            imageView4.layout(i21, i74, i21 + i92, i92 + i74);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        this.i.measure(iMakeMeasureSpec, iMakeMeasureSpec);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec((int) (size * 0.35f), 1073741824);
        Iterator it8 = this.f209569c.iterator();
        while (it8.hasNext()) {
            ((ImageView) it8.next()).measure(iMakeMeasureSpec2, iMakeMeasureSpec2);
        }
        setMeasuredDimension(size, size);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i5) {
        super.onSizeChanged(i, i2, i3, i5);
        float f = i;
        this.f209571h.setCornerRadius(0.25f * f);
        this.d = (int) (0.35f * f);
        this.e = (int) (0.1f * f);
        this.f = (int) (f * 0.55f);
    }

    public final void setImages(@NotNull AvatarModel.AvatarImage.GridImage avatarImage) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(avatarImage, "avatarImage");
        Image[] elements = {avatarImage.f57991a, avatarImage.f57992b, avatarImage.f57993c, avatarImage.d};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        skm.a2 a2Var = this.f209567a;
        if (a2Var != null) {
            a2Var.f(null);
        }
        int size = ((ArrayList) listL).size();
        while (true) {
            arrayList = this.f209569c;
            if (arrayList.size() <= size) {
                break;
            }
            ImageView imageView = (ImageView) arrayList.remove(zhm.v.j(arrayList));
            imageView.setImageDrawable(null);
            removeView(imageView);
        }
        while (arrayList.size() < size) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            CutoutImageView cutoutImageView = new CutoutImageView(context, null, 6, 0);
            cutoutImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            cutoutImageView.setOutlineProvider(this.f209570g);
            cutoutImageView.setClipToOutline(true);
            arrayList.add(cutoutImageView);
            addView(cutoutImageView);
        }
        LifecycleOwner lifecycleOwner = ViewTreeLifecycleOwner.get(this);
        LifecycleCoroutineScope lifecycleScope = lifecycleOwner != null ? LifecycleOwnerKt.getLifecycleScope(lifecycleOwner) : null;
        if (lifecycleScope == null) {
            this.f209568b = avatarImage;
            return;
        }
        this.f209568b = null;
        setItemRenderState(xv0.f.f309149a);
        this.f209567a = skm.e0.C(lifecycleScope, null, null, new b1(listL, this, null), 3);
    }

    @Override // xv0.m
    public void setItemRenderState(@NotNull xv0.i iVar) {
        Intrinsics.checkNotNullParameter(iVar, "<set-?>");
        this.f209572j = iVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a1(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f209569c = new ArrayList();
        this.f209570g = new b();
        GradientDrawable gradientDrawableK = ip0.v7.k(0);
        gradientDrawableK.setColor(io0.a.d(0.1f, kli.a.s(R$attr.uikit_colorAccentNeutral, context)));
        this.f209571h = gradientDrawableK;
        CutoutImageView cutoutImageView = new CutoutImageView(context, null, 6, 0);
        cutoutImageView.setScaleType(ImageView.ScaleType.FIT_XY);
        cutoutImageView.setImageDrawable(gradientDrawableK);
        this.i = cutoutImageView;
        this.f209572j = xv0.g.f309150a;
        this.k = this;
        addView(cutoutImageView);
    }

    public /* synthetic */ a1(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
