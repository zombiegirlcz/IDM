package m2j;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.shared.savings.models.SavingsAccountDetails;
import com.revolut.retail.feature.balance.picker.api.interactor.BalancesInteractor$InputData;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes10.dex */
public final class e0 extends gim.i implements Function2 {
    public int A;
    public int B;
    public int C;
    public int D;
    public /* synthetic */ Object E;
    public final /* synthetic */ ejb.b F;
    public final /* synthetic */ BalancesInteractor$InputData G;
    public final /* synthetic */ f0 H;
    public f0 u;
    public Collection v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Iterator f202025w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public SavingsAccountDetails f202026x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public AccountId.Personal f202027y;
    public d z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(ejb.b bVar, BalancesInteractor$InputData balancesInteractor$InputData, f0 f0Var, Continuation continuation) {
        super(2, continuation);
        this.F = bVar;
        this.G = balancesInteractor$InputData;
        this.H = f0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e0 e0Var = new e0(this.F, this.G, this.H, continuation);
        e0Var.E = obj2;
        return e0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e0) create((od0.i) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b1  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0065 -> B:23:0x00ab). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x006b -> B:22:0x009f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x006f -> B:22:0x009f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0093 -> B:21:0x0098). Please report as a decompilation issue!!! */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m2j.e0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
