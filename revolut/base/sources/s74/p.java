package s74;

import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt.constructor.ConstructorCreditPromptControllerContract$InputData;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import mx4.z;

/* JADX INFO: loaded from: classes22.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstructorCreditPromptControllerContract$InputData f260521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z f260522b;

    public p(ConstructorCreditPromptControllerContract$InputData inputData, q74.b creditNavigationIconMapper, z creditScreenConstructorMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(creditNavigationIconMapper, "creditNavigationIconMapper");
        Intrinsics.checkNotNullParameter(creditScreenConstructorMapper, "creditScreenConstructorMapper");
        this.f260521a = inputData;
        this.f260522b = creditScreenConstructorMapper;
    }

    public static LargeActionButton.ButtonStyle a(ht3.b bVar) {
        int i = o.f260520a[bVar.ordinal()];
        if (i == 1) {
            return LargeActionButton.ButtonStyle.f58725a;
        }
        if (i == 2) {
            return LargeActionButton.ButtonStyle.f58726b;
        }
        if (i == 3) {
            return LargeActionButton.ButtonStyle.o;
        }
        throw new NoWhenBranchMatchedException();
    }
}
