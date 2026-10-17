package i68;

import com.revolut.retail.core.navigation.NaviCommand;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends gim.c {
    public NaviCommand u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f158881w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f158882x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ i f158883y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(i iVar, gim.c cVar) {
        super(cVar);
        this.f158883y = iVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f158882x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f158883y.a(null, null, null, this);
    }
}
