package nk2;

import c93.p;
import com.revolut.data.model.Data;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f216626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f216627b;

    public /* synthetic */ c(p pVar, int i) {
        this.f216626a = i;
        this.f216627b = pVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f216626a) {
            case 0:
                return f.a((f) obj2, new Data(this.f216627b, null, false, 6, null), null, 11);
            default:
                Data exceptionalLimitEligibility = new Data(this.f216627b, null, false, 6, null);
                ((qk2.b) obj2).getClass();
                Intrinsics.checkNotNullParameter(exceptionalLimitEligibility, "exceptionalLimitEligibility");
                return new qk2.b(exceptionalLimitEligibility);
        }
    }
}
