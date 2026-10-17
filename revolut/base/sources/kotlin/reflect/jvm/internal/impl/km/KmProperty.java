package kotlin.reflect.jvm.internal.impl.km;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.jvm.internal.z;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.km.internal.BooleanFlagDelegate;
import kotlin.reflect.jvm.internal.impl.km.internal.FlagDelegatesImplKt;
import kotlin.reflect.jvm.internal.impl.km.internal.FlagImpl;
import kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmPropertyExtension;
import kotlin.reflect.jvm.internal.impl.km.internal.extensions.MetadataExtensions;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import org.jetbrains.annotations.NotNull;
import v0.a;
import zhm.w;

/* JADX INFO: loaded from: classes14.dex */
public final class KmProperty {
    public static final /* synthetic */ KProperty[] o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f186790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f186791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final KmPropertyAccessorAttributes f186792c;
    public final KmPropertyAccessorAttributes d;
    public final ArrayList e;
    public KmType f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f186793g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f186794h;
    public KmValueParameter i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f186795j;
    public final ArrayList k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f186796l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayList f186797m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ArrayList f186798n;
    public KmType returnType;

    static {
        z zVar = new z(KmProperty.class, "_hasSetter", "get_hasSetter()Z", 0);
        p0 p0Var = o0.f186429a;
        o = new KProperty[]{p0Var.f(zVar), a.s(KmProperty.class, "_hasGetter", "get_hasGetter()Z", 0, p0Var)};
    }

    public KmProperty(int i, @NotNull String name, int i2, int i3) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f186790a = i;
        this.f186791b = name;
        Flags.BooleanFlagField HAS_SETTER = Flags.HAS_SETTER;
        Intrinsics.checkNotNullExpressionValue(HAS_SETTER, "HAS_SETTER");
        BooleanFlagDelegate<KmProperty> booleanFlagDelegatePropertyBooleanFlag = FlagDelegatesImplKt.propertyBooleanFlag(new FlagImpl(HAS_SETTER));
        Flags.BooleanFlagField HAS_GETTER = Flags.HAS_GETTER;
        Intrinsics.checkNotNullExpressionValue(HAS_GETTER, "HAS_GETTER");
        BooleanFlagDelegate<KmProperty> booleanFlagDelegatePropertyBooleanFlag2 = FlagDelegatesImplKt.propertyBooleanFlag(new FlagImpl(HAS_GETTER));
        KmPropertyAccessorAttributes kmPropertyAccessorAttributes = new KmPropertyAccessorAttributes(i2);
        KProperty[] kPropertyArr = o;
        booleanFlagDelegatePropertyBooleanFlag2.setValue(this, kPropertyArr[1], true);
        this.f186792c = kmPropertyAccessorAttributes;
        this.d = booleanFlagDelegatePropertyBooleanFlag.getValue(this, kPropertyArr[0]) ? new KmPropertyAccessorAttributes(i3) : null;
        this.e = new ArrayList(0);
        this.f186793g = new ArrayList(0);
        new ArrayList(0);
        this.f186794h = new ArrayList();
        this.f186795j = new ArrayList(0);
        this.k = new ArrayList(0);
        this.f186796l = new ArrayList(0);
        this.f186797m = new ArrayList(0);
        List<MetadataExtensions> iNSTANCES$kotlin_metadata = MetadataExtensions.Companion.getINSTANCES$kotlin_metadata();
        ArrayList arrayList = new ArrayList(w.t(iNSTANCES$kotlin_metadata, 10));
        Iterator<T> it8 = iNSTANCES$kotlin_metadata.iterator();
        while (it8.hasNext()) {
            arrayList.add(((MetadataExtensions) it8.next()).createPropertyExtension());
        }
        this.f186798n = arrayList;
    }

    @NotNull
    public final List<KmAnnotation> getAnnotations() {
        return this.k;
    }

    @NotNull
    public final List<KmAnnotation> getBackingFieldAnnotations() {
        return this.f186796l;
    }

    @NotNull
    public final List<KmValueParameter> getContextParameters() {
        return this.f186794h;
    }

    @NotNull
    public final List<KmAnnotation> getDelegateFieldAnnotations() {
        return this.f186797m;
    }

    @NotNull
    public final List<KmAnnotation> getExtensionReceiverParameterAnnotations() {
        return this.f186793g;
    }

    @NotNull
    public final List<KmPropertyExtension> getExtensions$kotlin_metadata() {
        return this.f186798n;
    }

    public final int getFlags$kotlin_metadata() {
        return this.f186790a;
    }

    @NotNull
    public final KmPropertyAccessorAttributes getGetter() {
        return this.f186792c;
    }

    @NotNull
    public final String getName() {
        return this.f186791b;
    }

    public final KmType getReceiverParameterType() {
        return this.f;
    }

    @NotNull
    public final KmType getReturnType() {
        KmType kmType = this.returnType;
        if (kmType != null) {
            return kmType;
        }
        Intrinsics.r("returnType");
        throw null;
    }

    public final KmPropertyAccessorAttributes getSetter() {
        return this.d;
    }

    public final KmValueParameter getSetterParameter() {
        return this.i;
    }

    @NotNull
    public final List<KmTypeParameter> getTypeParameters() {
        return this.e;
    }

    @NotNull
    public final List<KmVersionRequirement> getVersionRequirements() {
        return this.f186795j;
    }

    public final void setFlags$kotlin_metadata(int i) {
        this.f186790a = i;
    }

    public final void setReceiverParameterType(KmType kmType) {
        this.f = kmType;
    }

    public final void setReturnType(@NotNull KmType kmType) {
        Intrinsics.checkNotNullParameter(kmType, "<set-?>");
        this.returnType = kmType;
    }

    public final void setSetterParameter(KmValueParameter kmValueParameter) {
        this.i = kmValueParameter;
    }
}
