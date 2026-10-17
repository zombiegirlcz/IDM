package en6;

import com.revolut.domain.models.topup.TopUpContext;

/* JADX INFO: loaded from: classes3.dex */
public final class r extends gim.c {
    public final /* synthetic */ s A;
    public int B;
    public String u;
    public se6.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public dj0.d f127755w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public TopUpContext f127756x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public e7l.f f127757y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(s sVar, gim.c cVar) {
        super(cVar);
        this.A = sVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.z = obj2;
        this.B |= Integer.MIN_VALUE;
        return this.A.b(null, null, null, null, this);
    }
}
