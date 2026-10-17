package r83;

import com.revolut.retail.core.navigation.NaviCommand;
import h93.l0;

/* JADX INFO: loaded from: classes21.dex */
public final class p extends gim.c {
    public final /* synthetic */ q A;
    public int B;
    public h93.u u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f252337w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public l0 f252338x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public NaviCommand f252339y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(q qVar, gim.c cVar) {
        super(cVar);
        this.A = qVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.z = obj2;
        this.B |= Integer.MIN_VALUE;
        return this.A.t(null, null, null, null, null, this);
    }
}
