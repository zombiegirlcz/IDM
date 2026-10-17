package rp0;

import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class t implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f256174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f256175b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x f256176c;
    public final r d;

    public t(Clause title, Clause clause, x xVar, int i) {
        clause = (i & 2) != 0 ? null : clause;
        xVar = (i & 4) != 0 ? null : xVar;
        r backButton = r.CROSS;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(backButton, "backButton");
        this.f256174a = title;
        this.f256175b = clause;
        this.f256176c = xVar;
        this.d = backButton;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return Intrinsics.f(this.f256174a, tVar.f256174a) && Intrinsics.f(this.f256175b, tVar.f256175b) && Intrinsics.f(this.f256176c, tVar.f256176c) && this.d == tVar.d;
    }

    @Override // rp0.u
    public final Parcelable getAnalyticsContext() {
        return null;
    }

    @Override // rp0.u
    public final Clause getDescription() {
        return this.f256175b;
    }

    @Override // rp0.u
    public final Clause getTitle() {
        return this.f256174a;
    }

    public final int hashCode() {
        int iHashCode = this.f256174a.hashCode() * 31;
        Clause clause = this.f256175b;
        int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
        x xVar = this.f256176c;
        return (this.d.hashCode() + ((iHashCode2 + (xVar != null ? xVar.hashCode() : 0)) * 31)) * 31;
    }
}
