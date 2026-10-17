package hp3;

import android.view.View;
import com.revolut.feature.corporate_events.impl.ui.screen.home.CorporateEventsHomeScreen;
import kotlin.Unit;

/* JADX INFO: loaded from: classes21.dex */
public final class i implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CorporateEventsHomeScreen f154403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f154404b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Integer f154405c;
    public final /* synthetic */ boolean d;

    public i(CorporateEventsHomeScreen corporateEventsHomeScreen, int i, Integer num, boolean z) {
        this.f154403a = corporateEventsHomeScreen;
        this.f154404b = i;
        this.f154405c = num;
        this.d = z;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i5, int i6, int i21, int i22, int i32) {
        CorporateEventsHomeScreen.Companion companion = CorporateEventsHomeScreen.INSTANCE;
        CorporateEventsHomeScreen corporateEventsHomeScreen = this.f154403a;
        corporateEventsHomeScreen.f3().removeOnLayoutChangeListener(this);
        int i33 = 1;
        if (this.f154404b != corporateEventsHomeScreen.c0) {
            corporateEventsHomeScreen.f3().post(new com.google.firebase.messaging.q(corporateEventsHomeScreen, this.f154405c, this.d, i33));
        } else {
            corporateEventsHomeScreen.d3().f307592b.setExpanded(false, true);
            corporateEventsHomeScreen.f66131b0.onNext(Unit.f186387a);
        }
    }
}
