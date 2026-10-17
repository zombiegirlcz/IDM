package og6;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends gim.c {
    public int A;
    public String u;
    public Boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Map f225038w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Map f225039x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f225040y;
    public final /* synthetic */ com.revolut.feature.external_accounts.impl.domain.open_banking_brazil.b z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.revolut.feature.external_accounts.impl.domain.open_banking_brazil.b bVar, gim.c cVar) {
        super(cVar);
        this.z = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f225040y = obj2;
        this.A |= Integer.MIN_VALUE;
        return this.z.a(null, null, null, null, this);
    }
}
