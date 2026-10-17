package eli;

import com.revolut.feature.twofa.exceptions.UserDeclinedTwoFaException;
import efm.r;
import ej9.s;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f127465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f127466b;

    public /* synthetic */ c(j jVar, int i) {
        this.f127465a = i;
        this.f127466b = jVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f127465a) {
            case 0:
                j jVar = this.f127466b;
                efm.i errors = (efm.i) obj2;
                Intrinsics.checkNotNullParameter(errors, "errors");
                s sVar = new s(new c(jVar, 2), 10);
                int i = efm.i.f125385a;
                return errors.f(sVar, i, i);
            case 1:
                j jVar2 = this.f127466b;
                Throwable throwable = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                return jVar2.f.g(throwable).toFlowable(efm.a.BUFFER);
            case 2:
                j jVar3 = this.f127466b;
                Throwable throwable2 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(throwable2, "throwable");
                return jVar3.f.g(throwable2).toFlowable(efm.a.BUFFER);
            case 3:
                j jVar4 = this.f127466b;
                r errors2 = (r) obj2;
                Intrinsics.checkNotNullParameter(errors2, "errors");
                return errors2.flatMap(new s(new c(jVar4, 6), 16));
            case 4:
                this.f127466b.c();
                return Unit.f186387a;
            case 5:
                j jVar5 = this.f127466b;
                r errors3 = (r) obj2;
                Intrinsics.checkNotNullParameter(errors3, "errors");
                return errors3.flatMap(new s(new c(jVar5, 7), 17));
            case 6:
                j jVar6 = this.f127466b;
                Throwable throwable3 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(throwable3, "throwable");
                return jVar6.e(throwable3, null);
            case 7:
                j jVar7 = this.f127466b;
                Throwable throwable4 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(throwable4, "throwable");
                return jVar7.f.g(throwable4);
            case 8:
                j jVar8 = this.f127466b;
                tjg.e method = (tjg.e) obj2;
                Intrinsics.checkNotNullParameter(method, "it");
                l lVar = (l) jVar8.f127477a;
                lVar.getClass();
                Intrinsics.checkNotNullParameter(method, "method");
                lVar.f127485b = method;
                lVar.f127487g.onNext(method);
                return Unit.f186387a;
            case 9:
                j jVar9 = this.f127466b;
                Throwable th10 = (Throwable) obj2;
                Intrinsics.h(th10);
                if (th10 instanceof UserDeclinedTwoFaException) {
                    jVar9.f127481h.d();
                } else {
                    jVar9.getClass();
                }
                return Unit.f186387a;
            case 10:
                j jVar10 = this.f127466b;
                tjg.e method2 = (tjg.e) obj2;
                Intrinsics.checkNotNullParameter(method2, "it");
                l lVar2 = (l) jVar10.f127477a;
                lVar2.getClass();
                Intrinsics.checkNotNullParameter(method2, "method");
                lVar2.f127485b = method2;
                lVar2.f127487g.onNext(method2);
                return Unit.f186387a;
            case 11:
                j jVar11 = this.f127466b;
                zm0.d it8 = (zm0.d) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                ((l) jVar11.f127477a).a(it8);
                return Unit.f186387a;
            case 12:
                j jVar12 = this.f127466b;
                Throwable th11 = (Throwable) obj2;
                Intrinsics.h(th11);
                if (th11 instanceof UserDeclinedTwoFaException) {
                    jVar12.f127481h.d();
                } else {
                    jVar12.getClass();
                }
                return Unit.f186387a;
            case 13:
                this.f127466b.c();
                return Unit.f186387a;
            default:
                j jVar13 = this.f127466b;
                efm.i errors4 = (efm.i) obj2;
                Intrinsics.checkNotNullParameter(errors4, "errors");
                s sVar2 = new s(new c(jVar13, 1), 8);
                int i2 = efm.i.f125385a;
                return errors4.f(sVar2, i2, i2);
        }
    }
}
