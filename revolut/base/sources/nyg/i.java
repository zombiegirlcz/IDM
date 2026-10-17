package nyg;

import cli.j;
import cli.n;
import cli.o;
import com.onfido.android.sdk.capture.utils.yearclass.YearClass;
import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import java.util.ArrayList;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final class i implements n {

    @NotNull
    public static final h Companion = new h();

    @Override // cli.n
    public final o c(j jVar) {
        a domainState = (a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        vyg.c cVar = domainState.f220869a;
        EnumEntries<vyg.c> enumEntriesA = vyg.c.a();
        ArrayList arrayList = new ArrayList(w.t(enumEntriesA, 10));
        for (vyg.c cVar2 : enumEntriesA) {
            arrayList.add(new SingleChoiceDelegate.Model(a0.d.n("SINGLE_CHOICE_LIST_ID_PREFIX_", cVar2.ordinal()), uyg.e.a(cVar2), cVar2 == cVar, null, cVar2, YearClass.CLASS_2008));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        return new c(arrayList);
    }
}
