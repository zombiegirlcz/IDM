package n2m;

import android.os.Bundle;
import com.trustdockekyc.core.backend.domain.model.AppError;
import com.trustdockekyc.core.backend.presentation.CoreEkycCommonErrorFragment;
import kotlin.jvm.internal.Intrinsics;
import u1m.f0;

/* JADX INFO: loaded from: classes12.dex */
public final class j {
    public static CoreEkycCommonErrorFragment a(j jVar, x2m.f verificationSettings, AppError appError, String str) {
        jVar.getClass();
        Intrinsics.checkNotNullParameter(verificationSettings, "verificationSettings");
        Intrinsics.checkNotNullParameter(appError, "appError");
        String message = "newInstance: e=" + appError + ", title=" + ((String) null) + ", message=" + str;
        Intrinsics.checkNotNullParameter(message, "message");
        f0 f0Var = f0.VERBOSE;
        CoreEkycCommonErrorFragment coreEkycCommonErrorFragment = new CoreEkycCommonErrorFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable("verificationSettings", verificationSettings);
        bundle.putSerializable("exception", appError);
        bundle.putString("title", null);
        bundle.putString("message", str);
        coreEkycCommonErrorFragment.setArguments(bundle);
        return coreEkycCommonErrorFragment;
    }
}
