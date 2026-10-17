package aie;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes8.dex */
public final class x extends gim.c {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.tab.accounts.impl.ui.spaces.i f5256w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f5257x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(com.revolut.feature.tab.accounts.impl.ui.spaces.i iVar, Continuation continuation) {
        super(continuation);
        this.f5256w = iVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f5257x |= Integer.MIN_VALUE;
        return com.revolut.feature.tab.accounts.impl.ui.spaces.i.I2(this.f5256w, null, this);
    }
}
