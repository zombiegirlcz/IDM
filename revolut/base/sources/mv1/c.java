package mv1;

import com.revolut.feature.apm.core.models.recipients.BrebContact;

/* JADX INFO: loaded from: classes20.dex */
public final class c extends gim.c {
    public BrebContact u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f209086w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f209087x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, gim.c cVar) {
        super(cVar);
        this.f209086w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f209087x |= Integer.MIN_VALUE;
        return this.f209086w.h(null, this);
    }
}
