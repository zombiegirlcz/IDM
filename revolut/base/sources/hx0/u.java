package hx0;

import android.view.View;
import androidx.collection.MutableObjectFloatMap;
import java.util.ArrayList;
import kotlin.jvm.internal.Ref$BooleanRef;

/* JADX INFO: loaded from: classes19.dex */
public final class u {
    private u() {
    }

    public static final void a(Ref$BooleanRef ref$BooleanRef, View view, float f, ArrayList arrayList, ArrayList arrayList2, MutableObjectFloatMap mutableObjectFloatMap) {
        if (ref$BooleanRef.f186407a) {
            return;
        }
        ref$BooleanRef.f186407a = true;
        view.setTranslationY(f);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            View view2 = (View) arrayList.get(i);
            view2.setAlpha(mutableObjectFloatMap.get(view2));
        }
        int size2 = arrayList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((View) arrayList2.get(i2)).setHasTransientState(false);
        }
    }
}
