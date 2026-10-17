package com.revolut.camerakit.vision_framework.generated;

import ehe.n;

/* JADX INFO: loaded from: classes16.dex */
public final class EulerAngles {
    final float pitch;
    final float roll;
    final float yaw;

    public EulerAngles(float f, float f4, float f5) {
        this.roll = f;
        this.yaw = f4;
        this.pitch = f5;
    }

    public boolean equals(Object obj2) {
        if (!(obj2 instanceof EulerAngles)) {
            return false;
        }
        EulerAngles eulerAngles = (EulerAngles) obj2;
        return this.roll == eulerAngles.roll && this.yaw == eulerAngles.yaw && this.pitch == eulerAngles.pitch;
    }

    public float getPitch() {
        return this.pitch;
    }

    public float getRoll() {
        return this.roll;
    }

    public float getYaw() {
        return this.yaw;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.pitch) + ((Float.floatToIntBits(this.yaw) + ((Float.floatToIntBits(this.roll) + 527) * 31)) * 31);
    }

    public String toString() {
        StringBuilder sb6 = new StringBuilder("EulerAngles{roll=");
        sb6.append(this.roll);
        sb6.append(",yaw=");
        sb6.append(this.yaw);
        sb6.append(",pitch=");
        return n.t(this.pitch, "}", sb6);
    }
}
