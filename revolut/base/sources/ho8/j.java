package ho8;

import com.revolut.data.model.Data;
import com.revolut.feature.junior_settings.impl.ui_kompot.coparents.CoparentsSettingsScreenContract$InputData;
import efm.r;
import jki.p;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import te8.z;

/* JADX INFO: loaded from: classes4.dex */
public final class j extends jki.g implements f {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final CoparentsSettingsScreenContract$InputData f154248p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final z f154249q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final te8.e f154250r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ao.h f154251s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final hj8.a f154252t;
    public final ang.f u;
    public final kbb.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final j60.a f154253w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final zq.a f154254x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ihm.b f154255y;
    public final e z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(p stateMapper, CoparentsSettingsScreenContract$InputData inputData, z juniorProductsInteractor, te8.e juniorAccountInteractor, ao.h juniorCoparentInteractor, hj8.a juniorProfileInteractor, ang.f userInteractor, kbb.c juniorConfigInteractor, j60.a expandableDialogControllerExtension, zq.a juniorCoparentLauncherFactory) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(juniorProductsInteractor, "juniorProductsInteractor");
        Intrinsics.checkNotNullParameter(juniorAccountInteractor, "juniorAccountInteractor");
        Intrinsics.checkNotNullParameter(juniorCoparentInteractor, "juniorCoparentInteractor");
        Intrinsics.checkNotNullParameter(juniorProfileInteractor, "juniorProfileInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(juniorConfigInteractor, "juniorConfigInteractor");
        Intrinsics.checkNotNullParameter(expandableDialogControllerExtension, "expandableDialogControllerExtension");
        Intrinsics.checkNotNullParameter(juniorCoparentLauncherFactory, "juniorCoparentLauncherFactory");
        this.f154248p = inputData;
        this.f154249q = juniorProductsInteractor;
        this.f154250r = juniorAccountInteractor;
        this.f154251s = juniorCoparentInteractor;
        this.f154252t = juniorProfileInteractor;
        this.u = userInteractor;
        this.v = juniorConfigInteractor;
        this.f154253w = expandableDialogControllerExtension;
        this.f154254x = juniorCoparentLauncherFactory;
        ihm.b bVarE = ihm.b.e(Unit.f186387a);
        Intrinsics.checkNotNullExpressionValue(bVarE, "createDefault(...)");
        this.f154255y = bVarE;
        this.z = new e(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null));
    }

    @Override // yji.l
    public final void I1() {
        r rVarSwitchMap = this.f154255y.switchMap(new hje.e(new hg4.a(this, 23), 20));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
        yji.l.a1(this, rd0.e.b(rVarSwitchMap), null, null, new hba.k(this, (Continuation) null, 29), 3);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.z;
    }
}
