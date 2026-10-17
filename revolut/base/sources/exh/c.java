package exh;

import kotlin.jvm.internal.Ref$BooleanRef;

/* JADX INFO: loaded from: classes10.dex */
public final class c extends gim.c {
    public int A;
    public long B;
    public /* synthetic */ Object C;
    public final /* synthetic */ g D;
    public int E;
    public cue.d u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Ref$BooleanRef f130432w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f130433x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f130434y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(g gVar, gim.c cVar) {
        super(cVar);
        this.D = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.C = obj2;
        this.E |= Integer.MIN_VALUE;
        return this.D.a(null, 0, 0L, this);
    }
}
