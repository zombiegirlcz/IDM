package kotlin.reflect.jvm.internal.impl.km;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmConstructorExtension;
import kotlin.reflect.jvm.internal.impl.km.internal.extensions.MetadataExtensions;
import org.jetbrains.annotations.NotNull;
import zhm.w;

/* JADX INFO: loaded from: classes14.dex */
public final class KmConstructor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f186773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f186774b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f186775c;
    public final ArrayList d;
    public final ArrayList e;

    public KmConstructor(int i) {
        this.f186773a = i;
        this.f186774b = new ArrayList();
        this.f186775c = new ArrayList(0);
        this.d = new ArrayList(0);
        List<MetadataExtensions> iNSTANCES$kotlin_metadata = MetadataExtensions.Companion.getINSTANCES$kotlin_metadata();
        ArrayList arrayList = new ArrayList(w.t(iNSTANCES$kotlin_metadata, 10));
        Iterator<T> it8 = iNSTANCES$kotlin_metadata.iterator();
        while (it8.hasNext()) {
            arrayList.add(((MetadataExtensions) it8.next()).createConstructorExtension());
        }
        this.e = arrayList;
    }

    @NotNull
    public final List<KmAnnotation> getAnnotations() {
        return this.d;
    }

    @NotNull
    public final List<KmConstructorExtension> getExtensions$kotlin_metadata() {
        return this.e;
    }

    public final int getFlags$kotlin_metadata() {
        return this.f186773a;
    }

    @NotNull
    public final List<KmValueParameter> getValueParameters() {
        return this.f186774b;
    }

    @NotNull
    public final List<KmVersionRequirement> getVersionRequirements() {
        return this.f186775c;
    }

    public final void setFlags$kotlin_metadata(int i) {
        this.f186773a = i;
    }

    public KmConstructor() {
        this(0);
    }
}
