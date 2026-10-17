package e42;

import com.revolut.feature.apm.core.models.recipients.ApmRecipient;

/* JADX INFO: loaded from: classes20.dex */
public final class d extends gim.c {
    public ApmRecipient u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.apm.core.ui.impl.ui.recipients.settings_dialog.b f122375w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f122376x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.revolut.feature.apm.core.ui.impl.ui.recipients.settings_dialog.b bVar, gim.c cVar) {
        super(cVar);
        this.f122375w = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f122376x |= Integer.MIN_VALUE;
        return com.revolut.feature.apm.core.ui.impl.ui.recipients.settings_dialog.b.I2(this.f122375w, null, null, this);
    }
}
