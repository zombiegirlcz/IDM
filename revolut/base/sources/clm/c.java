package clm;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes14.dex */
public final class c extends gim.c {
    public Function0 u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f25068w;

    public c(gim.c cVar) {
        super(cVar);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f25068w |= Integer.MIN_VALUE;
        return nim.a.d(null, null, this);
    }
}
