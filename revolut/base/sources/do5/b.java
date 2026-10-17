package do5;

import java.util.Set;
import jli.g;
import kn5.c;
import kn5.e;
import kn5.f;
import kn5.h;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.f0;
import org.bouncycastle.jcajce.provider.digest.SHA256;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements rn5.a {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Set f116445b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mn5.b f116446a;

    static {
        String[] elements = {"tz1", "tz2", "tz3"};
        Intrinsics.checkNotNullParameter(elements, "elements");
        f116445b = d.y0(elements);
    }

    public b(mn5.b base58Codec) {
        Intrinsics.checkNotNullParameter(base58Codec, "base58Codec");
        this.f116446a = base58Codec;
    }

    @Override // rn5.a
    public final f a(kn5.a params) {
        byte[] bArrA;
        Intrinsics.checkNotNullParameter(params, "params");
        String str = params.f185996a;
        if (str.length() == 0) {
            return new e(h.f186003a);
        }
        if (f116445b.contains(f0.U0(3, str)) && (bArrA = this.f116446a.a(str, "123456789ABCDEFGHJKLMNPQRSTUVWXYZabcdefghijkmnopqrstuvwxyz")) != null) {
            int length = bArrA.length - 4;
            byte[] bArrL0 = d.l0(bArrA, kotlin.ranges.f.o(0, length));
            String strI = g.i(d.l0(bArrA, kotlin.ranges.f.o(length, bArrA.length)));
            byte[] bArrDigest = new SHA256.Digest().digest(bArrL0);
            Intrinsics.checkNotNullExpressionValue(bArrDigest, "digest(...)");
            byte[] bArrDigest2 = new SHA256.Digest().digest(bArrDigest);
            Intrinsics.checkNotNullExpressionValue(bArrDigest2, "digest(...)");
            return f0.U0(8, g.i(bArrDigest2)).contentEquals(strI) ? c.f186000a : new e(null);
        }
        return new e(null);
    }
}
