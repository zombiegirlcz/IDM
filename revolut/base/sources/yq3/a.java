package yq3;

import gim.c;
import java.io.Serializable;
import pi3.e;

/* JADX INFO: loaded from: classes21.dex */
public final class a extends c {
    public boolean A;
    public /* synthetic */ Object B;
    public final /* synthetic */ b C;
    public int D;
    public b u;
    public Serializable v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public e f315979w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public dt3.a f315980x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f315981y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, c cVar) {
        super(cVar);
        this.C = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.B = obj2;
        this.D |= Integer.MIN_VALUE;
        return this.C.a(null, this);
    }
}
