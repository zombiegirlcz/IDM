package cya;

import android.content.Intent;
import com.revolut.kompot.common.ExternalDestination;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import yji.n;
import zhm.h0;
import zhm.q0;

/* JADX INFO: loaded from: classes5.dex */
public final class l extends n implements k {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final r70.c f110075l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final c70.a f110076m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final iki.c f110077n;

    public l(r70.c hapticEngine, c70.a clipboard, iki.c externalDestinationResolver) {
        Intrinsics.checkNotNullParameter(hapticEngine, "hapticEngine");
        Intrinsics.checkNotNullParameter(clipboard, "clipboard");
        Intrinsics.checkNotNullParameter(externalDestinationResolver, "externalDestinationResolver");
        this.f110075l = hapticEngine;
        this.f110076m = clipboard;
        this.f110077n = externalDestinationResolver;
    }

    public final void Z2(String inviteText, boolean z) {
        Intrinsics.checkNotNullParameter(inviteText, "inviteText");
        int i = 16;
        c70.a aVar = this.f110076m;
        if (z) {
            aVar.c("COPY_REFERRAL_LABEL", inviteText, false, new co7.a(this, i));
            return;
        }
        Intent intent = new Intent("android.intent.action.SEND");
        nim.a.F(intent, q0.c(new Pair("android.intent.extra.TEXT", inviteText)));
        nim.a.G(intent, "text/plain");
        Intent intentCreateChooser = Intent.createChooser(intent, null);
        Intrinsics.h(intentCreateChooser);
        ExternalDestination.ByIntent byIntent = new ExternalDestination.ByIntent(intentCreateChooser, null);
        if (!this.f110077n.a(new ExternalDestination.ByIntent(intent, null))) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "ReferralsShare", "Share sheet not available, falling back to clipboard", null, h0Var);
            aVar.c("COPY_REFERRAL_LABEL", inviteText, false, new co7.a(this, i));
            return;
        }
        try {
            A2(byIntent);
        } catch (Exception e) {
            h0 h0Var2 = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "ReferralsShare", "navigate() failed for share sheet, falling back to clipboard", e, h0Var2);
            aVar.c("COPY_REFERRAL_LABEL", inviteText, false, new co7.a(this, i));
        }
    }
}
