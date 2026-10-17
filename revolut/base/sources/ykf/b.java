package ykf;

import elf.s0;
import klf.h0;
import klf.m1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import yji.n;

/* JADX INFO: loaded from: classes8.dex */
public final class b extends n implements s0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final h0 f314617l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final m1 f314618m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final k61.a f314619n;
    public final c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c70.a f314620p;

    public b(h0 commonDataSource, m1 juniorDataSource, k61.a transferInteractor, c paymentLinkWidgetMapper, c70.a clipboard) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(juniorDataSource, "juniorDataSource");
        Intrinsics.checkNotNullParameter(transferInteractor, "transferInteractor");
        Intrinsics.checkNotNullParameter(paymentLinkWidgetMapper, "paymentLinkWidgetMapper");
        Intrinsics.checkNotNullParameter(clipboard, "clipboard");
        this.f314617l = commonDataSource;
        this.f314618m = juniorDataSource;
        this.f314619n = transferInteractor;
        this.o = paymentLinkWidgetMapper;
        this.f314620p = clipboard;
    }

    @Override // elf.s0
    public final Object c(Object obj2, String str, Continuation continuation) {
        boolean z = false;
        if (Intrinsics.f(str, "PAYMENT_LINK_WIDGET_LIST_ID")) {
            String str2 = obj2 instanceof String ? (String) obj2 : null;
            if (str2 != null) {
                this.f314620p.c(null, str2, false, new y99.c(this, 18));
            }
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
