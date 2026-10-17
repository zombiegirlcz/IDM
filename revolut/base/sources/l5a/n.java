package l5a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class n extends com.revolut.feature.payments.who_to_transfer.impl.ui.flow.tab_payments.payments_intro.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f192212a;

    public n(k createFirstTransferStubsState) {
        Intrinsics.checkNotNullParameter(createFirstTransferStubsState, "createFirstTransferStubsState");
        this.f192212a = createFirstTransferStubsState;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && this.f192212a == ((n) obj2).f192212a;
    }

    public final int hashCode() {
        return this.f192212a.hashCode();
    }
}
