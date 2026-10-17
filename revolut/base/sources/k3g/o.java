package k3g;

import c1g.u;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.travel.common.api.R$string;
import com.revolut.feature.travel.experiences.api.models.search.TravelSearchResponse;
import com.revolut.feature.travel.experiences.api.models.selection.TravelExperienceDatesSelection;
import com.revolut.feature.travel.experiences.impl.ui.screen.search.TravelExperiencesSearchScreenContract$InputData;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import nii.y0;
import nii.z;
import skm.a2;
import zhm.f0;

/* JADX INFO: loaded from: classes9.dex */
public final class o extends jki.g implements l {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final hyf.d f180727p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final hyf.b f180728q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final exf.c f180729r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public a2 f180730s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final d f180731t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(jki.p stateMapper, hyf.d searchInteractor, TravelExperiencesSearchScreenContract$InputData inputData, hyf.b travelExperiencesInteractor, exf.c userLocationInteractor) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(searchInteractor, "searchInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(travelExperiencesInteractor, "travelExperiencesInteractor");
        Intrinsics.checkNotNullParameter(userLocationInteractor, "userLocationInteractor");
        this.f180727p = searchInteractor;
        this.f180728q = travelExperiencesInteractor;
        this.f180729r = userLocationInteractor;
        f0 f0Var = f0.f322471a;
        Data data = new Data(new TravelSearchResponse(f0Var, f0Var, f0Var, f0Var), null, false, 6, null);
        TravelExperienceDatesSelection travelExperienceDatesSelection = inputData.f93135a;
        m70.a.c(t0.f186434a);
        this.f180731t = new d(data, travelExperienceDatesSelection, "", f0Var, f0Var);
    }

    public static final void y2(o oVar) {
        oVar.X1(new y0("ERROR_DIALOG_ID", new z(new TextLocalisedClause(R$string.travel_common_location_error_no_location, null, null, 14), null, null, null, null, null, false, null, null, null, null, null, null, 32766), false, 4));
    }

    @Override // yji.l
    public final void T1(long j2) {
        n2(new n(this, null, 3), new whi.b(6));
        yji.l.b1(this, mo3.a.g(nim.a.v(rd0.e.b(((m0g.g) ((u) this.f180728q).f20509a).i.f(Unit.f186387a, false)), new lyd.b(22)), null, new k1f.n(9), 1), null, new jv.o(this, null, 18), 3);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f180731t;
    }
}
