package kotlin.reflect.jvm.internal.impl.km;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmEnumEntryExtension;
import kotlin.reflect.jvm.internal.impl.km.internal.extensions.MetadataExtensions;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class KmEnumEntry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f186781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f186782b;

    public KmEnumEntry(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f186781a = name;
        this.f186782b = new ArrayList(0);
        List<MetadataExtensions> iNSTANCES$kotlin_metadata = MetadataExtensions.Companion.getINSTANCES$kotlin_metadata();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it8 = iNSTANCES$kotlin_metadata.iterator();
        while (it8.hasNext()) {
            KmEnumEntryExtension kmEnumEntryExtensionCreateEnumEntryExtension = ((MetadataExtensions) it8.next()).createEnumEntryExtension();
            if (kmEnumEntryExtensionCreateEnumEntryExtension != null) {
                arrayList.add(kmEnumEntryExtensionCreateEnumEntryExtension);
            }
        }
    }

    @NotNull
    public final List<KmAnnotation> getAnnotations() {
        return this.f186782b;
    }

    @NotNull
    public String toString() {
        return this.f186781a;
    }
}
