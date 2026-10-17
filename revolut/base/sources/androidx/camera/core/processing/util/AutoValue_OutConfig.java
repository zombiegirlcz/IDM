package androidx.camera.core.processing.util;

import android.graphics.Rect;
import android.util.Size;
import com.google.android.gms.internal.mlkit_vision_face.a;
import java.util.UUID;

/* JADX INFO: loaded from: classes15.dex */
final class AutoValue_OutConfig extends OutConfig {
    private final Rect getCropRect;
    private final int getFormat;
    private final int getRotationDegrees;
    private final Size getSize;
    private final int getTargets;
    private final UUID getUuid;
    private final boolean isMirroring;
    private final boolean shouldRespectInputCropRect;

    public AutoValue_OutConfig(UUID uuid, int i, int i2, Rect rect, Size size, int i3, boolean z, boolean z3) {
        if (uuid == null) {
            throw new NullPointerException("Null getUuid");
        }
        this.getUuid = uuid;
        this.getTargets = i;
        this.getFormat = i2;
        if (rect == null) {
            throw new NullPointerException("Null getCropRect");
        }
        this.getCropRect = rect;
        if (size == null) {
            throw new NullPointerException("Null getSize");
        }
        this.getSize = size;
        this.getRotationDegrees = i3;
        this.isMirroring = z;
        this.shouldRespectInputCropRect = z3;
    }

    public boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (obj2 instanceof OutConfig) {
            OutConfig outConfig = (OutConfig) obj2;
            if (this.getUuid.equals(outConfig.getUuid()) && this.getTargets == outConfig.getTargets() && this.getFormat == outConfig.getFormat() && this.getCropRect.equals(outConfig.getCropRect()) && this.getSize.equals(outConfig.getSize()) && this.getRotationDegrees == outConfig.getRotationDegrees() && this.isMirroring == outConfig.isMirroring() && this.shouldRespectInputCropRect == outConfig.shouldRespectInputCropRect()) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.core.processing.util.OutConfig
    public Rect getCropRect() {
        return this.getCropRect;
    }

    @Override // androidx.camera.core.processing.util.OutConfig
    public int getFormat() {
        return this.getFormat;
    }

    @Override // androidx.camera.core.processing.util.OutConfig
    public int getRotationDegrees() {
        return this.getRotationDegrees;
    }

    @Override // androidx.camera.core.processing.util.OutConfig
    public Size getSize() {
        return this.getSize;
    }

    @Override // androidx.camera.core.processing.util.OutConfig
    public int getTargets() {
        return this.getTargets;
    }

    @Override // androidx.camera.core.processing.util.OutConfig
    public UUID getUuid() {
        return this.getUuid;
    }

    public int hashCode() {
        return ((((((((((((((this.getUuid.hashCode() ^ 1000003) * 1000003) ^ this.getTargets) * 1000003) ^ this.getFormat) * 1000003) ^ this.getCropRect.hashCode()) * 1000003) ^ this.getSize.hashCode()) * 1000003) ^ this.getRotationDegrees) * 1000003) ^ (this.isMirroring ? 1231 : 1237)) * 1000003) ^ (this.shouldRespectInputCropRect ? 1231 : 1237);
    }

    @Override // androidx.camera.core.processing.util.OutConfig
    public boolean isMirroring() {
        return this.isMirroring;
    }

    @Override // androidx.camera.core.processing.util.OutConfig
    public boolean shouldRespectInputCropRect() {
        return this.shouldRespectInputCropRect;
    }

    public String toString() {
        StringBuilder sb6 = new StringBuilder("OutConfig{getUuid=");
        sb6.append(this.getUuid);
        sb6.append(", getTargets=");
        sb6.append(this.getTargets);
        sb6.append(", getFormat=");
        sb6.append(this.getFormat);
        sb6.append(", getCropRect=");
        sb6.append(this.getCropRect);
        sb6.append(", getSize=");
        sb6.append(this.getSize);
        sb6.append(", getRotationDegrees=");
        sb6.append(this.getRotationDegrees);
        sb6.append(", isMirroring=");
        sb6.append(this.isMirroring);
        sb6.append(", shouldRespectInputCropRect=");
        return a.t(sb6, this.shouldRespectInputCropRect, "}");
    }
}
