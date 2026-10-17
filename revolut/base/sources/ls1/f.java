package ls1;

import com.revolut.feature.apm.core.models.recipients.BizumContact;

/* JADX INFO: loaded from: classes20.dex */
public final class f extends gim.c {
    public BizumContact u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h f199590w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f199591x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, gim.c cVar) {
        super(cVar);
        this.f199590w = hVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f199591x |= Integer.MIN_VALUE;
        return this.f199590w.e(null, this);
    }
}
