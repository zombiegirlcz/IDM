package kotlin.reflect.jvm.internal.impl.resolve.constants;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;
import yrb.n;

/* JADX INFO: loaded from: classes14.dex */
public final class TypedArrayValue extends ArrayValue {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final KotlinType f187591c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TypedArrayValue(@NotNull List<? extends ConstantValue<?>> value, @NotNull KotlinType type) {
        super(value, new n(type, 5));
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f187591c = type;
    }

    @NotNull
    public final KotlinType getType() {
        return this.f187591c;
    }
}
