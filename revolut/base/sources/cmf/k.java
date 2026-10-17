package cmf;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class k {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Flow f25241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f25242b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f25243c;

    public k(Flow menuItemsFlow, List clickHandlers, String name) {
        Intrinsics.checkNotNullParameter(menuItemsFlow, "menuItemsFlow");
        Intrinsics.checkNotNullParameter(clickHandlers, "clickHandlers");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f25241a = menuItemsFlow;
        this.f25242b = clickHandlers;
        this.f25243c = name;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f25241a, kVar.f25241a) && Intrinsics.f(this.f25242b, kVar.f25242b) && Intrinsics.f(this.f25243c, kVar.f25243c);
    }

    public final int hashCode() {
        return this.f25243c.hashCode() + p.a.d(this.f25241a.hashCode() * 31, 31, this.f25242b);
    }
}
