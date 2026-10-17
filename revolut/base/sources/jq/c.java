package jq;

import android.content.Context;
import android.content.Intent;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import p01.u;

/* JADX INFO: loaded from: classes17.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f177329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final iq.g f177330b;

    public c(Context context, iq.g coreResources) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(coreResources, "coreResources");
        this.f177329a = context;
        this.f177330b = coreResources;
    }

    public final u a(a state) {
        Intrinsics.checkNotNullParameter(state, "state");
        int i = b.f177328a[state.ordinal()];
        iq.g gVar = this.f177330b;
        if (i == 1) {
            return new u(new TextLocalisedClause(gVar.f167793a, null, new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), 10), new k01.c(b()));
        }
        if (i == 2) {
            return new u(new TextLocalisedClause(gVar.f167795c, null, null, 14), new k01.c(b()));
        }
        if (i == 3) {
            return new u(new TextLocalisedClause(gVar.f167794b, null, new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), 10), new k01.c(b()));
        }
        throw new NoWhenBranchMatchedException();
    }

    public final Intent b() {
        Context context = this.f177329a;
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
        return launchIntentForPackage == null ? new Intent() : launchIntentForPackage;
    }
}
