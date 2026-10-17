package fu7;

import com.revolut.feature.insurance_embedded.impl.data.model.GenericBanner;
import du7.o4;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public abstract class h {
    public static final GenericBanner.GenericBannerAction.Deeplink a(o4 o4Var) {
        Intrinsics.checkNotNullParameter(o4Var, "<this>");
        if (o4Var instanceof o4.b) {
            return new GenericBanner.GenericBannerAction.Deeplink(((o4.b) o4Var).f117795a);
        }
        if (o4Var instanceof o4.c) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
