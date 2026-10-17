package lk6;

import com.revolut.feature.external_accounts.impl.domain.open_banking_brazil.OpenBankingBrazilPayment;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.r0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class z implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f196270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ wj6.l f196271b;

    public /* synthetic */ z(wj6.l lVar, int i) {
        this.f196270a = i;
        this.f196271b = lVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f196270a) {
            case 0:
                i iVar = (i) obj2;
                wj6.l lVar = this.f196271b;
                String str = lVar.f297969a;
                dj0.d dVar = lVar.f297970b;
                OpenBankingBrazilPayment.EditableMoneyField editableMoneyField = iVar.d;
                OpenBankingBrazilPayment.EditableMoneyField editableMoneyField2 = iVar.e;
                if (Intrinsics.f(str, editableMoneyField != null ? editableMoneyField.f72402a : null)) {
                    return i.a(iVar, null, null, null, OpenBankingBrazilPayment.EditableMoneyField.a(iVar.d, dVar), null, null, 55);
                }
                return Intrinsics.f(str, editableMoneyField2 != null ? editableMoneyField2.f72402a : null) ? i.a(iVar, null, null, null, null, OpenBankingBrazilPayment.EditableMoneyField.a(editableMoneyField2, dVar), null, 47) : iVar;
            default:
                uj6.k kVar = (uj6.k) obj2;
                Map map = kVar.e;
                wj6.l lVar2 = this.f196271b;
                return uj6.k.a(kVar, null, null, null, null, r0.q(map, new Pair(lVar2.f297969a, lVar2.f297970b)), 15);
        }
    }
}
