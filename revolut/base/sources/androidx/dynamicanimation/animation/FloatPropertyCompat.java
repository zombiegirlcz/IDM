package androidx.dynamicanimation.animation;

import d.a;

/* JADX INFO: loaded from: classes15.dex */
public abstract class FloatPropertyCompat<T> {
    final String mPropertyName;

    public FloatPropertyCompat(String str) {
        this.mPropertyName = str;
    }

    public static <T> FloatPropertyCompat<T> createFloatPropertyCompat(final a aVar) {
        return new FloatPropertyCompat<T>(aVar.getName()) { // from class: androidx.dynamicanimation.animation.FloatPropertyCompat.1
            @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
            public float getValue(T t2) {
                return ((Float) aVar.get(t2)).floatValue();
            }

            @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
            public void setValue(T t2, float f) {
                aVar.setValue(t2, f);
            }
        };
    }

    public abstract float getValue(T t2);

    public abstract void setValue(T t2, float f);
}
