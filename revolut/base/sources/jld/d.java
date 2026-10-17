package jld;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;
import rp0.f1;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f175716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f175717b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f175718c;
    public final TextLocalisedClause d;
    public final f1 e;

    public d(int i, TextLocalisedClause message, TextLocalisedClause action, String feedbackId, f1 position) {
        Intrinsics.checkNotNullParameter("fincrime_nps_tell_us_more", "toastId");
        Intrinsics.checkNotNullParameter(feedbackId, "feedbackId");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(position, "position");
        this.f175716a = feedbackId;
        this.f175717b = i;
        this.f175718c = message;
        this.d = action;
        this.e = position;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f175716a, dVar.f175716a) && this.f175717b == dVar.f175717b && this.f175718c.equals(dVar.f175718c) && this.d.equals(dVar.d) && this.e == dVar.e;
    }

    public final int hashCode() {
        return this.e.hashCode() + t61.a.a(t61.a.a(j6.a.b(this.f175717b, p.a.c(628302834, 31, this.f175716a), 31), 31, this.f175718c), 31, this.d);
    }
}
