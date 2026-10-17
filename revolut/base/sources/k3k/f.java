package k3k;

import android.os.Parcelable;
import com.revolut.retail.feature.payments.bank_transfer.impl.remittance_kompot.transfer.RemittanceTransferData;

/* JADX INFO: loaded from: classes11.dex */
public final class f extends gim.c {
    public int A;
    public i u;
    public Parcelable v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public RemittanceTransferData f180761w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f180762x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f180763y;
    public final /* synthetic */ i z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(i iVar, gim.c cVar) {
        super(cVar);
        this.z = iVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f180763y = obj2;
        this.A |= Integer.MIN_VALUE;
        return this.z.c(null, null, null, false, this);
    }
}
