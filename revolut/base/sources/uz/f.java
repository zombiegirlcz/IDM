package uz;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import com.revolut.camerakit.ui.models.R$id;
import com.revolut.camerakit.ui.models.R$layout;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.R$style;
import com.revolut.core.ui_kit.models.avatar.AvatarModel;
import com.revolut.core.ui_kit.views.AvatarView;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import java.util.Arrays;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class f extends ConstraintLayout {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ContextThemeWrapper f284510b;
    public final AvatarView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f284511g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextView f284512h;
    public rz.f i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f284513j;

    public static final class a {
        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final AvatarModel.Default f0(int i) {
        int i2 = this.f284513j ? R$attr.uikit_colorBlack : R$attr.uikit_colorWhite;
        List listK = zhm.v.k(new LayeredImage.Layer.Drawable(R$drawable.uikit_icn_circle_background, new Color.ModifiedColor(new Color.Solid(i2), 0.12f), 4.0f, 4.0f, 4.0f, 4.0f, (com.revolut.core.ui_kit_core.displayers.image.models.c) null, 64), new LayeredImage.Layer.Drawable(i, new Color.Solid(i2), 8.0f, 8.0f, 8.0f, 8.0f, (com.revolut.core.ui_kit_core.displayers.image.models.c) null, 64));
        Float fValueOf = Float.valueOf(40.0f);
        return new AvatarModel.Default(new LayeredImage(listK, fValueOf, fValueOf, 8), null, null, null, null, null, 126);
    }

    public final String g0(rz.j jVar) {
        if (!(jVar instanceof rz.h)) {
            if (jVar instanceof rz.i) {
                return ((rz.i) jVar).f258449a;
            }
            throw new NoWhenBranchMatchedException();
        }
        Context context = getContext();
        rz.h hVar = (rz.h) jVar;
        int i = hVar.f258447a;
        Object[] array = hVar.f258448b.toArray(new Object[0]);
        String string = context.getString(i, Arrays.copyOf(array, array.length));
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    public final void h0(boolean z) {
        Integer num;
        if (this.f284513j == z) {
            return;
        }
        this.f284513j = z;
        setBackground(ContextCompat.getDrawable(z ? getContext() : this.f284510b, com.revolut.camerakit.ui.models.R$drawable.bg_zebra_hint));
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.f284511g.setTextColor(kli.a.s(this.f284513j ? R$attr.uikit_colorBlack : R$attr.uikit_colorWhite, context));
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.f284512h.setTextColor(kli.a.s(this.f284513j ? R$attr.uikit_colorBlack_60 : R$attr.uikit_colorWhite_70, context2));
        rz.f fVar = this.i;
        if (fVar == null || (num = fVar.d) == null) {
            return;
        }
        this.f.setModel(f0(num.intValue()));
    }

    public final void setHint(@NotNull rz.f hintModel) {
        Intrinsics.checkNotNullParameter(hintModel, "hintModel");
        if (Intrinsics.f(hintModel, this.i)) {
            return;
        }
        this.i = hintModel;
        rz.k kVar = hintModel.f258444a;
        Integer num = hintModel.d;
        if (kVar == null || num == null) {
            setVisibility(4);
            return;
        }
        setVisibility(0);
        this.f.setModel(f0(num.intValue()));
        this.f284511g.setText(g0(kVar.f258450a));
        rz.k kVar2 = hintModel.f258445b;
        int i = kVar2 == null ? 8 : 0;
        TextView textView = this.f284512h;
        textView.setVisibility(i);
        textView.setText(kVar2 != null ? g0(kVar2.f258450a) : null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, R$style.UiKitTheme_TransparentNight);
        this.f284510b = contextThemeWrapper;
        setClipChildren(false);
        setClipToPadding(false);
        setBackground(ContextCompat.getDrawable(contextThemeWrapper, com.revolut.camerakit.ui.models.R$drawable.bg_zebra_hint));
        setMinHeight((int) jb3.l.g(context, 72.0f));
        setMaxWidth((int) jb3.l.g(context, 327.0f));
        int iG = (int) jb3.l.g(context, 8.0f);
        setPaddingRelative(iG, iG, iG, iG);
        View.inflate(new ContextThemeWrapper(contextThemeWrapper, com.revolut.camerakit.ui.models.R$style.CameraKit_ZebraTooltipTheme), R$layout.camera_kit_tooltip_hint_view, this);
        View viewFindViewById = findViewById(R$id.cameraKitUi_tooltipHintAvatar);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (AvatarView) viewFindViewById;
        View viewFindViewById2 = findViewById(R$id.cameraKitUi_tooltipHintTitle);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f284511g = (TextView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R$id.cameraKitUi_tooltipHintDescription);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f284512h = (TextView) viewFindViewById3;
    }

    public /* synthetic */ f(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
