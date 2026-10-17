package eq5;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class r0 extends gim.c {
    public ArrayList u;
    public xi0.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f128319w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ x0 f128320x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f128321y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(x0 x0Var, gim.c cVar) {
        super(cVar);
        this.f128320x = x0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f128319w = obj2;
        this.f128321y |= Integer.MIN_VALUE;
        return this.f128320x.l(null, this);
    }
}
