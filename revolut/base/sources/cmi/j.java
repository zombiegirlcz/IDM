package cmi;

import java.util.Iterator;

/* JADX INFO: loaded from: classes10.dex */
public final class j extends gim.c {
    public boolean A;
    public /* synthetic */ Object B;
    public final /* synthetic */ m C;
    public int D;
    public d u;
    public zli.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Iterator f25283w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public wli.e f25284x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f25285y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(m mVar, gim.c cVar) {
        super(cVar);
        this.C = mVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.B = obj2;
        this.D |= Integer.MIN_VALUE;
        return this.C.p3(null, this);
    }
}
