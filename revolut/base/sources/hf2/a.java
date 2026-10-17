package hf2;

import com.revolut.feature.apm.upi.impl.deeplink.AccountVerificationExplainerDestination;
import com.revolut.kompot.common.ParcelableDestination;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import lg0.e;
import org.jetbrains.annotations.NotNull;
import xii.b;
import zhm.y0;

/* JADX INFO: loaded from: classes21.dex */
public final class a implements b {

    @NotNull
    private static final C0870a Companion = new C0870a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f151742a = y0.b("topup-india/account-verification-explainer");

    /* JADX INFO: renamed from: hf2.a$a, reason: collision with other inner class name */
    public static final class C0870a {
        private C0870a() {
        }
    }

    @Override // xii.b
    public final Set a() {
        return this.f151742a;
    }

    @Override // xii.b
    public final ParcelableDestination e(e deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        return AccountVerificationExplainerDestination.f62956a;
    }
}
