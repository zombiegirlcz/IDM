package androidx.glance.appwidget;

import androidx.glance.GlanceModifier;
import androidx.glance.action.ActionModifier;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.u;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "count", "modifier", "Landroidx/glance/GlanceModifier$Element;", "invoke", "(ILandroidx/glance/GlanceModifier$Element;)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0}, xi = 48)
public final class NormalizeCompositionTreeKt$warnIfMultipleClickableActions$actionCount$1 extends u implements Function2<Integer, GlanceModifier.Element, Integer> {
    public static final NormalizeCompositionTreeKt$warnIfMultipleClickableActions$actionCount$1 INSTANCE = new NormalizeCompositionTreeKt$warnIfMultipleClickableActions$actionCount$1();

    public NormalizeCompositionTreeKt$warnIfMultipleClickableActions$actionCount$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
        return invoke(((Number) obj2).intValue(), (GlanceModifier.Element) obj3);
    }

    @NotNull
    public final Integer invoke(int i, @NotNull GlanceModifier.Element element) {
        if (element instanceof ActionModifier) {
            i++;
        }
        return Integer.valueOf(i);
    }
}
