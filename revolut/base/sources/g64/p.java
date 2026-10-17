package g64;

import com.revolut.feature.credit.application.models.plugins.PluginPayload;
import com.revolut.retail.core.navigation.NaviCommand;
import h93.j0;
import h93.l0;

/* JADX INFO: loaded from: classes22.dex */
public final class p extends gim.c {
    public boolean A;
    public boolean B;
    public boolean C;
    public /* synthetic */ Object D;
    public final /* synthetic */ s E;
    public int F;
    public PluginPayload u;
    public j0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public l0 f140854w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public NaviCommand f140855x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public hs3.q f140856y;
    public String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(s sVar, gim.c cVar) {
        super(cVar);
        this.E = sVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.D = obj2;
        this.F |= Integer.MIN_VALUE;
        return this.E.a(null, null, null, false, this);
    }
}
