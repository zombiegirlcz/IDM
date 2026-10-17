package sjf;

import androidx.compose.material.SnackbarKt;
import androidx.compose.runtime.Composer;
import com.revolut.domain.interactors.transactions.TransactionsPerformanceTracker$Scenario;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import zhm.r0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class a implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f263720a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f263721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f263722c;

    public /* synthetic */ a(long j2, String str) {
        this.f263721b = j2;
        this.f263722c = str;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f263720a) {
            case 0:
                c cVar = (c) obj3;
                Intrinsics.checkNotNullParameter((TransactionsPerformanceTracker$Scenario) obj2, "<unused var>");
                if (cVar == null) {
                    return null;
                }
                return c.a(cVar, r0.q(cVar.f263724b, new Pair(this.f263722c, Long.valueOf(this.f263721b - cVar.f263723a))));
            default:
                int iIntValue = ((Integer) obj3).intValue();
                return SnackbarKt.Snackbar_sPrSdHI$lambda$0(this.f263721b, null, this.f263722c, (Composer) obj2, iIntValue);
        }
    }

    public /* synthetic */ a(String str, long j2) {
        this.f263722c = str;
        this.f263721b = j2;
    }
}
