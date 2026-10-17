package exh;

import kotlin.jvm.internal.Ref$BooleanRef;

/* JADX INFO: loaded from: classes10.dex */
public final class f extends gim.c {
    public long A;
    public /* synthetic */ Object B;
    public final /* synthetic */ g C;
    public int D;
    public String u;
    public Ref$BooleanRef v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f130441w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f130442x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f130443y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, gim.c cVar) {
        super(cVar);
        this.C = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.B = obj2;
        this.D |= Integer.MIN_VALUE;
        return this.C.b(null, 0, 0L, this);
    }
}
