package k79;

import java.util.HashSet;

/* JADX INFO: loaded from: classes4.dex */
public final class l extends gim.c {
    public HashSet u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ r f181926w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f181927x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(r rVar, gim.c cVar) {
        super(cVar);
        this.f181926w = rVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f181927x |= Integer.MIN_VALUE;
        return r.I2(this.f181926w, null, this);
    }
}
