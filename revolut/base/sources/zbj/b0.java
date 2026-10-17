package zbj;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class b0 implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f320898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f320899b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CurrencyClause f320900c;
    public final Image d;
    public final a0 e;

    public b0(List items, Clause headerTitle, CurrencyClause headerDescription, Image headerEndImage, a0 contentKey) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(headerTitle, "headerTitle");
        Intrinsics.checkNotNullParameter(headerDescription, "headerDescription");
        Intrinsics.checkNotNullParameter(headerEndImage, "headerEndImage");
        Intrinsics.checkNotNullParameter(contentKey, "contentKey");
        this.f320898a = items;
        this.f320899b = headerTitle;
        this.f320900c = headerDescription;
        this.d = headerEndImage;
        this.e = contentKey;
    }

    @Override // cli.p
    public final List c() {
        return this.f320898a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj2;
        return Intrinsics.f(this.f320898a, b0Var.f320898a) && Intrinsics.f(this.f320899b, b0Var.f320899b) && this.f320900c.equals(b0Var.f320900c) && this.d.equals(b0Var.d) && this.e.equals(b0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + a10.b.c(this.d, (this.f320900c.hashCode() + p.a.a(this.f320898a.hashCode() * 31, 31, this.f320899b)) * 31, 31);
    }
}
