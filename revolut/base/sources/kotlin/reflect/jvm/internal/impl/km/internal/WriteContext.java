package kotlin.reflect.jvm.internal.impl.km.internal;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.km.internal.extensions.MetadataExtensions;
import kotlin.reflect.jvm.internal.impl.metadata.serialization.MutableVersionRequirementTable;
import kotlin.reflect.jvm.internal.impl.metadata.serialization.StringTable;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public class WriteContext {
    public final int get(@NotNull String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        throw null;
    }

    public final int getClassName$kotlin_metadata(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return WriteUtilsKt.getClassNameIndex(null, name);
    }

    @NotNull
    public final List<MetadataExtensions> getExtensions$kotlin_metadata() {
        return null;
    }

    @NotNull
    public final StringTable getStrings() {
        return null;
    }

    @NotNull
    public final MutableVersionRequirementTable getVersionRequirements$kotlin_metadata() {
        return null;
    }
}
