package t3f;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes8.dex */
public final class g extends gim.c {
    public final /* synthetic */ o A;
    public int B;
    public Object u;
    public e4f.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f267752w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f267753x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f267754y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(o oVar, Continuation continuation) {
        super(continuation);
        this.A = oVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.z = obj2;
        this.B |= Integer.MIN_VALUE;
        return o.a(this.A, this);
    }
}
