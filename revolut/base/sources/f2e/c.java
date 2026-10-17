package f2e;

import java.util.Set;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Lazy[] f131547b = {yhm.j.c(yhm.k.PUBLICATION, new euf.a(26))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f131548a;

    public /* synthetic */ c(int i, Set set) {
        if (1 == (i & 1)) {
            this.f131548a = set;
        } else {
            qlm.j1.f(a.f131530a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f131548a, ((c) obj2).f131548a);
    }

    public final int hashCode() {
        return this.f131548a.hashCode();
    }

    public c(Set campaignIds) {
        Intrinsics.checkNotNullParameter(campaignIds, "campaignIds");
        this.f131548a = campaignIds;
    }
}
