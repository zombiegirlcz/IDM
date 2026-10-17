package a3i;

import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MoneyClause f1150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f1151b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CurrencyImage f1152c;
    public final boolean d;

    public m(MoneyClause title, TextLocalisedClause description, CurrencyImage endIconImage, boolean z) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(endIconImage, "endIconImage");
        this.f1150a = title;
        this.f1151b = description;
        this.f1152c = endIconImage;
        this.d = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return this.f1150a.equals(mVar.f1150a) && this.f1151b.equals(mVar.f1151b) && this.f1152c.equals(mVar.f1152c) && this.d == mVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.f1152c.hashCode() + t61.a.a(this.f1150a.hashCode() * 31, 31, this.f1151b)) * 31);
    }
}
