package androidx.glance;

import androidx.glance.layout.ContentScale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.u;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "Landroidx/glance/EmittableImage;", "it", "Landroidx/glance/layout/ContentScale;", "invoke-5YttGEI", "(Landroidx/glance/EmittableImage;I)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
public final class ImageKt$Image$2$3 extends u implements Function2<EmittableImage, ContentScale, Unit> {
    public static final ImageKt$Image$2$3 INSTANCE = new ImageKt$Image$2$3();

    public ImageKt$Image$2$3() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
        m3486invoke5YttGEI((EmittableImage) obj2, ((ContentScale) obj3).getValue());
        return Unit.f186387a;
    }

    /* JADX INFO: renamed from: invoke-5YttGEI, reason: not valid java name */
    public final void m3486invoke5YttGEI(@NotNull EmittableImage emittableImage, int i) {
        emittableImage.m3484setContentScaleHwT0Evw(i);
    }
}
