package androidx.glance.layout;

import androidx.compose.runtime.Composer;
import androidx.glance.GlanceModifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.u;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
public final class RowKt$Row$4 extends u implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ Function3 $content;
    final /* synthetic */ int $horizontalAlignment;
    final /* synthetic */ GlanceModifier $modifier;
    final /* synthetic */ int $verticalAlignment;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RowKt$Row$4(GlanceModifier glanceModifier, int i, int i2, Function3 function3, int i3, int i5) {
        super(2);
        this.$modifier = glanceModifier;
        this.$horizontalAlignment = i;
        this.$verticalAlignment = i2;
        this.$content = function3;
        this.$$changed = i3;
        this.$$default = i5;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
        invoke((Composer) obj2, ((Number) obj3).intValue());
        return Unit.f186387a;
    }

    public final void invoke(Composer composer, int i) {
        RowKt.m3567RowlMAjyxE(this.$modifier, this.$horizontalAlignment, this.$verticalAlignment, this.$content, composer, this.$$changed | 1, this.$$default);
    }
}
