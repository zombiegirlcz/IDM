package w3g;

import aw0.o9;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ugc.a f294391a;

    public c(ugc.a measureFormat) {
        Intrinsics.checkNotNullParameter(measureFormat, "measureFormat");
        this.f294391a = measureFormat;
    }

    public final TextClause a(int i) {
        return new TextClause(this.f294391a.e(new e(Integer.valueOf(i), d.CENTIMETER)), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
    }

    public final TextClause b(int i) {
        return new TextClause(this.f294391a.e(new e(Integer.valueOf(i), d.KILOGRAM)), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
    }

    public final TextClause c(int i) {
        return new TextClause(this.f294391a.e(new e(Double.valueOf(((double) i) * 0.0328084d), d.FOOT)), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
    }

    public final TextClause d(int i) {
        return new TextClause(this.f294391a.e(new e(Double.valueOf(((double) i) * 2.2046226218d), d.POUND)), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
    }
}
