package b23;

import com.revolut.retail.core.navigation.NaviCommand;

/* JADX INFO: loaded from: classes21.dex */
public final class j extends gim.c {
    public /* synthetic */ Object A;
    public final /* synthetic */ l B;
    public int C;
    public String u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f11884w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public NaviCommand f11885x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public NaviCommand f11886y;
    public NaviCommand z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(l lVar, gim.c cVar) {
        super(cVar);
        this.B = lVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.A = obj2;
        this.C |= Integer.MIN_VALUE;
        return this.B.b(null, null, null, null, null, this);
    }
}
