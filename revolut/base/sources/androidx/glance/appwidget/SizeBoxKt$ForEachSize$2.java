package androidx.glance.appwidget;

import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.u;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
public final class SizeBoxKt$ForEachSize$2 extends u implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ Function2<Composer, Integer, Unit> $content;
    final /* synthetic */ long $minSize;
    final /* synthetic */ SizeMode $sizeMode;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SizeBoxKt$ForEachSize$2(SizeMode sizeMode, long j2, Function2<? super Composer, ? super Integer, Unit> function2, int i) {
        super(2);
        this.$sizeMode = sizeMode;
        this.$minSize = j2;
        this.$content = function2;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
        invoke((Composer) obj2, ((Number) obj3).intValue());
        return Unit.f186387a;
    }

    public final void invoke(Composer composer, int i) {
        SizeBoxKt.m3497ForEachSizeeVKgIn8(this.$sizeMode, this.$minSize, this.$content, composer, this.$$changed | 1);
    }
}
