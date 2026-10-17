package com.fourthline.vision.internal;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.ImageReader;
import android.util.Size;
import android.view.Display;
import com.fourthline.vision.internal.b0;
import com.fourthline.vision.internal.w;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class a3 extends b0 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final a f35934m = new a(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f35935n = 8;
    private static final Size o = new Size(1, 1);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Size f35936l;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj2, Object obj3) {
            return cim.b.b(Integer.valueOf(((Size) obj3).getWidth()), Integer.valueOf(((Size) obj2).getWidth()));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(@NotNull CameraManager delegate, @NotNull b0.c cameraDirection, @NotNull Display display) {
        super(delegate, cameraDirection, display);
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(cameraDirection, "cameraDirection");
        Intrinsics.checkNotNullParameter(display, "display");
        this.f35936l = getSize(ImageReader.class, true);
    }

    private final List<Size> filterSizes(Size[] sizeArr, Size size) {
        Float fValueOf = size != null ? Float.valueOf(size.getWidth() / size.getHeight()) : null;
        ArrayList arrayList = new ArrayList();
        for (Size size2 : sizeArr) {
            if (fValueOf == null ? true : Intrinsics.a(size2.getWidth() / size2.getHeight(), fValueOf)) {
                arrayList.add(size2);
            }
        }
        return zhm.d0.P0(arrayList, new b());
    }

    private final Size getImprovedSize(Class<?> cls) throws w.c {
        StreamConfigurationMap streamConfigurationMap;
        Object next;
        Object next2 = null;
        if (!StreamConfigurationMap.isOutputSupportedFor(cls) || getCameraId() == null || (streamConfigurationMap = (StreamConfigurationMap) getDelegate().getCameraCharacteristics(getCameraId()).get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)) == null) {
            return null;
        }
        Size[] outputSizes = streamConfigurationMap.getOutputSizes(cls);
        Intrinsics.checkNotNullExpressionValue(outputSizes, "getOutputSizes(...)");
        List<Size> listFilterSizes = filterSizes(outputSizes, getSize(cls));
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : listFilterSizes) {
            if (((Size) obj2).getHeight() >= 1080) {
                arrayList.add(obj2);
            }
        }
        Iterator it8 = arrayList.iterator();
        if (it8.hasNext()) {
            next = it8.next();
            if (it8.hasNext()) {
                int height = ((Size) next).getHeight();
                do {
                    Object next3 = it8.next();
                    int height2 = ((Size) next3).getHeight();
                    if (height > height2) {
                        next = next3;
                        height = height2;
                    }
                } while (it8.hasNext());
            }
        } else {
            next = null;
        }
        Size size = (Size) next;
        if (size == null) {
            Iterator<T> it9 = listFilterSizes.iterator();
            if (it9.hasNext()) {
                next2 = it9.next();
                if (it9.hasNext()) {
                    int height3 = ((Size) next2).getHeight();
                    do {
                        Object next4 = it9.next();
                        int height4 = ((Size) next4).getHeight();
                        if (height3 < height4) {
                            next2 = next4;
                            height3 = height4;
                        }
                    } while (it9.hasNext());
                }
            }
            size = (Size) next2;
            if (size == null) {
                throw w.c.f37036a;
            }
        }
        return improveSizeSelection(listFilterSizes, size);
    }

    private final Size getSize(Class<?> cls, boolean z) throws w.c {
        if (!z) {
            return getSize(cls);
        }
        Size improvedSize = getImprovedSize(cls);
        return improvedSize == null ? o : improvedSize;
    }

    private final Size improveSizeSelection(List<Size> list, Size size) {
        if (1920.0f / size.getWidth() < 0.7f) {
            return size;
        }
        ListIterator<Size> listIterator = list.listIterator();
        while (listIterator.hasNext() && !Intrinsics.f(listIterator.next(), size)) {
        }
        while (listIterator.hasPrevious()) {
            Size sizePrevious = listIterator.previous();
            if (1920.0f / sizePrevious.getWidth() > 0.7f) {
                size = sizePrevious;
            }
        }
        return size;
    }

    @Override // com.fourthline.vision.internal.b0
    @NotNull
    public Size getImageReaderSize() {
        return this.f35936l;
    }
}
