package kotlin.reflect.jvm.internal.impl.km;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmFunctionExtension;
import kotlin.reflect.jvm.internal.impl.km.internal.extensions.MetadataExtensions;
import org.jetbrains.annotations.NotNull;
import zhm.w;

/* JADX INFO: loaded from: classes14.dex */
public final class KmFunction {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f186785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f186786b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f186787c;
    public final ArrayList d;
    public final ArrayList e;
    public final ArrayList f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f186788g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f186789h;
    public KmType returnType;

    public KmFunction(int i, @NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f186785a = i;
        this.f186786b = new ArrayList(0);
        this.f186787c = new ArrayList(0);
        new ArrayList(0);
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f = new ArrayList(0);
        this.f186788g = new ArrayList(0);
        List<MetadataExtensions> iNSTANCES$kotlin_metadata = MetadataExtensions.Companion.getINSTANCES$kotlin_metadata();
        ArrayList arrayList = new ArrayList(w.t(iNSTANCES$kotlin_metadata, 10));
        Iterator<T> it8 = iNSTANCES$kotlin_metadata.iterator();
        while (it8.hasNext()) {
            arrayList.add(((MetadataExtensions) it8.next()).createFunctionExtension());
        }
        this.f186789h = arrayList;
    }

    @NotNull
    public final List<KmAnnotation> getAnnotations() {
        return this.f186788g;
    }

    @NotNull
    public final List<KmValueParameter> getContextParameters() {
        return this.e;
    }

    @NotNull
    public final List<KmAnnotation> getExtensionReceiverParameterAnnotations() {
        return this.f186787c;
    }

    @NotNull
    public final List<KmFunctionExtension> getExtensions$kotlin_metadata() {
        return this.f186789h;
    }

    public final int getFlags$kotlin_metadata() {
        return this.f186785a;
    }

    @NotNull
    public final List<KmTypeParameter> getTypeParameters() {
        return this.f186786b;
    }

    @NotNull
    public final List<KmValueParameter> getValueParameters() {
        return this.d;
    }

    @NotNull
    public final List<KmVersionRequirement> getVersionRequirements() {
        return this.f;
    }

    public final void setContract(KmContract kmContract) {
    }

    public final void setFlags$kotlin_metadata(int i) {
        this.f186785a = i;
    }

    public final void setReceiverParameterType(KmType kmType) {
    }

    public final void setReturnType(@NotNull KmType kmType) {
        Intrinsics.checkNotNullParameter(kmType, "<set-?>");
        this.returnType = kmType;
    }
}
