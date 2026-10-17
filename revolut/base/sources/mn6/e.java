package mn6;

import com.revolut.domain.models.openbanking.penny_verification.PennyAuthorisationResult;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends gim.c {
    public String u;
    public PennyAuthorisationResult v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f207368w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ j f207369x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f207370y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(j jVar, gim.c cVar) {
        super(cVar);
        this.f207369x = jVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f207368w = obj2;
        this.f207370y |= Integer.MIN_VALUE;
        return j.f3(this.f207369x, null, this);
    }
}
