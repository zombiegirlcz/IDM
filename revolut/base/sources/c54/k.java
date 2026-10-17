package c54;

import android.content.Context;
import androidx.browser.customtabs.CustomTabsClient;
import cli.y;
import com.revolut.kompot.common.ExternalDestination;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import zhm.h0;

/* JADX INFO: loaded from: classes22.dex */
public final class k extends oki.h implements g {
    public final f o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final f80.a f21419p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final a f21420q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f21421r;

    public k(f inputData, f80.a uriHelper, a akahuChromeTabLauncher) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(uriHelper, "uriHelper");
        Intrinsics.checkNotNullParameter(akahuChromeTabLauncher, "akahuChromeTabLauncher");
        this.o = inputData;
        this.f21419p = uriHelper;
        this.f21420q = akahuChromeTabLauncher;
        this.f21421r = mra.d.b(this, cli.k.f25028a, new a54.b(3), null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        a aVar = this.f21420q;
        d dVar = (d) aVar;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(this, "callback");
        dVar.d = this;
        String packageName = CustomTabsClient.getPackageName(dVar.f21411a, null);
        if (packageName == null) {
            packageName = "";
        }
        if (d0.W(packageName)) {
            I2();
            return;
        }
        try {
            d dVar2 = (d) aVar;
            dVar2.a(((f80.b) this.f21419p).f(this.o.f21416a), packageName);
        } catch (Exception e) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
            I2();
        }
    }

    public final void I2() {
        C1(new ExternalDestination.ImplicitActivity("android.intent.action.VIEW", null, ((f80.b) this.f21419p).f(this.o.f21416a), 0, null, 494));
        C2(h.f21417a);
    }

    @Override // yji.l
    public final void K1() {
        d dVar = (d) this.f21420q;
        if (dVar.e) {
            dVar.e = false;
            Context context = dVar.f21411a;
            b bVar = dVar.f21412b;
            if (bVar != null) {
                context.unbindService(bVar);
            } else {
                Intrinsics.r("serviceConnection");
                throw null;
            }
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f21421r;
    }
}
