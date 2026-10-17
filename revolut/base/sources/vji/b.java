package vji;

import com.revolut.kompot.R$layout;
import com.revolut.kompot.navigable.root.RootFlow;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RootFlow f289750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f289751b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f289752c;

    public b(RootFlow rootFlow, Integer num, boolean z, int i) {
        num = (i & 2) != 0 ? Integer.valueOf(R$layout.base_flow_container) : num;
        z = (i & 16) != 0 ? true : z;
        Intrinsics.checkNotNullParameter(rootFlow, "rootFlow");
        this.f289750a = rootFlow;
        this.f289751b = num;
        this.f289752c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f289750a.equals(bVar.f289750a) && Intrinsics.f(this.f289751b, bVar.f289751b) && this.f289752c == bVar.f289752c;
    }

    public final int hashCode() {
        int iHashCode = this.f289750a.hashCode() * 31;
        Integer num = this.f289751b;
        return Boolean.hashCode(this.f289752c) + j6.a.c(j6.a.b(30, (iHashCode + (num == null ? 0 : num.hashCode())) * 31, 31), 31, true);
    }
}
