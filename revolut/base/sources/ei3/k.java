package ei3;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.checkout.models.PreorderCardResult;
import ei3.n;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes21.dex */
public final class k extends gim.i implements Function2 {
    public Long A;
    public int B;
    public final /* synthetic */ b93.f C;
    public final /* synthetic */ m D;
    public final /* synthetic */ AccountId E;
    public final /* synthetic */ String F;
    public PreorderCardResult.Preordered u;
    public Address v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public d93.b f126379w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f126380x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public n.a f126381y;
    public String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(b93.f fVar, m mVar, AccountId accountId, String str, Continuation continuation) {
        super(2, continuation);
        this.C = fVar;
        this.D = mVar;
        this.E = accountId;
        this.F = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new k(this.C, this.D, this.E, this.F, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((k) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x028f A[Catch: Exception -> 0x0061, CancellationException -> 0x0064, TryCatch #7 {CancellationException -> 0x0064, Exception -> 0x0061, blocks: (B:26:0x0059, B:109:0x0288, B:111:0x028f, B:113:0x0299, B:105:0x0267), top: B:157:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:163:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x013d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0174 A[Catch: Exception -> 0x0072, CancellationException -> 0x0075, TryCatch #6 {CancellationException -> 0x0075, Exception -> 0x0072, blocks: (B:33:0x006b, B:84:0x0216, B:40:0x0082, B:53:0x00c1, B:55:0x00d5, B:60:0x0105, B:63:0x013f, B:65:0x014c, B:67:0x0159, B:71:0x0168, B:73:0x0174, B:77:0x017d, B:79:0x0188, B:81:0x0191, B:57:0x00db, B:59:0x00e6, B:50:0x00a7), top: B:157:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0188 A[Catch: Exception -> 0x0072, CancellationException -> 0x0075, TryCatch #6 {CancellationException -> 0x0075, Exception -> 0x0072, blocks: (B:33:0x006b, B:84:0x0216, B:40:0x0082, B:53:0x00c1, B:55:0x00d5, B:60:0x0105, B:63:0x013f, B:65:0x014c, B:67:0x0159, B:71:0x0168, B:73:0x0174, B:77:0x017d, B:79:0x0188, B:81:0x0191, B:57:0x00db, B:59:0x00e6, B:50:0x00a7), top: B:157:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0214  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r39) {
        /*
            Method dump skipped, instruction units count: 1058
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ei3.k.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
