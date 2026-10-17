package f63;

import a31.l;
import android.nfc.NfcAdapter;
import android.nfc.Tag;
import es.e;
import f0d.k;
import f2i.o;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import rfm.h0;
import yhm.j;

/* JADX INFO: loaded from: classes21.dex */
public final class d implements w53.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f132401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f132402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f132403c;
    public final Lazy d;
    public final Lazy e;

    public d(b nfcProxy) {
        Intrinsics.checkNotNullParameter(nfcProxy, "nfcProxy");
        this.f132401a = nfcProxy;
        this.f132403c = new c();
        this.d = j.b(new f2i.b(8));
        this.e = j.b(new e(this, 16));
    }

    public final boolean a() {
        b bVar = this.f132401a;
        bVar.getClass();
        try {
            NfcAdapter defaultAdapter = NfcAdapter.getDefaultAdapter(bVar.f132397a);
            if (defaultAdapter != null) {
                return defaultAdapter.isEnabled();
            }
            return false;
        } catch (UnsupportedOperationException unused) {
            return false;
        }
    }

    public final boolean b() {
        b bVar = this.f132401a;
        bVar.getClass();
        try {
            return NfcAdapter.getDefaultAdapter(bVar.f132397a) != null;
        } catch (UnsupportedOperationException unused) {
            return false;
        }
    }

    public final void c() {
        b bVar = this.f132401a;
        NfcAdapter nfcAdapter = bVar.f132398b;
        if (nfcAdapter != null) {
            nfcAdapter.enableForegroundDispatch(bVar.f132397a, bVar.f132399c, b.d, b.e);
        }
    }

    public final h0 d(Tag tag2) {
        Intrinsics.checkNotNullParameter(tag2, "tag");
        h0 h0Var = new h0(new l(tag2, 21), new o(new f0m.c(this, 12), 11), new o(new k(29), 12));
        Intrinsics.checkNotNullExpressionValue(h0Var, "using(...)");
        return h0Var;
    }
}
