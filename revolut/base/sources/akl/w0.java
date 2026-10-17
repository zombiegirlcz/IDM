package akl;

import com.revolut.feature.crypto_investments.api.model.CryptoCommodityPositions;
import com.revolut.feature.crypto_investments.api.model.PocketBalancesWithSum;
import com.revolut.feature.topup_screen.api.model.TopUpMethodsContext;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes12.dex */
public final class w0 extends gim.i implements Function2 {
    public Object A;
    public Object B;
    public Object C;
    public /* synthetic */ Object D;
    public final /* synthetic */ Object E;
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f6105w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f6106x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Object f6107y;
    public Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(ha3.x xVar, String str, e93.e eVar, String str2, String str3, String str4, i93.d dVar, Set set, e93.b bVar, Continuation continuation) {
        super(2, continuation);
        this.u = 1;
        this.f6107y = xVar;
        this.f6105w = str;
        this.z = eVar;
        this.f6106x = str2;
        this.A = str3;
        this.B = str4;
        this.C = dVar;
        this.D = set;
        this.E = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                w0 w0Var = new w0((String) this.f6105w, (e1) this.B, (Integer) this.E, (String) this.f6106x, continuation);
                w0Var.D = obj2;
                return w0Var;
            case 1:
                return new w0((ha3.x) this.f6107y, (String) this.f6105w, (e93.e) this.z, (String) this.f6106x, (String) this.A, (String) this.B, (i93.d) this.C, (Set) this.D, (e93.b) this.E, continuation);
            case 2:
                return new w0((hve.o) this.C, (String) this.D, (TopUpMethodsContext) this.E, (String) this.f6106x, continuation, 2);
            case 3:
                return new w0((of6.e) this.C, (dj0.d) this.D, (yte.n) this.E, (String) this.f6106x, continuation, 3);
            case 4:
                w0 w0Var2 = new w0((psd.j) this.A, (PocketBalancesWithSum) this.B, (List) this.C, (CryptoCommodityPositions) this.f6105w, (List) this.f6106x, (dj0.d) this.E, continuation);
                w0Var2.D = obj2;
                return w0Var2;
            default:
                w0 w0Var3 = new w0((ud3.e0) this.E, continuation);
                w0Var3.D = obj2;
                return w0Var3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((w0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((w0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((w0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((w0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((w0) create((psd.c) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((w0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x0482  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x07eb  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0986  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x09b4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:302:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:303:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:304:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x014c  */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13, types: [com.revolut.feature.topup_screen.api.model.CheckoutContext, java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r14v14 */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r48) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2504
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: akl.w0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w0(Object obj2, Object obj3, Object obj4, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.C = obj2;
        this.f6106x = str;
        this.D = obj3;
        this.E = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(String str, e1 e1Var, Integer num, String str2, Continuation continuation) {
        super(2, continuation);
        this.u = 0;
        this.f6105w = str;
        this.B = e1Var;
        this.E = num;
        this.f6106x = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(psd.j jVar, PocketBalancesWithSum pocketBalancesWithSum, List list, CryptoCommodityPositions cryptoCommodityPositions, List list2, dj0.d dVar, Continuation continuation) {
        super(2, continuation);
        this.u = 4;
        this.A = jVar;
        this.B = pocketBalancesWithSum;
        this.C = list;
        this.f6105w = cryptoCommodityPositions;
        this.f6106x = list2;
        this.E = dVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(ud3.e0 e0Var, Continuation continuation) {
        super(2, continuation);
        this.u = 5;
        this.E = e0Var;
    }
}
