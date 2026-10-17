package k64;

import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import ip0.v7;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import skm.p0;
import te0.w;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f181620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f181621b;

    public /* synthetic */ b(h hVar, int i) {
        this.f181620a = i;
        this.f181621b = hVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f181620a) {
            case 0:
                cqi.f it8 = (cqi.f) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return this.f181621b.f181629a.c0(new an.c(it8));
            case 1:
                j64.a action = (j64.a) obj2;
                Intrinsics.checkNotNullParameter(action, "action");
                w0 w0VarM = v7.m(action.f171669a, AnalyticsContext.INSTANCE);
                String str = action.f171669a.f66892b;
                kotlinx.coroutines.d dVar = p0.f264003c;
                h hVar = this.f181621b;
                pfm.a aVar = new pfm.a(w.o0(dVar, new k0g.b(hVar, str, action, (Continuation) null, 14)), new a(2, new ja3.d(hVar, w0VarM, action, str, 9)), 4);
                Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
                return aVar;
            default:
                j64.a action2 = (j64.a) obj2;
                Intrinsics.checkNotNullParameter(action2, "action");
                kotlinx.coroutines.d dVar2 = p0.f264003c;
                h hVar2 = this.f181621b;
                pfm.a aVarE = ue0.e.v(pd.b.n(dVar2, new k22.c(hVar2, null, 6))).e(new c(action2, hVar2, 0));
                Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
                return aVarE;
        }
    }
}
