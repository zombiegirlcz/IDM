package kotlin.reflect.jvm.internal.impl.metadata.builtins;

import java.io.DataInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.l0;
import zhm.w;

/* JADX INFO: loaded from: classes13.dex */
public final class BuiltInsBinaryVersion extends BinaryVersion {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final BuiltInsBinaryVersion INSTANCE = new BuiltInsBinaryVersion(1, 0, 7);

    @NotNull
    public static final BuiltInsBinaryVersion INVALID_VERSION = new BuiltInsBinaryVersion(new int[0]);

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        @NotNull
        public final BuiltInsBinaryVersion readFrom(@NotNull InputStream stream) {
            Intrinsics.checkNotNullParameter(stream, "stream");
            DataInputStream dataInputStream = new DataInputStream(stream);
            IntRange intRange = new IntRange(1, dataInputStream.readInt(), 1);
            ArrayList arrayList = new ArrayList(w.t(intRange, 10));
            Iterator<Integer> it8 = intRange.iterator();
            while (it8.hasNext()) {
                ((l0) it8).nextInt();
                arrayList.add(Integer.valueOf(dataInputStream.readInt()));
            }
            int[] iArrC1 = d0.c1(arrayList);
            return new BuiltInsBinaryVersion(Arrays.copyOf(iArrC1, iArrC1.length));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuiltInsBinaryVersion(@NotNull int... numbers) {
        super(Arrays.copyOf(numbers, numbers.length));
        Intrinsics.checkNotNullParameter(numbers, "numbers");
    }

    public boolean isCompatibleWithCurrentCompilerVersion() {
        BuiltInsBinaryVersion ourVersion = INSTANCE;
        Intrinsics.checkNotNullParameter(ourVersion, "ourVersion");
        int i = this.f187395c;
        int i2 = this.f187394b;
        return i2 == 0 ? ourVersion.f187394b == 0 && i == ourVersion.f187395c : i2 == ourVersion.f187394b && i <= ourVersion.f187395c;
    }
}
