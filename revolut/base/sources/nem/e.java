package nem;

import kem.t;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class e extends g {
    public final Function0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Function0 provider, Function0 dispose, t partHeaders) {
        super(dispose, partHeaders);
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(dispose, "dispose");
        Intrinsics.checkNotNullParameter(partHeaders, "partHeaders");
        this.e = provider;
    }
}
