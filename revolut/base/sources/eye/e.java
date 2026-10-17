package eye;

import com.revolut.feature.topup_screen.common.TopUpTarget;

/* JADX INFO: loaded from: classes8.dex */
public final class e extends gim.c {
    public TopUpTarget u;
    public dj0.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f130852w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f130853x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ f f130854y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, gim.c cVar) {
        super(cVar);
        this.f130854y = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f130853x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f130854y.a(null, null, null, this);
    }
}
