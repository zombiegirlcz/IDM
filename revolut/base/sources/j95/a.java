package j95;

import edk.e;
import gim.c;

/* JADX INFO: loaded from: classes21.dex */
public final class a extends c {
    public e u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e f172288w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f172289x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(e eVar, c cVar) {
        super(cVar);
        this.f172288w = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f172289x |= Integer.MIN_VALUE;
        return this.f172288w.e(null, this);
    }
}
