package ao5;

import java.util.List;
import kn5.e;
import kn5.f;
import kn5.h;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.f0;
import org.jetbrains.annotations.NotNull;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements rn5.a {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List f7901b = v.k('T', 'X');

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List f7902c = u.c('X');

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mn5.b f7903a;

    public b(mn5.b base58Codec) {
        Intrinsics.checkNotNullParameter(base58Codec, "base58Codec");
        this.f7903a = base58Codec;
    }

    @Override // rn5.a
    public final f a(kn5.a params) {
        Intrinsics.checkNotNullParameter(params, "params");
        String str = params.f185996a;
        if (str.length() == 0) {
            return new e(h.f186003a);
        }
        List list = params.f185998c ? f7901b : f7902c;
        char cP0 = f0.P0(str);
        mn5.b bVar = this.f7903a;
        if (cP0 != 'r') {
            return list.contains(Character.valueOf(cP0)) ? bVar.d(str, "rpshnaf39wBUDNEGHJKLM4PQRST7VWXYZ2bcdeCg65jkm8oFqi1tuvAxyz") : new e(null);
        }
        int length = str.length();
        return (26 > length || length >= 36) ? new e(null) : bVar.d(str, "rpshnaf39wBUDNEGHJKLM4PQRST7VWXYZ2bcdeCg65jkm8oFqi1tuvAxyz");
    }
}
