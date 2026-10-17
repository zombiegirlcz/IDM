package androidx.camera.core;

import androidx.core.util.Pair;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes15.dex */
public class CompositionSettings {
    public static final CompositionSettings DEFAULT = new Builder().setAlpha(1.0f).setOffset(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED).setScale(1.0f, 1.0f).build();
    private final float mAlpha;
    private final Pair<Float, Float> mOffset;
    private final Pair<Float, Float> mScale;

    public static final class Builder {
        private float mAlpha;
        private Pair<Float, Float> mOffset;
        private Pair<Float, Float> mScale;

        public Builder() {
            Float fValueOf = Float.valueOf(1.0f);
            this.mAlpha = 1.0f;
            Float fValueOf2 = Float.valueOf(BitmapDescriptorFactory.HUE_RED);
            this.mOffset = Pair.create(fValueOf2, fValueOf2);
            this.mScale = Pair.create(fValueOf, fValueOf);
        }

        public CompositionSettings build() {
            return new CompositionSettings(this.mAlpha, this.mOffset, this.mScale);
        }

        public Builder setAlpha(float f) {
            this.mAlpha = f;
            return this;
        }

        public Builder setOffset(float f, float f4) {
            this.mOffset = Pair.create(Float.valueOf(f), Float.valueOf(f4));
            return this;
        }

        public Builder setScale(float f, float f4) {
            this.mScale = Pair.create(Float.valueOf(f), Float.valueOf(f4));
            return this;
        }
    }

    public float getAlpha() {
        return this.mAlpha;
    }

    public Pair<Float, Float> getOffset() {
        return this.mOffset;
    }

    public Pair<Float, Float> getScale() {
        return this.mScale;
    }

    private CompositionSettings(float f, Pair<Float, Float> pair, Pair<Float, Float> pair2) {
        this.mAlpha = f;
        this.mOffset = pair;
        this.mScale = pair2;
    }
}
