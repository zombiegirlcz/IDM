package kotlin.reflect.jvm.internal.impl.km;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmValueParameterExtension;
import kotlin.reflect.jvm.internal.impl.km.internal.extensions.MetadataExtensions;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class KmValueParameter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f186812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f186813b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public KmType f186814c;
    public KmAnnotationArgument d;
    public final ArrayList e;
    public KmType type;

    public KmValueParameter(int i, @NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f186812a = i;
        this.f186813b = name;
        this.e = new ArrayList(0);
        List<MetadataExtensions> iNSTANCES$kotlin_metadata = MetadataExtensions.Companion.getINSTANCES$kotlin_metadata();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it8 = iNSTANCES$kotlin_metadata.iterator();
        while (it8.hasNext()) {
            KmValueParameterExtension kmValueParameterExtensionCreateValueParameterExtension = ((MetadataExtensions) it8.next()).createValueParameterExtension();
            if (kmValueParameterExtensionCreateValueParameterExtension != null) {
                arrayList.add(kmValueParameterExtensionCreateValueParameterExtension);
            }
        }
    }

    public final KmAnnotationArgument getAnnotationParameterDefaultValue() {
        return this.d;
    }

    @NotNull
    public final List<KmAnnotation> getAnnotations() {
        return this.e;
    }

    public final int getFlags$kotlin_metadata() {
        return this.f186812a;
    }

    @NotNull
    public final String getName() {
        return this.f186813b;
    }

    @NotNull
    public final KmType getType() {
        KmType kmType = this.type;
        if (kmType != null) {
            return kmType;
        }
        Intrinsics.r("type");
        throw null;
    }

    public final KmType getVarargElementType() {
        return this.f186814c;
    }

    public final void setAnnotationParameterDefaultValue(KmAnnotationArgument kmAnnotationArgument) {
        this.d = kmAnnotationArgument;
    }

    public final void setFlags$kotlin_metadata(int i) {
        this.f186812a = i;
    }

    public final void setType(@NotNull KmType kmType) {
        Intrinsics.checkNotNullParameter(kmType, "<set-?>");
        this.type = kmType;
    }

    public final void setVarargElementType(KmType kmType) {
        this.f186814c = kmType;
    }
}
