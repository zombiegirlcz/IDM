package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public interface TypeMappingConfiguration<T> {
    @NotNull
    KotlinType commonSupertype(@NotNull Collection<KotlinType> collection);

    KotlinBuiltIns getBuiltIns();

    String getPredefinedFullInternalNameForClass(@NotNull ClassDescriptor classDescriptor);

    String getPredefinedInternalNameForClass(@NotNull ClassDescriptor classDescriptor);

    T getPredefinedTypeForClass(@NotNull ClassDescriptor classDescriptor);

    KotlinType preprocessType(@NotNull KotlinType kotlinType);

    void processErrorType(@NotNull KotlinType kotlinType, @NotNull ClassDescriptor classDescriptor);
}
