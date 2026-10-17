package hzl;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.pincode.common.R$string;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class h implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f157261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f157262b;

    public h() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f157261a, hVar.f157261a) && Intrinsics.f(this.f157262b, hVar.f157262b);
    }

    @Override // hzl.j
    public final Clause getDescription() {
        return this.f157262b;
    }

    @Override // hzl.j
    public final Clause getTitle() {
        return this.f157261a;
    }

    public final int hashCode() {
        return this.f157262b.hashCode() + (this.f157261a.hashCode() * 31);
    }

    public h(int i) {
        TextLocalisedClause title = new TextLocalisedClause(R$string.revolut_passcode_creation_alert_long_title, null, null, 14);
        TextLocalisedClause description = new TextLocalisedClause(R$string.revolut_passcode_creation_alert_long_subtitle, null, null, 14);
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f157261a = title;
        this.f157262b = description;
    }
}
