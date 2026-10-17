package d7j;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class l0 implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AnalyticsContext f112019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i0 f112020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k0 f112021c;
    public final j0 d;
    public final List e;
    public final List f;

    public l0(AnalyticsContext analyticsContext, i0 navBar, k0 settingsButtonState, j0 nextButtonState, List keyboardSuggestions, List items) {
        Intrinsics.checkNotNullParameter(navBar, "navBar");
        Intrinsics.checkNotNullParameter(settingsButtonState, "settingsButtonState");
        Intrinsics.checkNotNullParameter(nextButtonState, "nextButtonState");
        Intrinsics.checkNotNullParameter(keyboardSuggestions, "keyboardSuggestions");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f112019a = analyticsContext;
        this.f112020b = navBar;
        this.f112021c = settingsButtonState;
        this.d = nextButtonState;
        this.e = keyboardSuggestions;
        this.f = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj2;
        return Intrinsics.f(this.f112019a, l0Var.f112019a) && Intrinsics.f(this.f112020b, l0Var.f112020b) && Intrinsics.f(this.f112021c, l0Var.f112021c) && Intrinsics.f(this.d, l0Var.d) && Intrinsics.f(this.e, l0Var.e) && Intrinsics.f(this.f, l0Var.f);
    }

    public final int hashCode() {
        AnalyticsContext analyticsContext = this.f112019a;
        return this.f.hashCode() + p.a.d((this.d.hashCode() + j6.a.c((this.f112020b.hashCode() + ((analyticsContext == null ? 0 : AnalyticsContext.a(analyticsContext.f50296a)) * 31)) * 31, 31, this.f112021c.f112015a)) * 31, 31, this.e);
    }
}
