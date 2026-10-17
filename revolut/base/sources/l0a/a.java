package l0a;

import com.revolut.feature.apm.core.models.recipients.ApmRecipient;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends gim.c {
    public ApmRecipient u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b f191189w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f191190x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, gim.c cVar) {
        super(cVar);
        this.f191189w = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f191190x |= Integer.MIN_VALUE;
        return this.f191189w.a(null, this);
    }
}
