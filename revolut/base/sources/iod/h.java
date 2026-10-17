package iod;

import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.d5;
import com.revolut.core.ui_kit.delegates.f5;
import com.revolut.core.ui_kit.delegates.g5;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes7.dex */
public final class h implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(j jVar) {
        iod.a domainState = (iod.a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        LocalDate localDate = domainState.f163220a;
        LocalDate localDate2 = domainState.f163221b;
        Set set = domainState.e;
        f5 f5Var = (localDate == null || localDate2 == null) ? null : new f5(localDate2);
        List listC = !set.isEmpty() ? u.c(new d5(set)) : f0.f322471a;
        LocalDate localDate3 = domainState.f ? (LocalDate) d0.p0(set) : null;
        if (localDate2 == null && (localDate2 = domainState.f163220a) == null) {
            localDate2 = domainState.f163222c;
        }
        g5 g5Var = new g5("date_picker", localDate2, domainState.f163220a, false, f5Var, localDate3, null, null, listC, null, 0, 0, 1047432);
        yp0.b.l(g5Var, 0, 0, 0, 0, null, false, 63);
        return new c(u.c(g5Var));
    }
}
