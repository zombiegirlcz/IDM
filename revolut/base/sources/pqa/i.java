package pqa;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class i implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f238709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f238710b;

    public i(List fieldInputs, int i) {
        Intrinsics.checkNotNullParameter(fieldInputs, "fieldInputs");
        this.f238709a = fieldInputs;
        this.f238710b = i;
    }

    public static i a(i iVar, ArrayList arrayList, int i, int i2) {
        List fieldInputs = arrayList;
        if ((i2 & 1) != 0) {
            fieldInputs = iVar.f238709a;
        }
        if ((i2 & 2) != 0) {
            i = iVar.f238710b;
        }
        iVar.getClass();
        Intrinsics.checkNotNullParameter(fieldInputs, "fieldInputs");
        return new i(fieldInputs, i);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f238709a, iVar.f238709a) && this.f238710b == iVar.f238710b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f238710b) + (this.f238709a.hashCode() * 31);
    }
}
