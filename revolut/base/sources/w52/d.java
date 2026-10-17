package w52;

import com.revolut.feature.apm.core.models.recipients.IrisContact;

/* JADX INFO: loaded from: classes20.dex */
public final class d extends gim.c {
    public IrisContact u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e f294683w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f294684x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, gim.c cVar) {
        super(cVar);
        this.f294683w = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f294684x |= Integer.MIN_VALUE;
        return this.f294683w.h(null, this);
    }
}
