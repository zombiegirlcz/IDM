package opf;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.transfer.core.models.CurrencyFilteringPolicy;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends gim.i implements Function2 {
    public int A;
    public int B;
    public final /* synthetic */ List C;
    public final /* synthetic */ Set D;
    public final /* synthetic */ List E;
    public final /* synthetic */ od0.i F;
    public final /* synthetic */ b G;
    public final /* synthetic */ AccountId H;
    public final /* synthetic */ io3.l I;
    public final /* synthetic */ CurrencyFilteringPolicy J;
    public b u;
    public CurrencyFilteringPolicy v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Collection f227598w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Iterator f227599x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Object f227600y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(List list, Set set, List list2, od0.i iVar, b bVar, AccountId accountId, io3.l lVar, CurrencyFilteringPolicy currencyFilteringPolicy, Continuation continuation) {
        super(2, continuation);
        this.C = list;
        this.D = set;
        this.E = list2;
        this.F = iVar;
        this.G = bVar;
        this.H = accountId;
        this.I = lVar;
        this.J = currencyFilteringPolicy;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new a(this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0075  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0066 -> B:14:0x0069). Please report as a decompilation issue!!! */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 477
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: opf.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
