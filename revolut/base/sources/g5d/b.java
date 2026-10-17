package g5d;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes7.dex */
public final class b extends gim.c {
    public int A;
    public /* synthetic */ Object B;
    public final /* synthetic */ d C;
    public int D;
    public d u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f140750w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f140751x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f140752y;
    public long z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, Continuation continuation) {
        super(continuation);
        this.C = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.B = obj2;
        this.D |= Integer.MIN_VALUE;
        return d.b(this.C, null, null, 0L, 0L, this);
    }
}
