package p72;

import com.revolut.feature.apm.core.models.multibanco.MultibancoRegistrationStatus;

/* JADX INFO: loaded from: classes20.dex */
public final class e extends gim.c {
    public MultibancoRegistrationStatus.Registered u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g f233519w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f233520x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, gim.c cVar) {
        super(cVar);
        this.f233519w = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f233520x |= Integer.MIN_VALUE;
        return this.f233519w.e(null, this);
    }
}
