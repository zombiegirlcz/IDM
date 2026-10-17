package cci;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f23115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f23116b;

    public h(TextLocalisedClause title, List purposes) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(purposes, "purposes");
        this.f23115a = title;
        this.f23116b = purposes;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f23115a.equals(hVar.f23115a) && Intrinsics.f(this.f23116b, hVar.f23116b);
    }

    public final int hashCode() {
        return this.f23116b.hashCode() + (this.f23115a.hashCode() * 31);
    }
}
