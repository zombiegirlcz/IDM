package kvh;

import com.revolut.shared.feature.workflow.engine.api.models.workflow.SdkStep;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class f {
    public static String a(SdkStep sdkStep) {
        String str = sdkStep.f105648b;
        if (str != null) {
            return str;
        }
        throw new IllegalArgumentException(("checkId cannot be null for " + sdkStep.f105649c + " vendor").toString());
    }

    public static List b(SdkStep sdkStep) {
        List list = sdkStep.k;
        List list2 = list;
        if (list2 != null && !list2.isEmpty()) {
            return list;
        }
        throw new IllegalArgumentException("Redirects can't be empty for " + sdkStep.f105649c + " vendor");
    }
}
