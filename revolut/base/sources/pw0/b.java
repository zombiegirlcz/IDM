package pw0;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f240314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f240315b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f240316c;

    public b(int i, int i2, TextLocalisedClause label) {
        Intrinsics.checkNotNullParameter(label, "label");
        this.f240314a = i;
        this.f240315b = label;
        this.f240316c = i2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f240314a == bVar.f240314a && this.f240315b.equals(bVar.f240315b) && this.f240316c == bVar.f240316c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f240316c) + t61.a.a(Integer.hashCode(this.f240314a) * 31, 31, this.f240315b);
    }
}
