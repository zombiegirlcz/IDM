package i97;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes21.dex */
public final class f extends gim.c {
    public ArrayList u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ l f159590w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f159591x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(l lVar, gim.c cVar) {
        super(cVar);
        this.f159590w = lVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f159591x |= Integer.MIN_VALUE;
        return this.f159590w.e(null, this);
    }
}
