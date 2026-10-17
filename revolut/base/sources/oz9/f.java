package oz9;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.payments.social.impl.presentation.transfer_only_kompot.transfer_with_chat_flow.TransferOnlyChatToTransferFlowContract$InputData;
import java.util.Set;
import ove.w;

/* JADX INFO: loaded from: classes5.dex */
public final class f implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransferOnlyChatToTransferFlowContract$InputData f231172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f231173b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f231174c;
    public final e4m.e d;
    public final e4m.e e;

    public f(c cVar, TransferOnlyChatToTransferFlowContract$InputData transferOnlyChatToTransferFlowContract$InputData) {
        this.f231173b = cVar;
        this.f231172a = transferOnlyChatToTransferFlowContract$InputData;
        int i = 14;
        this.f231174c = e4m.b.b(new w(cVar, this, 1, i));
        this.d = e4m.b.b(new w(cVar, this, 0, i));
        this.e = e4m.b.b(cVar.Z);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
