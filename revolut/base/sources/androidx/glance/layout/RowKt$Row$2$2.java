package androidx.glance.layout;

import androidx.glance.layout.Alignment;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.u;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "Landroidx/glance/layout/EmittableRow;", "it", "Landroidx/glance/layout/Alignment$Vertical;", "invoke-UKyfEZk", "(Landroidx/glance/layout/EmittableRow;I)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
public final class RowKt$Row$2$2 extends u implements Function2<EmittableRow, Alignment.Vertical, Unit> {
    public static final RowKt$Row$2$2 INSTANCE = new RowKt$Row$2$2();

    public RowKt$Row$2$2() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
        m3568invokeUKyfEZk((EmittableRow) obj2, ((Alignment.Vertical) obj3).getValue());
        return Unit.f186387a;
    }

    /* JADX INFO: renamed from: invoke-UKyfEZk, reason: not valid java name */
    public final void m3568invokeUKyfEZk(@NotNull EmittableRow emittableRow, int i) {
        emittableRow.m3557setVerticalAlignmentJe2gTW8(i);
    }
}
