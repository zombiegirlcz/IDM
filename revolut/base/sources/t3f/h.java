package t3f;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes8.dex */
public final class h extends gim.c {
    public /* synthetic */ Object A;
    public final /* synthetic */ o B;
    public int C;
    public Ref$ObjectRef u;
    public Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f267755w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f267756x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f267757y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(o oVar, Continuation continuation) {
        super(continuation);
        this.B = oVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.A = obj2;
        this.C |= Integer.MIN_VALUE;
        return o.b(this.B, this);
    }
}
