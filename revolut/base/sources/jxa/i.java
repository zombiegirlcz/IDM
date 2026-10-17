package jxa;

import com.revolut.feature.shared.help_centre.api.faq.SharedFaqDestination;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class i {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public final SharedFaqDestination a() {
        od0.a aVar = od0.a.f224253a;
        return od0.a.e() ? new SharedFaqDestination((SharedFaqDestination.StartPoint) new SharedFaqDestination.StartPoint.FaqExplicit("e4fcd47e-6b23-40e0-ab1e-61e06e56d19b", 14), (SharedFaqDestination.PassthroughData) null, false, 14) : new SharedFaqDestination((SharedFaqDestination.StartPoint) new SharedFaqDestination.StartPoint.FaqExplicit("a88c58c3-627a-44cc-b140-751eec23576a", 14), (SharedFaqDestination.PassthroughData) null, false, 14);
    }
}
