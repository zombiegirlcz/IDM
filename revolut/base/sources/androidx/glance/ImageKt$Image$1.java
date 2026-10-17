package androidx.glance;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.q;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
public /* synthetic */ class ImageKt$Image$1 extends q implements Function0<EmittableImage> {
    public static final ImageKt$Image$1 INSTANCE = new ImageKt$Image$1();

    public ImageKt$Image$1() {
        super(0, EmittableImage.class, "<init>", "<init>()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final EmittableImage invoke() {
        return new EmittableImage();
    }
}
