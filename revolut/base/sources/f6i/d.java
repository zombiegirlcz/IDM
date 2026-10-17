package f6i;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yji.n;

/* JADX INFO: loaded from: classes10.dex */
public final class d extends n implements a {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Set f132446p;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final wsg.n f132447l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e f132448m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ae5.a f132449n;
    public final bdi.a o;

    static {
        j8l.a[] elements = {j8l.a.JOINT, j8l.a.SAVINGS};
        Intrinsics.checkNotNullParameter(elements, "elements");
        f132446p = kotlin.collections.d.y0(elements);
    }

    public d(wsg.n walletInteractor, e dialogsProvider, ae5.a cryptoConvertDialogDisclaimerExtension, bdi.a pointsPocketCheckExtension) {
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(dialogsProvider, "dialogsProvider");
        Intrinsics.checkNotNullParameter(cryptoConvertDialogDisclaimerExtension, "cryptoConvertDialogDisclaimerExtension");
        Intrinsics.checkNotNullParameter(pointsPocketCheckExtension, "pointsPocketCheckExtension");
        this.f132447l = walletInteractor;
        this.f132448m = dialogsProvider;
        this.f132449n = cryptoConvertDialogDisclaimerExtension;
        this.o = pointsPocketCheckExtension;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Z2(s6i.e r8, b6i.l r9, gim.c r10) {
        /*
            Method dump skipped, instruction units count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f6i.d.Z2(s6i.e, b6i.l, gim.c):java.lang.Object");
    }
}
