package pjl;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes12.dex */
public final class n0 extends gim.c {
    public /* synthetic */ Object A;
    public final /* synthetic */ z0 B;
    public int C;
    public String u;
    public Collection v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Iterator f236830w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f236831x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f236832y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(z0 z0Var, gim.c cVar) {
        super(cVar);
        this.B = z0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.A = obj2;
        this.C |= Integer.MIN_VALUE;
        return z0.a(this.B, null, this);
    }
}
