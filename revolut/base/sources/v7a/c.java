package v7a;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.picker.R$string;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class c implements b {
    @Override // v7a.b
    public final TextLocalisedClause a(Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        return new TextLocalisedClause(R$string.common_error_title, null, null, 14);
    }
}
