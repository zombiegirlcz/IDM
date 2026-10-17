package zf1;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RowDelegate.Model f321853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f321854b;

    public a(RowDelegate.Model item, ArrayList keywords) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(keywords, "keywords");
        this.f321853a = item;
        this.f321854b = keywords;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f321853a.equals(aVar.f321853a) && this.f321854b.equals(aVar.f321854b);
    }

    public final int hashCode() {
        return this.f321854b.hashCode() + (this.f321853a.hashCode() * 31);
    }
}
