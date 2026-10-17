package l97;

import android.os.SystemClock;
import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.n0;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class s implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f193096a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i0 f193097b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n0 f193098c;

    public /* synthetic */ s(n0 n0Var, i0 i0Var) {
        this.f193098c = n0Var;
        this.f193097b = i0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        long jElapsedRealtime;
        switch (this.f193096a) {
            case 0:
                n0 n0Var = this.f193098c;
                this.f193097b.e.getClass();
                n0Var.f186428a = SystemClock.elapsedRealtime();
                break;
            default:
                i0 i0Var = this.f193097b;
                n0 n0Var2 = this.f193098c;
                Data data = (Data) obj2;
                if (!data.getLoading()) {
                    if (n0Var2.f186428a == -1) {
                        jElapsedRealtime = 0;
                    } else {
                        i0Var.e.getClass();
                        jElapsedRealtime = SystemClock.elapsedRealtime() - n0Var2.f186428a;
                    }
                    i0Var.o = jElapsedRealtime;
                    i0Var.f193071n = data;
                }
                break;
        }
        return Unit.f186387a;
    }

    public /* synthetic */ s(i0 i0Var, n0 n0Var) {
        this.f193097b = i0Var;
        this.f193098c = n0Var;
    }
}
