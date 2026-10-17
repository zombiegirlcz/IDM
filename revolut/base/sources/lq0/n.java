package lq0;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class n implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f199173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f199174b;

    public /* synthetic */ n(p pVar, int i) {
        this.f199173a = i;
        this.f199174b = pVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View view = (View) obj2;
        switch (this.f199173a) {
            case 0:
                Intrinsics.checkNotNullParameter(view, "view");
                r rVar = new r(view);
                p pVar = this.f199174b;
                pVar.f199177c.put(view, rVar);
                pVar.f199176b.d(rVar);
                break;
            default:
                Intrinsics.checkNotNullParameter(view, "view");
                r rVar2 = new r(view);
                p pVar2 = this.f199174b;
                pVar2.d.put(view, rVar2);
                pVar2.f199176b.b(rVar2);
                break;
        }
        return Unit.f186387a;
    }
}
