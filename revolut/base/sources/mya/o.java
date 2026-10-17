package mya;

import com.revolut.core.ui_kit.models.HtmlClause;
import ip0.ej;
import kotlin.jvm.internal.Intrinsics;
import mx0.c7;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class o {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static ej a(String disclaimer) {
        Intrinsics.checkNotNullParameter(disclaimer, "disclaimer");
        ej ejVar = new ej("FOOTER_LIST_ID", new c7(new HtmlClause(1, 28, (Integer) null, (Object) null, disclaimer), false, null, 6));
        yp0.b.r(ejVar, 0, 0, 0, 0, 15);
        return ejVar;
    }
}
