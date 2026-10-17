package t38;

import com.revolut.feature.joint.api.data.JointAccountCloseReason;

/* JADX INFO: loaded from: classes4.dex */
public final class l extends gim.c {
    public JointAccountCloseReason.ForceOffBoarding u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ p f267690w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f267691x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(p pVar, gim.c cVar) {
        super(cVar);
        this.f267690w = pVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f267691x |= Integer.MIN_VALUE;
        return this.f267690w.f3(null, this);
    }
}
