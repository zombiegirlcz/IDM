package g5d;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes7.dex */
public final class c extends gim.c {
    public /* synthetic */ Object A;
    public final /* synthetic */ d B;
    public int C;
    public d u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f140753w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f140754x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f140755y;
    public long z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, Continuation continuation) {
        super(continuation);
        this.B = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.A = obj2;
        this.C |= Integer.MIN_VALUE;
        return d.a(this.B, null, null, 0L, 0L, this);
    }
}
