package kotlin.reflect.jvm.internal.impl.descriptors.deserialization;

import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public interface ClassDescriptorFactory {
    ClassDescriptor createClass(@NotNull ClassId classId);

    @NotNull
    Collection<ClassDescriptor> getAllContributedClassesIfPossible(@NotNull FqName fqName);

    boolean shouldCreateClass(@NotNull FqName fqName, @NotNull Name name);
}
