package pkf;

import com.revolut.feature.shared.help_centre.api.faq.SharedFaqDestination;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class e1 extends yji.n implements elf.s0 {

    @NotNull
    public static final b1 Companion = new b1();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final klf.y0 f237044l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final vlf.b f237045m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final h1 f237046n;
    public final se5.a o;

    public e1(klf.y0 cryptoRemittancesDataSource, vlf.b commonUiMapper, h1 trackingItemsMapper, se5.a cryptoFaqKeysProvider) {
        Intrinsics.checkNotNullParameter(cryptoRemittancesDataSource, "cryptoRemittancesDataSource");
        Intrinsics.checkNotNullParameter(commonUiMapper, "commonUiMapper");
        Intrinsics.checkNotNullParameter(trackingItemsMapper, "trackingItemsMapper");
        Intrinsics.checkNotNullParameter(cryptoFaqKeysProvider, "cryptoFaqKeysProvider");
        this.f237044l = cryptoRemittancesDataSource;
        this.f237045m = commonUiMapper;
        this.f237046n = trackingItemsMapper;
        this.o = cryptoFaqKeysProvider;
    }

    public final void Z2(String str) {
        A2(new SharedFaqDestination((SharedFaqDestination.StartPoint) new SharedFaqDestination.StartPoint.FaqExplicit(str, 6), (SharedFaqDestination.PassthroughData) null, false, 14));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00be  */
    @Override // elf.s0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.Object r10, java.lang.String r11, kotlin.coroutines.Continuation r12) {
        /*
            Method dump skipped, instruction units count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pkf.e1.c(java.lang.Object, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
