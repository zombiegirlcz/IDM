package c84;

import com.revolut.feature.credit.application.api.models.CreditApplicationStatusNavigationConfig;
import com.revolut.retail.core.navigation.NaviCommand;

/* JADX INFO: loaded from: classes22.dex */
public final class h extends gim.c {
    public /* synthetic */ Object A;
    public final /* synthetic */ i B;
    public int C;
    public NaviCommand u;
    public CreditApplicationStatusNavigationConfig v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public it3.d f22083w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public it3.d f22084x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f22085y;
    public boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, gim.c cVar) {
        super(cVar);
        this.B = iVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.A = obj2;
        this.C |= Integer.MIN_VALUE;
        return this.B.e3(null, null, false, false, this);
    }
}
