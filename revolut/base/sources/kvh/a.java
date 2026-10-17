package kvh;

import com.revolut.shared.feature.workflow.engine.api.models.eligibility.exceptions.UnrecognisedContractException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes13.dex */
public final class a {
    public final ril.a a(String value) {
        ril.a aVar;
        Intrinsics.checkNotNullParameter(value, "value");
        ril.a[] aVarArrValues = ril.a.values();
        int length = aVarArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                aVar = null;
                break;
            }
            aVar = aVarArrValues[i];
            if (a0.z(aVar.name(), value, true)) {
                break;
            }
            i++;
        }
        if (aVar != null) {
            return aVar;
        }
        throw new UnrecognisedContractException(j6.a.q("Unknown DataPoint name: ", value));
    }
}
