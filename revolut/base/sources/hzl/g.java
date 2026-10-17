package hzl;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.pincode.common.R$string;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class g implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f157259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f157260b;

    public g() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f157259a, gVar.f157259a) && Intrinsics.f(this.f157260b, gVar.f157260b);
    }

    @Override // hzl.j
    public final Clause getDescription() {
        return this.f157260b;
    }

    @Override // hzl.j
    public final Clause getTitle() {
        return this.f157259a;
    }

    public final int hashCode() {
        return this.f157260b.hashCode() + (this.f157259a.hashCode() * 31);
    }

    public g(int i) {
        TextLocalisedClause title = new TextLocalisedClause(R$string.revolut_passcode_creation_alert_title, null, null, 14);
        TextLocalisedClause description = new TextLocalisedClause(R$string.revolut_passcode_creation_alert_phone, null, null, 14);
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f157259a = title;
        this.f157260b = description;
    }
}
