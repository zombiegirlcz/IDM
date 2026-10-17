package x8h;

import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class t extends gim.c {
    public tzg.d u;
    public List v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f303384w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f303385x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ y f303386y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(y yVar, gim.c cVar) {
        super(cVar);
        this.f303386y = yVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f303385x = obj2;
        this.z |= Integer.MIN_VALUE;
        return y.a(this.f303386y, null, null, null, this);
    }
}
