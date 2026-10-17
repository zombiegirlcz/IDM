package jnd;

import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: classes7.dex */
public final class s extends gim.c {
    public final /* synthetic */ t A;
    public int B;
    public n u;
    public MutableStateFlow v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f176723w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f176724x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f176725y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(t tVar, gim.c cVar) {
        super(cVar);
        this.A = tVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.z = obj2;
        this.B |= Integer.MIN_VALUE;
        return t.Q(this.A, null, this);
    }
}
