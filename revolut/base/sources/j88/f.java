package j88;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends gim.c {
    public ArrayList u;
    public dj0.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f172159w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f172160x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ g f172161y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, gim.c cVar) {
        super(cVar);
        this.f172161y = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f172160x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f172161y.b(null, null, null, this);
    }
}
