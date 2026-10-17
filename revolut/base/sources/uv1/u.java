package uv1;

import com.revolut.feature.apm.core.models.alias.Alias;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class u implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Alias f283289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f283290b;

    public u(Alias alias, ArrayList activeAliases) {
        Intrinsics.checkNotNullParameter(alias, "alias");
        Intrinsics.checkNotNullParameter(activeAliases, "activeAliases");
        this.f283289a = alias;
        this.f283290b = activeAliases;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return this.f283289a.equals(uVar.f283289a) && this.f283290b.equals(uVar.f283290b);
    }

    public final int hashCode() {
        return this.f283290b.hashCode() + (this.f283289a.hashCode() * 31);
    }
}
