package jtk;

import com.revolut.core.ui_kit.delegates.BannerDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextWarningDelegate;
import com.revolut.core.ui_kit.delegates.ScrollerDelegate;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PlainTextWarningDelegate f178524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BannerDelegate f178525b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ScrollerDelegate f178526c;

    public c(PlainTextWarningDelegate plainTextWarningDelegate, BannerDelegate bannerDelegate, ScrollerDelegate scrollerDelegate) {
        Intrinsics.checkNotNullParameter(plainTextWarningDelegate, "plainTextWarningDelegate");
        Intrinsics.checkNotNullParameter(bannerDelegate, "bannerDelegate");
        Intrinsics.checkNotNullParameter(scrollerDelegate, "scrollerDelegate");
        this.f178524a = plainTextWarningDelegate;
        this.f178525b = bannerDelegate;
        this.f178526c = scrollerDelegate;
        ArrayList arrayListE = scrollerDelegate.e.e();
        if (!arrayListE.contains(plainTextWarningDelegate)) {
            throw new IllegalArgumentException("plainTextWarningDelegate must be registered in scrollerDelegate");
        }
        if (!arrayListE.contains(bannerDelegate)) {
            throw new IllegalArgumentException("bannerDelegate must be registered in scrollerDelegate");
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f178524a, cVar.f178524a) && Intrinsics.f(this.f178525b, cVar.f178525b) && Intrinsics.f(this.f178526c, cVar.f178526c);
    }

    public final int hashCode() {
        return this.f178526c.hashCode() + ((this.f178525b.hashCode() + (this.f178524a.hashCode() * 31)) * 31);
    }
}
