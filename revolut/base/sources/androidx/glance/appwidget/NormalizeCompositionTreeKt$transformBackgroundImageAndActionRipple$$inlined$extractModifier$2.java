package androidx.glance.appwidget;

import androidx.glance.BackgroundModifier;
import androidx.glance.GlanceModifier;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.u;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00020\u00020\u0001\"\u0006\b\u0000\u0010\u0000\u0018\u00012\u0014\u0010\u0003\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"T", "Lkotlin/Pair;", "Landroidx/glance/GlanceModifier;", "acc", "Landroidx/glance/GlanceModifier$Element;", "cur", "invoke", "(Lkotlin/Pair;Landroidx/glance/GlanceModifier$Element;)Lkotlin/Pair;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
public final class NormalizeCompositionTreeKt$transformBackgroundImageAndActionRipple$$inlined$extractModifier$2 extends u implements Function2<Pair<? extends BackgroundModifier, ? extends GlanceModifier>, GlanceModifier.Element, Pair<? extends BackgroundModifier, ? extends GlanceModifier>> {
    public static final NormalizeCompositionTreeKt$transformBackgroundImageAndActionRipple$$inlined$extractModifier$2 INSTANCE = new NormalizeCompositionTreeKt$transformBackgroundImageAndActionRipple$$inlined$extractModifier$2();

    public NormalizeCompositionTreeKt$transformBackgroundImageAndActionRipple$$inlined$extractModifier$2() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public final Pair<BackgroundModifier, GlanceModifier> invoke(@NotNull Pair<? extends BackgroundModifier, ? extends GlanceModifier> pair, @NotNull GlanceModifier.Element element) {
        return element instanceof BackgroundModifier ? new Pair<>(element, pair.f186386b) : new Pair<>(pair.f186385a, ((GlanceModifier) pair.f186386b).then(element));
    }
}
