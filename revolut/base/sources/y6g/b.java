package y6g;

import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.p0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;

/* JADX INFO: loaded from: classes9.dex */
public abstract class b {
    public static final int a(dj0.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        return (int) (dVar.f115082a / cp5.d.k(dVar.f115083b));
    }

    public static final TimeClause b(int i) {
        b.Companion companion = kotlin.time.b.INSTANCE;
        return new TimeClause(kotlin.time.b.f(kotlin.time.c.g(i, pkm.e.MINUTES)), new TimeClause.Format.Duration(new TimeClause.Format.Duration.DurationStyle.Textual(p0.MINUTES)), null, null, 12);
    }
}
