package androidx.glance;

import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.u;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
public final class ImageKt$Image$3 extends u implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ ColorFilter $colorFilter;
    final /* synthetic */ String $contentDescription;
    final /* synthetic */ int $contentScale;
    final /* synthetic */ GlanceModifier $modifier;
    final /* synthetic */ ImageProvider $provider;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageKt$Image$3(ImageProvider imageProvider, String str, GlanceModifier glanceModifier, int i, ColorFilter colorFilter, int i2, int i3) {
        super(2);
        this.$provider = imageProvider;
        this.$contentDescription = str;
        this.$modifier = glanceModifier;
        this.$contentScale = i;
        this.$colorFilter = colorFilter;
        this.$$changed = i2;
        this.$$default = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
        invoke((Composer) obj2, ((Number) obj3).intValue());
        return Unit.f186387a;
    }

    public final void invoke(Composer composer, int i) {
        ImageKt.m3485ImageGCr5PR4(this.$provider, this.$contentDescription, this.$modifier, this.$contentScale, this.$colorFilter, composer, this.$$changed | 1, this.$$default);
    }
}
