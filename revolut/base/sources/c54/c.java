package c54;

import android.os.Bundle;
import androidx.browser.customtabs.CustomTabsCallback;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class c extends CustomTabsCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f21410b;

    public /* synthetic */ c(Object obj2, int i) {
        this.f21409a = i;
        this.f21410b = obj2;
    }

    @Override // androidx.browser.customtabs.CustomTabsCallback
    public final void onNavigationEvent(int i, Bundle bundle) {
        switch (this.f21409a) {
            case 0:
                super.onNavigationEvent(i, bundle);
                k kVar = ((d) this.f21410b).d;
                if (kVar == null) {
                    Intrinsics.r("callback");
                    throw null;
                }
                if (i == 6) {
                    kVar.C2(i.f21418a);
                    return;
                }
                return;
            default:
                super.onNavigationEvent(i, bundle);
                yw8.e eVar = ((cu8.d) this.f21410b).d;
                if (eVar == null) {
                    Intrinsics.r("kycChromeTabCustomCallBack");
                    throw null;
                }
                if (i == 6) {
                    eVar.C2(yw8.c.f317348a);
                    return;
                }
                return;
        }
    }
}
