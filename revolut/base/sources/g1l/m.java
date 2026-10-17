package g1l;

import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccounts;
import java.util.List;
import java.util.UUID;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import skm.h0;

/* JADX INFO: loaded from: classes12.dex */
public final class m extends gim.i implements Function2 {
    public final /* synthetic */ List A;
    public final /* synthetic */ UUID B;
    public final /* synthetic */ String C;
    public h0 u;
    public TradingAccounts v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f139723w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f139724x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ n f139725y;
    public final /* synthetic */ TradingAccountType z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar, TradingAccountType tradingAccountType, List list, UUID uuid, String str, Continuation continuation) {
        super(2, continuation);
        this.f139725y = nVar;
        this.z = tradingAccountType;
        this.A = list;
        this.B = uuid;
        this.C = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        m mVar = new m(this.f139725y, this.z, this.A, this.B, this.C, continuation);
        mVar.f139724x = obj2;
        return mVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((m) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0060, code lost:
    
        if (r1 == r2) goto L15;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0286 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r9v1, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.util.ArrayList] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 712
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g1l.m.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
