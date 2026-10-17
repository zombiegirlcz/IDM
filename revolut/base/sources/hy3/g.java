package hy3;

import ft3.d1;
import kotlin.Pair;

/* JADX INFO: loaded from: classes22.dex */
public final class g extends gim.c {
    public int A;
    public Pair[] u;
    public Pair[] v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public d1 f156726w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f156727x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f156728y;
    public final /* synthetic */ j z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(j jVar, gim.c cVar) {
        super(cVar);
        this.z = jVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f156728y = obj2;
        this.A |= Integer.MIN_VALUE;
        return this.z.d(this);
    }
}
