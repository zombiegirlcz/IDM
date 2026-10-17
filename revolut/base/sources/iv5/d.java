package iv5;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.crypto_investments.api.widget.split.SplitAccountsWidgetContract$AssetModelExtension;
import com.revolut.feature.crypto_investments.api.widget.split.SplitAccountsWidgetContract$PerpetualsItemsProvider$Parcel$HeaderParcel;
import com.revolut.feature.crypto_investments.api.widget.split.SplitAccountsWidgetContract$SpotMarginTradingItemsProvider$Parcel$HeaderParcel;
import com.revolut.feature.crypto_investments.impl.ui.widget.split.earn_accounts.EarnAccountsWidgetContract$Parcel$HeaderParcel;
import com.revolut.feature.crypto_investments.impl.ui.widget.split.main_accounts.MainAccountsWidgetContract$Parcel$HeaderParcel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ i v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(i iVar, Continuation continuation) {
        super(2, continuation);
        this.v = iVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        i iVar = this.v;
        SplitAccountsWidgetContract$AssetModelExtension splitAccountsWidgetContract$AssetModelExtension = iVar.f168726j;
        Intrinsics.h(model);
        splitAccountsWidgetContract$AssetModelExtension.Z2(model);
        Object parcel = model.u;
        if (parcel != null) {
            nv5.h hVar = (nv5.h) iVar.e;
            j2 j2Var = hVar.f219496h;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            if (parcel instanceof MainAccountsWidgetContract$Parcel$HeaderParcel) {
                do {
                } while (!j2Var.h(j2Var.getValue(), Boolean.valueOf(!((Boolean) r4).booleanValue())));
                if (!((Boolean) j2Var.getValue()).booleanValue()) {
                    j2 j2Var2 = hVar.i;
                    do {
                        value4 = j2Var2.getValue();
                        ((Boolean) value4).getClass();
                    } while (!j2Var2.h(value4, Boolean.TRUE));
                }
            }
            mv5.f fVar = (mv5.f) iVar.f;
            j2 j2Var3 = fVar.f209148g;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            if (parcel instanceof EarnAccountsWidgetContract$Parcel$HeaderParcel) {
                do {
                } while (!j2Var3.h(j2Var3.getValue(), Boolean.valueOf(!((Boolean) r1).booleanValue())));
                if (!((Boolean) j2Var3.getValue()).booleanValue()) {
                    j2 j2Var4 = fVar.f209149h;
                    do {
                        value3 = j2Var4.getValue();
                        ((Boolean) value3).getClass();
                    } while (!j2Var4.h(value3, Boolean.TRUE));
                }
            }
            qv5.b bVar = (qv5.b) iVar.f168724g;
            j2 j2Var5 = bVar.f249537b;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            if (parcel instanceof SplitAccountsWidgetContract$SpotMarginTradingItemsProvider$Parcel$HeaderParcel) {
                do {
                } while (!j2Var5.h(j2Var5.getValue(), Boolean.valueOf(!((Boolean) r4).booleanValue())));
                if (!((Boolean) j2Var5.getValue()).booleanValue()) {
                    j2 j2Var6 = bVar.f249538c;
                    do {
                        value2 = j2Var6.getValue();
                        ((Boolean) value2).getClass();
                    } while (!j2Var6.h(value2, Boolean.TRUE));
                }
            }
            pv5.b bVar2 = (pv5.b) iVar.f168725h;
            bVar2.getClass();
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            if ((parcel instanceof SplitAccountsWidgetContract$PerpetualsItemsProvider$Parcel$HeaderParcel) && ((SplitAccountsWidgetContract$PerpetualsItemsProvider$Parcel$HeaderParcel) parcel).f71417a == ut5.f.EXPAND_COLLAPSE) {
                j2 j2Var7 = bVar2.f239981c;
                do {
                } while (!j2Var7.h(j2Var7.getValue(), Boolean.valueOf(!((Boolean) r1).booleanValue())));
                if (!((Boolean) j2Var7.getValue()).booleanValue()) {
                    j2 j2Var8 = bVar2.d;
                    do {
                        value = j2Var8.getValue();
                        ((Boolean) value).getClass();
                    } while (!j2Var8.h(value, Boolean.TRUE));
                }
            }
        }
        return Unit.f186387a;
    }
}
