package androidx.transition;

import a0.d;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public class TransitionValues {
    public View view;
    public final Map<String, Object> values = new HashMap();
    final ArrayList<Transition> mTargetedTransitions = new ArrayList<>();

    @Deprecated
    public TransitionValues() {
    }

    public boolean equals(Object obj2) {
        if (!(obj2 instanceof TransitionValues)) {
            return false;
        }
        TransitionValues transitionValues = (TransitionValues) obj2;
        return this.view == transitionValues.view && this.values.equals(transitionValues.values);
    }

    public int hashCode() {
        return this.values.hashCode() + (this.view.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sbL = v0.a.l("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n", "    view = ");
        sbL.append(this.view);
        sbL.append("\n");
        String strR = d.r(sbL.toString(), "    values:");
        for (String str : this.values.keySet()) {
            strR = strR + "    " + str + ": " + this.values.get(str) + "\n";
        }
        return strR;
    }

    public TransitionValues(View view) {
        this.view = view;
    }
}
