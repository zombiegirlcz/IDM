package cwl;

import android.os.Handler;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import com.revolut.core.ui_kit.views.o;
import com.revolut.retail.core.ui.activity.BaseDelegatesActivity;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import ks0.n;
import skm.e0;
import zhm.v;

/* JADX INFO: loaded from: classes12.dex */
public final class e implements DefaultLifecycleObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f109860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f109861b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f109862c;

    public /* synthetic */ e(Object obj2, Object obj3, int i) {
        this.f109860a = i;
        this.f109861b = obj2;
        this.f109862c = obj3;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner owner) {
        switch (this.f109860a) {
            case 0:
                Intrinsics.checkNotNullParameter(owner, "owner");
                ((BaseDelegatesActivity) this.f109861b).getLifecycle().removeObserver(this);
                ((Handler) this.f109862c).removeCallbacksAndMessages(null);
                break;
            case 1:
                Intrinsics.checkNotNullParameter(owner, "owner");
                ((LifecycleOwner) ((n) this.f109861b).f189085b).getLifecycle().removeObserver(this);
                e0.j(((CoroutineScope) this.f109862c).getF74819h(), null);
                break;
            case 2:
                Intrinsics.checkNotNullParameter(owner, "owner");
                zv0.a aVar = (zv0.a) this.f109861b;
                ek2.g listener = (ek2.g) this.f109862c;
                o oVar = (o) aVar;
                Intrinsics.checkNotNullParameter(listener, "listener");
                ArrayList arrayList = oVar.f59568c;
                for (int iJ = v.j(arrayList); -1 < iJ; iJ--) {
                    if (Intrinsics.f((ek2.g) arrayList.get(iJ), listener)) {
                        arrayList.remove(iJ);
                    }
                }
                oVar.f59578s.h(listener);
                break;
            default:
                Intrinsics.checkNotNullParameter(owner, "owner");
                zv0.a aVar2 = (zv0.a) this.f109861b;
                ebi.a listener2 = (ebi.a) this.f109862c;
                o oVar2 = (o) aVar2;
                Intrinsics.checkNotNullParameter(listener2, "listener");
                ArrayList arrayList2 = oVar2.f59567b;
                for (int iJ2 = v.j(arrayList2); -1 < iJ2; iJ2--) {
                    if (Intrinsics.f((ebi.a) arrayList2.get(iJ2), listener2)) {
                        arrayList2.remove(iJ2);
                    }
                }
                oVar2.f59578s.d(listener2);
                break;
        }
    }
}
