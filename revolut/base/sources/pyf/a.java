package pyf;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f240818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f240819b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f240820c;
    public final String d;
    public final String e;
    public final Map f;

    public a(String experienceId, String optionId, String date, String currency, String str, Map agebandSelectionMap) {
        Intrinsics.checkNotNullParameter(experienceId, "experienceId");
        Intrinsics.checkNotNullParameter(optionId, "optionId");
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(agebandSelectionMap, "agebandSelectionMap");
        this.f240818a = experienceId;
        this.f240819b = optionId;
        this.f240820c = date;
        this.d = currency;
        this.e = str;
        this.f = agebandSelectionMap;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f240818a, aVar.f240818a) && Intrinsics.f(this.f240819b, aVar.f240819b) && Intrinsics.f(this.f240820c, aVar.f240820c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e) && Intrinsics.f(this.f, aVar.f);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(p.a.c(this.f240818a.hashCode() * 31, 31, this.f240819b), 31, this.f240820c), 31, this.d);
        String str = this.e;
        return this.f.hashCode() + ((iC + (str == null ? 0 : str.hashCode())) * 31);
    }
}
