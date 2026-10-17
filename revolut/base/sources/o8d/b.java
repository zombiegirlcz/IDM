package o8d;

import aw0.o9;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final TextClause f223014b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p8d.a f223015a;

    static {
        t0 t0Var = t0.f186434a;
        f223014b = new TextClause(a0.d.r(m70.a.o(t0Var), m70.a.o(t0Var)), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
    }

    public b(p8d.a contentConverter) {
        Intrinsics.checkNotNullParameter(contentConverter, "contentConverter");
        this.f223015a = contentConverter;
    }
}
