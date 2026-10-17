package ry8;

import android.app.Activity;
import android.content.Intent;
import com.onfido.android.sdk.capture.Onfido;
import com.onfido.workflow.OnfidoWorkflow;
import ihm.j;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends fsi.c implements ky8.a {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final fsi.b f258261n = new fsi.b("EXTERNAL_KYC_PROVIDER_DELEGATE_ID");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Activity f258262h;
    public final sy8.b i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final d4m.a f258263j;
    public final d4m.a k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final vw8.a f258264l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final j f258265m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Activity activity, sy8.b configMapper, d4m.a onfido, d4m.a onfidoWorkflow, vw8.a documentScanResourcesProvider) {
        super(f258261n);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(configMapper, "configMapper");
        Intrinsics.checkNotNullParameter(onfido, "onfido");
        Intrinsics.checkNotNullParameter(onfidoWorkflow, "onfidoWorkflow");
        Intrinsics.checkNotNullParameter(documentScanResourcesProvider, "documentScanResourcesProvider");
        this.f258262h = activity;
        this.i = configMapper;
        this.f258263j = onfido;
        this.k = onfidoWorkflow;
        this.f258264l = documentScanResourcesProvider;
        this.f258265m = p.a.D("toSerialized(...)");
    }

    @Override // fsi.a
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i == 8002) {
            ((Onfido) this.f258263j.get()).handleActivityResult(i2, intent, new b(this));
        } else {
            if (i != 8003) {
                return;
            }
            ((OnfidoWorkflow) this.k.get()).handleActivityResult(i2, intent, new c(this));
        }
    }
}
