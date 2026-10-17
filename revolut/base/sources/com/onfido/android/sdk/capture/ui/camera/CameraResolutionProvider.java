package com.onfido.android.sdk.capture.ui.camera;

import android.hardware.Camera;
import com.onfido.android.sdk.capture.internal.util.Dimension;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.w;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\b`\u0018\u0000 \f2\u00020\u0001:\u0001\fJ\u0016\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\tH&J\u0016\u0010\n\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\tH&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\r"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/camera/CameraResolutionProvider;", "", "providesStrictAspectRatio", "", "getProvidesStrictAspectRatio", "()Z", "findOptimalPictureResolution", "Lcom/onfido/android/sdk/capture/internal/util/Dimension;", "supportedDimensionList", "", "findOptimalPreviewResolution", "supportedPreviewDimensionList", "Companion", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface CameraResolutionProvider {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\tB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0010\u0010\u0006\u001a\f\u0012\b\u0012\u00060\u0007R\u00020\b0\u0004H\u0007¨\u0006\n"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/camera/CameraResolutionProvider$Companion;", "", "()V", "convertToDimensionList", "", "Lcom/onfido/android/sdk/capture/internal/util/Dimension;", "sizeList", "Landroid/hardware/Camera$Size;", "Landroid/hardware/Camera;", "Factory", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/camera/CameraResolutionProvider$Companion$Factory;", "", "create", "Lcom/onfido/android/sdk/capture/ui/camera/CameraResolutionProvider;", "screenHeightToFrameHeightRatio", "", "previewDimension", "Lcom/onfido/android/sdk/capture/internal/util/Dimension;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public interface Factory {
            @NotNull
            CameraResolutionProvider create(double screenHeightToFrameHeightRatio, @NotNull Dimension previewDimension);
        }

        private Companion() {
        }

        @NotNull
        public final List<Dimension> convertToDimensionList(@NotNull List<? extends Camera.Size> sizeList) {
            Intrinsics.checkNotNullParameter(sizeList, "sizeList");
            ArrayList arrayList = new ArrayList(w.t(sizeList, 10));
            for (Camera.Size size : sizeList) {
                arrayList.add(new Dimension(size.width, size.height));
            }
            return arrayList;
        }
    }

    @NotNull
    static List<Dimension> convertToDimensionList(@NotNull List<? extends Camera.Size> list) {
        return INSTANCE.convertToDimensionList(list);
    }

    @NotNull
    Dimension findOptimalPictureResolution(@NotNull List<Dimension> supportedDimensionList);

    @NotNull
    Dimension findOptimalPreviewResolution(@NotNull List<Dimension> supportedPreviewDimensionList);

    boolean getProvidesStrictAspectRatio();
}
