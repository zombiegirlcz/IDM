package lv4;

import aw0.n6;
import com.revolut.feature.credit.card.impl.ui.statement.details.page.CreditCardStatementPageScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes22.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ CreditCardStatementPageScreen f200294w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(CreditCardStatementPageScreen creditCardStatementPageScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f200294w = creditCardStatementPageScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                e eVar = new e(this.f200294w, continuation, 0);
                eVar.v = obj2;
                return eVar;
            default:
                e eVar2 = new e(this.f200294w, continuation, 1);
                eVar2.v = obj2;
                return eVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((e) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((e) create((yx4.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c7  */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lv4.e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
