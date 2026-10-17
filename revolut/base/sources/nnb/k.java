package nnb;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class k implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f217499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f217500b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f217501c;

    public k(TextLocalisedClause actionButtonText, List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(actionButtonText, "actionButtonText");
        this.f217499a = items;
        this.f217500b = z;
        this.f217501c = actionButtonText;
    }

    @Override // cli.p
    public final List c() {
        return this.f217499a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f217499a, kVar.f217499a) && this.f217500b == kVar.f217500b && this.f217501c.equals(kVar.f217501c);
    }

    public final int hashCode() {
        return this.f217501c.hashCode() + j6.a.c(this.f217499a.hashCode() * 31, 31, this.f217500b);
    }
}
