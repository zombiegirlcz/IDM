package qq3;

import com.revolut.feature_credit_data_monitoring_sdk_proxy.incognia.IncogniaCustomEvent;
import java.util.Iterator;

/* JADX INFO: loaded from: classes21.dex */
public final class j extends gim.c {
    public /* synthetic */ Object A;
    public final /* synthetic */ i B;
    public int C;
    public IncogniaCustomEvent u;
    public hlm.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Iterator f248474w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f248475x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f248476y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(i iVar, gim.c cVar) {
        super(cVar);
        this.B = iVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.A = obj2;
        this.C |= Integer.MIN_VALUE;
        return this.B.a(null, this);
    }
}
