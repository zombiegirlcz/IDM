package ip0;

import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.models.CountryImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class a00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextClause f163359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextClause f163360b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CountryImage f163361c;

    public a00(TextClause title, TextClause value, CountryImage icon) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.f163359a = title;
        this.f163360b = value;
        this.f163361c = icon;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a00)) {
            return false;
        }
        a00 a00Var = (a00) obj2;
        return this.f163359a.equals(a00Var.f163359a) && this.f163360b.equals(a00Var.f163360b) && this.f163361c.equals(a00Var.f163361c);
    }

    public final int hashCode() {
        return this.f163361c.hashCode() + v7.b(this.f163359a.hashCode() * 31, 31, this.f163360b);
    }
}
