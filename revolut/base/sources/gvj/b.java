package gvj;

import cli.g;
import cli.k;
import cli.y;
import com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.confirm_edit_dates.TravelItineraryConfirmEditDatesContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends h implements dli.b {
    public final TravelItineraryConfirmEditDatesContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yuj.a f147208p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final abk.c f147209q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f147210r;

    public b(TravelItineraryConfirmEditDatesContract$InputData inputData, yuj.a interactor, abk.c errorDialogMapper, c stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(errorDialogMapper, "errorDialogMapper");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f147208p = interactor;
        this.f147209q = errorDialogMapper;
        this.f147210r = d.b(this, k.f25028a, stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final g getState() {
        return this.f147210r;
    }
}
