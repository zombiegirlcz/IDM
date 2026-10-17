package glk;

import cli.p;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class k implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f144722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f144723b;

    public k(TextLocalisedClause actionButtonText, ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(actionButtonText, "actionButtonText");
        this.f144722a = items;
        this.f144723b = actionButtonText;
    }

    @Override // cli.p
    public final List c() {
        return this.f144722a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return this.f144722a.equals(kVar.f144722a) && this.f144723b.equals(kVar.f144723b);
    }

    public final int hashCode() {
        return this.f144723b.hashCode() + (this.f144722a.hashCode() * 31);
    }
}
