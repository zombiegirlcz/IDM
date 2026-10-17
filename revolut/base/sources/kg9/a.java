package kg9;

import com.revolut.core.ui_kit.models.TextClause;
import grl.b4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextClause f183933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f183934b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f183935c;
    public final Integer d;

    public a(TextClause dialogTitle, int i, Integer num, Integer num2) {
        Intrinsics.checkNotNullParameter(dialogTitle, "dialogTitle");
        this.f183933a = dialogTitle;
        this.f183934b = i;
        this.f183935c = num;
        this.d = num2;
    }

    public final boolean equals(Object obj2) {
        Object objValueOf = Integer.valueOf(b4.EXPIRED_OR_INVALID_KEY_VALUE);
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f183933a.equals(aVar.f183933a) && this.f183934b == aVar.f183934b && Intrinsics.f(this.f183935c, aVar.f183935c) && objValueOf.equals(objValueOf) && Intrinsics.f(this.d, aVar.d);
    }

    public final int hashCode() {
        int iB = j6.a.b(this.f183934b, this.f183933a.hashCode() * 31, 31);
        Integer num = this.f183935c;
        int iHashCode = (Integer.valueOf(b4.EXPIRED_OR_INVALID_KEY_VALUE).hashCode() + ((iB + (num == null ? 0 : num.hashCode())) * 31)) * 31;
        Integer num2 = this.d;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }
}
