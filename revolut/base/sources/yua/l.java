package yua;

import java.util.HashSet;

/* JADX INFO: loaded from: classes5.dex */
public final class l extends gim.c {
    public String u;
    public s71.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public HashSet f316950w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f316951x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ q f316952y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(q qVar, gim.c cVar) {
        super(cVar);
        this.f316952y = qVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f316951x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f316952y.h(null, null, this);
    }
}
