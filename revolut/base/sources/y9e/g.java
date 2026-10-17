package y9e;

import cli.n;
import cli.y;
import com.revolut.feature.subscriptions.impl.edit_frequency.EditSubscriptionFrequencyControllerContract$InputData;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import qua.p;

/* JADX INFO: loaded from: classes8.dex */
public final class g extends oki.h implements c {
    public final xua.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f311848p;

    public g(n stateMapper, EditSubscriptionFrequencyControllerContract$InputData inputData, xua.a recurringPaymentInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(recurringPaymentInteractor, "recurringPaymentInteractor");
        this.o = recurringPaymentInteractor;
        p pVar = inputData.f89184a;
        fva.e eVar = pVar.K;
        eVar = eVar == null ? fva.e.MONTHLY : eVar;
        EnumEntries enumEntriesA = fva.e.a();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : enumEntriesA) {
            switch (e.f311847a[((fva.e) obj2).ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    arrayList.add(obj2);
                    break;
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        this.f311848p = mra.d.b(this, new d(eVar, arrayList, pVar), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f311848p;
    }
}
