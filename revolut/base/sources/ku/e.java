package ku;

import kotlin.jvm.internal.Intrinsics;
import nq.w;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class e {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final w f189576b = w.SELFIE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tr.b f189577a;

    public e(tr.b mediaMetadataMapper, qw.a cameraKitImageFormatConverter, nw.a closeableBitmapFactory) {
        Intrinsics.checkNotNullParameter(mediaMetadataMapper, "mediaMetadataMapper");
        Intrinsics.checkNotNullParameter(cameraKitImageFormatConverter, "cameraKitImageFormatConverter");
        Intrinsics.checkNotNullParameter(closeableBitmapFactory, "closeableBitmapFactory");
        this.f189577a = mediaMetadataMapper;
    }
}
