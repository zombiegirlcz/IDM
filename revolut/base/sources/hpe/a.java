package hpe;

import com.revolut.core.ui_kit.models.HtmlClause;
import com.revolut.kompot.common.ExternalDestination;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public abstract class a {
    public static final ExternalDestination.Browser a(ty0.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        if (aVar.f275447c instanceof HtmlClause) {
            return new ExternalDestination.Browser(aVar.f275445a, null);
        }
        return null;
    }
}
