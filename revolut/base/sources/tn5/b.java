package tn5;

import java.util.List;
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

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List f272304c = v.k('1', 'n', 'm');
    public static final List d = v.k('3', '2');
    public static final List e = v.k("bc1", "tb1");
    public static final List f = u.c('1');

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final List f272305g = u.c('3');

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final List f272306h = u.c("bc1");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f272307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f272308b;

    public b(e bitcoinP2pkhAndP2pshAddressValidator, c bitcoinBech32AddressValidator) {
        Intrinsics.checkNotNullParameter(bitcoinP2pkhAndP2pshAddressValidator, "bitcoinP2pkhAndP2pshAddressValidator");
        Intrinsics.checkNotNullParameter(bitcoinBech32AddressValidator, "bitcoinBech32AddressValidator");
        this.f272307a = bitcoinP2pkhAndP2pshAddressValidator;
        this.f272308b = bitcoinBech32AddressValidator;
    }

    @Override // rn5.a
    public final f a(kn5.a params) {
        Intrinsics.checkNotNullParameter(params, "params");
        boolean z = params.f185998c;
        String str = params.f185996a;
        List list = z ? f272304c : f;
        List list2 = z ? d : f272305g;
        List list3 = z ? e : f272306h;
        if (str.length() == 0) {
            return new kn5.e(h.f186003a);
        }
        if (str.length() < 3) {
            return new kn5.e(null);
        }
        boolean zContains = list.contains(Character.valueOf(f0.P0(str)));
        e eVar = this.f272307a;
        if (!zContains && !list2.contains(Character.valueOf(f0.P0(str)))) {
            return list3.contains(f0.U0(3, str)) ? this.f272308b.b(str) : new kn5.e(null);
        }
        return eVar.a(str);
    }
}
