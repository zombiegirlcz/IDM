package bo5;

import kn5.c;
import kn5.e;
import kn5.f;
import kn5.h;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements rn5.a {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final IntRange f17287b = new IntRange(32, 44, 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f17288c = 32;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mn5.b f17289a;

    public b(mn5.b base58Codec) {
        Intrinsics.checkNotNullParameter(base58Codec, "base58Codec");
        this.f17289a = base58Codec;
    }

    @Override // rn5.a
    public final f a(kn5.a params) {
        Intrinsics.checkNotNullParameter(params, "params");
        String str = params.f185996a;
        if (str.length() == 0) {
            return new e(h.f186003a);
        }
        IntRange intRange = f17287b;
        int i = intRange.f186448a;
        int i2 = intRange.f186449b;
        int length = str.length();
        if (i > length || length > i2) {
            return new e(null);
        }
        byte[] bArrA = this.f17289a.a(str, "123456789ABCDEFGHJKLMNPQRSTUVWXYZabcdefghijkmnopqrstuvwxyz");
        return (bArrA == null || bArrA.length != f17288c) ? new e(null) : c.f186000a;
    }
}
