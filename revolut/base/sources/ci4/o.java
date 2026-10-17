package ci4;

import android.content.Intent;
import android.net.Uri;
import cli.y;
import com.revolut.feature.credit.application.plugins.impl.ui.solicitor_selection.custom_solicitor_details.CustomSolicitorDetailsControllerContract$InputData;
import com.revolut.kompot.common.ExternalDestination;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;
import vkm.j2;

/* JADX INFO: loaded from: classes22.dex */
public final class o extends oki.h implements e {

    @NotNull
    private static final n Companion = new n();
    public final CustomSolicitorDetailsControllerContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final q f24382p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final z80.b f24383q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f24384r;

    public o(CustomSolicitorDetailsControllerContract$InputData inputData, q intentProvider, z80.b phoneToolsProvider, p stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(intentProvider, "intentProvider");
        Intrinsics.checkNotNullParameter(phoneToolsProvider, "phoneToolsProvider");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f24382p = intentProvider;
        this.f24383q = phoneToolsProvider;
        t0 t0Var = t0.f186434a;
        m70.a.c(t0Var);
        Intrinsics.checkNotNullParameter(t0Var, "<this>");
        Intrinsics.checkNotNullParameter(t0Var, "<this>");
        Intrinsics.checkNotNullParameter(t0Var, "<this>");
        this.f24384r = mra.d.b(this, new f("", "", "", ""), stateMapper, null, false, 12);
    }

    public final void I2(k event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof i) {
            B2();
            return;
        }
        String strA = null;
        if (event instanceof j) {
            String url2 = ((j) event).f24375a.f275445a;
            this.f24382p.getClass();
            Intrinsics.checkNotNullParameter(url2, "url");
            C1(new ExternalDestination.ByIntent(new Intent("android.intent.action.VIEW", Uri.parse(url2)), null));
            return;
        }
        boolean z = event instanceof g;
        y yVar = this.f24384r;
        if (!z) {
            if (!(event instanceof h)) {
                throw new NoWhenBranchMatchedException();
            }
            H2(yVar, new ce9.a((h) event, 9));
            return;
        }
        f fVar = (f) ((j2) yVar.f22677a).getValue();
        String str = fVar.f24368a;
        String str2 = fVar.f24369b;
        String str3 = fVar.f24370c;
        if (d0.W(str3)) {
            str3 = null;
        }
        String str4 = fVar.d;
        if (d0.W(str4)) {
            str4 = null;
        }
        if (str4 != null) {
            strA = this.f24383q.a(str4, this.o.f68396b.f297794a, yk0.b.E164);
        }
        C2(new l(str, str2, str3, strA));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f24384r;
    }
}
