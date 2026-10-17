package ard;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class r0 extends gim.c {
    public String u;
    public List v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f8674w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ s0 f8675x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f8676y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(s0 s0Var, gim.c cVar) {
        super(cVar);
        this.f8675x = s0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f8674w = obj2;
        this.f8676y |= Integer.MIN_VALUE;
        return this.f8675x.a(this, null, null);
    }
}
