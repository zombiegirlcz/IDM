package wkk;

import com.revolut.data.model.Data;
import hha.w0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f298292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w0 f298293b;

    public e(Data layout, w0 w0Var) {
        Intrinsics.checkNotNullParameter(layout, "layout");
        this.f298292a = layout;
        this.f298293b = w0Var;
    }

    public static e a(e eVar, Data layout, w0 w0Var, int i) {
        if ((i & 1) != 0) {
            layout = eVar.f298292a;
        }
        if ((i & 2) != 0) {
            w0Var = eVar.f298293b;
        }
        eVar.getClass();
        Intrinsics.checkNotNullParameter(layout, "layout");
        return new e(layout, w0Var);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f298292a, eVar.f298292a) && this.f298293b == eVar.f298293b;
    }

    public final int hashCode() {
        int iHashCode = this.f298292a.hashCode() * 31;
        w0 w0Var = this.f298293b;
        return iHashCode + (w0Var == null ? 0 : w0Var.hashCode());
    }
}
