package la0;

import com.revolut.feature.backend_flow.domain.models.BackendFlow;
import com.revolut.feature.backend_flow.domain.models.BackendScreen;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f193301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BackendFlow f193302b;

    public /* synthetic */ a(BackendFlow backendFlow, int i) {
        this.f193301a = i;
        this.f193302b = backendFlow;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object next;
        switch (this.f193301a) {
            case 0:
                BackendScreen screen = (BackendScreen) obj2;
                Intrinsics.checkNotNullParameter(screen, "screen");
                String f = screen.getD();
                if (f != null) {
                    return ta6.a.m(this.f193302b, f);
                }
                return null;
            case 1:
                BackendFlow updatedFlow = (BackendFlow) obj2;
                Intrinsics.checkNotNullParameter(updatedFlow, "updatedFlow");
                return Boolean.valueOf(!Intrinsics.f(this.f193302b, updatedFlow));
            case 2:
                String currentScreenId = (String) obj2;
                Intrinsics.checkNotNullParameter(currentScreenId, "currentScreenId");
                Iterator it8 = this.f193302b.e.iterator();
                while (true) {
                    if (it8.hasNext()) {
                        next = it8.next();
                        if (Intrinsics.f(((BackendScreen) next).getF63704a(), currentScreenId)) {
                        }
                    } else {
                        next = null;
                    }
                }
                BackendScreen backendScreen = (BackendScreen) next;
                if (backendScreen != null) {
                    return backendScreen.getD();
                }
                return null;
            case 3:
                BackendScreen screen2 = (BackendScreen) obj2;
                Intrinsics.checkNotNullParameter(screen2, "screen");
                String f4 = screen2.getD();
                if (f4 != null) {
                    return ta6.a.m(this.f193302b, f4);
                }
                return null;
            default:
                BackendScreen nextScreen = (BackendScreen) obj2;
                Intrinsics.checkNotNullParameter(nextScreen, "nextScreen");
                String f5 = nextScreen.getD();
                if (f5 != null) {
                    return ta6.a.m(this.f193302b, f5);
                }
                return null;
        }
    }
}
