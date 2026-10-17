package rle;

import com.revolut.kompot.common.ExternalDestination;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class h extends b {
    @Override // rle.b
    public final void S0(String url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        A2(new ExternalDestination.Browser(url2, null));
    }
}
