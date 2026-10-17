package zl;

import android.animation.IntEvaluator;
import android.animation.PropertyValuesHolder;

/* JADX INFO: loaded from: classes17.dex */
public final class j extends i {
    @Override // zl.i
    public final PropertyValuesHolder g(boolean z) {
        int i;
        int i2;
        String str;
        if (z) {
            i2 = this.f323146h;
            i = (int) (i2 * this.i);
            str = "ANIMATION_SCALE_REVERSE";
        } else {
            i = this.f323146h;
            i2 = (int) (i * this.i);
            str = "ANIMATION_SCALE";
        }
        PropertyValuesHolder propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, i, i2);
        propertyValuesHolderOfInt.setEvaluator(new IntEvaluator());
        return propertyValuesHolderOfInt;
    }
}
