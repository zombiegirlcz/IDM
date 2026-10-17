package ok8;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f225932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f225933b;

    public /* synthetic */ c(m mVar, int i) {
        this.f225932a = i;
        this.f225933b = mVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f225932a) {
            case 0:
                Throwable it8 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                oki.h.D2(this.f225933b.f225946q);
                return Boolean.FALSE;
            default:
                pk8.g result = (pk8.g) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                boolean z = result instanceof pk8.f;
                m mVar = this.f225933b;
                if (z) {
                    mVar.l2(new i(mVar, null, 1), new yi5.b(26));
                } else {
                    if (!(result instanceof pk8.e)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    oki.h.D2(mVar.f225946q);
                }
                return Unit.f186387a;
        }
    }
}
