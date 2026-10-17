package dx6;

import kotlin.Function;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;
import wba.v;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class m implements nii.b, kotlin.jvm.internal.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f120908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f120909b;

    public /* synthetic */ m(Object obj2, int i) {
        this.f120908a = i;
        this.f120909b = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x012b  */
    @Override // nii.p1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final nii.m0 a(java.lang.Object r24) {
        /*
            Method dump skipped, instruction units count: 838
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dx6.m.a(java.lang.Object):nii.m0");
    }

    public final boolean equals(Object obj2) {
        switch (this.f120908a) {
            case 0:
                if ((obj2 instanceof nii.b) && (obj2 instanceof kotlin.jvm.internal.n)) {
                    break;
                }
                break;
            case 1:
                if ((obj2 instanceof nii.b) && (obj2 instanceof kotlin.jvm.internal.n)) {
                    break;
                }
                break;
            case 2:
                if ((obj2 instanceof nii.b) && (obj2 instanceof kotlin.jvm.internal.n)) {
                    break;
                }
                break;
            case 3:
                if ((obj2 instanceof nii.b) && (obj2 instanceof kotlin.jvm.internal.n)) {
                    break;
                }
                break;
            case 4:
                if ((obj2 instanceof nii.b) && (obj2 instanceof kotlin.jvm.internal.n)) {
                    break;
                }
                break;
            case 5:
                if ((obj2 instanceof nii.b) && (obj2 instanceof kotlin.jvm.internal.n)) {
                    break;
                }
                break;
            case 6:
                if ((obj2 instanceof nii.b) && (obj2 instanceof kotlin.jvm.internal.n)) {
                    break;
                }
                break;
            case 7:
                if ((obj2 instanceof nii.b) && (obj2 instanceof kotlin.jvm.internal.n)) {
                    break;
                }
                break;
            case 8:
                if ((obj2 instanceof nii.b) && (obj2 instanceof kotlin.jvm.internal.n)) {
                    break;
                }
                break;
            default:
                if ((obj2 instanceof nii.b) && (obj2 instanceof kotlin.jvm.internal.n)) {
                    break;
                }
                break;
        }
        return Intrinsics.f(getFunctionDelegate(), ((kotlin.jvm.internal.n) obj2).getFunctionDelegate());
    }

    @Override // kotlin.jvm.internal.n
    public final Function getFunctionDelegate() {
        switch (this.f120908a) {
            case 0:
                return new q(1, 0, com.revolut.feature.freelancer.impl.ui.extension.a.class, (com.revolut.feature.freelancer.impl.ui.extension.a) this.f120909b, "getClosureErrorConfig", "getClosureErrorConfig(Ljava/lang/Throwable;)Lcom/revolut/kompot/common/dialog/status/StatusDialogConfiguration;");
            case 1:
                return new q(1, 0, com.revolut.feature.credit.application.plugins.impl.ui.card_ordering.a.class, (com.revolut.feature.credit.application.plugins.impl.ui.card_ordering.a) this.f120909b, "getErrorDialogConfig", "getErrorDialogConfig(Ljava/lang/Throwable;)Lcom/revolut/kompot/common/dialog/status/StatusDialogConfiguration$Error;");
            case 2:
                return new q(1, 0, h32.k.class, (h32.k) this.f120909b, "handleError", "handleError(Ljava/lang/Throwable;)Lcom/revolut/kompot/common/dialog/status/StatusDialogConfiguration;");
            case 3:
                return new q(1, 0, h66.c.class, (h66.c) this.f120909b, "map", "map(Ljava/lang/Throwable;)Lcom/revolut/kompot/common/dialog/status/StatusDialogConfiguration;");
            case 4:
                return (Function1) this.f120909b;
            case 5:
                return new q(1, 0, d12.b.class, (d12.b) this.f120909b, "handleError", "handleError(Ljava/lang/Throwable;)Lcom/revolut/kompot/common/dialog/status/StatusDialogConfiguration;");
            case 6:
                return new q(1, 0, vic.c.class, (vic.c) this.f120909b, "handleActivationError", "handleActivationError(Ljava/lang/Throwable;)Lcom/revolut/kompot/common/dialog/status/StatusDialogConfiguration;");
            case 7:
                return new q(1, 0, w8a.i.class, (w8a.i) this.f120909b, "provideErrorConfig", "provideErrorConfig(Ljava/lang/Throwable;)Lcom/revolut/kompot/common/dialog/status/StatusDialogConfiguration$Error;");
            case 8:
                return new q(1, 0, v.class, (v) this.f120909b, "getErrorDialogConfiguration", "getErrorDialogConfiguration(Ljava/lang/Throwable;)Lcom/revolut/kompot/common/dialog/status/StatusDialogConfiguration;");
            default:
                return new q(1, 0, d9a.c.class, (d9a.c) this.f120909b, "provideErrorConfig", "provideErrorConfig(Ljava/lang/Throwable;)Lcom/revolut/kompot/common/dialog/status/StatusDialogConfiguration$Error;");
        }
    }

    public final int hashCode() {
        switch (this.f120908a) {
        }
        return getFunctionDelegate().hashCode();
    }

    public m(Function1 function) {
        this.f120908a = 4;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f120909b = function;
    }
}
