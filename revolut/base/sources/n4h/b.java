package n4h;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kpj.f f212442a;

    public b(d accountSellSubtitleBuilder, kpj.f wealthAccountHeaderUiMapper) {
        Intrinsics.checkNotNullParameter(accountSellSubtitleBuilder, "accountSellSubtitleBuilder");
        Intrinsics.checkNotNullParameter(wealthAccountHeaderUiMapper, "wealthAccountHeaderUiMapper");
        this.f212442a = wealthAccountHeaderUiMapper;
    }

    public static boolean a(hdh.c cVar, bfl.g gVar) {
        int i = a.f212441a[gVar.ordinal()];
        if (i == 1) {
            return cVar.f151435b;
        }
        if (i == 2) {
            return cVar.f151436c;
        }
        throw new NoWhenBranchMatchedException();
    }
}
