package wh3;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes21.dex */
public final class k extends gim.c {
    public boolean u;
    public Function0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f297383w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ l f297384x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f297385y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, gim.c cVar) {
        super(cVar);
        this.f297384x = lVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f297383w = obj2;
        this.f297385y |= Integer.MIN_VALUE;
        return this.f297384x.Z2(false, null, this);
    }
}
