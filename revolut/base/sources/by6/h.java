package by6;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f19749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f19750b;

    public h(TextLocalisedClause buttonLabel, boolean z) {
        Intrinsics.checkNotNullParameter(buttonLabel, "buttonLabel");
        this.f19749a = buttonLabel;
        this.f19750b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f19749a.equals(hVar.f19749a) && this.f19750b == hVar.f19750b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f19750b) + (this.f19749a.hashCode() * 31);
    }
}
