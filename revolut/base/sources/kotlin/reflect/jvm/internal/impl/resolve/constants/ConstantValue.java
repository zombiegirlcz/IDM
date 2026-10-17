package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public abstract class ConstantValue<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f187582a;

    public ConstantValue(T t2) {
        this.f187582a = t2;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        T value = getValue();
        ConstantValue constantValue = obj2 instanceof ConstantValue ? (ConstantValue) obj2 : null;
        return Intrinsics.f(value, constantValue != null ? constantValue.getValue() : null);
    }

    @NotNull
    public abstract KotlinType getType(@NotNull ModuleDescriptor moduleDescriptor);

    public T getValue() {
        return (T) this.f187582a;
    }

    public int hashCode() {
        T value = getValue();
        if (value != null) {
            return value.hashCode();
        }
        return 0;
    }

    @NotNull
    public String toString() {
        return String.valueOf(getValue());
    }
}
