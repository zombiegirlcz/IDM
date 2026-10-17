package androidx.viewbinding;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes16.dex */
public abstract class ViewBindings {
    public static <T extends View> T findChildViewById(View view, int i) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            T t2 = (T) viewGroup.getChildAt(i2).findViewById(i);
            if (t2 != null) {
                return t2;
            }
        }
        return null;
    }
}
