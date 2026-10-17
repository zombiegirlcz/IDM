package bw;

import androidx.camera.core.CameraFilter;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class b implements CameraFilter {
    @Override // androidx.camera.core.CameraFilter
    public final List filter(List cameras) {
        Intrinsics.checkNotNullParameter(cameras, "cameras");
        return zhm.u.c(cameras.get(1));
    }
}
