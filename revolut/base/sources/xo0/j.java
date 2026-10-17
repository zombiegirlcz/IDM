package xo0;

import android.content.Context;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import xo0.l;

/* JADX INFO: loaded from: classes19.dex */
public final class j {
    private j() {
    }

    public static l a(g position, Context context) {
        g gVar;
        g gVar2;
        g gVar3;
        g gVar4;
        Intrinsics.checkNotNullParameter(position, "position");
        Intrinsics.checkNotNullParameter(context, "context");
        boolean z = context.getResources().getConfiguration().getLayoutDirection() == 1;
        if (position == g.OUTGOING_UNCONTAINED || position == g.INCOMING_UNCONTAINED) {
            return l.e.f307553a;
        }
        if (position == g.INCOMING || position == g.OUTGOING) {
            return l.f.f307554a;
        }
        g gVar5 = g.INCOMING_TAIL;
        if ((position == gVar5 && !z) || (position == (gVar = g.OUTGOING_TAIL) && z)) {
            return l.d.f307552a;
        }
        if ((position == gVar && !z) || (position == gVar5 && z)) {
            return l.j.f307558a;
        }
        g gVar6 = g.INCOMING_FIRST;
        if ((position == gVar6 && !z) || (position == (gVar2 = g.OUTGOING_FIRST) && z)) {
            return l.a.f307549a;
        }
        if ((position == gVar2 && !z) || (position == gVar6 && z)) {
            return l.g.f307555a;
        }
        g gVar7 = g.INCOMING_MIDDLE;
        if ((position == gVar7 && !z) || (position == (gVar3 = g.OUTGOING_MIDDLE) && z)) {
            return l.c.f307551a;
        }
        if ((position == gVar3 && !z) || (position == gVar7 && z)) {
            return l.i.f307557a;
        }
        g gVar8 = g.INCOMING_LAST;
        if ((position == gVar8 && !z) || (position == (gVar4 = g.OUTGOING_LAST) && z)) {
            return l.b.f307550a;
        }
        if ((position == gVar4 && !z) || (position == gVar8 && z)) {
            return l.h.f307556a;
        }
        throw new IllegalStateException(position + " " + z + " state is not supported");
    }

    public static g b(cam.f position) {
        Intrinsics.checkNotNullParameter(position, "position");
        if (position instanceof gw0.k) {
            return ((gw0.k) position).f147242c ? g.INCOMING_UNCONTAINED : g.OUTGOING_UNCONTAINED;
        }
        if (position instanceof gw0.i) {
            int i = i.f307545a[((gw0.i) position).f147239b.ordinal()];
            if (i == 1) {
                return g.INCOMING_FIRST;
            }
            if (i == 2) {
                return g.INCOMING_MIDDLE;
            }
            if (i == 3) {
                return g.INCOMING_LAST;
            }
            if (i == 4) {
                return g.INCOMING;
            }
            if (i == 5) {
                return g.INCOMING_TAIL;
            }
            throw new NoWhenBranchMatchedException();
        }
        if (!(position instanceof gw0.j)) {
            throw new NoWhenBranchMatchedException();
        }
        int i2 = i.f307545a[((gw0.j) position).f147240b.ordinal()];
        if (i2 == 1) {
            return g.OUTGOING_FIRST;
        }
        if (i2 == 2) {
            return g.OUTGOING_MIDDLE;
        }
        if (i2 == 3) {
            return g.OUTGOING_LAST;
        }
        if (i2 == 4) {
            return g.OUTGOING;
        }
        if (i2 == 5) {
            return g.OUTGOING_TAIL;
        }
        throw new NoWhenBranchMatchedException();
    }
}
