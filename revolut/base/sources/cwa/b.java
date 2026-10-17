package cwa;

import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends gim.c {
    public int A;
    public int B;
    public /* synthetic */ Object C;
    public final /* synthetic */ j D;
    public int E;
    public String u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Ref$ObjectRef f109575w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f109576x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f109577y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(j jVar, gim.c cVar) {
        super(cVar);
        this.D = jVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.C = obj2;
        this.E |= Integer.MIN_VALUE;
        return this.D.a(null, null, this);
    }
}
