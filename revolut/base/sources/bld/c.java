package bld;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.slot_manager.impl.ui.custom_rating.RateUsBundle;
import kotlin.jvm.internal.Intrinsics;
import rp0.f1;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RateUsBundle f16527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f16528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f16529c;
    public final f1 d;

    public c(RateUsBundle rateUsBundle, TextLocalisedClause message, TextLocalisedClause action, f1 position) {
        Intrinsics.checkNotNullParameter("rate_us", "toastId");
        Intrinsics.checkNotNullParameter(rateUsBundle, "rateUsBundle");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(position, "position");
        this.f16527a = rateUsBundle;
        this.f16528b = message;
        this.f16529c = action;
        this.d = position;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f16527a.equals(cVar.f16527a) && this.f16528b.equals(cVar.f16528b) && this.f16529c.equals(cVar.f16529c) && this.d == cVar.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + t61.a.a(t61.a.a(p.a.c(422629699, 31, this.f16527a.f87355a), 31, this.f16528b), 31, this.f16529c);
    }
}
