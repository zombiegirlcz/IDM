package v99;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class e extends gim.c {
    public int A;
    public Function2 u;
    public hlm.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f287011w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f287012x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f287013y;
    public final /* synthetic */ f z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, gim.c cVar) {
        super(cVar);
        this.z = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f287013y = obj2;
        this.A |= Integer.MIN_VALUE;
        return this.z.a(null, null, this);
    }
}
