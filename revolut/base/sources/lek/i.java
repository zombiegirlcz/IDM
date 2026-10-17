package lek;

import com.revolut.feature.address.models.Address;
import java.time.LocalDate;

/* JADX INFO: loaded from: classes11.dex */
public final class i extends gim.c {
    public /* synthetic */ Object A;
    public final /* synthetic */ m B;
    public int C;
    public String u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f194578w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public LocalDate f194579x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f194580y;
    public Address z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(m mVar, gim.c cVar) {
        super(cVar);
        this.B = mVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.A = obj2;
        this.C |= Integer.MIN_VALUE;
        return this.B.f(null, null, null, null, null, null, this);
    }
}
