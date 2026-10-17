package fug;

import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.wealth.account_closure.api.domain.model.AccountClosureFeedbackOptions;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f138209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f138210b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f138211c;
    public final TextLocalisedClause d;
    public final Clause e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Parcelable f138212g;

    public f(String id10, TextLocalisedClause title, Clause description, TextLocalisedClause primaryButtonLabel, TextLocalisedClause textLocalisedClause, boolean z, AccountClosureFeedbackOptions accountClosureFeedbackOptions) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(primaryButtonLabel, "primaryButtonLabel");
        this.f138209a = id10;
        this.f138210b = title;
        this.f138211c = description;
        this.d = primaryButtonLabel;
        this.e = textLocalisedClause;
        this.f = z;
        this.f138212g = accountClosureFeedbackOptions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f138209a.equals(fVar.f138209a) && this.f138210b.equals(fVar.f138210b) && this.f138211c.equals(fVar.f138211c) && this.d.equals(fVar.d) && Intrinsics.f(this.e, fVar.e) && this.f == fVar.f && Intrinsics.f(this.f138212g, fVar.f138212g);
    }

    public final int hashCode() {
        int iA = t61.a.a(p.a.a(t61.a.a(this.f138209a.hashCode() * 31, 31, this.f138210b), 31, this.f138211c), 31, this.d);
        Clause clause = this.e;
        int iC = j6.a.c((iA + (clause == null ? 0 : clause.hashCode())) * 31, 31, this.f);
        Parcelable parcelable = this.f138212g;
        return iC + (parcelable != null ? parcelable.hashCode() : 0);
    }
}
