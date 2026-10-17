package nem;

import kem.t;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class f extends g {
    public final String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(String value, Function0 dispose, t partHeaders) {
        super(dispose, partHeaders);
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(dispose, "dispose");
        Intrinsics.checkNotNullParameter(partHeaders, "partHeaders");
        this.e = value;
    }
}
