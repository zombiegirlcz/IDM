package syd;

import com.revolut.feature.statements.api.models.StatementUrlState;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.f;
import oyd.q;
import yhm.j;
import zhm.d0;
import zhm.f0;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Lazy f266662a = j.b(new sq5.j(26));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lazy f266663b = j.b(new sq5.j(27));

    public final StatementUrlState a(q statement) {
        Intrinsics.checkNotNullParameter(statement, "statement");
        String state = statement.getState();
        if (Intrinsics.f(state, "READY")) {
            String url2 = statement.getUrl();
            Intrinsics.h(url2);
            return new StatementUrlState.Ready(url2);
        }
        if (Intrinsics.f(state, "IN_PREPARATION")) {
            return new StatementUrlState.InPreparation(null, 1, null);
        }
        throw new IllegalArgumentException(j6.a.q("Unknown state: ", statement.getState()));
    }

    public final List b(oyd.b availableYearsDto) {
        Intrinsics.checkNotNullParameter(availableYearsDto, "availableYearsDto");
        return availableYearsDto.getFrom() < availableYearsDto.getTo() ? d0.d1(f.o(availableYearsDto.getFrom(), availableYearsDto.getTo())) : f0.f322471a;
    }
}
