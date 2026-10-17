package pf9;

import com.revolut.data.model.Data;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f235539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f235540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final om1.a f235541c;

    public h(Data extraData, Map fieldValues, om1.a aVar) {
        Intrinsics.checkNotNullParameter(extraData, "extraData");
        Intrinsics.checkNotNullParameter(fieldValues, "fieldValues");
        this.f235539a = extraData;
        this.f235540b = fieldValues;
        this.f235541c = aVar;
    }

    public static h a(h hVar, Data extraData, HashMap map, om1.a aVar, int i) {
        if ((i & 1) != 0) {
            extraData = hVar.f235539a;
        }
        Map fieldValues = map;
        if ((i & 2) != 0) {
            fieldValues = hVar.f235540b;
        }
        if ((i & 4) != 0) {
            aVar = hVar.f235541c;
        }
        hVar.getClass();
        Intrinsics.checkNotNullParameter(extraData, "extraData");
        Intrinsics.checkNotNullParameter(fieldValues, "fieldValues");
        return new h(extraData, fieldValues, aVar);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f235539a, hVar.f235539a) && Intrinsics.f(this.f235540b, hVar.f235540b) && Intrinsics.f(this.f235541c, hVar.f235541c);
    }

    public final int hashCode() {
        int iE = p.a.e(this.f235539a.hashCode() * 31, 31, this.f235540b);
        om1.a aVar = this.f235541c;
        return iE + (aVar == null ? 0 : aVar.hashCode());
    }
}
