package ip0;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class ww {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f167065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f167066b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Image f167067c;

    public ww(TextLocalisedClause textLocalisedClause, Clause clause, ResourceImage resourceImage) {
        this.f167065a = textLocalisedClause;
        this.f167066b = clause;
        this.f167067c = resourceImage;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ww)) {
            return false;
        }
        ww wwVar = (ww) obj2;
        return Intrinsics.f(this.f167065a, wwVar.f167065a) && Intrinsics.f(this.f167066b, wwVar.f167066b) && Intrinsics.f(this.f167067c, wwVar.f167067c);
    }

    public final int hashCode() {
        Clause clause = this.f167065a;
        int iHashCode = (clause == null ? 0 : clause.hashCode()) * 31;
        Clause clause2 = this.f167066b;
        int iHashCode2 = (iHashCode + (clause2 == null ? 0 : clause2.hashCode())) * 31;
        Image image = this.f167067c;
        return iHashCode2 + (image != null ? image.hashCode() : 0);
    }
}
