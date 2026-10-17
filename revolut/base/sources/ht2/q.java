package ht2;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class q implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f155237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f155238b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Image f155239c;

    public q(TextLocalisedClause title, Clause clause, Image image) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f155237a = title;
        this.f155238b = clause;
        this.f155239c = image;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return this.f155237a.equals(qVar.f155237a) && Intrinsics.f(this.f155238b, qVar.f155238b) && Intrinsics.f(this.f155239c, qVar.f155239c);
    }

    public final int hashCode() {
        int iHashCode = this.f155237a.hashCode() * 31;
        Clause clause = this.f155238b;
        int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
        Image image = this.f155239c;
        return iHashCode2 + (image != null ? image.hashCode() : 0);
    }
}
