package kkf;

/* JADX INFO: loaded from: classes8.dex */
public final class p8 extends gim.c {
    public tof.a3 u;
    public ttf.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f184891w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ s8 f184892x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f184893y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p8(s8 s8Var, gim.c cVar) {
        super(cVar);
        this.f184892x = s8Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f184891w = obj2;
        this.f184893y |= Integer.MIN_VALUE;
        return this.f184892x.Z2(this);
    }
}
