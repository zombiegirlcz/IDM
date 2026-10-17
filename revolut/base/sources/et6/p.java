package et6;

import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes3.dex */
public final class p extends gim.c {
    public Object u;
    public hlm.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Ref$ObjectRef f129292w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f129293x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ v f129294y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(v vVar, gim.c cVar) {
        super(cVar);
        this.f129294y = vVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f129293x = obj2;
        this.z |= Integer.MIN_VALUE;
        return v.a(this.f129294y, this);
    }
}
