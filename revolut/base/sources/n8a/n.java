package n8a;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes5.dex */
public final class n extends gim.c {
    public int A;
    public int B;
    public /* synthetic */ Object C;
    public final /* synthetic */ o D;
    public int E;
    public Object u;
    public Function1 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Ref$ObjectRef f213337w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Ref$ObjectRef f213338x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f213339y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar, gim.c cVar) {
        super(cVar);
        this.D = oVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.C = obj2;
        this.E |= Integer.MIN_VALUE;
        return this.D.j(null, null, this);
    }
}
