package androidx.glance.appwidget;

import androidx.compose.ui.unit.DpSize;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.u;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/ui/unit/DpSize;", "invoke-MYxV2XQ", "()J"}, k = 3, mv = {1, 8, 0}, xi = 48)
public final class SizeBoxKt$ForEachSize$sizes$1$1 extends u implements Function0<DpSize> {
    final /* synthetic */ long $minSize;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SizeBoxKt$ForEachSize$sizes$1$1(long j2) {
        super(0);
        this.$minSize = j2;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        return DpSize.m3317boximpl(m3499invokeMYxV2XQ());
    }

    /* JADX INFO: renamed from: invoke-MYxV2XQ, reason: not valid java name */
    public final long m3499invokeMYxV2XQ() {
        return this.$minSize;
    }
}
