package uw8;

import ipa.h;
import ipa.j;
import ipa.k;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import mt8.d;
import om4.d0;
import skd.i;
import skm.e0;

/* JADX INFO: loaded from: classes13.dex */
public final class b implements hpa.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f283560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f283561b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d0 f283562c;
    public final CoroutineScope d;

    public b(d kycInteractor, i slotManagerInteractor, d0 mainSlotContextProvider, CoroutineScope appCoroutineScope) {
        Intrinsics.checkNotNullParameter(kycInteractor, "kycInteractor");
        Intrinsics.checkNotNullParameter(slotManagerInteractor, "slotManagerInteractor");
        Intrinsics.checkNotNullParameter(mainSlotContextProvider, "mainSlotContextProvider");
        Intrinsics.checkNotNullParameter(appCoroutineScope, "appCoroutineScope");
        this.f283560a = kycInteractor;
        this.f283561b = slotManagerInteractor;
        this.f283562c = mainSlotContextProvider;
        this.d = appCoroutineScope;
    }

    @Override // hpa.a
    public final boolean b(j message) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (k.l(message) != h.KYC) {
            return false;
        }
        Continuation continuation = null;
        a aVar = new a(this, continuation, 0);
        CoroutineScope coroutineScope = this.d;
        e0.C(coroutineScope, null, null, aVar, 3);
        e0.C(coroutineScope, null, null, new a(this, continuation, 1), 3);
        return true;
    }
}
