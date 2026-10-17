package cqh;

import com.revolut.data.model.Data;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import uqh.z;

/* JADX INFO: loaded from: classes10.dex */
public final class g implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f108105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f108106b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final poh.i f108107c;
    public final Data d;

    public g(z extensionState, Map selections, poh.i config, Data data) {
        Intrinsics.checkNotNullParameter(extensionState, "extensionState");
        Intrinsics.checkNotNullParameter(selections, "selections");
        Intrinsics.checkNotNullParameter(config, "config");
        this.f108105a = extensionState;
        this.f108106b = selections;
        this.f108107c = config;
        this.d = data;
    }

    public static g a(g gVar, z extensionState, Map selections, poh.i config, Data data, int i) {
        if ((i & 1) != 0) {
            extensionState = gVar.f108105a;
        }
        if ((i & 2) != 0) {
            selections = gVar.f108106b;
        }
        if ((i & 4) != 0) {
            config = gVar.f108107c;
        }
        if ((i & 8) != 0) {
            data = gVar.d;
        }
        gVar.getClass();
        Intrinsics.checkNotNullParameter(extensionState, "extensionState");
        Intrinsics.checkNotNullParameter(selections, "selections");
        Intrinsics.checkNotNullParameter(config, "config");
        return new g(extensionState, selections, config, data);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f108105a, gVar.f108105a) && Intrinsics.f(this.f108106b, gVar.f108106b) && Intrinsics.f(this.f108107c, gVar.f108107c) && Intrinsics.f(this.d, gVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.f108107c.hashCode() + p.a.e(this.f108105a.hashCode() * 31, 31, this.f108106b)) * 31;
        Data data = this.d;
        return iHashCode + (data == null ? 0 : data.hashCode());
    }
}
