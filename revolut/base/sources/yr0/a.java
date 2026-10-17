package yr0;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class a extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Function1 f316050a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final Drawable getSelectedBackground() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return dr0.l.h(context, 20.0f, new Color.Solid(R$attr.uikit_colorGreyTone10), 0, null);
    }

    public final Function1<mw0.f, Unit> getClickListener() {
        return this.f316050a;
    }

    public final void setClickListener(Function1<? super mw0.f, Unit> function1) {
        this.f316050a = function1;
    }

    public final void setEmojiBarData(@NotNull List<mw0.b> emojis, boolean z, Object obj2) {
        Intrinsics.checkNotNullParameter(emojis, "emojis");
        removeAllViews();
        for (mw0.b bVar : emojis) {
            int iJ = foh.i.j(6);
            ImageView imageView = new ImageView(getContext());
            imageView.setLayoutParams(new LinearLayout.LayoutParams(foh.i.j(40), foh.i.j(40)));
            imageView.setPadding(iJ, iJ, iJ, iJ);
            if (bVar.f209282b) {
                imageView.setBackground(getSelectedBackground());
            }
            imageView.setOnClickListener(new kp0.l(this, bVar, 27));
            addView(imageView);
            yy0.f.e(or0.u.k(this).Q(), bVar.f209281a, imageView, null, null, 12);
        }
        if (z) {
            int iJ2 = foh.i.j(12);
            ImageView imageView2 = new ImageView(getContext());
            imageView2.setLayoutParams(new LinearLayout.LayoutParams(foh.i.j(40), foh.i.j(40)));
            imageView2.setPadding(iJ2, iJ2, iJ2, iJ2);
            addView(imageView2);
            imageView2.setOnClickListener(new kp0.l(this, obj2, 28));
            yy0.f.e(or0.u.k(this).Q(), new ResourceImage(R$drawable.uikit_icn_24_plus, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246), imageView2, null, null, 12);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        setOrientation(0);
        setBackground(dr0.l.h(context, 24.0f, new Color.Solid(R$attr.uikit_colorPopoverBackground), 0, null));
        int iJ = foh.i.j(4);
        setPadding(iJ, iJ, iJ, iJ);
    }
}
