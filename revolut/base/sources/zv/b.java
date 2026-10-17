package zv;

import androidx.camera.core.ImageInfo;
import androidx.camera.core.impl.TagBundle;
import androidx.camera.core.impl.utils.ExifData;
import kotlin.NotImplementedError;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class b implements ImageInfo {
    @Override // androidx.camera.core.ImageInfo
    public final int getRotationDegrees() {
        return 0;
    }

    @Override // androidx.camera.core.ImageInfo
    public final TagBundle getTagBundle() {
        Intrinsics.checkNotNullParameter("Not implemented", "message");
        throw new NotImplementedError("Not implemented");
    }

    @Override // androidx.camera.core.ImageInfo
    public final long getTimestamp() {
        Intrinsics.checkNotNullParameter("Not implemented", "message");
        throw new NotImplementedError("Not implemented");
    }

    @Override // androidx.camera.core.ImageInfo
    public final void populateExifData(ExifData.Builder exifBuilder) {
        Intrinsics.checkNotNullParameter(exifBuilder, "exifBuilder");
        Intrinsics.checkNotNullParameter("Not implemented", "message");
        throw new NotImplementedError("Not implemented");
    }
}
