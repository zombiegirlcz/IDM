package il;

import android.content.Context;
import com.onfido.android.sdk.capture.common.SdkController;
import com.onfido.android.sdk.capture.common.di.SdkComponent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ i f162033a = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static h f162034b;

    public static j a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        h hVar = f162034b;
        if (hVar != null) {
            return hVar;
        }
        SdkComponent sdkComponent$default = SdkController.getSdkComponent$default(SdkController.INSTANCE.getInstance(), context, null, 2, null);
        sdkComponent$default.getClass();
        h hVar2 = new h(sdkComponent$default);
        f162034b = hVar2;
        return hVar2;
    }
}
