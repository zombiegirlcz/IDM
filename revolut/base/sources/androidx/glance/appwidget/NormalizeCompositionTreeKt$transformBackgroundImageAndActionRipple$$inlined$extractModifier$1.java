package androidx.glance.appwidget;

import androidx.glance.BackgroundModifier;
import androidx.glance.GlanceModifier;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.u;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0006\b\u0000\u0010\u0000\u0018\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Landroidx/glance/GlanceModifier$Element;", "it", "", "invoke", "(Landroidx/glance/GlanceModifier$Element;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
public final class NormalizeCompositionTreeKt$transformBackgroundImageAndActionRipple$$inlined$extractModifier$1 extends u implements Function1<GlanceModifier.Element, Boolean> {
    public static final NormalizeCompositionTreeKt$transformBackgroundImageAndActionRipple$$inlined$extractModifier$1 INSTANCE = new NormalizeCompositionTreeKt$transformBackgroundImageAndActionRipple$$inlined$extractModifier$1();

    public NormalizeCompositionTreeKt$transformBackgroundImageAndActionRipple$$inlined$extractModifier$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final Boolean invoke(@NotNull GlanceModifier.Element element) {
        return Boolean.valueOf(element instanceof BackgroundModifier);
    }
}
