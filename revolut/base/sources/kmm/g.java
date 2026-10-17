package kmm;

import java.io.IOException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes14.dex */
public final class g extends xlm.a {
    public final /* synthetic */ int e = 1;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(String str, Function0 function0) {
        super(str, true);
        this.f = function0;
    }

    @Override // xlm.a
    public final long a() {
        switch (this.e) {
            case 0:
                h hVar = (h) this.f;
                try {
                    break;
                } catch (IOException e) {
                    h.d(hVar, e, null, 2);
                }
                return hVar.g() ? 0L : -1L;
            default:
                return ((Number) ((Function0) this.f).invoke()).longValue();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar) {
        super(v0.a.i(new StringBuilder(), hVar.f185928n, " writer"), true);
        this.f = hVar;
    }
}
