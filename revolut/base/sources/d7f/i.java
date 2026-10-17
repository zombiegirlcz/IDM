package d7f;

import cli.p;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class i implements p {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f111956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f111957b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Image f111958c;
    public final List d;

    public i(MoneyClause moneyClause, TextClause textClause, LayeredImage layeredImage, List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f111956a = moneyClause;
        this.f111957b = textClause;
        this.f111958c = layeredImage;
        this.d = items;
    }

    @Override // cli.p
    public final List c() {
        return this.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f111956a, iVar.f111956a) && Intrinsics.f(this.f111957b, iVar.f111957b) && Intrinsics.f(this.f111958c, iVar.f111958c) && Intrinsics.f(this.d, iVar.d);
    }

    public final int hashCode() {
        Clause clause = this.f111956a;
        int iHashCode = (clause == null ? 0 : clause.hashCode()) * 31;
        Clause clause2 = this.f111957b;
        int iHashCode2 = (iHashCode + (clause2 == null ? 0 : clause2.hashCode())) * 31;
        Image image = this.f111958c;
        return this.d.hashCode() + ((iHashCode2 + (image != null ? image.hashCode() : 0)) * 31);
    }
}
