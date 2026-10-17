package androidx.camera.video;

import android.util.Size;
import androidx.camera.video.Quality;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
final class AutoValue_Quality_ConstantQuality extends Quality.ConstantQuality {
    private final int highSpeedValue;
    private final String name;
    private final List<Size> typicalSizes;
    private final int value;

    public AutoValue_Quality_ConstantQuality(int i, int i2, String str, List<Size> list) {
        this.value = i;
        this.highSpeedValue = i2;
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        this.name = str;
        if (list == null) {
            throw new NullPointerException("Null typicalSizes");
        }
        this.typicalSizes = list;
    }

    public boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (obj2 instanceof Quality.ConstantQuality) {
            Quality.ConstantQuality constantQuality = (Quality.ConstantQuality) obj2;
            if (this.value == constantQuality.getValue() && this.highSpeedValue == constantQuality.getHighSpeedValue() && this.name.equals(constantQuality.getName()) && this.typicalSizes.equals(constantQuality.getTypicalSizes())) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.video.Quality.ConstantQuality
    public int getHighSpeedValue() {
        return this.highSpeedValue;
    }

    @Override // androidx.camera.video.Quality.ConstantQuality
    public String getName() {
        return this.name;
    }

    @Override // androidx.camera.video.Quality.ConstantQuality
    public List<Size> getTypicalSizes() {
        return this.typicalSizes;
    }

    @Override // androidx.camera.video.Quality.ConstantQuality
    public int getValue() {
        return this.value;
    }

    public int hashCode() {
        return ((((((this.value ^ 1000003) * 1000003) ^ this.highSpeedValue) * 1000003) ^ this.name.hashCode()) * 1000003) ^ this.typicalSizes.hashCode();
    }

    public String toString() {
        StringBuilder sb6 = new StringBuilder("ConstantQuality{value=");
        sb6.append(this.value);
        sb6.append(", highSpeedValue=");
        sb6.append(this.highSpeedValue);
        sb6.append(", name=");
        sb6.append(this.name);
        sb6.append(", typicalSizes=");
        return t61.a.q("}", this.typicalSizes, sb6);
    }
}
