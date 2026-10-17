package y3f;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes8.dex */
public final class j extends gim.c {
    public int A;
    public z2f.f u;
    public LinkedHashMap v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f310706w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f310707x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f310708y;
    public final /* synthetic */ l z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(l lVar, gim.c cVar) {
        super(cVar);
        this.z = lVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f310708y = obj2;
        this.A |= Integer.MIN_VALUE;
        return this.z.a(null, this);
    }
}
