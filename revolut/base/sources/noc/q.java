package noc;

import com.revolut.feature.wealth.models.robo.Template;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Template f217993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xdh.b f217994b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f217995c;
    public final p d;
    public final int e;

    public q(Template template, xdh.b rebalanceStatus, List assetAllocations, p allocationType, int i) {
        Intrinsics.checkNotNullParameter(template, "template");
        Intrinsics.checkNotNullParameter(rebalanceStatus, "rebalanceStatus");
        Intrinsics.checkNotNullParameter(assetAllocations, "assetAllocations");
        Intrinsics.checkNotNullParameter(allocationType, "allocationType");
        this.f217993a = template;
        this.f217994b = rebalanceStatus;
        this.f217995c = assetAllocations;
        this.d = allocationType;
        this.e = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f217993a, qVar.f217993a) && this.f217994b == qVar.f217994b && Intrinsics.f(this.f217995c, qVar.f217995c) && this.d == qVar.d && this.e == qVar.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + ((this.d.hashCode() + p.a.d((this.f217994b.hashCode() + (this.f217993a.hashCode() * 31)) * 31, 31, this.f217995c)) * 31);
    }
}
