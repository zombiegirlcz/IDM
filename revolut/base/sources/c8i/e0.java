package c8i;

import com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData;
import java.time.LocalDate;

/* JADX INFO: loaded from: classes10.dex */
public final class e0 extends gim.c {
    public String A;
    public long B;
    public /* synthetic */ Object C;
    public final /* synthetic */ f0 D;
    public int E;
    public j8l.d u;
    public TransferScheduleData v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public LocalDate f22190w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f22191x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ibd.e f22192y;
    public ibd.f z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(f0 f0Var, gim.c cVar) {
        super(cVar);
        this.D = f0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.C = obj2;
        this.E |= Integer.MIN_VALUE;
        return this.D.d(null, 0L, null, null, null, null, null, null, null, this);
    }
}
