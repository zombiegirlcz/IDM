package ad0;

import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class g {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yc0.e f3214a;

    public g(yc0.e iconMapper) {
        Intrinsics.checkNotNullParameter(iconMapper, "iconMapper");
        this.f3214a = iconMapper;
    }

    public static Custom a(com.revolut.feature.backend_flow.domain.models.d dVar) {
        int i = f.f3213a[dVar.ordinal()];
        if (i == 1) {
            return new Custom(Integer.valueOf(R$attr.uikit_colorRed), false, null, false, null, 254);
        }
        if (i == 2) {
            return new Custom(Integer.valueOf(R$attr.uikit_colorOrange), false, null, false, null, 254);
        }
        if (i == 3 || i == 4) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x010e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList b(com.revolut.feature.backend_flow.domain.models.EditableListItem r53) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 677
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ad0.g.b(com.revolut.feature.backend_flow.domain.models.EditableListItem):java.util.ArrayList");
    }
}
