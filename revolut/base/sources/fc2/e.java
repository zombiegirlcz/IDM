package fc2;

import com.revolut.feature.apm.core.models.recipients.QvikContact;

/* JADX INFO: loaded from: classes20.dex */
public final class e extends gim.c {
    public QvikContact u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g f133616w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f133617x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, gim.c cVar) {
        super(cVar);
        this.f133616w = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f133617x |= Integer.MIN_VALUE;
        return this.f133616w.e(null, this);
    }
}
