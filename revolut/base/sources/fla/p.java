package fla;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class p<T> {

    @NotNull
    public static final o Companion = new o();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final PluginGeneratedSerialDescriptor f135938c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f135939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f135940b;

    static {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.product_catalogue.impl.data.ProductPropertyDto", null, 2);
        pluginGeneratedSerialDescriptor.j("code", false);
        pluginGeneratedSerialDescriptor.j("values", false);
        f135938c = pluginGeneratedSerialDescriptor;
    }

    public /* synthetic */ p(int i, String str, List list) {
        if (3 != (i & 3)) {
            j1.f(f135938c, i, 3);
            throw null;
        }
        this.f135939a = str;
        this.f135940b = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f135939a, pVar.f135939a) && Intrinsics.f(this.f135940b, pVar.f135940b);
    }

    public final int hashCode() {
        return this.f135940b.hashCode() + (this.f135939a.hashCode() * 31);
    }
}
