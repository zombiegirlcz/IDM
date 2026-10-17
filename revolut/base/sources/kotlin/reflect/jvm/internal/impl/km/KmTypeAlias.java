package kotlin.reflect.jvm.internal.impl.km;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmTypeAliasExtension;
import kotlin.reflect.jvm.internal.impl.km.internal.extensions.MetadataExtensions;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class KmTypeAlias {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f186804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f186805b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f186806c;
    public final ArrayList d;
    public KmType expandedType;
    public KmType underlyingType;

    public KmTypeAlias(int i, @NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f186804a = i;
        this.f186805b = new ArrayList(0);
        this.f186806c = new ArrayList(0);
        this.d = new ArrayList(0);
        List<MetadataExtensions> iNSTANCES$kotlin_metadata = MetadataExtensions.Companion.getINSTANCES$kotlin_metadata();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it8 = iNSTANCES$kotlin_metadata.iterator();
        while (it8.hasNext()) {
            KmTypeAliasExtension kmTypeAliasExtensionCreateTypeAliasExtension = ((MetadataExtensions) it8.next()).createTypeAliasExtension();
            if (kmTypeAliasExtensionCreateTypeAliasExtension != null) {
                arrayList.add(kmTypeAliasExtensionCreateTypeAliasExtension);
            }
        }
    }

    @NotNull
    public final List<KmAnnotation> getAnnotations() {
        return this.f186806c;
    }

    public final int getFlags$kotlin_metadata() {
        return this.f186804a;
    }

    @NotNull
    public final List<KmTypeParameter> getTypeParameters() {
        return this.f186805b;
    }

    @NotNull
    public final List<KmVersionRequirement> getVersionRequirements() {
        return this.d;
    }

    public final void setExpandedType(@NotNull KmType kmType) {
        Intrinsics.checkNotNullParameter(kmType, "<set-?>");
        this.expandedType = kmType;
    }

    public final void setFlags$kotlin_metadata(int i) {
        this.f186804a = i;
    }

    public final void setUnderlyingType(@NotNull KmType kmType) {
        Intrinsics.checkNotNullParameter(kmType, "<set-?>");
        this.underlyingType = kmType;
    }
}
