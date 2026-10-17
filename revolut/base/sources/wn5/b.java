package wn5;

import java.util.List;
import kn5.f;
import kn5.h;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.f0;
import org.jetbrains.annotations.NotNull;
import tn5.e;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements rn5.a {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List f298710b = v.k('D', 'n');

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List f298711c = v.k('A', '9');
    public static final List d = u.c('D');
    public static final List e = v.k('A', '9');

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f298712a;

    public b(e bitcoinP2pkhAndP2pshAddressValidator) {
        Intrinsics.checkNotNullParameter(bitcoinP2pkhAndP2pshAddressValidator, "bitcoinP2pkhAndP2pshAddressValidator");
        this.f298712a = bitcoinP2pkhAndP2pshAddressValidator;
    }

    @Override // rn5.a
    public final f a(kn5.a params) {
        Intrinsics.checkNotNullParameter(params, "params");
        boolean z = params.f185998c;
        String str = params.f185996a;
        List list = z ? f298710b : d;
        List list2 = z ? f298711c : e;
        if (str.length() == 0) {
            return new kn5.e(h.f186003a);
        }
        boolean zContains = list.contains(Character.valueOf(f0.P0(str)));
        e eVar = this.f298712a;
        if (!zContains && !list2.contains(Character.valueOf(f0.P0(str)))) {
            return new kn5.e(null);
        }
        return eVar.a(str);
    }
}
