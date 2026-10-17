package nnd;

import com.revolut.retail.feature.api.AnalyticsAccount;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class a0 extends gim.c {
    public Map A;
    public String B;
    public /* synthetic */ Object C;
    public final /* synthetic */ c0 D;
    public int E;
    public Map u;
    public Map v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Iterator f217520w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public AnalyticsAccount f217521x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Map f217522y;
    public String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(c0 c0Var, gim.c cVar) {
        super(cVar);
        this.D = c0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.C = obj2;
        this.E |= Integer.MIN_VALUE;
        return c0.a(this.D, null, this);
    }
}
