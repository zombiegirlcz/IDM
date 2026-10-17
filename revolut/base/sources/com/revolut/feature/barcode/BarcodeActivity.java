package com.revolut.feature.barcode;

import android.os.Bundle;
import com.bumptech.glide.c;
import com.revolut.feature.barcode.BarcodeActivity;
import com.revolut.feature.barcode.BarcodeContract$Configuration;
import com.revolut.retail.core.ui.activity.BaseDelegatesActivity;
import gsi.a;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import pri.e;
import yhm.j;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/barcode/BarcodeActivity;", "Lcom/revolut/retail/core/ui/activity/BaseDelegatesActivity;", "", "<init>", "()V", "feature_barcode_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BarcodeActivity extends BaseDelegatesActivity {

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final /* synthetic */ int f64112t0 = 0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Lazy f64113r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final Lazy f64114s0;

    public BarcodeActivity() {
        final int i = 0;
        this.f64113r0 = j.b(new Function0(this) { // from class: xq2.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BarcodeActivity f308053b;

            {
                this.f308053b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                BarcodeActivity barcodeActivity = this.f308053b;
                switch (i2) {
                    case 0:
                        int i3 = BarcodeActivity.f64112t0;
                        return ((BarcodeContract$Configuration) barcodeActivity.G0()).f64115a;
                    default:
                        int i5 = BarcodeActivity.f64112t0;
                        return ((BarcodeContract$Configuration) barcodeActivity.G0()).f64116b;
                }
            }
        });
        final int i2 = 1;
        this.f64114s0 = j.b(new Function0(this) { // from class: xq2.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BarcodeActivity f308053b;

            {
                this.f308053b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                BarcodeActivity barcodeActivity = this.f308053b;
                switch (i22) {
                    case 0:
                        int i3 = BarcodeActivity.f64112t0;
                        return ((BarcodeContract$Configuration) barcodeActivity.G0()).f64115a;
                    default:
                        int i5 = BarcodeActivity.f64112t0;
                        return ((BarcodeContract$Configuration) barcodeActivity.G0()).f64116b;
                }
            }
        });
    }

    @Override // nri.b
    public final e F0() {
        Intrinsics.r("activityComponent");
        throw null;
    }

    @Override // nri.b
    /* JADX INFO: renamed from: J0 */
    public final String getF81955s0() {
        return (String) this.f64113r0.getValue();
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity
    public final a L0() {
        Intrinsics.r("activityComponent");
        throw null;
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity, androidx.view.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        if (this.f218652a0 != null) {
            throw new ClassCastException();
        }
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity, nri.b, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        c.l(this).b(null, getF81955s0()).getClass();
        throw new ClassCastException();
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity, nri.b, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStop() {
        Intrinsics.r("cameraDelegate");
        throw null;
    }
}
