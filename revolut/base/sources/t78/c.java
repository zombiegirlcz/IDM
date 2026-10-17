package t78;

import com.revolut.feature.junior.accounts.models.JuniorAccountShownPayload;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends gim.c {
    public JuniorAccountShownPayload.GraduationPendingDialog u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f268607w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f268608x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ f f268609y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(f fVar, gim.c cVar) {
        super(cVar);
        this.f268609y = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f268608x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f268609y.Z2(null, this);
    }
}
