package bz9;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import ukm.f;
import vkm.q;
import vkm.z1;
import yy9.v;
import zhm.d0;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends ry9.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final v f19938l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final c70.a f19939m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final b f19940n;
    public final z1 o;

    public a(v bankTransferPaymentOptionProvider, c70.a clipboard, b clipboardErrorDialogMapper) {
        Intrinsics.checkNotNullParameter(bankTransferPaymentOptionProvider, "bankTransferPaymentOptionProvider");
        Intrinsics.checkNotNullParameter(clipboard, "clipboard");
        Intrinsics.checkNotNullParameter(clipboardErrorDialogMapper, "clipboardErrorDialogMapper");
        this.f19938l = bankTransferPaymentOptionProvider;
        this.f19939m = clipboard;
        this.f19940n = clipboardErrorDialogMapper;
        this.o = q.a(0, 1, f.DROP_OLDEST);
    }

    @Override // ry9.a
    public final z1 Z2() {
        return this.o;
    }

    @Override // ry9.a
    public final void b3() {
        String strD = this.f19939m.d();
        b bVar = this.f19940n;
        if (strD == null) {
            bVar.getClass();
            L2(b.a());
            return;
        }
        this.f19938l.getClass();
        List listB = v.b(strD);
        if (listB != null) {
            this.o.k(d0.b0(listB));
        } else {
            bVar.getClass();
            L2(b.a());
        }
    }
}
