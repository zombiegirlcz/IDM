package p72;

import com.revolut.feature.apm.core.models.multibanco.MultibancoRegistrationStatus;

/* JADX INFO: loaded from: classes20.dex */
public final class d extends gim.c {
    public MultibancoRegistrationStatus u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f233516w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ g f233517x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f233518y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(g gVar, gim.c cVar) {
        super(cVar);
        this.f233517x = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f233516w = obj2;
        this.f233518y |= Integer.MIN_VALUE;
        return this.f233517x.b(this);
    }
}
