package pyf;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f240821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f240822b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f240823c;
    public final Map d;

    public b(String experienceId, String date, String currency, Map agebandSelectionMap) {
        Intrinsics.checkNotNullParameter(experienceId, "experienceId");
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(agebandSelectionMap, "agebandSelectionMap");
        this.f240821a = experienceId;
        this.f240822b = date;
        this.f240823c = currency;
        this.d = agebandSelectionMap;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f240821a, bVar.f240821a) && Intrinsics.f(this.f240822b, bVar.f240822b) && Intrinsics.f(this.f240823c, bVar.f240823c) && Intrinsics.f(this.d, bVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(p.a.c(this.f240821a.hashCode() * 31, 31, this.f240822b), 31, this.f240823c);
    }
}
