package j4g;

import iz1.p;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import yji.n;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends n {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final b f171377l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f171378m;

    public a(b flightUnavailableDialogFactory) {
        Intrinsics.checkNotNullParameter(flightUnavailableDialogFactory, "flightUnavailableDialogFactory");
        this.f171377l = flightUnavailableDialogFactory;
    }

    public final void Z2(Function0 onDismissed) {
        Intrinsics.checkNotNullParameter(onDismissed, "onDismissed");
        if (this.f171378m) {
            return;
        }
        this.f171378m = true;
        T2(new p(this, onDismissed, null, 12), new yi5.b(27));
    }
}
