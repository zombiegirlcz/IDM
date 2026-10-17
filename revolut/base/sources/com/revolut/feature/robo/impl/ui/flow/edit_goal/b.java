package com.revolut.feature.robo.impl.ui.flow.edit_goal;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends gim.c {
    public int A;
    public dj0.d u;
    public dj0.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public a f85105w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f85106x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f85107y;
    public final /* synthetic */ c z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, gim.c cVar2) {
        super(cVar2);
        this.z = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f85107y = obj2;
        this.A |= Integer.MIN_VALUE;
        return this.z.a(null, null, null, this);
    }
}
