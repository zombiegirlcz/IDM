package kotlin.reflect.jvm.internal.impl.km;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmClassExtension;
import kotlin.reflect.jvm.internal.impl.km.internal.extensions.MetadataExtensions;
import org.jetbrains.annotations.NotNull;
import zhm.w;

/* JADX INFO: loaded from: classes14.dex */
public final class KmClass implements KmDeclarationContainer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f186759a;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public KmType f186765l;
    public String name;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ArrayList f186768p;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f186760b = new ArrayList(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f186761c = new ArrayList(1);
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList(0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f186762g = new ArrayList(1);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f186763h = new ArrayList(0);
    public final ArrayList i = new ArrayList(0);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f186764j = new ArrayList(0);
    public final ArrayList k = new ArrayList(0);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayList f186766m = new ArrayList(0);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ArrayList f186767n = new ArrayList(0);
    public final ArrayList o = new ArrayList(0);

    public KmClass() {
        List<MetadataExtensions> iNSTANCES$kotlin_metadata = MetadataExtensions.Companion.getINSTANCES$kotlin_metadata();
        ArrayList arrayList = new ArrayList(w.t(iNSTANCES$kotlin_metadata, 10));
        Iterator<T> it8 = iNSTANCES$kotlin_metadata.iterator();
        while (it8.hasNext()) {
            arrayList.add(((MetadataExtensions) it8.next()).createClassExtension());
        }
        this.f186768p = arrayList;
    }

    @NotNull
    public final List<KmAnnotation> getAnnotations() {
        return this.f186766m;
    }

    @NotNull
    public final List<KmConstructor> getConstructors() {
        return this.f186762g;
    }

    @NotNull
    public final List<KmType> getContextReceiverTypes() {
        return this.f186767n;
    }

    @NotNull
    public final List<String> getEnumEntries() {
        return this.i;
    }

    @NotNull
    public final List<KmClassExtension> getExtensions$kotlin_metadata() {
        return this.f186768p;
    }

    public final int getFlags$kotlin_metadata() {
        return this.f186759a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.km.KmDeclarationContainer
    @NotNull
    public List<KmFunction> getFunctions() {
        return this.d;
    }

    public final KmType getInlineClassUnderlyingType() {
        return this.f186765l;
    }

    @NotNull
    public final List<KmEnumEntry> getKmEnumEntries() {
        return this.f186764j;
    }

    @NotNull
    public final String getName() {
        String str = this.name;
        if (str != null) {
            return str;
        }
        Intrinsics.r("name");
        throw null;
    }

    @NotNull
    public final List<String> getNestedClasses() {
        return this.f186763h;
    }

    @Override // kotlin.reflect.jvm.internal.impl.km.KmDeclarationContainer
    @NotNull
    public List<KmProperty> getProperties() {
        return this.e;
    }

    @NotNull
    public final List<String> getSealedSubclasses() {
        return this.k;
    }

    @NotNull
    public final List<KmType> getSupertypes() {
        return this.f186761c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.km.KmDeclarationContainer
    @NotNull
    public List<KmTypeAlias> getTypeAliases() {
        return this.f;
    }

    @NotNull
    public final List<KmTypeParameter> getTypeParameters() {
        return this.f186760b;
    }

    @NotNull
    public final List<KmVersionRequirement> getVersionRequirements() {
        return this.o;
    }

    public final void setCompanionObject(String str) {
    }

    public final void setFlags$kotlin_metadata(int i) {
        this.f186759a = i;
    }

    public final void setInlineClassUnderlyingPropertyName(String str) {
    }

    public final void setInlineClassUnderlyingType(KmType kmType) {
        this.f186765l = kmType;
    }

    public final void setName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.name = str;
    }
}
