package lj9;

import com.revolut.core.ui_kit.models.CompositeClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CompositeClause f195612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f195613b;

    public a(CompositeClause text, boolean z) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f195612a = text;
        this.f195613b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f195612a.equals(aVar.f195612a) && this.f195613b == aVar.f195613b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f195613b) + (this.f195612a.hashCode() * 31);
    }
}
