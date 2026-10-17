package n61;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class m {

    @NotNull
    public static final l Companion = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f212691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f212692b;

    public m(List individualAccounts, List businessAccounts) {
        Intrinsics.checkNotNullParameter(individualAccounts, "individualAccounts");
        Intrinsics.checkNotNullParameter(businessAccounts, "businessAccounts");
        this.f212691a = individualAccounts;
        this.f212692b = businessAccounts;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f212691a, mVar.f212691a) && Intrinsics.f(this.f212692b, mVar.f212692b);
    }

    public final int hashCode() {
        return this.f212692b.hashCode() + (this.f212691a.hashCode() * 31);
    }
}
