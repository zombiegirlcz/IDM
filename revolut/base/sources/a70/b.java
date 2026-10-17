package a70;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import com.revolut.retail.core.ui.activity.BaseDelegatesActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import xr0.i;
import yhm.m;

/* JADX INFO: loaded from: classes19.dex */
public final class b implements DefaultLifecycleObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1711b;

    public /* synthetic */ b(Object obj2, int i) {
        this.f1710a = i;
        this.f1711b = obj2;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner owner) {
        int i = this.f1710a;
        Object obj2 = this.f1711b;
        Intrinsics.checkNotNullParameter(owner, "owner");
        switch (i) {
            case 0:
                c cVar = (c) obj2;
                BaseDelegatesActivity baseDelegatesActivity = cVar.f1712a;
                if (baseDelegatesActivity != null) {
                    cVar.f1712a = null;
                    baseDelegatesActivity.getLifecycle().removeObserver(cVar.f1714c);
                    baseDelegatesActivity.removeOnMultiWindowModeChangedListener(cVar.f1713b);
                }
                super.onDestroy(owner);
                break;
            case 1:
                super.onDestroy(owner);
                m.Companion companion = m.INSTANCE;
                ((eim.c) obj2).resumeWith(Unit.f186387a);
                break;
            default:
                i iVar = (i) obj2;
                Function0 function0 = iVar.d;
                if (function0 != null) {
                    function0.invoke();
                }
                w.A(iVar.f308195a).removeObserver(this);
                break;
        }
    }
}
