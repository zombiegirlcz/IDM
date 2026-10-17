package com.revolut.feature.travel.hotels.impl.ui_kompot.screen.campaign;

import cli.g;
import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.campaign.TravelHotelsCampaignsHubScreenContract$InputData;
import hx7.e;
import i9g.h0;
import i9g.o;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oa4.c;
import obg.f;
import obg.k;
import oki.h;
import vkm.q;
import yji.l;

/* JADX INFO: loaded from: classes9.dex */
public final class b extends h implements k {
    public final TravelHotelsCampaignsHubScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final o f93864p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final h0 f93865q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final vii.b f93866r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f93867s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f93868t;

    public b(n stateMapper, TravelHotelsCampaignsHubScreenContract$InputData inputData, o travelHotelsCampaignsInteractor, h0 travelPropertySearchParamsInteractor) {
        Data data;
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(travelHotelsCampaignsInteractor, "travelHotelsCampaignsInteractor");
        Intrinsics.checkNotNullParameter(travelPropertySearchParamsInteractor, "travelPropertySearchParamsInteractor");
        this.o = inputData;
        this.f93864p = travelHotelsCampaignsInteractor;
        this.f93865q = travelPropertySearchParamsInteractor;
        this.f93866r = new vii.b();
        if (inputData instanceof TravelHotelsCampaignsHubScreenContract$InputData.Id) {
            data = new Data(null, null, true, 3, null);
        } else {
            if (!(inputData instanceof TravelHotelsCampaignsHubScreenContract$InputData.Campaign)) {
                throw new NoWhenBranchMatchedException();
            }
            data = new Data(((TravelHotelsCampaignsHubScreenContract$InputData.Campaign) inputData).f93859a, null, false, 6, null);
        }
        this.f93867s = d.b(this, new f(data, new Data(null, null, true, 3, null), new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
        this.f93868t = e.a(this, new c(this, 5));
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l.a1(this, q.Q(this.f93866r, new ns9.h(continuation, this, 21)), null, null, new o95.c(this, continuation, 5), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f93868t;
    }

    @Override // cli.z
    public final g getState() {
        return this.f93867s;
    }
}
