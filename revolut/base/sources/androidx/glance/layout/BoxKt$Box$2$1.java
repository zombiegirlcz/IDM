package androidx.glance.layout;

import androidx.glance.GlanceModifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.u;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Landroidx/glance/layout/EmittableBox;", "it", "Landroidx/glance/GlanceModifier;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
public final class BoxKt$Box$2$1 extends u implements Function2<EmittableBox, GlanceModifier, Unit> {
    public static final BoxKt$Box$2$1 INSTANCE = new BoxKt$Box$2$1();

    public BoxKt$Box$2$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
        invoke((EmittableBox) obj2, (GlanceModifier) obj3);
        return Unit.f186387a;
    }

    public final void invoke(@NotNull EmittableBox emittableBox, @NotNull GlanceModifier glanceModifier) {
        emittableBox.setModifier(glanceModifier);
    }
}
