package pli;

import androidx.lifecycle.LifecycleOwner;
import e4m.e;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import ks0.n;
import skm.p0;
import zkm.o;

/* JADX INFO: loaded from: classes10.dex */
public abstract class c implements e {
    public static CoroutineScope a(n scopeFactory) {
        a.Companion.getClass();
        Intrinsics.checkNotNullParameter(scopeFactory, "scopeFactory");
        p0 p0Var = p0.f264001a;
        CoroutineScope coroutineScopeA = rd0.e.a(o.f323119a);
        ((LifecycleOwner) scopeFactory.f189085b).getLifecycle().addObserver(new cwl.e(scopeFactory, coroutineScopeA, 1));
        return coroutineScopeA;
    }
}
