package yua;

import a31.t;
import a31.x;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import skm.p0;
import te0.w;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f316927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f316928b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f316929c;
    public final /* synthetic */ String d;

    public /* synthetic */ b(q qVar, String str, String str2, int i) {
        this.f316927a = i;
        this.f316928b = qVar;
        this.f316929c = str;
        this.d = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f316927a;
        String str = this.d;
        String id10 = this.f316929c;
        q qVar = this.f316928b;
        hbd.a params = (hbd.a) obj2;
        switch (i) {
            case 0:
                Intrinsics.checkNotNullParameter(params, "it");
                x xVar = (x) qVar.f316963a;
                Intrinsics.checkNotNullParameter(id10, "id");
                Intrinsics.checkNotNullParameter(params, "params");
                pfm.a aVarE = xVar.f999a.deleteCardMandate(id10, str != null ? str : null).e(xVar.f(id10, params));
                Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
                return w.g0(aVarE);
            case 1:
                Intrinsics.checkNotNullParameter(params, "it");
                x xVar2 = (x) qVar.f316963a;
                String id11 = this.f316929c;
                Intrinsics.checkNotNullParameter(id11, "id");
                Intrinsics.checkNotNullParameter(params, "params");
                p0 p0Var = p0.f264001a;
                pfm.a aVarE2 = pd.b.n(elm.f.f127540b, new t(xVar2, id11, this.d, null, 0)).e(xVar2.f(id11, params));
                Intrinsics.checkNotNullExpressionValue(aVarE2, "andThen(...)");
                return w.g0(aVarE2);
            default:
                Intrinsics.checkNotNullParameter(params, "it");
                x xVar3 = (x) qVar.f316963a;
                Intrinsics.checkNotNullParameter(id10, "id");
                Intrinsics.checkNotNullParameter(params, "params");
                pfm.a aVarE3 = xVar3.f999a.deleteManualCardMandate(id10, str != null ? str : null).e(xVar3.f(id10, params));
                Intrinsics.checkNotNullExpressionValue(aVarE3, "andThen(...)");
                return w.g0(aVarE3);
        }
    }
}
