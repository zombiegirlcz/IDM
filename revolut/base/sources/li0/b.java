package li0;

import android.app.Activity;
import com.google.android.gms.tapandpay.TapAndPayClient;
import com.google.android.gms.tapandpay.issuer.PushTokenizeRequest;
import kl.c0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class b extends gi0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TapAndPayClient f195399a;

    public b(TapAndPayClient tapAndPayClient) {
        Intrinsics.checkNotNullParameter(tapAndPayClient, "tapAndPayClient");
        this.f195399a = tapAndPayClient;
    }

    public final void a(Activity activity, c0 pushTokenizerRequest) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(pushTokenizerRequest, "pushTokenizerRequest");
        Intrinsics.checkNotNullParameter(pushTokenizerRequest, "<this>");
        this.f195399a.pushTokenize(activity, (PushTokenizeRequest) pushTokenizerRequest.f185148b, 1000);
    }
}
