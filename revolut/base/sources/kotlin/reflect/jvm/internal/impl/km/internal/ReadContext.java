package kotlin.reflect.jvm.internal.impl.km.internal;

import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.km.internal.extensions.MetadataExtensions;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable;
import org.jetbrains.annotations.NotNull;
import zhm.f0;

/* JADX INFO: loaded from: classes14.dex */
public final class ReadContext {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NameResolver f186829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TypeTable f186830b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final VersionRequirementTable f186831c;
    public final boolean d;
    public final ReadContext e;
    public final List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LinkedHashMap f186832g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f186833h;

    public ReadContext(@NotNull NameResolver strings, @NotNull TypeTable types, @NotNull VersionRequirementTable versionRequirements, boolean z, ReadContext readContext, @NotNull List<? extends Object> contextExtensions) {
        Intrinsics.checkNotNullParameter(strings, "strings");
        Intrinsics.checkNotNullParameter(types, "types");
        Intrinsics.checkNotNullParameter(versionRequirements, "versionRequirements");
        Intrinsics.checkNotNullParameter(contextExtensions, "contextExtensions");
        this.f186829a = strings;
        this.f186830b = types;
        this.f186831c = versionRequirements;
        this.d = z;
        this.e = readContext;
        this.f = contextExtensions;
        this.f186832g = new LinkedHashMap();
        this.f186833h = MetadataExtensions.Companion.getINSTANCES$kotlin_metadata();
    }

    @NotNull
    public final String className$kotlin_metadata(int i) {
        return ReadUtilsKt.getClassName(this.f186829a, i);
    }

    @NotNull
    public final String get(int i) {
        return this.f186829a.getString(i);
    }

    @NotNull
    public final List<MetadataExtensions> getExtensions$kotlin_metadata() {
        return this.f186833h;
    }

    public final boolean getIgnoreUnknownVersionRequirements$kotlin_metadata() {
        return this.d;
    }

    @NotNull
    public final NameResolver getStrings() {
        return this.f186829a;
    }

    public final Integer getTypeParameterId$kotlin_metadata(int i) {
        Integer num = (Integer) this.f186832g.get(Integer.valueOf(i));
        if (num != null) {
            return num;
        }
        ReadContext readContext = this.e;
        if (readContext != null) {
            return readContext.getTypeParameterId$kotlin_metadata(i);
        }
        return null;
    }

    @NotNull
    public final TypeTable getTypes() {
        return this.f186830b;
    }

    @NotNull
    public final VersionRequirementTable getVersionRequirements$kotlin_metadata() {
        return this.f186831c;
    }

    @NotNull
    public final ReadContext withTypeParameters$kotlin_metadata(@NotNull List<ProtoBuf.TypeParameter> typeParameters) {
        Intrinsics.checkNotNullParameter(typeParameters, "typeParameters");
        ReadContext readContext = new ReadContext(this.f186829a, this.f186830b, this.f186831c, this.d, this, this.f);
        for (ProtoBuf.TypeParameter typeParameter : typeParameters) {
            readContext.f186832g.put(Integer.valueOf(typeParameter.getName()), Integer.valueOf(typeParameter.getId()));
        }
        return readContext;
    }

    public ReadContext(NameResolver nameResolver, TypeTable typeTable, VersionRequirementTable versionRequirementTable, boolean z, ReadContext readContext, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(nameResolver, typeTable, versionRequirementTable, z, (i & 16) != 0 ? null : readContext, (i & 32) != 0 ? f0.f322471a : list);
    }
}
