package ks9;

import kotlin.jvm.internal.Intrinsics;
import vr9.b;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends yji.n implements c {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final bqf.g f189318l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final vr9.b f189319m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final g f189320n;
    public final j60.a o;

    public b(bqf.g trustedPayeeChecker, vr9.b appFraudMapper, g groupPaymentExtension, j60.a bottomExpandableDialog) {
        Intrinsics.checkNotNullParameter(trustedPayeeChecker, "trustedPayeeChecker");
        Intrinsics.checkNotNullParameter(appFraudMapper, "appFraudMapper");
        Intrinsics.checkNotNullParameter(groupPaymentExtension, "groupPaymentExtension");
        Intrinsics.checkNotNullParameter(bottomExpandableDialog, "bottomExpandableDialog");
        this.f189318l = trustedPayeeChecker;
        this.f189319m = appFraudMapper;
        this.f189320n = groupPaymentExtension;
        this.o = bottomExpandableDialog;
    }

    public final void Z2(b.AbstractC1618b parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        j60.a.v(this.o, false, null, 3);
        if (parcel instanceof vr9.c) {
            vr9.c cVar = (vr9.c) parcel;
            ((b0) this.f189320n).b3(cVar.f291518a, cVar.f291519b, cVar.f291520c);
        }
    }
}
