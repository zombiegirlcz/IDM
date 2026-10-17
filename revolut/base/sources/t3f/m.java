package t3f;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public final class m extends gim.c {
    public final /* synthetic */ o A;
    public int B;
    public Function1 u;
    public hlm.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f267765w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f267766x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f267767y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(o oVar, gim.c cVar) {
        super(cVar);
        this.A = oVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.z = obj2;
        this.B |= Integer.MIN_VALUE;
        return this.A.j(null, this);
    }
}
