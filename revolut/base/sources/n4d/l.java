package n4d;

import kotlin.jvm.internal.Ref$BooleanRef;

/* JADX INFO: loaded from: classes7.dex */
public final class l extends gim.c {
    public Ref$BooleanRef u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ m f212371w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f212372x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, gim.c cVar) {
        super(cVar);
        this.f212371w = mVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f212372x |= Integer.MIN_VALUE;
        return this.f212371w.f(this);
    }
}
