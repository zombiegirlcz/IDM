package i68;

import com.revolut.retail.core.navigation.NaviCommand;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends gim.c {
    public String u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public NaviCommand f158884w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f158885x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ i f158886y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i iVar, gim.c cVar) {
        super(cVar);
        this.f158886y = iVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f158885x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f158886y.b(null, null, this);
    }
}
