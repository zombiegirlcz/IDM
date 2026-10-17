package lhh;

import aah.g;
import com.revolut.feature.wealth.models.addmoney.TransferSubjectId;
import kotlin.jvm.internal.Intrinsics;
import m1h.l;
import m1h.m;
import m1h.t;
import ybl.k;

/* JADX INFO: loaded from: classes9.dex */
public final class b implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f195255a;

    public b(k tradingAccountsInteractor) {
        Intrinsics.checkNotNullParameter(tradingAccountsInteractor, "tradingAccountsInteractor");
        this.f195255a = tradingAccountsInteractor;
    }

    @Override // m1h.l
    public final m a(TransferSubjectId transferSubjectId, t view, j60.a bottomExpandableDialogControllerExtension) {
        Intrinsics.checkNotNullParameter(transferSubjectId, "transferSubjectId");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(bottomExpandableDialogControllerExtension, "bottomExpandableDialogControllerExtension");
        c84.c cVar = new c84.c(this.f195255a, transferSubjectId);
        return new m(cVar, new g(cVar, view));
    }
}
