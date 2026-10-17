package gec;

import com.revolut.data.model.Data;
import fnk.o;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class c {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public final List a(Data usageCheckData, f widgetType) {
        Intrinsics.checkNotNullParameter(usageCheckData, "usageCheckData");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        return (List) iii.c.f(usageCheckData, new gd8.j(14), new gcc.c(7), new o(this, widgetType, 25));
    }
}
