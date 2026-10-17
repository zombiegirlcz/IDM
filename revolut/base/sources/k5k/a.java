package k5k;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f181524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FeatureCommand f181525b;

    public a(TextLocalisedClause text, FeatureCommand navigationCommand) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(navigationCommand, "navigationCommand");
        this.f181524a = text;
        this.f181525b = navigationCommand;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f181524a.equals(aVar.f181524a) && this.f181525b.equals(aVar.f181525b);
    }

    public final int hashCode() {
        return this.f181525b.f98638a.hashCode() + (this.f181524a.hashCode() * 31);
    }
}
