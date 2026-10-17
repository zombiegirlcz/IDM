package pjl;

import java.util.Iterator;

/* JADX INFO: loaded from: classes12.dex */
public final class e extends gim.c {
    public /* synthetic */ Object A;
    public final /* synthetic */ g B;
    public int C;
    public String u;
    public cjl.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public uil.a f236802w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Iterator f236803x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f236804y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, gim.c cVar) {
        super(cVar);
        this.B = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.A = obj2;
        this.C |= Integer.MIN_VALUE;
        return this.B.b(null, null, null, this);
    }
}
