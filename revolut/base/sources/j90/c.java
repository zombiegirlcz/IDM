package j90;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class c extends b {
    public final int d;

    public c(int i) {
        this.d = i;
    }

    @Override // j90.b
    public final View a(Object obj2) {
        Fragment thisRef = (Fragment) obj2;
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        View view = thisRef.getView();
        if (view != null) {
            return view.findViewById(this.d);
        }
        return null;
    }

    @Override // j90.b
    public final Lifecycle b(Object obj2) {
        Fragment thisRef = (Fragment) obj2;
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        LifecycleOwner value = thisRef.getViewLifecycleOwnerLiveData().getValue();
        if (value != null) {
            return value.getLifecycle();
        }
        return null;
    }
}
