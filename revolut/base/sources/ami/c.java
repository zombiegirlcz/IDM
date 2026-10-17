package ami;

import com.revolut.kompot.common.ParcelableDestination;

/* JADX INFO: loaded from: classes10.dex */
public final class c extends gim.c {
    public int A;
    public zli.b u;
    public ParcelableDestination v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public wli.o f6436w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f6437x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f6438y;
    public final /* synthetic */ f z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(f fVar, gim.c cVar) {
        super(cVar);
        this.z = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f6438y = obj2;
        this.A |= Integer.MIN_VALUE;
        return this.z.c(null, null, null, null, this);
    }
}
