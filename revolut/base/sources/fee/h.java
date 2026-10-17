package fee;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class h extends com.revolut.feature.support.impl.transfer_tracker.ui.inbound_transaction_list.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f134594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f134595b;

    public h(TextLocalisedClause title, TextLocalisedClause description) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f134594a = title;
        this.f134595b = description;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f134594a.equals(hVar.f134594a) && this.f134595b.equals(hVar.f134595b);
    }

    public final int hashCode() {
        return this.f134595b.hashCode() + (this.f134594a.hashCode() * 31);
    }
}
