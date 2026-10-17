package kotlin.reflect.jvm.internal.impl.km;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmTypeParameterExtension;
import kotlin.reflect.jvm.internal.impl.km.internal.extensions.MetadataExtensions;
import org.jetbrains.annotations.NotNull;
import zhm.w;

/* JADX INFO: loaded from: classes14.dex */
public final class KmTypeParameter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f186807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f186808b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f186809c;
    public final KmVariance d;
    public final ArrayList e;
    public final ArrayList f;

    public KmTypeParameter(int i, @NotNull String name, int i2, @NotNull KmVariance variance) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(variance, "variance");
        this.f186807a = i;
        this.f186808b = name;
        this.f186809c = i2;
        this.d = variance;
        this.e = new ArrayList(1);
        List<MetadataExtensions> iNSTANCES$kotlin_metadata = MetadataExtensions.Companion.getINSTANCES$kotlin_metadata();
        ArrayList arrayList = new ArrayList(w.t(iNSTANCES$kotlin_metadata, 10));
        Iterator<T> it8 = iNSTANCES$kotlin_metadata.iterator();
        while (it8.hasNext()) {
            arrayList.add(((MetadataExtensions) it8.next()).createTypeParameterExtension());
        }
        this.f = arrayList;
    }

    @NotNull
    public final List<KmTypeParameterExtension> getExtensions$kotlin_metadata() {
        return this.f;
    }

    public final int getFlags$kotlin_metadata() {
        return this.f186807a;
    }

    public final int getId() {
        return this.f186809c;
    }

    @NotNull
    public final String getName() {
        return this.f186808b;
    }

    @NotNull
    public final List<KmType> getUpperBounds() {
        return this.e;
    }

    @NotNull
    public final KmVariance getVariance() {
        return this.d;
    }

    public final void setFlags$kotlin_metadata(int i) {
        this.f186807a = i;
    }
}
