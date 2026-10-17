package er;

import com.revolut.camerakit.core.settings.VideoImuDataCollectionSettings;
import com.revolut.camerakit.core.settings.WatermarkSettings;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yw.n;

/* JADX INFO: loaded from: classes17.dex */
public final class e {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f128522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final VideoImuDataCollectionSettings f128523b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WatermarkSettings f128524c;
    public final WatermarkSettings d;

    public static final class a {
        private a() {
        }
    }

    static {
        new e(0);
    }

    public e() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f128522a == eVar.f128522a && Intrinsics.f(this.f128523b, eVar.f128523b) && Intrinsics.f(this.f128524c, eVar.f128524c) && Intrinsics.f(this.d, eVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f128524c.hashCode() + ((this.f128523b.hashCode() + (this.f128522a.hashCode() * 31)) * 31)) * 31);
    }

    public e(n videoCaptureStoragePolicy, VideoImuDataCollectionSettings imuDataCollectionSettings, WatermarkSettings videoWatermarkSettings, WatermarkSettings photoWatermarkSettings) {
        Intrinsics.checkNotNullParameter(videoCaptureStoragePolicy, "videoCaptureStoragePolicy");
        Intrinsics.checkNotNullParameter(imuDataCollectionSettings, "imuDataCollectionSettings");
        Intrinsics.checkNotNullParameter(videoWatermarkSettings, "videoWatermarkSettings");
        Intrinsics.checkNotNullParameter(photoWatermarkSettings, "photoWatermarkSettings");
        this.f128522a = videoCaptureStoragePolicy;
        this.f128523b = imuDataCollectionSettings;
        this.f128524c = videoWatermarkSettings;
        this.d = photoWatermarkSettings;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public e(int i) {
        n nVar = n.FILE;
        VideoImuDataCollectionSettings.INSTANCE.getClass();
        this(nVar, VideoImuDataCollectionSettings.f50742c, new WatermarkSettings(), new WatermarkSettings());
    }
}
