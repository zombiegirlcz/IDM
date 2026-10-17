package yp2;

import com.revolut.feature.bank_account_switching.impl.ui.switch_out.review.domain.SwitchOutRequestStatus;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public final class c extends gim.c {
    public SwitchOutRequestStatus u;
    public List v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f315764w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ su9.c f315765x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f315766y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(su9.c cVar, gim.c cVar2) {
        super(cVar2);
        this.f315765x = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f315764w = obj2;
        this.f315766y |= Integer.MIN_VALUE;
        return this.f315765x.f(null, this);
    }
}
