package androidx.glance.appwidget;

import androidx.compose.ui.unit.DpSize;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.u;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "Landroidx/glance/appwidget/EmittableSizeBox;", "it", "Landroidx/compose/ui/unit/DpSize;", "invoke-6HolHcs", "(Landroidx/glance/appwidget/EmittableSizeBox;J)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
public final class SizeBoxKt$SizeBox$1$2$1 extends u implements Function2<EmittableSizeBox, DpSize, Unit> {
    public static final SizeBoxKt$SizeBox$1$2$1 INSTANCE = new SizeBoxKt$SizeBox$1$2$1();

    public SizeBoxKt$SizeBox$1$2$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
        m3500invoke6HolHcs((EmittableSizeBox) obj2, ((DpSize) obj3).getPackedValue());
        return Unit.f186387a;
    }

    /* JADX INFO: renamed from: invoke-6HolHcs, reason: not valid java name */
    public final void m3500invoke6HolHcs(@NotNull EmittableSizeBox emittableSizeBox, long j2) {
        emittableSizeBox.m3492setSizeEaSLcWc(j2);
    }
}
