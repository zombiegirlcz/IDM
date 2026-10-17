package vq0;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f291297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f291298b;

    public /* synthetic */ k(m mVar, int i) {
        this.f291297a = i;
        this.f291298b = mVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f291297a) {
            case 0:
                nu0.h showingState = (nu0.h) obj2;
                Intrinsics.checkNotNullParameter(showingState, "showingState");
                int i = l.f291299a[showingState.ordinal()];
                m mVar = this.f291298b;
                if (i == 1) {
                    mVar.c();
                } else {
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    mVar.d(mVar.f291301g);
                }
                return Unit.f186387a;
            default:
                String str = (String) obj2;
                Intrinsics.h(str);
                this.f291298b.f291301g = str;
                return Unit.f186387a;
        }
    }
}
