package ja8;

import cli.j;
import cli.n;
import cli.o;
import com.onfido.android.sdk.capture.utils.yearclass.YearClass;
import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.junior.isa.impl.R$string;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public final class i implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f172464a;

    public i(d inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f172464a = inputData;
    }

    @Override // cli.n
    public final o c(j jVar) {
        TextLocalisedClause textLocalisedClause;
        c domainState = (c) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        EnumEntries<bj0.b> enumEntriesB = bj0.b.b();
        ArrayList arrayList = new ArrayList(w.t(enumEntriesB, 10));
        for (bj0.b bVar : enumEntriesB) {
            int i = h.f172463a[bVar.ordinal()];
            if (i == 1) {
                textLocalisedClause = new TextLocalisedClause(R$string.junior_trading_gender_male, null, null, 14);
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                textLocalisedClause = new TextLocalisedClause(R$string.junior_trading_gender_female, null, null, 14);
            }
            arrayList.add(new SingleChoiceDelegate.Model(bVar.name(), textLocalisedClause, this.f172464a.f172460a == bVar, null, bVar, YearClass.CLASS_2008));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        return new cii.b(null, arrayList, new lw0.a(new TextLocalisedClause(R$string.junior_trading_child_creation_item_gender_label, null, null, 14), new TextLocalisedClause(R$string.junior_trading_gender_hint, null, null, 14), null, null, false, 28));
    }
}
