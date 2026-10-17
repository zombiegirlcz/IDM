package androidx.camera.core.impl;

import android.util.Range;
import android.util.Size;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.impl.UseCaseConfigFactory;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
final class AutoValue_AttachedSurfaceInfo extends AttachedSurfaceInfo {
    private final List<UseCaseConfigFactory.CaptureType> captureTypes;
    private final int customMaxFrameRate;
    private final DynamicRange dynamicRange;
    private final int imageFormat;
    private final Config implementationOptions;
    private final int sessionType;
    private final Size size;
    private final boolean strictFrameRateRequired;
    private final SurfaceConfig surfaceConfig;
    private final Range<Integer> targetFrameRate;

    public AutoValue_AttachedSurfaceInfo(SurfaceConfig surfaceConfig, int i, Size size, DynamicRange dynamicRange, List<UseCaseConfigFactory.CaptureType> list, Config config, int i2, Range<Integer> range, boolean z, int i3) {
        if (surfaceConfig == null) {
            throw new NullPointerException("Null surfaceConfig");
        }
        this.surfaceConfig = surfaceConfig;
        this.imageFormat = i;
        if (size == null) {
            throw new NullPointerException("Null size");
        }
        this.size = size;
        if (dynamicRange == null) {
            throw new NullPointerException("Null dynamicRange");
        }
        this.dynamicRange = dynamicRange;
        if (list == null) {
            throw new NullPointerException("Null captureTypes");
        }
        this.captureTypes = list;
        this.implementationOptions = config;
        this.sessionType = i2;
        if (range == null) {
            throw new NullPointerException("Null targetFrameRate");
        }
        this.targetFrameRate = range;
        this.strictFrameRateRequired = z;
        this.customMaxFrameRate = i3;
    }

    public boolean equals(Object obj2) {
        Config config;
        if (obj2 == this) {
            return true;
        }
        if (obj2 instanceof AttachedSurfaceInfo) {
            AttachedSurfaceInfo attachedSurfaceInfo = (AttachedSurfaceInfo) obj2;
            if (this.surfaceConfig.equals(attachedSurfaceInfo.getSurfaceConfig()) && this.imageFormat == attachedSurfaceInfo.getImageFormat() && this.size.equals(attachedSurfaceInfo.getSize()) && this.dynamicRange.equals(attachedSurfaceInfo.getDynamicRange()) && this.captureTypes.equals(attachedSurfaceInfo.getCaptureTypes()) && ((config = this.implementationOptions) != null ? config.equals(attachedSurfaceInfo.getImplementationOptions()) : attachedSurfaceInfo.getImplementationOptions() == null) && this.sessionType == attachedSurfaceInfo.getSessionType() && this.targetFrameRate.equals(attachedSurfaceInfo.getTargetFrameRate()) && this.strictFrameRateRequired == attachedSurfaceInfo.isStrictFrameRateRequired() && this.customMaxFrameRate == attachedSurfaceInfo.getCustomMaxFrameRate()) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.core.impl.AttachedSurfaceInfo
    public List<UseCaseConfigFactory.CaptureType> getCaptureTypes() {
        return this.captureTypes;
    }

    @Override // androidx.camera.core.impl.AttachedSurfaceInfo
    public int getCustomMaxFrameRate() {
        return this.customMaxFrameRate;
    }

    @Override // androidx.camera.core.impl.AttachedSurfaceInfo
    public DynamicRange getDynamicRange() {
        return this.dynamicRange;
    }

    @Override // androidx.camera.core.impl.AttachedSurfaceInfo
    public int getImageFormat() {
        return this.imageFormat;
    }

    @Override // androidx.camera.core.impl.AttachedSurfaceInfo
    public Config getImplementationOptions() {
        return this.implementationOptions;
    }

    @Override // androidx.camera.core.impl.AttachedSurfaceInfo
    public int getSessionType() {
        return this.sessionType;
    }

    @Override // androidx.camera.core.impl.AttachedSurfaceInfo
    public Size getSize() {
        return this.size;
    }

    @Override // androidx.camera.core.impl.AttachedSurfaceInfo
    public SurfaceConfig getSurfaceConfig() {
        return this.surfaceConfig;
    }

    @Override // androidx.camera.core.impl.AttachedSurfaceInfo
    public Range<Integer> getTargetFrameRate() {
        return this.targetFrameRate;
    }

    public int hashCode() {
        int iHashCode = (((((((((this.surfaceConfig.hashCode() ^ 1000003) * 1000003) ^ this.imageFormat) * 1000003) ^ this.size.hashCode()) * 1000003) ^ this.dynamicRange.hashCode()) * 1000003) ^ this.captureTypes.hashCode()) * 1000003;
        Config config = this.implementationOptions;
        return ((((((((iHashCode ^ (config == null ? 0 : config.hashCode())) * 1000003) ^ this.sessionType) * 1000003) ^ this.targetFrameRate.hashCode()) * 1000003) ^ (this.strictFrameRateRequired ? 1231 : 1237)) * 1000003) ^ this.customMaxFrameRate;
    }

    @Override // androidx.camera.core.impl.AttachedSurfaceInfo
    public boolean isStrictFrameRateRequired() {
        return this.strictFrameRateRequired;
    }

    public String toString() {
        StringBuilder sb6 = new StringBuilder("AttachedSurfaceInfo{surfaceConfig=");
        sb6.append(this.surfaceConfig);
        sb6.append(", imageFormat=");
        sb6.append(this.imageFormat);
        sb6.append(", size=");
        sb6.append(this.size);
        sb6.append(", dynamicRange=");
        sb6.append(this.dynamicRange);
        sb6.append(", captureTypes=");
        sb6.append(this.captureTypes);
        sb6.append(", implementationOptions=");
        sb6.append(this.implementationOptions);
        sb6.append(", sessionType=");
        sb6.append(this.sessionType);
        sb6.append(", targetFrameRate=");
        sb6.append(this.targetFrameRate);
        sb6.append(", strictFrameRateRequired=");
        sb6.append(this.strictFrameRateRequired);
        sb6.append(", customMaxFrameRate=");
        return j6.a.v(sb6, "}", this.customMaxFrameRate);
    }
}
