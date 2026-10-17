package js9;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ResourceImage f178162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f178163b;

    public a(TextLocalisedClause textLocalisedClause, ResourceImage resourceImage) {
        this.f178162a = resourceImage;
        this.f178163b = textLocalisedClause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f178162a.equals(aVar.f178162a) && this.f178163b.equals(aVar.f178163b);
    }

    public final int hashCode() {
        return this.f178163b.hashCode() + (this.f178162a.hashCode() * 31);
    }
}
