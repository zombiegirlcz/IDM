package kotlin.reflect.jvm.internal.impl.km.internal;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class FlagImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f186826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f186827b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f186828c;

    public FlagImpl(int i, int i2, int i3) {
        this.f186826a = i;
        this.f186827b = i2;
        this.f186828c = i3;
    }

    public final int getBitWidth$kotlin_metadata() {
        return this.f186827b;
    }

    public final int getOffset$kotlin_metadata() {
        return this.f186826a;
    }

    public final int getValue$kotlin_metadata() {
        return this.f186828c;
    }

    public final boolean invoke(int i) {
        return ((i >>> this.f186826a) & ((1 << this.f186827b) - 1)) == this.f186828c;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FlagImpl(@NotNull Flags.FlagField<?> field, int i) {
        this(field.offset, field.bitWidth, i);
        Intrinsics.checkNotNullParameter(field, "field");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FlagImpl(@NotNull Flags.BooleanFlagField field) {
        this(field, 1);
        Intrinsics.checkNotNullParameter(field, "field");
    }
}
