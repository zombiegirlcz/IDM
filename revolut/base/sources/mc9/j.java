package mc9;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class j extends gim.c {
    public final /* synthetic */ com.revolut.feature.onboarding.impl.qes.waiting_qes_result.b A;
    public int B;
    public List u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f204317w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Iterator f204318x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f204319y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.revolut.feature.onboarding.impl.qes.waiting_qes_result.b bVar, gim.c cVar) {
        super(cVar);
        this.A = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.z = obj2;
        this.B |= Integer.MIN_VALUE;
        return this.A.I2(this, null, null);
    }
}
