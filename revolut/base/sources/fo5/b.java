package fo5;

import java.util.Set;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.y0;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements rn5.a {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Set f136818b = y0.b(65);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Set f136819c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mn5.b f136820a;

    static {
        Integer[] elements = {65, 160};
        Intrinsics.checkNotNullParameter(elements, "elements");
        f136819c = d.y0(elements);
    }

    public b(mn5.b base58Codec) {
        Intrinsics.checkNotNullParameter(base58Codec, "base58Codec");
        this.f136820a = base58Codec;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    @Override // rn5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kn5.f a(kn5.a r9) {
        /*
            Method dump skipped, instruction units count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fo5.b.a(kn5.a):kn5.f");
    }
}
