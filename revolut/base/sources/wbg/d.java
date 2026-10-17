package wbg;

import com.revolut.core.error.data.model.ServerError;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.travel.hotels.api.R$string;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.checkout.TravelHotelsRevPayAbandoned;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.checkout.TravelHotelsRevPayError;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class d extends c {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final sf0.h f296162l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final g81.a f296163m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final b f296164n;

    public d(sf0.h serverErrorParser, g81.a errorHandler, b checkoutErrorDialogsFactory) {
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        Intrinsics.checkNotNullParameter(errorHandler, "errorHandler");
        Intrinsics.checkNotNullParameter(checkoutErrorDialogsFactory, "checkoutErrorDialogsFactory");
        this.f296162l = serverErrorParser;
        this.f296163m = errorHandler;
        this.f296164n = checkoutErrorDialogsFactory;
    }

    @Override // wbg.c
    public final void Z2(Data bedOptionsSelectionData, Function1 onRoomIsNoLongerAvailable) {
        Intrinsics.checkNotNullParameter(bedOptionsSelectionData, "bedOptionsSelectionData");
        Intrinsics.checkNotNullParameter(onRoomIsNoLongerAvailable, "onRoomIsNoLongerAvailable");
        List list = (List) bedOptionsSelectionData.getContent();
        if (list != null && list.isEmpty()) {
            this.f296164n.getClass();
            yji.n.j2(this, L2(new nii.y0(null, b.a(), false, 5)), null, new bt9.v(7, null, onRoomIsNoLongerAvailable), 3);
        }
    }

    @Override // wbg.c
    public final void b3(Throwable throwable, Function1 onRoomIsNoLongerAvailableOrPriceHasChanged) {
        nii.l0 l0Var;
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        Intrinsics.checkNotNullParameter(onRoomIsNoLongerAvailableOrPriceHasChanged, "onRoomIsNoLongerAvailableOrPriceHasChanged");
        ServerError serverErrorA = this.f296162l.a(throwable);
        if (serverErrorA != null) {
            int i = serverErrorA.f51362a;
            b bVar = this.f296164n;
            switch (i) {
                case 22713002:
                    bVar.getClass();
                    l0Var = new nii.l0(new TextLocalisedClause(R$string.hotels_room_options_error_price_change_title, null, null, 14), null, null, new TextLocalisedClause(R$string.hotels_room_options_error_price_change_action, null, null, 14), null, null, false, null, 1014);
                    break;
                case 22713003:
                    bVar.getClass();
                    l0Var = b.a();
                    break;
                case 22713006:
                    bVar.getClass();
                    l0Var = new nii.l0(new TextLocalisedClause(R$string.hotels_error_sanctioned_location, null, null, 14), null, null, null, null, null, false, null, 1022);
                    break;
            }
            yji.n.j2(this, L2(new nii.y0(null, l0Var, false, 5)), null, new w3k.i(serverErrorA, onRoomIsNoLongerAvailableOrPriceHasChanged, (Continuation) null), 3);
            return;
        }
        if (throwable instanceof TravelHotelsRevPayError) {
            yji.n.j2(this, L2(new nii.y0(null, new nii.z(((TravelHotelsRevPayError) throwable).f93903a, null, null, null, null, null, false, null, null, null, null, null, null, 32766), false, 5)), null, null, 7);
            return;
        }
        if (throwable instanceof TravelHotelsRevPayAbandoned) {
            return;
        }
        i81.c cVarA = ((g81.e) this.f296163m).a(new aii.i(throwable, aii.a.USER_ACTION, 4));
        if (cVarA instanceof i81.b) {
            yji.n.j2(this, L2(((i81.b) cVarA).f159410a), null, null, 7);
        } else {
            if (!cVarA.equals(i81.a.f159409a)) {
                throw new NoWhenBranchMatchedException();
            }
            Unit unit = Unit.f186387a;
        }
    }
}
