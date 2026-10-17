package pyd;

import com.revolut.feature.statements.api.models.TaxPeriod;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import oyd.t;
import yhm.j;

/* JADX INFO: loaded from: classes7.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Lazy f240811a = j.b(new pni.a(17));

    public static final TaxPeriod a(t tVar) {
        Intrinsics.checkNotNullParameter(tVar, "<this>");
        String from = tVar.getFrom();
        Lazy lazy = f240811a;
        LocalDate localDate = LocalDate.parse(from, (DateTimeFormatter) lazy.getValue());
        Intrinsics.checkNotNullExpressionValue(localDate, "parse(...)");
        LocalDate localDate2 = LocalDate.parse(tVar.getTo(), (DateTimeFormatter) lazy.getValue());
        Intrinsics.checkNotNullExpressionValue(localDate2, "parse(...)");
        return new TaxPeriod(localDate, localDate2);
    }
}
