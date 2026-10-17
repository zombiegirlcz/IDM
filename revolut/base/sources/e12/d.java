package e12;

import android.os.Parcelable;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.apm.core.models.transfers.payments.ApmPaymentDraft;
import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f121850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextClause f121851b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f121852c;
    public final Clause d;
    public final RowDelegate.Model.MainImage.Image40 e;
    public final RowDelegate.Model.c.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Parcelable f121853g;

    public d(String listId, TextClause title, TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2, RowDelegate.Model.MainImage.Image40 image40, RowDelegate.Model.c.b bVar, ApmPaymentDraft apmPaymentDraft) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f121850a = listId;
        this.f121851b = title;
        this.f121852c = textLocalisedClause;
        this.d = textLocalisedClause2;
        this.e = image40;
        this.f = bVar;
        this.f121853g = apmPaymentDraft;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f121850a, dVar.f121850a) && this.f121851b.equals(dVar.f121851b) && Intrinsics.f(this.f121852c, dVar.f121852c) && Intrinsics.f(this.d, dVar.d) && this.e.equals(dVar.e) && this.f.equals(dVar.f) && Intrinsics.f(this.f121853g, dVar.f121853g);
    }

    public final int hashCode() {
        int iB = v7.b(this.f121850a.hashCode() * 31, 31, this.f121851b);
        Clause clause = this.f121852c;
        int iHashCode = (iB + (clause == null ? 0 : clause.hashCode())) * 31;
        Clause clause2 = this.d;
        int iHashCode2 = (this.f.hashCode() + ((this.e.hashCode() + ((iHashCode + (clause2 == null ? 0 : clause2.hashCode())) * 31)) * 31)) * 31;
        Parcelable parcelable = this.f121853g;
        return iHashCode2 + (parcelable != null ? parcelable.hashCode() : 0);
    }
}
