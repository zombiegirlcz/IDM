package z32;

import com.revolut.feature.apm.core.models.recipients.ApmRecipient;
import com.revolut.feature.apm.core.models.recipients.ApmRecipientSettingsValue;

/* JADX INFO: loaded from: classes20.dex */
public final class g extends gim.c {
    public ApmRecipient u;
    public ApmRecipientSettingsValue.BlockIncomingMoneyRequests v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f319126w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ h f319127x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f319128y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, gim.c cVar) {
        super(cVar);
        this.f319127x = hVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f319126w = obj2;
        this.f319128y |= Integer.MIN_VALUE;
        return this.f319127x.c(null, null, this);
    }
}
