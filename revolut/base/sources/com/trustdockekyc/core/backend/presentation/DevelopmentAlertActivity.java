package com.trustdockekyc.core.backend.presentation;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.fragment.app.FragmentActivity;
import androidx.view.EdgeToEdge;
import com.revolut.revolut.feature_fourthline_impl.R;
import hx7.i;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ksj.b;
import u1m.f0;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/trustdockekyc/core/backend/presentation/DevelopmentAlertActivity;", "Landroidx/fragment/app/FragmentActivity;", "<init>", "()V", "backend_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class DevelopmentAlertActivity extends FragmentActivity {
    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        EdgeToEdge.enable$default(this, null, null, 3, null);
        if (i.f156401b == null) {
            Intrinsics.checkNotNullParameter("session state is invalid.", "message");
            f0 f0Var = f0.VERBOSE;
            finish();
        } else {
            setContentView(R.layout.tdcoreekyc__activity_development_alert);
            View viewFindViewById = findViewById(R.id.continueButton);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            Button continueButton = (Button) viewFindViewById;
            Intrinsics.checkNotNullParameter(continueButton, "continueButton");
            b.u(continueButton, new c2m.b(this, 4));
        }
    }
}
