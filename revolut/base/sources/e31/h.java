package e31;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class h extends q implements Function1 {
    public static final h f = new h();

    public h() {
        super(1, ResponseBody.class, "bytes", "bytes()[B", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        ResponseBody p0 = (ResponseBody) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return p0.bytes();
    }
}
