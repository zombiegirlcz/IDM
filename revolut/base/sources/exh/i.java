package exh;

import kotlin.jvm.internal.Ref$BooleanRef;

/* JADX INFO: loaded from: classes10.dex */
public final class i extends gim.c {
    public /* synthetic */ Object A;
    public final /* synthetic */ j B;
    public int C;
    public String u;
    public Ref$BooleanRef v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f130446w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f130447x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f130448y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, gim.c cVar) {
        super(cVar);
        this.B = jVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.A = obj2;
        this.C |= Integer.MIN_VALUE;
        return this.B.a(null, this);
    }
}
