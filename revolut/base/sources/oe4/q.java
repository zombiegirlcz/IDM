package oe4;

import android.content.Intent;
import android.net.Uri;
import cli.y;
import com.revolut.kompot.common.ExternalDestination;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class q extends oki.h implements f {
    public final a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f224534p;

    public q(a intentProvider, cli.n stateMapper) {
        Intrinsics.checkNotNullParameter(intentProvider, "intentProvider");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = intentProvider;
        this.f224534p = mra.d.b(this, cli.k.f25028a, stateMapper, null, false, 12);
    }

    public final void I2(l event) {
        Intrinsics.checkNotNullParameter(event, "event");
        boolean z = event instanceof j;
        m mVar = m.f224529a;
        if (z) {
            C2(mVar);
            return;
        }
        if (event instanceof k) {
            String link = ((k) event).f224528a.f275445a;
            this.o.getClass();
            Intrinsics.checkNotNullParameter(link, "link");
            C1(new ExternalDestination.ByIntent(new Intent("android.intent.action.VIEW", Uri.parse(link)), null));
            return;
        }
        if (event instanceof g) {
            C2(mVar);
        } else if (event instanceof i) {
            C2(new n(((i) event).f224526a.f53228a));
        } else {
            if (!(event instanceof h)) {
                throw new NoWhenBranchMatchedException();
            }
            C2(new n(((h) event).f224525a.f52539a));
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f224534p;
    }
}
