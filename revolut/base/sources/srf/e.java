package srf;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final class e implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f265210a;

    public e(Map transferValidators) {
        Intrinsics.checkNotNullParameter(transferValidators, "transferValidators");
        this.f265210a = transferValidators;
    }

    @Override // yqi.f
    public final yqi.d validate(Object obj2) {
        List list;
        g validationData = (g) obj2;
        Intrinsics.checkNotNullParameter(validationData, "validationData");
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.f265210a.entrySet()) {
            KClass kClass = (KClass) entry.getKey();
            h hVar = (h) entry.getValue();
            if (kClass.l(validationData)) {
                Intrinsics.i(hVar, "null cannot be cast to non-null type com.revolut.feature.transfer.shared_core.validators.TransferValidator<com.revolut.feature.transfer.shared_core.validators.TransferValidator.TransferValidationData>");
                list = hVar.validate(validationData).f316033b;
            } else {
                list = null;
            }
            if (list != null) {
                arrayList.add(list);
            }
        }
        return new yqi.d(validationData, d0.U(w.u(arrayList)));
    }
}
