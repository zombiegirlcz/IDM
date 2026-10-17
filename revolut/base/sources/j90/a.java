package j90;

import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.view.ComponentActivity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class a extends b {
    public final int d;

    public a(int i) {
        this.d = i;
    }

    @Override // j90.b
    public final View a(Object obj2) {
        ComponentActivity thisRef = (ComponentActivity) obj2;
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        return thisRef.findViewById(this.d);
    }

    @Override // j90.b
    public final Lifecycle b(Object obj2) {
        ComponentActivity thisRef = (ComponentActivity) obj2;
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        return thisRef.getLifecycle();
    }
}
