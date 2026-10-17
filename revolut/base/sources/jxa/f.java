package jxa;

import com.revolut.feature.shared.help_centre.api.faq.SharedFaqDestination;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class f {

    @NotNull
    private static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public final SharedFaqDestination a() {
        od0.a aVar = od0.a.f224253a;
        return od0.a.e() ? new SharedFaqDestination((SharedFaqDestination.StartPoint) new SharedFaqDestination.StartPoint.FaqExplicit("607b0ed2-770e-40c8-b57f-fc6be984a933", 14), (SharedFaqDestination.PassthroughData) null, false, 14) : new SharedFaqDestination((SharedFaqDestination.StartPoint) new SharedFaqDestination.StartPoint.FaqExplicit("607b0b2c-fadf-46e1-a893-75b46784b593", 14), (SharedFaqDestination.PassthroughData) null, false, 14);
    }
}
