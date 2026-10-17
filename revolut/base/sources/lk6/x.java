package lk6;

import com.revolut.feature.external_accounts.impl.domain.open_banking_brazil.OpenBankingBrazilPayment;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;
import zhm.r0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class x implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f196268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ hk6.j f196269b;

    public /* synthetic */ x(hk6.j jVar, int i) {
        this.f196268a = i;
        this.f196269b = jVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f196268a;
        hk6.j jVar = this.f196269b;
        switch (i) {
            case 0:
                i iVar = (i) obj2;
                String str = jVar.f152857a;
                OpenBankingBrazilPayment.EditableDateField editableDateField = iVar.f;
                if (Intrinsics.f(str, editableDateField != null ? editableDateField.f72400a : null)) {
                    return i.a(iVar, null, null, null, null, null, OpenBankingBrazilPayment.EditableDateField.a(editableDateField, jVar.f152858b), 31);
                }
                IllegalStateException illegalStateException = new IllegalStateException(a0.d.s("Unexpected id returned after editing date ", jVar.f152857a, ", expected ", editableDateField != null ? editableDateField.f72400a : null));
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                return iVar;
            default:
                uj6.k kVar = (uj6.k) obj2;
                return uj6.k.a(kVar, null, null, null, r0.q(kVar.d, new Pair(jVar.f152857a, jVar.f152858b)), null, 23);
        }
    }
}
