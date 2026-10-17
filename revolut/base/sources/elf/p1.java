package elf;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes8.dex */
public final class p1 extends gim.c {
    public e60.m u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ s1 f127396w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f127397x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(s1 s1Var, Continuation continuation) {
        super(continuation);
        this.f127396w = s1Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f127397x |= Integer.MIN_VALUE;
        return this.f127396w.Z2(null, this);
    }
}
