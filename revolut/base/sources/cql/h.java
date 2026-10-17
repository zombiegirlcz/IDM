package cql;

import a3e.u;
import cli.y;
import com.revolut.sso.impl.ui.signin_sessions_flow.bottom_dialog.SignInSessionsBottomSheetContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class h extends oki.h implements dli.b {

    @NotNull
    public static final g Companion = new g();
    public final y o;

    public h(SignInSessionsBottomSheetContract$InputData inputData, u stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = mra.d.b(this, new c(inputData.f106749a), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.o;
    }
}
