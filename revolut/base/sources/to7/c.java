package to7;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public abstract class c extends a8a.d {
    public static int f(l80.e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        LocalDate localDateE = ((l80.f) eVar).e();
        return localDateE.getMonth() == Month.DECEMBER ? localDateE.getYear() + 1 : localDateE.getYear();
    }

    public static SingleChoiceDelegate.Model g(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return new SingleChoiceDelegate.Model(str, new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), false, null, null, 2040);
    }

    @Override // a8a.d
    public final List a(String filterQuery, ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(filterQuery, "filterQuery");
        yp0.b.k(items, 0, 0, 0, 0, 31);
        return items;
    }

    @Override // a8a.d
    public final boolean b(String query, qv0.i model) {
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(model, "model");
        return jli.g.d(model.getF55265b(), query);
    }
}
