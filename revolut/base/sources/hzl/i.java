package hzl;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.pincode.common.R$string;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class i implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f157263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f157264b;

    public i() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f157263a, iVar.f157263a) && Intrinsics.f(this.f157264b, iVar.f157264b);
    }

    @Override // hzl.j
    public final Clause getDescription() {
        return this.f157264b;
    }

    @Override // hzl.j
    public final Clause getTitle() {
        return this.f157263a;
    }

    public final int hashCode() {
        return this.f157264b.hashCode() + (this.f157263a.hashCode() * 31);
    }

    public i(int i) {
        TextLocalisedClause title = new TextLocalisedClause(R$string.revolut_passcode_creation_alert_short_title, null, null, 14);
        TextLocalisedClause description = new TextLocalisedClause(R$string.revolut_passcode_creation_alert_short, null, null, 14);
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f157263a = title;
        this.f157264b = description;
    }
}
