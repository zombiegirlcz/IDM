package n10;

import com.revolut.data.model.Data;
import dj0.d;
import java.util.LinkedHashMap;
import kii.e;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f211197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f211198b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f211199c;
    public final LinkedHashMap d;
    public final d e;
    public final ay2.d f;

    public a(Data physicalGroups, Data virtualGroups, Data disposableGroups, LinkedHashMap lockedInfo, d dVar, ay2.d needPlanUpgrade) {
        Intrinsics.checkNotNullParameter(physicalGroups, "physicalGroups");
        Intrinsics.checkNotNullParameter(virtualGroups, "virtualGroups");
        Intrinsics.checkNotNullParameter(disposableGroups, "disposableGroups");
        Intrinsics.checkNotNullParameter(lockedInfo, "lockedInfo");
        Intrinsics.checkNotNullParameter(needPlanUpgrade, "needPlanUpgrade");
        this.f211197a = physicalGroups;
        this.f211198b = virtualGroups;
        this.f211199c = disposableGroups;
        this.d = lockedInfo;
        this.e = dVar;
        this.f = needPlanUpgrade;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f211197a.equals(aVar.f211197a) && this.f211198b.equals(aVar.f211198b) && this.f211199c.equals(aVar.f211199c) && this.d.equals(aVar.d) && Intrinsics.f(this.e, aVar.e) && this.f.equals(aVar.f);
    }

    public final int hashCode() {
        int iE = r6.b.e(this.d, e.c(this.f211199c, e.c(this.f211198b, this.f211197a.hashCode() * 31, 31), 31), 31);
        d dVar = this.e;
        return this.f.hashCode() + ((iE + (dVar == null ? 0 : dVar.hashCode())) * 31);
    }
}
