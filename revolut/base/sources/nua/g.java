package nua;

import cli.j;
import cli.n;
import cli.o;
import com.onfido.android.sdk.capture.utils.yearclass.YearClass;
import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.ArrayList;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.w;

/* JADX INFO: loaded from: classes5.dex */
public final class g implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(j jVar) {
        nua.a domainState = (nua.a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        hua.c cVar = domainState.f219267a;
        EnumEntries<hua.c> enumEntriesA = hua.c.a();
        ArrayList arrayList = new ArrayList(w.t(enumEntriesA, 10));
        for (hua.c cVar2 : enumEntriesA) {
            arrayList.add(new SingleChoiceDelegate.Model(a0.d.h(cVar2.c(), "_FREQUENCY_PICKER_ITEM_ID"), new TextLocalisedClause(cVar2.c(), null, null, 14), cVar2 == cVar, null, cVar2, YearClass.CLASS_2008));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        return new c(arrayList);
    }
}
