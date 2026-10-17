package rli;

import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes13.dex */
public final class d extends gim.c {
    public Ref$ObjectRef u;
    public Ref$ObjectRef v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f255082w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f255083x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ e f255084y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, gim.c cVar) {
        super(cVar);
        this.f255084y = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f255083x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f255084y.a(null, this);
    }
}
