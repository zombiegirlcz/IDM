package zzd;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f326691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f326692b;

    public r(TextLocalisedClause textLocalisedClause, boolean z) {
        this.f326691a = z;
        this.f326692b = textLocalisedClause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return this.f326691a == rVar.f326691a && Intrinsics.f(this.f326692b, rVar.f326692b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f326691a) * 31;
        Clause clause = this.f326692b;
        return iHashCode + (clause == null ? 0 : clause.hashCode());
    }
}
