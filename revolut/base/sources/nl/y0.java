package nl;

import com.onfido.android.sdk.capture.common.permissions.RuntimePermissionsManager;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.trackers.NfcTracker;
import com.onfido.android.sdk.capture.internal.navigation.Navigator;
import com.onfido.android.sdk.capture.ui.nfc.NfcDataRepository;
import com.onfido.javax.inject.Provider;

/* JADX INFO: loaded from: classes17.dex */
public final class y0 implements el.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f216965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Provider f216966b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Provider f216967c;

    public /* synthetic */ y0(el.b bVar, el.b bVar2, int i) {
        this.f216965a = i;
        this.f216966b = bVar;
        this.f216967c = bVar2;
    }

    @Override // com.onfido.javax.inject.Provider
    public final Object get() {
        switch (this.f216965a) {
            case 0:
                return new x0((Navigator) this.f216966b.get(), (RuntimePermissionsManager) this.f216967c.get());
            default:
                return new pl.q((NfcDataRepository) this.f216966b.get(), (NfcTracker) this.f216967c.get());
        }
    }
}
