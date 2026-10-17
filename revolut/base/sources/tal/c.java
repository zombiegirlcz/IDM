package tal;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f269367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f269368b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f269369c;

    public c(b primaryButton, boolean z, b bVar) {
        Intrinsics.checkNotNullParameter(primaryButton, "primaryButton");
        this.f269367a = primaryButton;
        this.f269368b = z;
        this.f269369c = bVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f269367a, cVar.f269367a) && this.f269368b == cVar.f269368b && Intrinsics.f(this.f269369c, cVar.f269369c);
    }

    public final int hashCode() {
        int iC = j6.a.c(this.f269367a.hashCode() * 31, 31, this.f269368b);
        b bVar = this.f269369c;
        return iC + (bVar == null ? 0 : bVar.hashCode());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(Clause primaryButtonClause, Clause clause, boolean z) {
        this(new b(primaryButtonClause, LargeActionButton.ButtonStyle.f58725a, true), z, new b(clause, LargeActionButton.ButtonStyle.f58726b, true));
        Intrinsics.checkNotNullParameter(primaryButtonClause, "primaryButtonClause");
    }
}
