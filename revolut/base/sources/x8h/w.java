package x8h;

import com.revolut.feature.wealth.api.domain.model.transactions.InvestTransaction;
import com.revolut.shared.feature.wealth.models.transaction.TradingTransactionsFilter;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes9.dex */
public final class w extends gim.i implements Function2 {
    public final /* synthetic */ InvestTransaction A;
    public final /* synthetic */ tzg.d B;
    public final /* synthetic */ TradingTransactionsFilter.TradingTransactionsFilterImpl C;
    public final /* synthetic */ long D;
    public final /* synthetic */ Ref$ObjectRef E;
    public List u;
    public ArrayList v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public List f303397w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f303398x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f303399y;
    public final /* synthetic */ y z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(y yVar, InvestTransaction investTransaction, tzg.d dVar, TradingTransactionsFilter.TradingTransactionsFilterImpl tradingTransactionsFilterImpl, long j2, Ref$ObjectRef ref$ObjectRef, Continuation continuation) {
        super(2, continuation);
        this.z = yVar;
        this.A = investTransaction;
        this.B = dVar;
        this.C = tradingTransactionsFilterImpl;
        this.D = j2;
        this.E = ref$ObjectRef;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        w wVar = new w(this.z, this.A, this.B, this.C, this.D, this.E, continuation);
        wVar.f303399y = obj2;
        return wVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((w) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x01cb, code lost:
    
        if (r0 != r8) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01e1, code lost:
    
        if (vkm.q.u(r7, r0, r16) == r8) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0136 A[SYNTHETIC] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 508
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x8h.w.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
