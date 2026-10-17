package z70;

import android.content.Context;
import android.provider.Settings;
import com.revolut.feature.pix.impl.flow.qr_request.screen.add_amount.PixQrRequestAddAmountScreen;
import kotlin.jvm.internal.Intrinsics;
import ppk.f;
import z8g.q;
import zba.i;

/* JADX INFO: loaded from: classes19.dex */
public final class c implements zp0.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f319851a;

    public c(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f319851a = context;
    }

    public boolean a() {
        return Settings.Global.getInt(((Context) this.f319851a).getContentResolver(), "development_settings_enabled", 0) == 1;
    }

    @Override // zp0.c
    public void k(String extractedValue, String amountString, boolean z) {
        Intrinsics.checkNotNullParameter(extractedValue, "extractedValue");
        Intrinsics.checkNotNullParameter(amountString, "formattedValue");
        i iVarE3 = ((PixQrRequestAddAmountScreen) this.f319851a).R2();
        iVarE3.getClass();
        Intrinsics.checkNotNullParameter(amountString, "amountString");
        iVarE3.H2(iVarE3.f320863q, new q(iVarE3, amountString, 20));
    }

    public c(f ratesInteractor) {
        Intrinsics.checkNotNullParameter(ratesInteractor, "ratesInteractor");
        this.f319851a = ratesInteractor;
    }

    public c(PixQrRequestAddAmountScreen pixQrRequestAddAmountScreen) {
        this.f319851a = pixQrRequestAddAmountScreen;
    }
}
