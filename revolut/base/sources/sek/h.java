package sek;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f262204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f262205b;

    public h(TextLocalisedClause continueButtonText, boolean z) {
        Intrinsics.checkNotNullParameter(continueButtonText, "continueButtonText");
        this.f262204a = continueButtonText;
        this.f262205b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f262204a.equals(hVar.f262204a) && this.f262205b == hVar.f262205b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f262205b) + (this.f262204a.hashCode() * 31);
    }
}
