package fc2;

import com.revolut.feature.apm.core.models.recipients.QvikContact;

/* JADX INFO: loaded from: classes20.dex */
public final class f extends gim.c {
    public QvikContact u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g f133618w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f133619x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, gim.c cVar) {
        super(cVar);
        this.f133618w = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f133619x |= Integer.MIN_VALUE;
        return this.f133618w.h(null, this);
    }
}
