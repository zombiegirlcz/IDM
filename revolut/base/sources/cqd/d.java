package cqd;

import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.home.IncomeSorterHomeContract$DestinationValue;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import m3j.l;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class d {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final end.d f108077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pqd.a f108078b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f108079c;
    public final dl3.f d;

    public d(end.d incomeSorterDestinationUiMapper, pqd.a incomeSorterDestinationSubtitleMapper, l beneficiaryDetailsViewMapper, dl3.f contactsMapper) {
        Intrinsics.checkNotNullParameter(incomeSorterDestinationUiMapper, "incomeSorterDestinationUiMapper");
        Intrinsics.checkNotNullParameter(incomeSorterDestinationSubtitleMapper, "incomeSorterDestinationSubtitleMapper");
        Intrinsics.checkNotNullParameter(beneficiaryDetailsViewMapper, "beneficiaryDetailsViewMapper");
        Intrinsics.checkNotNullParameter(contactsMapper, "contactsMapper");
        this.f108077a = incomeSorterDestinationUiMapper;
        this.f108078b = incomeSorterDestinationSubtitleMapper;
        this.f108079c = beneficiaryDetailsViewMapper;
        this.d = contactsMapper;
    }

    public static MoneyClause a(IncomeSorterHomeContract$DestinationValue incomeSorterHomeContract$DestinationValue, dj0.d dVar, List list, xi0.b bVar) {
        dj0.d dVarB;
        xi0.b bVarA = tpd.a.a(incomeSorterHomeContract$DestinationValue.f87825a);
        boolean zK = dVar.k();
        xi0.b bVar2 = dVar.f115083b;
        if (!zK) {
            if (!Intrinsics.f(bVar2, bVar)) {
                dj0.d dVarB2 = otd.f.b(dVar, list, bVar);
                if (dVarB2 != null) {
                    return otd.f.c(3, null, null, dVarB2);
                }
            } else if (!Intrinsics.f(bVarA, bVar2) && (dVarB = otd.f.b(dVar, list, bVarA)) != null) {
                return cp5.d.z(dVarB.f115083b) ? u5l.a.b(dVarB, null, null, null, 15) : otd.f.c(3, null, null, dVarB);
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x01c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.revolut.core.ui_kit.delegates.RowDelegate.Model b(java.lang.String r29, com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.home.IncomeSorterHomeContract$DestinationValue r30, dj0.d r31, com.revolut.core.ui_kit.delegates.RowDelegate.Model.c r32, boolean r33, java.util.List r34, android.os.Parcelable r35, aqd.l r36) {
        /*
            Method dump skipped, instruction units count: 497
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cqd.d.b(java.lang.String, com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.home.IncomeSorterHomeContract$DestinationValue, dj0.d, com.revolut.core.ui_kit.delegates.RowDelegate$Model$c, boolean, java.util.List, android.os.Parcelable, aqd.l):com.revolut.core.ui_kit.delegates.RowDelegate$Model");
    }
}
