package kotlin.reflect.jvm.internal.impl.km;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmTypeExtension;
import kotlin.reflect.jvm.internal.impl.km.internal.extensions.MetadataExtensions;
import org.jetbrains.annotations.NotNull;
import zhm.w;

/* JADX INFO: loaded from: classes14.dex */
public final class KmType {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f186801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f186802b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public KmType f186803c;
    public KmClassifier classifier;
    public KmType d;
    public KmFlexibleTypeUpperBound e;
    public final ArrayList f;

    public KmType(int i) {
        this.f186801a = i;
        this.f186802b = new ArrayList(0);
        List<MetadataExtensions> iNSTANCES$kotlin_metadata = MetadataExtensions.Companion.getINSTANCES$kotlin_metadata();
        ArrayList arrayList = new ArrayList(w.t(iNSTANCES$kotlin_metadata, 10));
        Iterator<T> it8 = iNSTANCES$kotlin_metadata.iterator();
        while (it8.hasNext()) {
            arrayList.add(((MetadataExtensions) it8.next()).createTypeExtension());
        }
        this.f = arrayList;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!KmType.class.equals(obj2 != null ? obj2.getClass() : null)) {
            return false;
        }
        Intrinsics.i(obj2, "null cannot be cast to non-null type kotlin.metadata.KmType");
        KmType kmType = (KmType) obj2;
        return this.f186801a == kmType.f186801a && Intrinsics.f(getClassifier(), kmType.getClassifier()) && Intrinsics.f(this.f186802b, kmType.f186802b) && Intrinsics.f(this.d, kmType.d) && Intrinsics.f(this.f186803c, kmType.f186803c) && Intrinsics.f(this.e, kmType.e) && Intrinsics.f(this.f, kmType.f);
    }

    public final KmType getAbbreviatedType() {
        return this.f186803c;
    }

    @NotNull
    public final List<KmTypeProjection> getArguments() {
        return this.f186802b;
    }

    @NotNull
    public final KmClassifier getClassifier() {
        KmClassifier kmClassifier = this.classifier;
        if (kmClassifier != null) {
            return kmClassifier;
        }
        Intrinsics.r("classifier");
        throw null;
    }

    @NotNull
    public final List<KmTypeExtension> getExtensions$kotlin_metadata() {
        return this.f;
    }

    public final int getFlags$kotlin_metadata() {
        return this.f186801a;
    }

    public final KmFlexibleTypeUpperBound getFlexibleTypeUpperBound() {
        return this.e;
    }

    public final KmType getOuterType() {
        return this.d;
    }

    public int hashCode() {
        return this.f186802b.hashCode() + ((getClassifier().hashCode() + (this.f186801a * 31)) * 31);
    }

    public final void setAbbreviatedType(KmType kmType) {
        this.f186803c = kmType;
    }

    public final void setClassifier(@NotNull KmClassifier kmClassifier) {
        Intrinsics.checkNotNullParameter(kmClassifier, "<set-?>");
        this.classifier = kmClassifier;
    }

    public final void setFlags$kotlin_metadata(int i) {
        this.f186801a = i;
    }

    public final void setFlexibleTypeUpperBound(KmFlexibleTypeUpperBound kmFlexibleTypeUpperBound) {
        this.e = kmFlexibleTypeUpperBound;
    }

    public final void setOuterType(KmType kmType) {
        this.d = kmType;
    }

    public KmType() {
        this(0);
    }
}
