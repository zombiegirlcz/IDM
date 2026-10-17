package com.revolut.feature.travel.experiences.impl.ui.flow.tabs;

import ali.b;
import c1g.m;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.travel.experiences.api.models.selection.TravelExperienceDatesSelection;
import com.revolut.feature.travel.experiences.impl.ui.flow.tabs.TravelExperiencesTabsFlowContract$PagerItem;
import go.g;
import j0g.j;
import java.util.List;
import k1g.d;
import k1g.e;
import k1g.o;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import md6.s;
import nyb.k;
import oki.h;
import yji.l;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends h implements d {
    public final hyf.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final j f93005p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final k f93006q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final List f93007r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f93008s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final b f93009t;

    public a(TravelExperiencesTabsFlowContract$InputData inputData, hyf.a experiencesFeatureInteractor, j experiencesBookingRepository, k revPointsInteractor, o tabsStateMapper) {
        TravelExperienceDatesSelection travelExperienceDatesSelection;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(experiencesFeatureInteractor, "experiencesFeatureInteractor");
        Intrinsics.checkNotNullParameter(experiencesBookingRepository, "experiencesBookingRepository");
        Intrinsics.checkNotNullParameter(revPointsInteractor, "revPointsInteractor");
        Intrinsics.checkNotNullParameter(tabsStateMapper, "tabsStateMapper");
        this.o = experiencesFeatureInteractor;
        this.f93005p = experiencesBookingRepository;
        this.f93006q = revPointsInteractor;
        TravelExperiencesTabsFlowContract$PagerItem travelExperiencesTabsFlowContract$PagerItem = inputData.f93002a;
        TravelExperiencesTabsFlowContract$PagerItem.Discover discover = travelExperiencesTabsFlowContract$PagerItem instanceof TravelExperiencesTabsFlowContract$PagerItem.Discover ? (TravelExperiencesTabsFlowContract$PagerItem.Discover) travelExperiencesTabsFlowContract$PagerItem : null;
        List listK = v.k(new TravelExperiencesTabsFlowContract$PagerItem.Discover((discover == null || (travelExperienceDatesSelection = discover.f93004a) == null) ? TravelExperienceDatesSelection.NoDatesSelection.f92906a : travelExperienceDatesSelection), TravelExperiencesTabsFlowContract$PagerItem.Bookings.f93003a);
        this.f93007r = listK;
        this.f93008s = mra.d.b(this, new e(new Data(null, null, false, 7, null), travelExperiencesTabsFlowContract$PagerItem.getF94249a(), listK), tabsStateMapper, null, false, 12);
        this.f93009t = s.b(this, new jnf.d(this, 28));
    }

    @Override // ali.h
    public final b I0() {
        return this.f93009t;
    }

    @Override // yji.l
    public final void I1() {
        a aVar;
        m mVar = (m) this.o;
        Continuation continuation = null;
        if (mVar.a()) {
            aVar = this;
            l.a1(aVar, this.f93005p.a(), null, null, new ji1.m(this, continuation, 23), 3);
        } else {
            aVar = this;
        }
        l.a1(aVar, mVar.a() ? rd0.e.b(aVar.f93006q.c(false)) : new g(new Data(null, null, false, 7, null), 2), null, null, new jv.o(this, continuation, 12), 3);
    }

    @Override // ali.h, cli.z
    public final cli.g getState() {
        return this.f93008s;
    }
}
