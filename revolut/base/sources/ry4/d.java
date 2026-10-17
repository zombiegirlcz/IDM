package ry4;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.feature.credit.direct.debit.account_details_v2.DirectDebitAccountDetailsScreenContract$AccountInfo;
import jki.i;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class d implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f258213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f258214b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DirectDebitAccountDetailsScreenContract$AccountInfo f258215c;

    public d(Clause toolbarTitle, Clause toolbarDescription, DirectDebitAccountDetailsScreenContract$AccountInfo accountInfo) {
        Intrinsics.checkNotNullParameter(toolbarTitle, "toolbarTitle");
        Intrinsics.checkNotNullParameter(toolbarDescription, "toolbarDescription");
        Intrinsics.checkNotNullParameter(accountInfo, "accountInfo");
        this.f258213a = toolbarTitle;
        this.f258214b = toolbarDescription;
        this.f258215c = accountInfo;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f258213a, dVar.f258213a) && Intrinsics.f(this.f258214b, dVar.f258214b) && Intrinsics.f(this.f258215c, dVar.f258215c);
    }

    public final int hashCode() {
        return this.f258215c.hashCode() + p.a.a(this.f258213a.hashCode() * 31, 31, this.f258214b);
    }
}
