package rp8;

import cli.y;
import com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.edit.screens.details.ChallengeEditDetailsScreenContract$InputData;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import rp0.n0;
import vkm.j2;

/* JADX INFO: loaded from: classes4.dex */
public final class o extends oki.h implements l {
    public final y o;

    public o(q stateMapper, ChallengeEditDetailsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = mra.d.b(this, new f(inputData.f77374b, inputData.f77375c, inputData.d), stateMapper, null, false, 12);
    }

    public final void I2(final j event) {
        Intrinsics.checkNotNullParameter(event, "event");
        boolean z = event instanceof h;
        y yVar = this.o;
        if (z) {
            String str = ((h) event).f256277a.f53304a;
            if (Intrinsics.f(str, "LIST_ID_FREQUENCY_RECURRING_TRUE")) {
                H2(yVar, new n0(9));
                return;
            } else {
                if (Intrinsics.f(str, "LIST_ID_FREQUENCY_RECURRING_FALSE")) {
                    H2(yVar, new n0(10));
                    return;
                }
                return;
            }
        }
        if (!(event instanceof i)) {
            if (!(event instanceof g)) {
                throw new NoWhenBranchMatchedException();
            }
            j2 j2Var = (j2) yVar.f22677a;
            j2 j2Var2 = (j2) yVar.f22677a;
            C2(new k(((f) j2Var.getValue()).f256273a, ((f) j2Var2.getValue()).f256274b, ((f) j2Var2.getValue()).f256275c));
            return;
        }
        String str2 = ((i) event).f256278a.f52597a;
        if (Intrinsics.f(str2, "LIST_ID_INPUT_NAME")) {
            final int i = 0;
            H2(yVar, new Function1() { // from class: rp8.n
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    f update = (f) obj2;
                    switch (i) {
                        case 0:
                            Intrinsics.checkNotNullParameter(update, "$this$update");
                            return f.a(update, ((i) event).f256278a.f52598b.toString(), null, false, 6);
                        default:
                            Intrinsics.checkNotNullParameter(update, "$this$update");
                            return f.a(update, null, ((i) event).f256278a.f52598b.toString(), false, 5);
                    }
                }
            });
        } else if (Intrinsics.f(str2, "LIST_ID_INPUT_DESCRIPTION")) {
            final int i2 = 1;
            H2(yVar, new Function1() { // from class: rp8.n
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    f update = (f) obj2;
                    switch (i2) {
                        case 0:
                            Intrinsics.checkNotNullParameter(update, "$this$update");
                            return f.a(update, ((i) event).f256278a.f52598b.toString(), null, false, 6);
                        default:
                            Intrinsics.checkNotNullParameter(update, "$this$update");
                            return f.a(update, null, ((i) event).f256278a.f52598b.toString(), false, 5);
                    }
                }
            });
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.o;
    }
}
