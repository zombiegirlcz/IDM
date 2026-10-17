package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import kotlin.reflect.jvm.internal.impl.protobuf.Internal;

/* JADX INFO: loaded from: classes13.dex */
public final class a extends Flags.FlagField {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Internal.EnumLite[] f187407a;

    /* JADX WARN: Illegal instructions before constructor call */
    public a(int i, Internal.EnumLite[] enumLiteArr) {
        if (enumLiteArr == null) {
            throw new IllegalArgumentException("Argument for @NotNull parameter 'enumEntries' of kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags$EnumLiteFlagField.bitWidth must not be null");
        }
        int i2 = 1;
        int length = enumLiteArr.length - 1;
        if (length != 0) {
            for (int i3 = 31; i3 >= 0; i3--) {
                if (((1 << i3) & length) != 0) {
                    i2 = 1 + i3;
                }
            }
            throw new IllegalStateException("Empty enum: " + enumLiteArr.getClass());
        }
        super(i, i2);
        this.f187407a = enumLiteArr;
    }

    @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField
    public final Object get(int i) {
        int i2 = (1 << this.bitWidth) - 1;
        int i3 = this.offset;
        int i5 = (i & (i2 << i3)) >> i3;
        for (Internal.EnumLite enumLite : this.f187407a) {
            if (enumLite.getNumber() == i5) {
                return enumLite;
            }
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField
    public final int toFlags(Object obj2) {
        return ((Internal.EnumLite) obj2).getNumber() << this.offset;
    }
}
