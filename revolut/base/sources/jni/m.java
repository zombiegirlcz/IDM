package jni;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class m implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f176795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f176796b;

    public m(TextLocalisedClause description, List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f176795a = items;
        this.f176796b = description;
    }

    @Override // cli.p
    public final List c() {
        return this.f176795a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return this.f176795a.equals(mVar.f176795a) && this.f176796b.equals(mVar.f176796b);
    }

    public final int hashCode() {
        return this.f176796b.hashCode() + (this.f176795a.hashCode() * 31);
    }
}
