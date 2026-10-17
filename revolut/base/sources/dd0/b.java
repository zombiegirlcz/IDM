package dd0;

import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes19.dex */
public final class b extends gim.c {
    public Ref$ObjectRef u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c f113079w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f113080x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, gim.c cVar2) {
        super(cVar2);
        this.f113079w = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f113080x |= Integer.MIN_VALUE;
        return this.f113079w.a(null, null, this);
    }
}
