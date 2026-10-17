package com.onfido.android.sdk.capture.internal.camera.usecase;

import com.onfido.android.sdk.capture.internal.camera.usecase.GetOptimalFourByThreePictureResolutionUseCase;
import com.onfido.android.sdk.capture.internal.util.Dimension;
import com.onfido.android.sdk.capture.ui.camera.CameraResolutionProvider;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.ClosedFloatingPointRange;
import org.jetbrains.annotations.NotNull;
import vim.b;
import zhm.d0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0004\b\u0000\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u000b\u001a\u00020\u00052\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\rH\u0016J\u0016\u0010\u000e\u001a\u00020\u00052\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\rH\u0016R\u0014\u0010\u0007\u001a\u00020\bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0011"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/camera/usecase/GetOptimalFourByThreePictureResolutionUseCase;", "Lcom/onfido/android/sdk/capture/internal/camera/usecase/GetDefaultPictureResolutionUseCase;", "screenHeightToFrameHeightRatio", "", "previewDimension", "Lcom/onfido/android/sdk/capture/internal/util/Dimension;", "(DLcom/onfido/android/sdk/capture/internal/util/Dimension;)V", "providesStrictAspectRatio", "", "getProvidesStrictAspectRatio", "()Z", "findOptimalPictureResolution", "supportedDimensionList", "", "findOptimalPreviewResolution", "supportedPreviewDimensionList", "Companion", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class GetOptimalFourByThreePictureResolutionUseCase extends GetDefaultPictureResolutionUseCase {
    private static final double ONE_MP_PIXEL_SIZE = 1048576.0d;
    private final boolean providesStrictAspectRatio;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final ClosedFloatingPointRange FOUR_BY_THREE_ASPECT_RATIO_RANGE = new b(1.3d, 1.36d);

    @NotNull
    private static final List<Function1<Dimension, Boolean>> TARGET_RESOLUTION_CONSTRAINT_LIST = v.k(GetOptimalFourByThreePictureResolutionUseCase$Companion$TARGET_RESOLUTION_CONSTRAINT_LIST$1.INSTANCE, GetOptimalFourByThreePictureResolutionUseCase$Companion$TARGET_RESOLUTION_CONSTRAINT_LIST$2.INSTANCE, GetOptimalFourByThreePictureResolutionUseCase$Companion$TARGET_RESOLUTION_CONSTRAINT_LIST$3.INSTANCE, GetOptimalFourByThreePictureResolutionUseCase$Companion$TARGET_RESOLUTION_CONSTRAINT_LIST$4.INSTANCE, GetOptimalFourByThreePictureResolutionUseCase$Companion$TARGET_RESOLUTION_CONSTRAINT_LIST$5.INSTANCE);

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0018B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\f\u0010\u0017\u001a\u00020\n*\u00020\nH\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R \u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\f\u001a\u00020\u0005*\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u000f\u001a\u00020\u000b*\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0011\u001a\u00020\u0005*\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u000eR\u0018\u0010\u0013\u001a\u00020\u0014*\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/camera/usecase/GetOptimalFourByThreePictureResolutionUseCase$Companion;", "", "()V", "FOUR_BY_THREE_ASPECT_RATIO_RANGE", "Lkotlin/ranges/ClosedFloatingPointRange;", "", "ONE_MP_PIXEL_SIZE", "TARGET_RESOLUTION_CONSTRAINT_LIST", "", "Lkotlin/Function1;", "Lcom/onfido/android/sdk/capture/internal/util/Dimension;", "", "aspectRatio", "getAspectRatio", "(Lcom/onfido/android/sdk/capture/internal/util/Dimension;)D", "isFourByThree", "(Lcom/onfido/android/sdk/capture/internal/util/Dimension;)Z", "megapixel", "getMegapixel", "pixelSize", "", "getPixelSize", "(Lcom/onfido/android/sdk/capture/internal/util/Dimension;)I", "rotate", "Factory", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/camera/usecase/GetOptimalFourByThreePictureResolutionUseCase$Companion$Factory;", "Lcom/onfido/android/sdk/capture/ui/camera/CameraResolutionProvider$Companion$Factory;", "()V", "create", "Lcom/onfido/android/sdk/capture/ui/camera/CameraResolutionProvider;", "screenHeightToFrameHeightRatio", "", "previewDimension", "Lcom/onfido/android/sdk/capture/internal/util/Dimension;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Factory implements CameraResolutionProvider.Companion.Factory {
            @Override // com.onfido.android.sdk.capture.ui.camera.CameraResolutionProvider.Companion.Factory
            @NotNull
            public CameraResolutionProvider create(double screenHeightToFrameHeightRatio, @NotNull Dimension previewDimension) {
                Intrinsics.checkNotNullParameter(previewDimension, "previewDimension");
                return new GetOptimalFourByThreePictureResolutionUseCase(screenHeightToFrameHeightRatio, previewDimension);
            }
        }

        private Companion() {
        }

        private final double getAspectRatio(Dimension dimension) {
            return ((double) dimension.getHeight()) / ((double) dimension.getWidth());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final double getMegapixel(Dimension dimension) {
            return ((double) getPixelSize(dimension)) / GetOptimalFourByThreePictureResolutionUseCase.ONE_MP_PIXEL_SIZE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int getPixelSize(Dimension dimension) {
            return dimension.getHeight() * dimension.getWidth();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isFourByThree(Dimension dimension) {
            return GetOptimalFourByThreePictureResolutionUseCase.FOUR_BY_THREE_ASPECT_RATIO_RANGE.contains(Double.valueOf(getAspectRatio(dimension)));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Dimension rotate(Dimension dimension) {
            return new Dimension(dimension.getHeight(), dimension.getWidth());
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetOptimalFourByThreePictureResolutionUseCase(double d, @NotNull Dimension previewDimension) {
        super(d, previewDimension);
        Intrinsics.checkNotNullParameter(previewDimension, "previewDimension");
        this.providesStrictAspectRatio = true;
    }

    @Override // com.onfido.android.sdk.capture.internal.camera.usecase.GetDefaultPictureResolutionUseCase, com.onfido.android.sdk.capture.ui.camera.CameraResolutionProvider
    @NotNull
    public Dimension findOptimalPictureResolution(@NotNull List<Dimension> supportedDimensionList) {
        Dimension dimension;
        Intrinsics.checkNotNullParameter(supportedDimensionList, "supportedDimensionList");
        ArrayList arrayList = new ArrayList(w.t(supportedDimensionList, 10));
        Iterator<T> it8 = supportedDimensionList.iterator();
        while (it8.hasNext()) {
            arrayList.add(INSTANCE.rotate((Dimension) it8.next()));
        }
        List listP0 = d0.P0(arrayList, new Comparator() { // from class: com.onfido.android.sdk.capture.internal.camera.usecase.GetOptimalFourByThreePictureResolutionUseCase$findOptimalPictureResolution$$inlined$sortedByDescending$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t2, T t3) {
                GetOptimalFourByThreePictureResolutionUseCase.Companion companion = GetOptimalFourByThreePictureResolutionUseCase.INSTANCE;
                return cim.b.b(Integer.valueOf(companion.getPixelSize((Dimension) t3)), Integer.valueOf(companion.getPixelSize((Dimension) t2)));
            }
        });
        Iterator<T> it9 = TARGET_RESOLUTION_CONSTRAINT_LIST.iterator();
        do {
            dimension = null;
            Object obj2 = null;
            if (!it9.hasNext()) {
                break;
            }
            Function1 function1 = (Function1) it9.next();
            Iterator it10 = listP0.iterator();
            while (true) {
                if (!it10.hasNext()) {
                    break;
                }
                Object next = it10.next();
                if (((Boolean) function1.invoke(next)).booleanValue()) {
                    obj2 = next;
                    break;
                }
            }
            dimension = (Dimension) obj2;
        } while (dimension == null);
        if (dimension != null) {
            return dimension;
        }
        throw new NoSuchElementException("No element of the collection was transformed to a non-null value.");
    }

    @Override // com.onfido.android.sdk.capture.internal.camera.usecase.GetDefaultPictureResolutionUseCase, com.onfido.android.sdk.capture.ui.camera.CameraResolutionProvider
    @NotNull
    public Dimension findOptimalPreviewResolution(@NotNull List<Dimension> supportedPreviewDimensionList) {
        Intrinsics.checkNotNullParameter(supportedPreviewDimensionList, "supportedPreviewDimensionList");
        ArrayList arrayList = new ArrayList(w.t(supportedPreviewDimensionList, 10));
        Iterator<T> it8 = supportedPreviewDimensionList.iterator();
        while (it8.hasNext()) {
            arrayList.add(INSTANCE.rotate((Dimension) it8.next()));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (INSTANCE.isFourByThree((Dimension) obj2)) {
                arrayList2.add(obj2);
            }
        }
        return (Dimension) d0.b0(d0.P0(arrayList2, new Comparator() { // from class: com.onfido.android.sdk.capture.internal.camera.usecase.GetOptimalFourByThreePictureResolutionUseCase$findOptimalPreviewResolution$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t2, T t3) {
                return cim.b.b(Integer.valueOf(Math.abs(((Dimension) t2).getWidth() - this.this$0.getPreviewDimension().getWidth())), Integer.valueOf(Math.abs(((Dimension) t3).getWidth() - this.this$0.getPreviewDimension().getWidth())));
            }
        }));
    }

    @Override // com.onfido.android.sdk.capture.internal.camera.usecase.GetDefaultPictureResolutionUseCase, com.onfido.android.sdk.capture.ui.camera.CameraResolutionProvider
    public boolean getProvidesStrictAspectRatio() {
        return this.providesStrictAspectRatio;
    }
}
