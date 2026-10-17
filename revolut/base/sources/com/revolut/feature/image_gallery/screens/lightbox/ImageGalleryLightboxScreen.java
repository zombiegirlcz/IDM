package com.revolut.feature.image_gallery.screens.lightbox;

import aii.q;
import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.text.Editable;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.o9;
import cli.a0;
import cli.o;
import cli.w;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.ChatInputLayoutView;
import com.revolut.core.ui_kit.views.ChatInputView;
import com.revolut.core.ui_kit.views.ExpandableTextView;
import com.revolut.core.ui_kit.views.LightboxGalleryView;
import com.revolut.core.ui_kit.views.input.MaskedTextInputEditText;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.image_gallery.R$layout;
import com.revolut.feature.image_gallery.R$string;
import com.revolut.feature.image_gallery.screens.lightbox.ImageGalleryLightboxScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import kotlin.text.d0;
import mx0.s5;
import mx0.u5;
import mx0.v5;
import org.jetbrains.annotations.NotNull;
import ud7.d;
import vc.s;
import wrj.m;
import xd7.b;
import xd7.c;
import xd7.f;
import xd7.i;
import xki.e;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/image_gallery/screens/lightbox/ImageGalleryLightboxScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lcli/w;", "Lxd7/h;", "Companion", "a", "feature_image_gallery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ImageGalleryLightboxScreen extends ViewController<q> implements w {
    public final int K;
    public final Object L;
    public final h M;
    public final Object N;
    public final Object O;
    public boolean P;
    public int Q;
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(ImageGalleryLightboxScreen.class, "binding", "getBinding()Lcom/revolut/feature/image_gallery/databinding/ScreenImageGalleryLightboxBinding;", 0))};

    @NotNull
    private static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public ImageGalleryLightboxScreen(ImageGalleryLightboxScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_image_gallery_lightbox;
        final int i = 0;
        this.L = te0.w.y0(new Function0(this) { // from class: xd7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ImageGalleryLightboxScreen f304271b;

            {
                this.f304271b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ImageGalleryLightboxScreen imageGalleryLightboxScreen = this.f304271b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = ImageGalleryLightboxScreen.R;
                        return n14.e.a(imageGalleryLightboxScreen, imageGalleryLightboxScreen.d());
                    default:
                        KProperty[] kPropertyArr2 = ImageGalleryLightboxScreen.R;
                        return (i) ((ud7.d) imageGalleryLightboxScreen.N.getValue()).f279172c.get();
                }
            }
        });
        this.M = s.t(this, c.f);
        this.N = te0.w.y0(new m(this, inputData, 26));
        final int i2 = 1;
        this.O = te0.w.y0(new Function0(this) { // from class: xd7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ImageGalleryLightboxScreen f304271b;

            {
                this.f304271b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ImageGalleryLightboxScreen imageGalleryLightboxScreen = this.f304271b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ImageGalleryLightboxScreen.R;
                        return n14.e.a(imageGalleryLightboxScreen, imageGalleryLightboxScreen.d());
                    default:
                        KProperty[] kPropertyArr2 = ImageGalleryLightboxScreen.R;
                        return (i) ((ud7.d) imageGalleryLightboxScreen.N.getValue()).f279172c.get();
                }
            }
        });
        this.Q = -1;
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        xd7.h uiState = (xd7.h) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        LightboxGalleryView lightboxGalleryView = d3().d;
        lightboxGalleryView.setGalleryItems(uiState.f304280a);
        lightboxGalleryView.setMenuItems(uiState.f304282c);
        lightboxGalleryView.setToolbarTitle(uiState.d);
        int i = uiState.f304281b;
        lightboxGalleryView.setViewPagerToPosition(i, false);
        if (i != this.Q) {
            this.P = false;
            this.Q = i;
        }
        rd7.c cVar = uiState.f;
        String str = uiState.e;
        int i2 = b.f304272a[cVar.ordinal()];
        if (i2 == 1) {
            ChatInputLayoutView imageGalleryLightboxScreenInputLayout = d3().f261833c;
            Intrinsics.checkNotNullExpressionValue(imageGalleryLightboxScreenInputLayout, "imageGalleryLightboxScreenInputLayout");
            imageGalleryLightboxScreenInputLayout.setVisibility(8);
            boolean zW = d0.W(str);
            ExpandableTextView imageGalleryLightboxScreenCaption = d3().f261832b;
            Intrinsics.checkNotNullExpressionValue(imageGalleryLightboxScreenCaption, "imageGalleryLightboxScreenCaption");
            imageGalleryLightboxScreenCaption.setVisibility(zW ? 8 : 0);
            if (zW) {
                return;
            }
            d3().f261832b.setText(new TextClause(uiState.e, (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
            d3().f261832b.f0(e3());
            return;
        }
        if (i2 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        ExpandableTextView imageGalleryLightboxScreenCaption2 = d3().f261832b;
        Intrinsics.checkNotNullExpressionValue(imageGalleryLightboxScreenCaption2, "imageGalleryLightboxScreenCaption");
        imageGalleryLightboxScreenCaption2.setVisibility(8);
        ChatInputLayoutView imageGalleryLightboxScreenInputLayout2 = d3().f261833c;
        Intrinsics.checkNotNullExpressionValue(imageGalleryLightboxScreenInputLayout2, "imageGalleryLightboxScreenInputLayout");
        imageGalleryLightboxScreenInputLayout2.setVisibility(0);
        ChatInputView inputView = d3().f261833c.getInputView();
        if (Intrinsics.f(inputView.getInputText(), str)) {
            return;
        }
        inputView.setInput(new TextClause(uiState.e, (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
        MaskedTextInputEditText input$ui_kit_components_release = inputView.getInput$ui_kit_components_release();
        Editable text = inputView.getInput$ui_kit_components_release().getText();
        input$ui_kit_components_release.setSelection(text != null ? text.length() : 0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (d) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        d3().d.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
        ChatInputView inputView = d3().f261833c.getInputView();
        inputView.setHint(new TextLocalisedClause(R$string.media_details_caption_input_placeholder, null, null, 14));
        inputView.setMaxInputLines(6);
        inputView.setMaxInputLength(1000);
        d3().f261832b.setTextColorAttr(R$attr.uikit_colorForeground);
        d3().f261832b.setTextAppearanceAttr(R$attr.internal_textAppearanceBody2);
        Context context = d3().f261831a.getContext();
        Intrinsics.h(context);
        int iS = kli.a.s(R$attr.uikit_colorGroupedBackground, context);
        int iD = io0.a.d(0.9f, iS);
        int iD2 = io0.a.d(0.8f, iS);
        int iS2 = kli.a.s(R$attr.uikit_colorTransparent, context);
        float fL = kli.a.l(context, 100.0f);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RectShape());
        shapeDrawable.setShaderFactory(new f(fL, iS2, iD2, iD));
        d3().f261832b.setBackground(shapeDrawable);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().d.i), new xd7.d(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().d.h0()), new xd7.e(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().d.b()), new xd7.d(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(d3().f261833c.getInputView().b0()), new xd7.d(this, null, 2), 3);
        ViewController.P2(this, rd0.e.b(d3().f261832b.f58531g), new xd7.e(this, null, 1), 3);
    }

    public final sd7.b d3() {
        ViewBinding value = this.M.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (sd7.b) value;
    }

    public final v5 e3() {
        return this.P ? new u5(3, new TextLocalisedClause(R$string.image_gallery_caption_show_less, null, null, 14)) : new s5(3, new TextLocalisedClause(R$string.image_gallery_caption_show_more, null, null, 14));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: f3, reason: merged with bridge method [inline-methods] */
    public final i d() {
        return (i) this.O.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getT() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (a0) this.L.getValue();
    }
}
