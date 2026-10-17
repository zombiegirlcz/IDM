package oeb;

import aw0.d7;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.k;
import ip0.a10;
import ip0.c10;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public final class g implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(j jVar) {
        oeb.a domainState = (oeb.a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List<LocalTime> list = domainState.f224569b;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (LocalTime localTime : list) {
            arrayList.add(new c10(k.a(d7.Companion, localTime), localTime));
        }
        return new c(u.c(new a10("RESERVATION_TIME_PICKER", arrayList, domainState.f224570c)));
    }
}
