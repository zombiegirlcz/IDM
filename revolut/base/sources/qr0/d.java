package qr0;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import au0.p2;
import aw0.v8;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.DeleteButtonSmall;
import com.revolut.core.ui_kit.internal.views.DynamicWidthHeightAutosizeTextView;
import com.revolut.core.ui_kit.internal.views.switcher_button.SwitcherButtonView;
import com.revolut.core.ui_kit.internal.views.videoplayer.UiKitPlayerView;
import com.revolut.core.ui_kit_core.displayers.video.models.UriVideo;
import com.revolut.core.ui_kit_resources.R$attr;
import fp0.m;
import fp0.p;
import jv0.v;
import kotlin.jvm.internal.Intrinsics;
import or0.u;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class d extends FrameLayout implements b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Float f248586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public DeleteButtonSmall f248587b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.f f248588c;
    public final DynamicWidthHeightAutosizeTextView d;
    public final SwitcherButtonView e;
    public final jv0.e f;

    public static final class a {
        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(@NotNull Context context) {
        this(context, null, 0, 14);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void a(UiKitPlayerView view) {
        UiKitPlayerView uiKitPlayerView;
        Intrinsics.checkNotNullParameter(view, "view");
        jv0.e eVar = this.f;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(view, "view");
        if (eVar.f178737a != null) {
            return;
        }
        eVar.f178737a = view;
        eVar.addView(view, 1);
        UriVideo uriVideo = eVar.f178738b;
        if (uriVideo == null || (uiKitPlayerView = eVar.f178737a) == null) {
            return;
        }
        Uri uri2 = uriVideo.f60085a;
        oz0.c transparencyMode = uriVideo.f60088g;
        Intrinsics.checkNotNullParameter(uri2, "uri");
        Intrinsics.checkNotNullParameter(transparencyMode, "transparencyMode");
        uiKitPlayerView.j(new v(uri2, transparencyMode), null);
        uiKitPlayerView.setVisibility(0);
        uiKitPlayerView.i();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        Float f = this.f248586a;
        if (f == null || View.MeasureSpec.getMode(i2) != 1073741824) {
            super.onMeasure(i, i2);
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(rim.d.c(f.floatValue() * View.MeasureSpec.getSize(i2)), 1073741824), i2);
        }
    }

    public final void setAmountMaxTextSizeSp(int i) {
        this.d.setAutoSizeTextTypeUniformWithConfiguration(20, i, 1, 2);
    }

    public final void setModel(@NotNull v8 data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f.setContent(data.f10575a, data.f10576b);
        ty0.c.b(u.k(this).b0(), data.f10577c, this.d, null, null, 12);
        if (Build.VERSION.SDK_INT >= 29) {
            g4i.a.j(this.d).a(data.d);
        }
        this.e.setModel(data.e);
        if (!data.f) {
            DeleteButtonSmall deleteButtonSmall = this.f248587b;
            if (deleteButtonSmall != null) {
                deleteButtonSmall.setVisibility(8);
                return;
            }
            return;
        }
        if (this.f248587b == null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            int iK = kli.a.k(context, 28.0f);
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            int iK2 = kli.a.k(context2, 6.0f);
            Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            DeleteButtonSmall deleteButtonSmall2 = new DeleteButtonSmall(context3, null);
            deleteButtonSmall2.setId(R$id.internal_personalisation_gallery_tile_close_button);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iK, iK, 8388661);
            layoutParams.topMargin = iK2;
            layoutParams.setMarginEnd(iK2);
            deleteButtonSmall2.setLayoutParams(layoutParams);
            Context context4 = getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
            int iK3 = kli.a.k(context4, 16.0f);
            u.l(deleteButtonSmall2, iK3, iK3, iK3, iK3);
            addView(deleteButtonSmall2);
            this.f248587b = deleteButtonSmall2;
            p.Companion.getClass();
            p pVarA = m.a(deleteButtonSmall2, gp0.b.f145198a);
            p.b(pVarA, true);
            View view = pVarA.f137029a;
            or0.m.a(view);
            view.setOnClickListener(new p2(this, 10));
        }
        DeleteButtonSmall deleteButtonSmall3 = this.f248587b;
        if (deleteButtonSmall3 != null) {
            deleteButtonSmall3.setVisibility(0);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(@NotNull Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 8);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public d(Context context, AttributeSet attributeSet, int i, int i2) {
        Float fValueOf = Float.valueOf(0.46296296f);
        AttributeSet attributeSet2 = null;
        attributeSet = (i2 & 2) != 0 ? null : attributeSet;
        int i3 = 0;
        i = (i2 & 4) != 0 ? 0 : i;
        fValueOf = (i2 & 8) != 0 ? null : fValueOf;
        Intrinsics.checkNotNullParameter(context, "context");
        super(context, attributeSet, i);
        this.f248586a = fValueOf;
        this.f248588c = v0.a.d("create(...)");
        int iK = kli.a.k(context, 80.0f);
        int iK2 = kli.a.k(context, 148.0f);
        int i5 = 6;
        jv0.e eVar = new jv0.e(context, attributeSet2, i5, i3);
        eVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f = eVar;
        addView(eVar);
        int iK3 = kli.a.k(context, 20.0f);
        DynamicWidthHeightAutosizeTextView dynamicWidthHeightAutosizeTextView = new DynamicWidthHeightAutosizeTextView(context, attributeSet2, i5, i3);
        jb3.l.e(dynamicWidthHeightAutosizeTextView, R$attr.internal_textAppearanceDisplay2);
        dynamicWidthHeightAutosizeTextView.setMaxLines(1);
        dynamicWidthHeightAutosizeTextView.setGravity(1);
        dynamicWidthHeightAutosizeTextView.setAutoSizeTextTypeUniformWithConfiguration(20, 32, 1, 2);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = iK;
        layoutParams.setMarginStart(iK3);
        layoutParams.setMarginEnd(iK3);
        layoutParams.gravity = 49;
        dynamicWidthHeightAutosizeTextView.setLayoutParams(layoutParams);
        this.d = dynamicWidthHeightAutosizeTextView;
        SwitcherButtonView switcherButtonView = new SwitcherButtonView(context, null);
        switcherButtonView.setClickable(false);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.setMarginStart(iK3);
        layoutParams2.setMarginEnd(iK3);
        layoutParams2.topMargin = iK2;
        layoutParams2.gravity = 49;
        switcherButtonView.setLayoutParams(layoutParams2);
        this.e = switcherButtonView;
        addView(dynamicWidthHeightAutosizeTextView);
        addView(switcherButtonView);
    }
}
