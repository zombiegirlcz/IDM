package g9j;

import com.revolut.data.model.Data;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class u implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f141941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f141942b;

    public /* synthetic */ u(w wVar, int i) {
        this.f141941a = i;
        this.f141942b = wVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        efm.r rVarM;
        switch (this.f141941a) {
            case 0:
                xi0.b it8 = (xi0.b) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return gt5.a.a(this.f141942b.f141947c, it8, false, 6);
            default:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                Data data = (Data) pair.f186385a;
                Data data2 = (Data) pair.f186386b;
                Object content = data.getContent();
                Object content2 = data2.getContent();
                if (content == null || content2 == null) {
                    rVarM = null;
                } else {
                    rVarM = this.f141942b.e.m((io3.d) content, (xi0.b) content2);
                }
                if (rVarM != null) {
                    return rVarM;
                }
                boolean z = data.getLoading() || data2.getLoading();
                Throwable error = data.getError();
                if (error == null) {
                    error = data2.getError();
                }
                return te0.w.h(new Data(null, error, z));
        }
    }
}
