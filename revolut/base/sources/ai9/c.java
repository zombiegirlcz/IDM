package ai9;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.tracking.v3.PayLaterCrossSellContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f5218b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f5219c;
    public final Clause d;
    public final b e;
    public final PayLaterCrossSellContext f;

    public c(String imageId, Clause title, Clause description, Clause clause, b payload, PayLaterCrossSellContext trackingContext) {
        Intrinsics.checkNotNullParameter(imageId, "imageId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(trackingContext, "trackingContext");
        this.f5217a = imageId;
        this.f5218b = title;
        this.f5219c = description;
        this.d = clause;
        this.e = payload;
        this.f = trackingContext;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f5217a, cVar.f5217a) && Intrinsics.f(this.f5218b, cVar.f5218b) && Intrinsics.f(this.f5219c, cVar.f5219c) && Intrinsics.f(this.d, cVar.d) && Intrinsics.f(this.e, cVar.e) && Intrinsics.f(this.f, cVar.f);
    }

    public final int hashCode() {
        int iA = p.a.a(p.a.a(this.f5217a.hashCode() * 31, 31, this.f5218b), 31, this.f5219c);
        Clause clause = this.d;
        return this.f.hashCode() + ((this.e.hashCode() + ((iA + (clause == null ? 0 : clause.hashCode())) * 31)) * 31);
    }
}
