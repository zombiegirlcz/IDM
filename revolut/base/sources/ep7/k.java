package ep7;

import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.eligibility.EligibilityScreenContract$InputData;
import java.util.LinkedHashMap;
import java.util.List;
import jki.p;
import kl7.n0;
import kotlin.jvm.internal.Intrinsics;
import zhm.q0;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public final class k extends jki.g implements h {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final tl7.f f128102p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e f128103q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(p stateMapper, EligibilityScreenContract$InputData inputData, tl7.f bottomDialog) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(bottomDialog, "bottomDialog");
        this.f128102p = bottomDialog;
        boolean z = inputData.f75589a;
        boolean z3 = inputData.f75590b;
        List list = inputData.f75591c;
        List list2 = list;
        int iB = q0.b(w.t(list2, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB < 16 ? 16 : iB);
        for (Object obj2 : list2) {
            Boolean bool = (Boolean) inputData.d.get((n0) obj2);
            linkedHashMap.put(obj2, Boolean.valueOf(bool != null ? bool.booleanValue() : false));
        }
        this.f128103q = new e(z, z3, list, linkedHashMap);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f128103q;
    }
}
