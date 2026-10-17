package jn7;

import com.revolut.feature.insurance_car.impl.ui.screen.common.benefit_details.BenefitDetailsScreenContract$InputData;
import com.revolut.feature.insurance_common.data.model.Document;
import jki.p;
import jn7.e;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends jki.g implements f {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final d f176657p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(p stateMapper, BenefitDetailsScreenContract$InputData inputData) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f176657p = new d(inputData.f75511a);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f176657p;
    }

    public final void y2(Object obj2, String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (!(obj2 instanceof Document)) {
            if (Intrinsics.f(listId, "GET_HELP")) {
                v2(e.a.f176653a);
                return;
            }
            return;
        }
        rr7.c cVarA = rr7.e.a((Document) obj2);
        if (cVarA instanceof rr7.a) {
            C1(((rr7.a) cVarA).f256732a);
        } else {
            if (!(cVarA instanceof rr7.b)) {
                throw new NoWhenBranchMatchedException();
            }
            A1(new jec.p(this, (rr7.b) cVarA, null, 16), new yi5.b(25));
        }
    }
}
