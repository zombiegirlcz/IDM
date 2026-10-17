package p72;

import com.revolut.feature.apm.core.models.multibanco.MultibancoRegistrationStatus;

/* JADX INFO: loaded from: classes20.dex */
public final class f extends gim.c {
    public MultibancoRegistrationStatus.Registered u;
    public h02.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f233521w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ g f233522x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f233523y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, gim.c cVar) {
        super(cVar);
        this.f233522x = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f233521w = obj2;
        this.f233523y |= Integer.MIN_VALUE;
        return this.f233522x.f(null, null, this);
    }
}
