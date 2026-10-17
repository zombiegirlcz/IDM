package ks9;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class r0 extends yji.n {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final mq9.f f189371l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final vr9.s f189372m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final j60.a f189373n;

    public r0(mq9.f groupsInteractor, vr9.s trustingMapper, j60.a bottomExpandableDialog) {
        Intrinsics.checkNotNullParameter(groupsInteractor, "groupsInteractor");
        Intrinsics.checkNotNullParameter(trustingMapper, "trustingMapper");
        Intrinsics.checkNotNullParameter(bottomExpandableDialog, "bottomExpandableDialog");
        this.f189371l = groupsInteractor;
        this.f189372m = trustingMapper;
        this.f189373n = bottomExpandableDialog;
    }

    public final void Z2(vr9.v parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        Continuation continuation = null;
        if (parcel instanceof vr9.t) {
            T2(new q0(this, ((vr9.t) parcel).f291540a, continuation, 1), new yi5.b(27));
        } else {
            if (!(parcel instanceof vr9.u)) {
                throw new NoWhenBranchMatchedException();
            }
            T2(new q0(this, ((vr9.u) parcel).f291541a, continuation, 0), new yi5.b(27));
        }
    }
}
