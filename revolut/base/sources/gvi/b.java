package gvi;

import com.revolut.core.ui_kit.delegates.DatePickerDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.feature.card_contactless_limit.impl.ui.mvp.RevolutCardResetScaActivity;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.traveller_details.AsftTravellerDetailsScreen;
import com.revolut.trading.orders.ui.screens.schedule.ScheduleSettingsScreen;
import gwi.b5;
import gwi.d2;
import gwi.f4;
import gwi.h5;
import gwi.l4;
import gwi.n3;
import gwi.o4;
import gwi.r1;
import gwi.u4;
import gwi.w3;
import gwi.y2;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import qlm.v1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f147177a;

    public /* synthetic */ b(int i) {
        this.f147177a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f147177a) {
            case 0:
                KProperty[] kPropertyArr = AsftTravellerDetailsScreen.S;
                return new InputTextDelegate(null);
            case 1:
                KProperty[] kPropertyArr2 = AsftTravellerDetailsScreen.S;
                return new FullScreenStateDelegate();
            case 2:
                KProperty[] kPropertyArr3 = ScheduleSettingsScreen.X;
                return new InputTextDelegate(null);
            case 3:
                KProperty[] kPropertyArr4 = ScheduleSettingsScreen.X;
                return new PlainTextDelegate();
            case 4:
                KProperty[] kPropertyArr5 = ScheduleSettingsScreen.X;
                return new ListSubheaderDelegate();
            case 5:
                KProperty[] kPropertyArr6 = ScheduleSettingsScreen.X;
                return new DatePickerDelegate();
            case 6:
                KProperty[] kPropertyArr7 = ScheduleSettingsScreen.X;
                return new LargeActionButtonDelegate();
            case 7:
                KProperty[] kPropertyArr8 = ScheduleSettingsScreen.X;
                return new SingleChoiceDelegate();
            case 8:
                return new qlm.e(v1.f247718a);
            case 9:
                return new qlm.e(gwi.j.f147427a);
            case 10:
                return new qlm.e(n3.f147475a);
            case 11:
                return new qlm.e(gwi.r.f147503a);
            case 12:
                return new qlm.e(gwi.r.f147503a);
            case 13:
                return new qlm.e(gwi.r.f147503a);
            case 14:
                return new qlm.e(gwi.r.f147503a);
            case 15:
                return new qlm.e(gwi.r.f147503a);
            case 16:
                return new qlm.e(gwi.r.f147503a);
            case 17:
                return new qlm.e(gwi.r.f147503a);
            case 18:
                return new qlm.e(v1.f247718a);
            case 19:
                return new qlm.e(d2.f147370a);
            case 20:
                return new qlm.e(r1.f147504a);
            case 21:
                return new qlm.e(y2.f147568a);
            case 22:
                return new qlm.e(w3.f147553a);
            case 23:
                return new qlm.e(o4.f147485a);
            case 24:
                return new qlm.e(l4.f147452a);
            case 25:
                u4.Companion bVar = u4.INSTANCE;
                return new qlm.e(f4.f147396a);
            case 26:
                return new qlm.e(b5.f147353a);
            case 27:
                return new qlm.e(h5.f147415a);
            case 28:
                return new qlm.e(h5.f147415a);
            default:
                KProperty[] kPropertyArr9 = RevolutCardResetScaActivity.A0;
                return new z4l.j(7, zhm.u.c(new FullScreenStateDelegate()), false);
        }
    }
}
