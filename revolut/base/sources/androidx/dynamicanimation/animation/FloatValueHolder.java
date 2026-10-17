package androidx.dynamicanimation.animation;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes15.dex */
public final class FloatValueHolder {
    private float mValue = BitmapDescriptorFactory.HUE_RED;

    public FloatValueHolder() {
    }

    public float getValue() {
        return this.mValue;
    }

    public void setValue(float f) {
        this.mValue = f;
    }

    public FloatValueHolder(float f) {
        setValue(f);
    }
}
