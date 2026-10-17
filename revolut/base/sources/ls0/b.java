package ls0;

import android.view.View;
import androidx.compose.material.DrawerKt;
import androidx.compose.material.DrawerState;
import androidx.compose.ui.unit.Density;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.retail.wealth.resources.R$string;
import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f199577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f199578b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f199579c;
    public final /* synthetic */ Object d;

    public /* synthetic */ b(float f, int i, Object obj2, Object obj3) {
        this.f199577a = i;
        this.f199579c = obj2;
        this.d = obj3;
        this.f199578b = f;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f199577a) {
            case 0:
                ((d) this.f199579c).transformPage((View) this.d, this.f199578b);
                return Unit.f186387a;
            case 1:
                mvl.b bVar = (mvl.b) this.f199579c;
                Amount amount = (Amount) this.d;
                int i = R$string.wealth_trading_dialog_insufficient_funds_subtitle_fund_or_switch_account_with_buffer;
                bVar.getClass();
                return mvl.b.h(mvl.b.f(i, amount, this.f199578b));
            default:
                return DrawerKt.ModalDrawer_Gs3lGvM$lambda$0$0$0((DrawerState) this.f199579c, (Density) this.d, this.f199578b, BitmapDescriptorFactory.HUE_RED);
        }
    }
}
