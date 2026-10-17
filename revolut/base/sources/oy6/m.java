package oy6;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f230901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f230902b;

    public m(TextLocalisedClause title, TextLocalisedClause description) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f230901a = title;
        this.f230902b = description;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return this.f230901a.equals(mVar.f230901a) && this.f230902b.equals(mVar.f230902b);
    }

    public final int hashCode() {
        return this.f230902b.hashCode() + (this.f230901a.hashCode() * 31);
    }
}
