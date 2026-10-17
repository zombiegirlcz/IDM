package yn5;

import java.util.Iterator;
import java.util.List;
import kn5.f;
import kn5.h;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.jetbrains.annotations.NotNull;
import tn5.c;
import tn5.e;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements rn5.a {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List f315258c = v.k('L', 'n', 'm');
    public static final List d = v.k('M', 'Q');
    public static final List e = v.k("ltc1", "tltc1");
    public static final List f = u.c('L');

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final List f315259g = u.c('M');

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final List f315260h = u.c("ltc1");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f315261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f315262b;

    public b(e bitcoinP2pkhAndP2pshAddressValidator, c bitcoinBitcoinBech32AddressValidator) {
        Intrinsics.checkNotNullParameter(bitcoinP2pkhAndP2pshAddressValidator, "bitcoinP2pkhAndP2pshAddressValidator");
        Intrinsics.checkNotNullParameter(bitcoinBitcoinBech32AddressValidator, "bitcoinBitcoinBech32AddressValidator");
        this.f315261a = bitcoinP2pkhAndP2pshAddressValidator;
        this.f315262b = bitcoinBitcoinBech32AddressValidator;
    }

    @Override // rn5.a
    public final f a(kn5.a params) {
        Object next;
        Intrinsics.checkNotNullParameter(params, "params");
        boolean z = params.f185998c;
        String str = params.f185996a;
        List list = z ? f315258c : f;
        List list2 = z ? d : f315259g;
        List list3 = z ? e : f315260h;
        if (str.length() == 0) {
            return new kn5.e(h.f186003a);
        }
        boolean zContains = list.contains(Character.valueOf(str.charAt(0)));
        e eVar = this.f315261a;
        if (!zContains && !list2.contains(Character.valueOf(str.charAt(0)))) {
            Iterator it8 = list3.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    next = null;
                    break;
                }
                next = it8.next();
                if (a0.H(str, (String) next, false)) {
                    break;
                }
            }
            return ((String) next) != null ? this.f315262b.b(str) : new kn5.e(null);
        }
        return eVar.a(str);
    }
}
