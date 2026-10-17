package xwd;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class m implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f309359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f309360b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CurrencyImage f309361c;
    public final TextLocalisedClause d;
    public final boolean e;
    public final List f;

    public m(TextLocalisedClause titleClause, TextLocalisedClause textLocalisedClause, CurrencyImage currencyImage, TextLocalisedClause confirmButtonClause, boolean z, List items) {
        Intrinsics.checkNotNullParameter(titleClause, "titleClause");
        Intrinsics.checkNotNullParameter(confirmButtonClause, "confirmButtonClause");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f309359a = titleClause;
        this.f309360b = textLocalisedClause;
        this.f309361c = currencyImage;
        this.d = confirmButtonClause;
        this.e = z;
        this.f = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return this.f309359a.equals(mVar.f309359a) && this.f309360b.equals(mVar.f309360b) && this.f309361c.equals(mVar.f309361c) && this.d.equals(mVar.d) && this.e == mVar.e && this.f.equals(mVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + j6.a.c(t61.a.a((this.f309361c.hashCode() + t61.a.a(this.f309359a.hashCode() * 31, 31, this.f309360b)) * 31, 31, this.d), 31, this.e);
    }
}
