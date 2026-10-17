package nfj;

import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes11.dex */
public final class c extends gim.c {
    public Ref$ObjectRef u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f214925w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f214926x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, gim.c cVar) {
        super(cVar);
        this.f214925w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f214926x |= Integer.MIN_VALUE;
        return d.b(this.f214925w, null, null, null, null, null, null, null, null, 0L, 0L, this);
    }
}
