package us9;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f282840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f282841b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f282842c;

    public b(TextLocalisedClause title, ArrayList perCurrency, dj0.d total) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(perCurrency, "perCurrency");
        Intrinsics.checkNotNullParameter(total, "total");
        this.f282840a = title;
        this.f282841b = perCurrency;
        this.f282842c = total;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f282840a.equals(bVar.f282840a) && this.f282841b.equals(bVar.f282841b) && Intrinsics.f(this.f282842c, bVar.f282842c);
    }

    public final int hashCode() {
        return this.f282842c.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f282841b, this.f282840a.hashCode() * 31, 31);
    }
}
