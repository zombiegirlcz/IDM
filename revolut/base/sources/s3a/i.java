package s3a;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.payments.who_to_transfer.impl.transfer.selection.flow.RecipientSelectionFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class i implements qji.a, fri.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RecipientSelectionFlowContract$InputData f259520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f259521b;

    public i(k kVar, RecipientSelectionFlowContract$InputData recipientSelectionFlowContract$InputData) {
        this.f259520a = recipientSelectionFlowContract$InputData;
        this.f259521b = e4m.b.b(new r6e.m(kVar, this, 15));
    }

    @Override // dki.t
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // dki.q
    public final Set g() {
        return ImmutableSet.of();
    }
}
