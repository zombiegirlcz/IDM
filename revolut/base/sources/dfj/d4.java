package dfj;

import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes11.dex */
public final class d4 extends gim.c {
    public Ref$ObjectRef u;
    public long v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f113940w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ k4 f113941x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f113942y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d4(k4 k4Var, gim.c cVar) {
        super(cVar);
        this.f113941x = k4Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f113940w = obj2;
        this.f113942y |= Integer.MIN_VALUE;
        return this.f113941x.h(null, null, this);
    }
}
