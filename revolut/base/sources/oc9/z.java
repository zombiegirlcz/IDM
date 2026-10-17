package oc9;

import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public final class z extends gim.c {
    public Iterator u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f224166w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ b0 f224167x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f224168y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(b0 b0Var, gim.c cVar) {
        super(cVar);
        this.f224167x = b0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f224166w = obj2;
        this.f224168y |= Integer.MIN_VALUE;
        return b0.I2(this.f224167x, this);
    }
}
