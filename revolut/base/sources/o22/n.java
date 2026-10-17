package o22;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.core.models.alias.AliasType;
import com.revolut.feature.apm.core.ui.api.navigation.ApmNewAliasNavigation$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class n extends oki.h implements d {
    public final ApmNewAliasNavigation$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final com.revolut.feature.apm.core.ui.api.navigation.a f221428p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final v02.c f221429q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final z80.b f221430r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ang.f f221431s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final phm.a f221432t;
    public final y u;

    public n(ApmNewAliasNavigation$InputData inputData, com.revolut.feature.apm.core.ui.api.navigation.a aliasRegistrationExtension, v02.c aliasDialogProvider, z80.b phoneToolsProvider, ang.f userInteractor, phm.a pickerControllerInteractor, p stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(aliasRegistrationExtension, "aliasRegistrationExtension");
        Intrinsics.checkNotNullParameter(aliasDialogProvider, "aliasDialogProvider");
        Intrinsics.checkNotNullParameter(phoneToolsProvider, "phoneToolsProvider");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(pickerControllerInteractor, "pickerControllerInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f221428p = aliasRegistrationExtension;
        this.f221429q = aliasDialogProvider;
        this.f221430r = phoneToolsProvider;
        this.f221431s = userInteractor;
        this.f221432t = pickerControllerInteractor;
        this.u = mra.d.b(this, new a(AliasType.PHONE.f61895b, new Data(null, null, true, 3, null), "", "", inputData.d), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        l2(new m(this, null, 1), new yi5.b(26));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.u;
    }
}
