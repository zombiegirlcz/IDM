package sma;

import android.os.SystemClock;
import com.revolut.feature.profile.impl.ui.details.email.VerifyEmailFlowContract$State;
import com.revolut.feature_retail_user_declarations.email.flow.EmailFlowOutputData;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import rnb.u;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f264402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.profile.impl.ui.details.email.c f264403b;

    public /* synthetic */ d(com.revolut.feature.profile.impl.ui.details.email.c cVar, int i) {
        this.f264402a = i;
        this.f264403b = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f264402a) {
            case 0:
                EmailFlowOutputData output = (EmailFlowOutputData) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                boolean z = output instanceof EmailFlowOutputData.EmailData;
                com.revolut.feature.profile.impl.ui.details.email.c cVar = this.f264403b;
                if (z) {
                    EmailFlowOutputData.EmailData emailData = (EmailFlowOutputData.EmailData) output;
                    String str = emailData.f97565a;
                    String str2 = emailData.f97566b;
                    cVar.l2(new f(cVar, str2, str, (Continuation) null, 0), new u(1, cVar, com.revolut.feature.profile.impl.ui.details.email.c.class, "handleError", "handleError(Ljava/lang/Throwable;)Z", 0, 28));
                } else {
                    if (!Intrinsics.f(output, EmailFlowOutputData.Close.f97564a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    h.D2(cVar.f81389t);
                }
                return Unit.f186387a;
            case 1:
                wma.c it8 = (wma.c) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                h.D2(this.f264403b.f81389t);
                return Unit.f186387a;
            default:
                this.f264403b.f81386q.getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                ((VerifyEmailFlowContract$State) obj2).getClass();
                return new VerifyEmailFlowContract$State(jElapsedRealtime);
        }
    }
}
