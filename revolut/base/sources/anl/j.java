package anl;

import c55.k;
import com.google.common.collect.ImmutableMap;
import com.revolut.feature.credit.application.plugins.impl.ui.loading.LoadingScreenContract$InputData;
import com.revolut.retail.feature.cryptocommoditydetails.impl.ui.price_targets.details.screens.leaf.PriceTargetsFaqLeafScreenContract$InputData;
import epg.m;
import gc1.n;
import java.util.Map;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import od3.l;

/* JADX INFO: loaded from: classes12.dex */
public final class j implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7819a = 12;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f7820b;

    public j(LoadingScreenContract$InputData input) {
        Intrinsics.checkNotNullParameter(input, "input");
        this.f7820b = input;
    }

    /* JADX WARN: Removed duplicated region for block: B:149:0x098f  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x09d3  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0b3e  */
    @Override // jki.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final jki.m a(jki.i r91) {
        /*
            Method dump skipped, instruction units count: 3058
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: anl.j.a(jki.i):jki.m");
    }

    public rd3.d b(l lVar) {
        rd3.d dVar = (rd3.d) ((Map) this.f7820b).get(lVar.f224276a);
        if (dVar != null) {
            return dVar;
        }
        throw new NullPointerException("No mapper found for cashback type " + lVar.f224276a + ". Please make sure you provided it in CashbackProductScreenModule");
    }

    public j(dyf.f travelFullScreenBookingsItemMapper) {
        Intrinsics.checkNotNullParameter(travelFullScreenBookingsItemMapper, "travelFullScreenBookingsItemMapper");
        this.f7820b = travelFullScreenBookingsItemMapper;
    }

    public j(ImmutableMap uiMappers) {
        Intrinsics.checkNotNullParameter(uiMappers, "uiMappers");
        this.f7820b = uiMappers;
    }

    public j(dk9.b headerMapper, dk9.d contentItemsMapper) {
        Intrinsics.checkNotNullParameter(headerMapper, "headerMapper");
        Intrinsics.checkNotNullParameter(contentItemsMapper, "contentItemsMapper");
        this.f7820b = headerMapper;
    }

    public j(n65.d loanSelectNewRepaymentDayCalendarMapper) {
        Intrinsics.checkNotNullParameter(loanSelectNewRepaymentDayCalendarMapper, "loanSelectNewRepaymentDayCalendarMapper");
        this.f7820b = loanSelectNewRepaymentDayCalendarMapper;
    }

    public j(m listItemsProvider) {
        Intrinsics.checkNotNullParameter(listItemsProvider, "listItemsProvider");
        this.f7820b = listItemsProvider;
    }

    public j(onh.b planCancellationDowngradeReasonMapper) {
        Intrinsics.checkNotNullParameter(planCancellationDowngradeReasonMapper, "planCancellationDowngradeReasonMapper");
        this.f7820b = planCancellationDowngradeReasonMapper;
    }

    public j(k loanBackupCardToggleCommonMapper) {
        Intrinsics.checkNotNullParameter(loanBackupCardToggleCommonMapper, "loanBackupCardToggleCommonMapper");
        this.f7820b = loanBackupCardToggleCommonMapper;
    }

    public j(PriceTargetsFaqLeafScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f7820b = inputData;
    }

    public j(n listItemFactory) {
        Intrinsics.checkNotNullParameter(listItemFactory, "listItemFactory");
        this.f7820b = listItemFactory;
    }

    public j(tll.p revolutAccountsUiFactory) {
        Intrinsics.checkNotNullParameter(revolutAccountsUiFactory, "revolutAccountsUiFactory");
        this.f7820b = revolutAccountsUiFactory;
    }

    public j(xea.g pocketPickerMapper) {
        Intrinsics.checkNotNullParameter(pocketPickerMapper, "pocketPickerMapper");
        this.f7820b = pocketPickerMapper;
    }

    public j(jb1.a listItemFactory, wa1.a strings) {
        Intrinsics.checkNotNullParameter(listItemFactory, "listItemFactory");
        Intrinsics.checkNotNullParameter(strings, "strings");
        this.f7820b = listItemFactory;
    }

    public j(p9d.c doneButtonProvider) {
        Intrinsics.checkNotNullParameter(doneButtonProvider, "doneButtonProvider");
        this.f7820b = doneButtonProvider;
    }
}
