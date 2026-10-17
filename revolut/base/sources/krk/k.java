package krk;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kr.h2;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes12.dex */
@mlm.g
public final class k<T> {

    @NotNull
    public static final h Companion = new h();
    public static final Lazy[] e;
    public static final PluginGeneratedSerialDescriptor f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f188889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f188890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f188891c;
    public final Object d;

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        e = new Lazy[]{yhm.j.c(kVar, new h2(7)), null, yhm.j.c(kVar, new h2(8)), null};
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.retail.feature.stockdetails.impl.data.network.model.data_points.AssetSeriesDataDto.PointDto", null, 4);
        pluginGeneratedSerialDescriptor.j("type", false);
        pluginGeneratedSerialDescriptor.j("fiscalYear", false);
        pluginGeneratedSerialDescriptor.j("fiscalQuarter", false);
        pluginGeneratedSerialDescriptor.j("value", true);
        f = pluginGeneratedSerialDescriptor;
    }

    public /* synthetic */ k(int i, j jVar, int i2, i iVar, Object obj2) {
        if (7 != (i & 7)) {
            j1.f(f, i, 7);
            throw null;
        }
        this.f188889a = jVar;
        this.f188890b = i2;
        this.f188891c = iVar;
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = obj2;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return this.f188889a == kVar.f188889a && this.f188890b == kVar.f188890b && this.f188891c == kVar.f188891c && Intrinsics.f(this.d, kVar.d);
    }

    public final int hashCode() {
        int iB = j6.a.b(this.f188890b, this.f188889a.hashCode() * 31, 31);
        i iVar = this.f188891c;
        int iHashCode = (iB + (iVar == null ? 0 : iVar.hashCode())) * 31;
        Object obj2 = this.d;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public k(j type, int i, i iVar, Object obj2) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f188889a = type;
        this.f188890b = i;
        this.f188891c = iVar;
        this.d = obj2;
    }
}
