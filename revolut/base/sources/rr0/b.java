package rr0;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes19.dex */
public final class b {
    private b() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Drawable a(View view) {
        if (view instanceof a) {
            return ((a) view).getClonableBackground();
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            Drawable drawableA = a(viewGroup.getChildAt(i));
            if (drawableA != null) {
                return drawableA;
            }
        }
        return null;
    }
}
