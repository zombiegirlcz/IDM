package androidx.glance.appwidget;

import android.os.Build;
import androidx.glance.BackgroundModifier;
import androidx.glance.Emittable;
import androidx.glance.GlanceModifier;
import androidx.glance.action.ActionModifier;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.u;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Landroidx/glance/GlanceModifier$Element;", "invoke", "(Landroidx/glance/GlanceModifier$Element;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
public final class NormalizeCompositionTreeKt$transformBackgroundImageAndActionRipple$shouldWrapTargetInABox$1 extends u implements Function1<GlanceModifier.Element, Boolean> {
    final /* synthetic */ boolean $isButton;
    final /* synthetic */ Emittable $this_transformBackgroundImageAndActionRipple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NormalizeCompositionTreeKt$transformBackgroundImageAndActionRipple$shouldWrapTargetInABox$1(boolean z, Emittable emittable) {
        super(1);
        this.$isButton = z;
        this.$this_transformBackgroundImageAndActionRipple = emittable;
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final Boolean invoke(@NotNull GlanceModifier.Element element) {
        return Boolean.valueOf(((element instanceof BackgroundModifier) && ((BackgroundModifier) element).getImageProvider() != null) || (this.$isButton && Build.VERSION.SDK_INT <= 30) || ((element instanceof ActionModifier) && !NormalizeCompositionTreeKt.hasBuiltinRipple(this.$this_transformBackgroundImageAndActionRipple)));
    }
}
