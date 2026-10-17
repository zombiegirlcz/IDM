package v5e;

import cli.j;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class e implements j {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x4e.d f286202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f286203b;

    public static final class a {
        private a() {
        }
    }

    public e() {
        this((x4e.d) null, 3);
    }

    public static e a(e eVar, x4e.d payoutChartState, Data data, int i) {
        if ((i & 1) != 0) {
            payoutChartState = eVar.f286202a;
        }
        if ((i & 2) != 0) {
            data = eVar.f286203b;
        }
        eVar.getClass();
        Intrinsics.checkNotNullParameter(payoutChartState, "payoutChartState");
        return new e(payoutChartState, data);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f286202a, eVar.f286202a) && Intrinsics.f(this.f286203b, eVar.f286203b);
    }

    public final int hashCode() {
        int iHashCode = this.f286202a.hashCode() * 31;
        Data data = this.f286203b;
        return iHashCode + (data == null ? 0 : data.hashCode());
    }

    public e(x4e.d payoutChartState, Data data) {
        Intrinsics.checkNotNullParameter(payoutChartState, "payoutChartState");
        this.f286202a = payoutChartState;
        this.f286203b = data;
    }

    public /* synthetic */ e(x4e.d dVar, int i) {
        this((i & 1) != 0 ? new x4e.d(null, null, null) : dVar, (Data) null);
    }
}
