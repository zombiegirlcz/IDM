package ya4;

import com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$Configuration;
import kotlin.jvm.internal.Intrinsics;
import wh3.h;

/* JADX INFO: loaded from: classes22.dex */
public final class c implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f311919a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f311920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f311921c;

    public c(py3.c creditApplicationNotExistsErrorChecker, f navigateToCurrentApplicationErrorHandlerDelegate) {
        Intrinsics.checkNotNullParameter(creditApplicationNotExistsErrorChecker, "creditApplicationNotExistsErrorChecker");
        Intrinsics.checkNotNullParameter(navigateToCurrentApplicationErrorHandlerDelegate, "navigateToCurrentApplicationErrorHandlerDelegate");
        this.f311921c = creditApplicationNotExistsErrorChecker;
        this.f311920b = navigateToCurrentApplicationErrorHandlerDelegate;
    }

    @Override // py3.a
    public final boolean a(Throwable throwable) {
        switch (this.f311919a) {
            case 0:
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                return ((py3.c) this.f311921c).a(throwable);
            case 1:
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                return ((py3.e) this.f311921c).a(throwable);
            default:
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                return ((py3.g) this.f311920b).a(throwable);
        }
    }

    @Override // ya4.a
    public final Object b(Throwable th10, CreditApplicationPluginFlowContract$Configuration creditApplicationPluginFlowContract$Configuration, h hVar) {
        switch (this.f311919a) {
            case 0:
                if (a(th10)) {
                    return ((f) this.f311920b).b(creditApplicationPluginFlowContract$Configuration, hVar);
                }
                return null;
            case 1:
                if (a(th10)) {
                    return ((f) this.f311920b).b(creditApplicationPluginFlowContract$Configuration, hVar);
                }
                return null;
            default:
                if (a(th10)) {
                    return new b(((hz3.c) this.f311921c).d(ju3.g.STATUS_DIALOG));
                }
                return null;
        }
    }

    public c(py3.e incorrectPluginCreditApplicationErrorChecker, f navigateToCurrentApplicationErrorHandlerDelegate) {
        Intrinsics.checkNotNullParameter(incorrectPluginCreditApplicationErrorChecker, "incorrectPluginCreditApplicationErrorChecker");
        Intrinsics.checkNotNullParameter(navigateToCurrentApplicationErrorHandlerDelegate, "navigateToCurrentApplicationErrorHandlerDelegate");
        this.f311921c = incorrectPluginCreditApplicationErrorChecker;
        this.f311920b = navigateToCurrentApplicationErrorHandlerDelegate;
    }

    public c(hz3.c applicationCommandsFactory, py3.g workingHoursCreditApplicationErrorChecker) {
        Intrinsics.checkNotNullParameter(applicationCommandsFactory, "applicationCommandsFactory");
        Intrinsics.checkNotNullParameter(workingHoursCreditApplicationErrorChecker, "workingHoursCreditApplicationErrorChecker");
        this.f311921c = applicationCommandsFactory;
        this.f311920b = workingHoursCreditApplicationErrorChecker;
    }
}
