package vci;

import cli.j;
import cli.k;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.user_declarations.shared.R$string;
import grl.b4;
import java.util.ArrayList;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import zhm.w;

/* JADX INFO: loaded from: classes10.dex */
public final class f implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f287759a;

    public f(c inputData, xci.b frequencyMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(frequencyMapper, "frequencyMapper");
        this.f287759a = inputData;
    }

    @Override // cli.n
    public final o c(j jVar) {
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.transaction_countries_frequency_bottom_sheet_title, null, null, 14), new TextLocalisedClause(R$string.transaction_countries_frequency_bottom_sheet_subtitle, null, null, 14), null, null, false, 28);
        EnumEntries<yci.a> enumEntriesA = yci.a.a();
        ArrayList arrayList = new ArrayList(w.t(enumEntriesA, 10));
        for (yci.a aVar2 : enumEntriesA) {
            String strName = aVar2.name();
            TextLocalisedClause textLocalisedClauseA = xci.b.a(aVar2);
            boolean z = false;
            SingleChoiceDelegate.b.a aVar3 = new SingleChoiceDelegate.b.a(0);
            if (this.f287759a.f287757a == aVar2) {
                z = true;
            }
            arrayList.add(new SingleChoiceDelegate.Model(strName, textLocalisedClauseA, z, aVar3, aVar2, b4.EXPIRED_OR_INVALID_KEY_VALUE));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        return new cii.b(null, arrayList, aVar);
    }
}
