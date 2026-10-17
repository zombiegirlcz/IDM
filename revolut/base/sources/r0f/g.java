package r0f;

import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit_core.displayers.image.models.PairedImage;
import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MoneyClause f250789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MoneyClause f250790b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PairedImage f250791c;

    public g(MoneyClause title, MoneyClause subtitle, PairedImage endImage) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(endImage, "endImage");
        this.f250789a = title;
        this.f250790b = subtitle;
        this.f250791c = endImage;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f250789a.equals(gVar.f250789a) && this.f250790b.equals(gVar.f250790b) && this.f250791c.equals(gVar.f250791c);
    }

    public final int hashCode() {
        return this.f250791c.hashCode() + v7.a(this.f250789a.hashCode() * 31, 31, this.f250790b);
    }
}
