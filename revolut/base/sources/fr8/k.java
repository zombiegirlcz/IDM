package fr8;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f137414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f137415b;

    public k(TextLocalisedClause titleButton, boolean z) {
        Intrinsics.checkNotNullParameter(titleButton, "titleButton");
        this.f137414a = titleButton;
        this.f137415b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return this.f137414a.equals(kVar.f137414a) && this.f137415b == kVar.f137415b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f137415b) + (this.f137414a.hashCode() * 31);
    }
}
