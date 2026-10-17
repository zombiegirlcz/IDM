package ckb;

import aw0.c7;
import aw0.t0;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.LocalDateClause$DateFormat;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.j;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import java.time.LocalDate;
import java.time.LocalDateTime;
import kotlin.jvm.internal.Intrinsics;
import oi0.d;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    @NotNull
    public static final C0157a Companion = new C0157a();

    /* JADX INFO: renamed from: ckb.a$a, reason: collision with other inner class name */
    public static final class C0157a {
        private C0157a() {
        }
    }

    public static CellDetailsDelegate.Model a(int i, LocalDateTime localDateTime) {
        String strM = p.a.m(d.R(localDateTime), "ID_ROW_DATE_");
        t0 t0Var = new t0((Clause) new TextLocalisedClause(i, null, null, 14), (Image) null, 0, false, 30);
        j jVar = c7.Companion;
        LocalDate localDate = localDateTime.toLocalDate();
        Intrinsics.checkNotNullExpressionValue(localDate, "toLocalDate(...)");
        return new CellDetailsDelegate.Model(strM, t0Var, j.b(jVar, localDate, new LocalDateClause$DateFormat.DateMedium(0)), null, null, null, null, 0, null, false, false, null, null, 32760);
    }
}
