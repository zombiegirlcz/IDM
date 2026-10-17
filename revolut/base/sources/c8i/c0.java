package c8i;

import com.revolut.feature_move_money.api.model.AccountWrapper;
import com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData;
import java.time.LocalDate;

/* JADX INFO: loaded from: classes10.dex */
public final class c0 extends gim.c {
    public ibd.e A;
    public ibd.f B;
    public String C;
    public long D;
    public /* synthetic */ Object E;
    public final /* synthetic */ f0 F;
    public int G;
    public TransferScheduleData u;
    public AccountWrapper v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public j8l.d f22179w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public LocalDate f22180x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public AccountWrapper f22181y;
    public String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(f0 f0Var, gim.c cVar) {
        super(cVar);
        this.F = f0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.E = obj2;
        this.G |= Integer.MIN_VALUE;
        return this.F.b(null, null, 0L, null, null, null, null, null, this);
    }
}
