package cm4;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public interface h {
    default TextLocalisedClause a(cl4.a details, ll4.k entryPoint) {
        Intrinsics.checkNotNullParameter(details, "details");
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        return ((vt4.g) this).b(details.e, details.f24928a, details.d, entryPoint, details.f24930c);
    }
}
