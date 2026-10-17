package xl1;

import cli.y;
import com.revolut.feature.apm.aani.impl.ui.registration.confirmation.AaniRegistrationConfirmationContract$InputData;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class m extends oki.h implements dli.b {
    public final kdh.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f306910p;

    public m(AaniRegistrationConfirmationContract$InputData inputData, o stateMapper, kdh.b aaniInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(aaniInteractor, "aaniInteractor");
        this.o = aaniInteractor;
        this.f306910p = mra.d.b(this, new a(inputData.f61138a, true), stateMapper, null, false, 12);
    }

    public final void I2(f uiEvent) {
        Intrinsics.checkNotNullParameter(uiEvent, "uiEvent");
        if (uiEvent.equals(c.f306903a)) {
            B2();
            return;
        }
        if (uiEvent.equals(d.f306904a)) {
            l2(new xb4.e(this, null, 6), new yi5.b(26));
        } else {
            if (!uiEvent.equals(e.f306905a)) {
                throw new NoWhenBranchMatchedException();
            }
            H2(this.f306910p, new xif.c(23));
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f306910p;
    }
}
