package yw0;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f317256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f317257b;

    public e(TextLocalisedClause text, Integer num) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f317256a = text;
        this.f317257b = num;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f317256a.equals(eVar.f317256a) && this.f317257b.equals(eVar.f317257b);
    }

    public final int hashCode() {
        return this.f317257b.hashCode() + (this.f317256a.hashCode() * 31);
    }
}
