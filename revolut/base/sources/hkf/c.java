package hkf;

import akf.t1;
import akf.u1;
import akf.v1;
import ekf.f;
import java.util.Set;
import klf.h0;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tof.v5;

/* JADX INFO: loaded from: classes8.dex */
public final class c {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Set f152927c;
    public static final Set d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0 f152928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f152929b;

    static {
        u1 u1Var = v1.Companion;
        t1 t1Var = t1.CONFIRM_CANCEL_BANK_TRANSFER;
        u1Var.getClass();
        String[] elements = {u1.a(t1Var), u1.a(t1.SEND_AGAIN), u1.a(t1.RECURRING)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        f152927c = d.y0(elements);
        v5[] elements2 = {v5.PIX_WITHDRAW, v5.PIX_CHANGE};
        Intrinsics.checkNotNullParameter(elements2, "elements");
        d = d.y0(elements2);
    }

    public c(h0 commonDataSource, f bankTransferActionsProvider) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(bankTransferActionsProvider, "bankTransferActionsProvider");
        this.f152928a = commonDataSource;
        this.f152929b = bankTransferActionsProvider;
    }
}
