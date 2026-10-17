package uo7;

import aw0.o9;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.car.search.CarSearchScreenContract$InputData;
import java.util.List;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
public final class m extends jki.g implements i {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final tl7.f f281582p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ll7.a f281583q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final sf0.h f281584r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e f281585s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(p stateMapper, CarSearchScreenContract$InputData inputData, tl7.f bottomDialog, ll7.a profileRepository, sf0.h serverErrorParser) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(bottomDialog, "bottomDialog");
        Intrinsics.checkNotNullParameter(profileRepository, "profileRepository");
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        this.f281582p = bottomDialog;
        this.f281583q = profileRepository;
        this.f281584r = serverErrorParser;
        String str = inputData.f75566a;
        this.f281585s = new e(str == null ? "" : str, inputData.f75567b);
    }

    public static CompositeClause y2(int i, String str) {
        List listK = v.k(new TextLocalisedClause(i, null, null, 14), new TextClause(str, (Style) new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124));
        t0 t0Var = t0.f186434a;
        return new CompositeClause(listK, new TextClause(a0.d.r(m70.a.o(t0Var), m70.a.o(t0Var)), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f281585s;
    }
}
