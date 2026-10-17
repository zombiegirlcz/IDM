package iz7;

import iqi.h;
import iv0.p;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import xpi.g;
import yhm.j;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f169849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f169850b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Lazy f169851c;
    public final Lazy d;

    public a(g navBarView, h twinVerticalButtonView) {
        Intrinsics.checkNotNullParameter(navBarView, "navBarView");
        Intrinsics.checkNotNullParameter(twinVerticalButtonView, "twinVerticalButtonView");
        this.f169849a = navBarView;
        this.f169850b = twinVerticalButtonView;
        this.f169851c = j.b(new iw4.b(15));
        this.d = j.b(new p(this, 7));
    }
}
