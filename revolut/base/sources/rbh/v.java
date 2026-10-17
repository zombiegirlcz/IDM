package rbh;

import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes9.dex */
public final class v extends gim.i implements Function2 {
    public k1j.b A;
    public Collection B;
    public int C;
    public int D;
    public int E;
    public /* synthetic */ Object F;
    public final /* synthetic */ z G;
    public final /* synthetic */ List H;
    public TradingAccount u;
    public Set v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Set f253103w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public z f253104x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Collection f253105y;
    public Iterator z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(z zVar, List list, Continuation continuation) {
        super(2, continuation);
        this.G = zVar;
        this.H = list;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        v vVar = new v(this.G, this.H, continuation);
        vVar.F = obj2;
        return vVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((v) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x0150, code lost:
    
        if (r3 == r6) goto L70;
     */
    /* JADX WARN: Path cross not found for [B:38:0x00ce, B:37:0x00cc], limit reached: 95 */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01c8  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:71:0x01a8 -> B:72:0x01ad). Please report as a decompilation issue!!! */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 497
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rbh.v.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
