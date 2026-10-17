package no;

import android.view.View;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.retail.analytics.impl.R$id;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class b1 implements c1, m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a1 f217736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final uo.o0 f217737b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AnalyticsProduct f217738c;

    public b1(a1 descriptor, uo.o0 screenName, AnalyticsProduct analyticsProduct) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(screenName, "screenName");
        Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
        this.f217736a = descriptor;
        this.f217737b = screenName;
        this.f217738c = analyticsProduct;
        View viewB = descriptor.b();
        if (viewB != null) {
            viewB.setTag(R$id.internal_screen_ref, this);
        }
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getP() {
        return this.f217738c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b1)) {
            return false;
        }
        b1 b1Var = (b1) obj2;
        return Intrinsics.f(this.f217736a, b1Var.f217736a) && Intrinsics.f(this.f217737b, b1Var.f217737b) && Intrinsics.f(this.f217738c, b1Var.f217738c);
    }

    @Override // no.c1
    public final a1 getDescriptor() {
        return this.f217736a;
    }

    public final int hashCode() {
        return this.f217738c.hashCode() + ((this.f217737b.hashCode() + (this.f217736a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        uo.o0 o0Var = this.f217737b;
        StringBuilder sbM = v0.a.m("DialogViewScreen.Opened(screenName=", o0Var.b(), ", rawResKey=", o0Var.a(), ", analyticsProduct=");
        sbM.append(this.f217738c);
        sbM.append(")");
        return sbM.toString();
    }
}
