package ybl;

import com.revolut.shared.feature.wealth.domain.api.interactors.InstrumentTickerInteractor$Companion;
import efm.r;
import java.util.List;
import kotlin.jvm.functions.Function1;
import nel.m0;
import org.jetbrains.annotations.NotNull;
import vdl.y;

/* JADX INFO: loaded from: classes12.dex */
public interface b {

    @NotNull
    public static final InstrumentTickerInteractor$Companion Companion = InstrumentTickerInteractor$Companion.f105073a;

    static r a(b bVar, List list) {
        Companion.getClass();
        return ((ael.k) bVar).i(list, InstrumentTickerInteractor$Companion.f105074b);
    }

    static /* synthetic */ r b(b bVar, m0.a aVar, w4l.k kVar, Function1 function1, int i) {
        if ((i & 1) != 0) {
            aVar = null;
        }
        if ((i & 2) != 0) {
            kVar = w4l.i.f294643c;
        }
        return ((ael.k) bVar).m(aVar, kVar, function1);
    }

    static r c(b bVar) {
        ael.k kVar = (ael.k) bVar;
        return nim.a.w(((y) kVar.f3633a).a(), new aed.a(kVar, 9));
    }

    static r d(b bVar, List list) {
        Companion.getClass();
        return ((ael.k) bVar).k(list, InstrumentTickerInteractor$Companion.f105074b);
    }
}
