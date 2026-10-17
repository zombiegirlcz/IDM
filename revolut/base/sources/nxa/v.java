package nxa;

import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.data.model.Data;
import com.revolut.feature.card_input.common.ui.CardInputActivity;
import com.revolut.feature.insurance_pet.impl.ui.add.step.breed.PetBreedDetailsContract$BreedParam;
import com.revolut.feature.insurance_pet.impl.ui.pet.amount.AmountData;
import com.revolut.feature.insurance_pet.impl.ui.pet.dob.DOBInputData;
import com.revolut.feature.referrals.shared.ui.impl.ui.invite_campaign.home.a;
import hha.z0;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class v implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f220537a;

    public /* synthetic */ v(int i) {
        this.f220537a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object obj3 = null;
        boolean z = false;
        switch (this.f220537a) {
            case 0:
                l update = (l) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return l.a(update, null, null, false, null, 11);
            case 1:
                Function0 it8 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return new t(iii.c.c(5));
            case 2:
                InputTextDelegate.Model it9 = (InputTextDelegate.Model) obj2;
                int i = CardInputActivity.B0;
                Intrinsics.checkNotNullParameter(it9, "it");
                return Unit.f186387a;
            case 3:
                ny4.d updateState = (ny4.d) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return new ny4.d(new Data(null, null, true, 3, null));
            case 4:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return (List) getDefaultLoadingItems.invoke();
            case 5:
                List it10 = (List) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return it10;
            case 6:
                InputChecklistDelegate.Model it11 = (InputChecklistDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return Boolean.valueOf(kotlin.text.a0.H(it11.f52519a, "INPUT_RADIO_GENDER_LIST_ID_", false));
            case 7:
                vf0.k kVar = (vf0.k) obj2;
                Intrinsics.checkNotNullParameter(kVar, "<destruct>");
                boolean zBooleanValue = ((Boolean) kVar.f288454a).booleanValue();
                boolean zBooleanValue2 = ((Boolean) kVar.f288455b).booleanValue();
                boolean zBooleanValue3 = ((Boolean) kVar.f288456c).booleanValue();
                boolean zBooleanValue4 = ((Boolean) kVar.d).booleanValue();
                boolean zBooleanValue5 = ((Boolean) kVar.e).booleanValue();
                if (zBooleanValue && zBooleanValue2 && zBooleanValue3 && zBooleanValue4 && zBooleanValue5) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 8:
                vf0.h hVar = (vf0.h) obj2;
                Intrinsics.checkNotNullParameter(hVar, "<destruct>");
                return new vx7.b((String) hVar.d, (zw7.c0) hVar.f288433a, (List) hVar.f288434b, (zw7.z) hVar.f288435c);
            case 9:
                DOBInputData it12 = (DOBInputData) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return Boolean.valueOf(!(it12 instanceof DOBInputData.PartiallyFilled));
            case 10:
                vf0.y yVar = (vf0.y) obj2;
                Intrinsics.checkNotNullParameter(yVar, "<destruct>");
                zw7.c0 c0Var = (zw7.c0) yVar.f288491a;
                zw7.h hVar2 = (zw7.h) yVar.f288492b;
                return new sx7.b(c0Var, hVar2, ce9.m.B((List) yVar.f288493c, hVar2, (PetBreedDetailsContract$BreedParam) yVar.d), (AmountData) yVar.e, ((Boolean) yVar.f).booleanValue());
            case 11:
                InputTextDelegate.TextData it13 = (InputTextDelegate.TextData) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return Boolean.valueOf(Intrinsics.f(it13.f52597a, "INPUT_TEXT_NAME_LIST_ID"));
            case 12:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                zm3.l lVar = (zm3.l) pair.f186385a;
                return !Intrinsics.f(lVar.N0(), ((do3.n) pair.f186386b).f) ? zhm.u.c(lVar) : zhm.f0.f322471a;
            case 13:
                zm3.a it14 = (zm3.a) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return (zm3.l) it14;
            case 14:
                nya.k update2 = (nya.k) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return nya.k.a(update2, null, null, false, true, false, 23);
            case 15:
                nya.k update3 = (nya.k) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return nya.k.a(update3, null, null, false, false, true, 15);
            case 16:
                nya.k update4 = (nya.k) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                return nya.k.a(update4, null, new nya.i(false, null), false, false, false, 29);
            case 17:
                return nya.k.a((nya.k) obj2, null, null, true, false, false, 27);
            case 18:
                return nya.k.a((nya.k) obj2, a.C0524a.f81852a, null, true, false, false, 26);
            case 19:
                return nya.k.a((nya.k) obj2, a.b.f81853a, null, false, false, false, 30);
            case 20:
                return nya.k.a((nya.k) obj2, a.b.f81853a, null, false, false, false, 30);
            case 21:
                yhm.r rVar = (yhm.r) obj2;
                Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                boolean zBooleanValue6 = ((Boolean) rVar.f314201a).booleanValue();
                boolean zBooleanValue7 = ((Boolean) rVar.f314202b).booleanValue();
                boolean zBooleanValue8 = ((Boolean) rVar.f314203c).booleanValue();
                if (zBooleanValue6 && zBooleanValue7 && zBooleanValue8) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 22:
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                boolean zBooleanValue9 = ((Boolean) pair2.f186385a).booleanValue();
                boolean zBooleanValue10 = ((Boolean) pair2.f186386b).booleanValue();
                if (zBooleanValue9 && zBooleanValue10) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 23:
                Pair pair3 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair3, "<destruct>");
                boolean zBooleanValue11 = ((Boolean) pair3.f186385a).booleanValue();
                boolean zBooleanValue12 = ((Boolean) pair3.f186386b).booleanValue();
                if (zBooleanValue11 && zBooleanValue12) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 24:
                List earningRates = (List) obj2;
                Intrinsics.checkNotNullParameter(earningRates, "earningRates");
                Iterator it15 = earningRates.iterator();
                while (true) {
                    if (it15.hasNext()) {
                        Object next = it15.next();
                        if (((z0) next).f152379b) {
                            obj3 = next;
                        }
                    }
                }
                return (z0) obj3;
            case 25:
                m1c.z it16 = (m1c.z) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                m1c.y yVar2 = it16 instanceof m1c.y ? (m1c.y) it16 : null;
                if (yVar2 != null) {
                    return yVar2.f201475a;
                }
                return null;
            case 26:
                return ((Boolean) obj2).booleanValue() ? new b39.a(b39.d.REV_POINTS) : b39.b.f12015a;
            case 27:
                Boolean isEnabled = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(isEnabled, "isEnabled");
                isEnabled.booleanValue();
                return isEnabled;
            case 28:
                Boolean userIsCobranded = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(userIsCobranded, "userIsCobranded");
                return Boolean.valueOf(!userIsCobranded.booleanValue());
            default:
                Throwable it17 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                return Boolean.FALSE;
        }
    }
}
