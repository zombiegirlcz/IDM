package zzb;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class n extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f326655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f326656b;

    public n(TextLocalisedClause title, TextLocalisedClause description) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f326655a = title;
        this.f326656b = description;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return this.f326655a.equals(nVar.f326655a) && this.f326656b.equals(nVar.f326656b);
    }

    public final int hashCode() {
        return this.f326656b.hashCode() + (this.f326655a.hashCode() * 31);
    }
}
