package yw0;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$drawable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class g implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f317274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f317275b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f317276c;
    public final boolean d;

    public g(TextLocalisedClause title, TextLocalisedClause actionText, boolean z) {
        int i = R$drawable.uikit_icn_24_cross;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(actionText, "actionText");
        this.f317274a = title;
        this.f317275b = actionText;
        this.f317276c = i;
        this.d = z;
    }

    @Override // yw0.k
    public final boolean a() {
        return this.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f317274a.equals(gVar.f317274a) && this.f317275b.equals(gVar.f317275b) && this.f317276c == gVar.f317276c && this.d == gVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + j6.a.b(this.f317276c, t61.a.a(this.f317274a.hashCode() * 31, 31, this.f317275b), 31);
    }
}
