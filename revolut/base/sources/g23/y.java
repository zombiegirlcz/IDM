package g23;

import com.revolut.retail.core.navigation.NaviCommand;

/* JADX INFO: loaded from: classes21.dex */
public final class y extends gim.c {
    public NaviCommand u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ z f139840w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f139841x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(z zVar, gim.c cVar) {
        super(cVar);
        this.f139840w = zVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f139841x |= Integer.MIN_VALUE;
        return this.f139840w.Z2(null, this);
    }
}
