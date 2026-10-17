package y4c;

import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CurrencyClause f310864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CurrencyClause f310865b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CurrencyImage f310866c;
    public final List d;

    public e(CurrencyClause toolbarTitle, CurrencyClause toolbarSubtitle, CurrencyImage toolbarImage, List actions) {
        Intrinsics.checkNotNullParameter(toolbarTitle, "toolbarTitle");
        Intrinsics.checkNotNullParameter(toolbarSubtitle, "toolbarSubtitle");
        Intrinsics.checkNotNullParameter(toolbarImage, "toolbarImage");
        Intrinsics.checkNotNullParameter(actions, "actions");
        this.f310864a = toolbarTitle;
        this.f310865b = toolbarSubtitle;
        this.f310866c = toolbarImage;
        this.d = actions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f310864a.equals(eVar.f310864a) && this.f310865b.equals(eVar.f310865b) && this.f310866c.equals(eVar.f310866c) && Intrinsics.f(this.d, eVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f310866c.hashCode() + ((this.f310865b.hashCode() + (this.f310864a.hashCode() * 31)) * 31)) * 31);
    }
}
