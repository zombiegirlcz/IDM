package androidx.view;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.os.SavedStateRegistry;
import kotlin.jvm.internal.Intrinsics;
import uji.b;
import yji.q;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements SavedStateRegistry.SavedStateProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6787b;

    public /* synthetic */ g(Object obj2, int i) {
        this.f6786a = i;
        this.f6787b = obj2;
    }

    @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
    public final Bundle saveState() {
        switch (this.f6786a) {
            case 0:
                return ComponentActivity._init_$lambda$3((ComponentActivity) this.f6787b);
            case 1:
                return ((FragmentActivity) this.f6787b).lambda$init$0();
            case 2:
                return ((FragmentManager) this.f6787b).lambda$attachController$5();
            default:
                b bVar = (b) this.f6787b;
                Bundle outState = new Bundle();
                q qVar = bVar.d;
                if (qVar != null) {
                    Intrinsics.checkNotNullParameter(outState, "outState");
                    qVar.f314529n.g(outState);
                }
                return outState;
        }
    }
}
