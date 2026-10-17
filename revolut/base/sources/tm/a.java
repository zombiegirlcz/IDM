package tm;

import com.revolut.data.model.Data;
import efm.d0;
import efm.r;
import efm.y;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import rfm.f0;
import v4a.i;
import vf0.o;
import z9h.n;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f272134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f272135b;

    public /* synthetic */ a(int i, Function1 function1) {
        this.f272134a = i;
        this.f272135b = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object it8) {
        r rVarF;
        switch (this.f272134a) {
            case 0:
                mm.a it9 = (mm.a) it8;
                Intrinsics.checkNotNullParameter(it9, "it");
                f0 f0VarF = ((efm.b) this.f272135b.invoke(it9)).f(d0.m(Unit.f186387a));
                Intrinsics.checkNotNullExpressionValue(f0VarF, "andThen(...)");
                return f0VarF;
            case 1:
                Function1 function1 = this.f272135b;
                Data data = (Data) it8;
                Intrinsics.checkNotNullParameter(data, "data");
                try {
                    Object content = data.getContent();
                    return new Data(content != null ? function1.invoke(content) : null, data.getError(), data.getLoading());
                } catch (Throwable th10) {
                    return new Data(null, th10, data.getLoading());
                }
            case 2:
                Function1 function12 = this.f272135b;
                Data original = (Data) it8;
                Intrinsics.checkNotNullParameter(original, "original");
                Object content2 = original.getContent();
                if (content2 == null) {
                    return r.just(new Data(null, original.getError(), original.getLoading(), 1, null));
                }
                try {
                    rVarF = (r) function12.invoke(content2);
                    break;
                } catch (Throwable th11) {
                    rVarF = n.f(null, th11, false, 1, null);
                }
                return rVarF.map(new i(16, new uz7.d(original, 13)));
            case 3:
                Function1 function13 = this.f272135b;
                Data original2 = (Data) it8;
                Intrinsics.checkNotNullParameter(original2, "original");
                Object content3 = original2.getContent();
                if (content3 == null) {
                    return d0.m(new Data(null, original2.getError(), original2.getLoading(), 1, null));
                }
                try {
                    d0 d0Var = (d0) function13.invoke(content3);
                    i iVar = new i(13, new uz7.d(original2, 11));
                    d0Var.getClass();
                    return new ufm.i(d0Var, iVar, 1);
                } catch (Throwable th12) {
                    return d0.m(new Data(null, pd.b.c(original2.getError(), th12), original2.getLoading(), 1, null));
                }
            case 4:
                y observer = (y) it8;
                Intrinsics.checkNotNullParameter(observer, "observer");
                return new vf0.d(observer, new o(1, this.f272135b), false);
            case 5:
                Intrinsics.checkNotNullParameter(it8, "it");
                return (efm.f) this.f272135b.invoke(it8);
            case 6:
                Intrinsics.checkNotNullParameter(it8, "params");
                return new ufm.c(new to7.f(it8, this.f272135b), 2);
            default:
                Intrinsics.checkNotNullParameter(it8, "params");
                return this.f272135b.invoke(it8);
        }
    }
}
