package o4h;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f222272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f222273b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n2h.f f222274c;

    public e(Data data, Data data2, n2h.f actionsPanelState) {
        Intrinsics.checkNotNullParameter(actionsPanelState, "actionsPanelState");
        this.f222272a = data;
        this.f222273b = data2;
        this.f222274c = actionsPanelState;
    }

    public static e a(e eVar, Data data, Data data2, n2h.f actionsPanelState, int i) {
        if ((i & 1) != 0) {
            data = eVar.f222272a;
        }
        if ((i & 2) != 0) {
            data2 = eVar.f222273b;
        }
        if ((i & 4) != 0) {
            actionsPanelState = eVar.f222274c;
        }
        eVar.getClass();
        Intrinsics.checkNotNullParameter(actionsPanelState, "actionsPanelState");
        return new e(data, data2, actionsPanelState);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f222272a, eVar.f222272a) && Intrinsics.f(this.f222273b, eVar.f222273b) && Intrinsics.f(this.f222274c, eVar.f222274c);
    }

    public final int hashCode() {
        Data data = this.f222272a;
        int iHashCode = (data == null ? 0 : data.hashCode()) * 31;
        Data data2 = this.f222273b;
        return this.f222274c.f211545a.hashCode() + ((iHashCode + (data2 != null ? data2.hashCode() : 0)) * 31);
    }
}
