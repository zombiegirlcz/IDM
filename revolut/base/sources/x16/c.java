package x16;

import com.revolut.feature.defi.accounts.impl.ui.extension.DeFiAccountsExtensionState;
import com.revolut.feature.defi.exchange.api.navigation.CeFiToDeFiDestination;
import com.revolut.feature.defi.remittances.api.navigation.DeFiReceiveDestination;
import com.revolut.feature.defi.remittances.api.navigation.DeFiToCeFiDestination;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import vkm.j2;
import zhm.h0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f302309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.defi.accounts.impl.ui.extension.a f302310b;

    public /* synthetic */ c(com.revolut.feature.defi.accounts.impl.ui.extension.a aVar, int i) {
        this.f302309a = i;
        this.f302310b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f302309a;
        com.revolut.feature.defi.accounts.impl.ui.extension.a aVar = this.f302310b;
        switch (i) {
            case 0:
                w16.b it8 = (w16.b) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                if (it8 != null) {
                    aVar.f71664t.a();
                    return Unit.f186387a;
                }
                aVar.getClass();
                throw new NoWhenBranchMatchedException();
            case 1:
                eii.k output = (eii.k) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                if (output instanceof eii.i) {
                    Object obj3 = ((eii.i) output).f126655a;
                    if (obj3 == j.MOVE_CRYPTO) {
                        e16.b bVar = (e16.b) ((DeFiAccountsExtensionState) ((j2) aVar.u.f22677a).getValue()).f71651a.getContent();
                        String str = bVar != null ? bVar.f121886a : null;
                        if (str == null) {
                            h0 h0Var = h0.f322473a;
                            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                            rd0.d.a(rd0.c.ERROR, "DeFiAccountsExtensionImpl", "Trying to navigate to DeFi to CeFi while DeFi account is not loaded", null, h0Var);
                        } else {
                            aVar.A2(new DeFiToCeFiDestination(str));
                        }
                    } else if (obj3 == j.SEND_CRYPTO) {
                        aVar.Z2();
                    } else {
                        h0 h0Var2 = h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, "DeFiAccountsExtensionImpl", a0.d.m(obj3, "Unexpected DeFi send option parcel: "), null, h0Var2);
                    }
                } else {
                    h0 h0Var3 = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, "DeFiAccountsExtensionImpl", j6.a.q("Unexpected DeFi send options bottom sheet output: ", o0.f186429a.b(output.getClass()).m()), null, h0Var3);
                }
                return Unit.f186387a;
            default:
                vki.a aVar2 = aVar.u;
                eii.k output2 = (eii.k) obj2;
                Intrinsics.checkNotNullParameter(output2, "output");
                if (output2 instanceof eii.i) {
                    Object obj4 = ((eii.i) output2).f126655a;
                    if (obj4 == i.ADD_CRYPTO) {
                        e16.b bVar2 = (e16.b) ((DeFiAccountsExtensionState) ((j2) aVar2.f22677a).getValue()).f71651a.getContent();
                        String str2 = bVar2 != null ? bVar2.f121886a : null;
                        if (str2 == null) {
                            h0 h0Var4 = h0.f322473a;
                            CopyOnWriteArrayList copyOnWriteArrayList4 = rd0.d.f253311a;
                            rd0.d.a(rd0.c.ERROR, "DeFiAccountsExtensionImpl", "Trying to navigate to CeFi to DeFi while DeFi account is not loaded", null, h0Var4);
                        } else {
                            aVar.A2(new CeFiToDeFiDestination(str2));
                        }
                    } else if (obj4 == i.RECEIVE_CRYPTO) {
                        e16.b bVar3 = (e16.b) ((DeFiAccountsExtensionState) ((j2) aVar2.f22677a).getValue()).f71651a.getContent();
                        String str3 = bVar3 != null ? bVar3.f121886a : null;
                        if (str3 == null) {
                            h0 h0Var5 = h0.f322473a;
                            CopyOnWriteArrayList copyOnWriteArrayList5 = rd0.d.f253311a;
                            rd0.d.a(rd0.c.ERROR, "DeFiAccountsExtensionImpl", "Trying to navigate to receive while DeFi account is not loaded", null, h0Var5);
                        } else {
                            aVar.A2(new DeFiReceiveDestination(str3, null));
                        }
                    } else {
                        h0 h0Var6 = h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList6 = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, "DeFiAccountsExtensionImpl", a0.d.m(obj4, "Unexpected DeFi deposit option parcel: "), null, h0Var6);
                    }
                } else {
                    h0 h0Var7 = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList7 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, "DeFiAccountsExtensionImpl", j6.a.q("Unexpected DeFi deposit options bottom sheet output: ", o0.f186429a.b(output2.getClass()).m()), null, h0Var7);
                }
                return Unit.f186387a;
        }
    }
}
