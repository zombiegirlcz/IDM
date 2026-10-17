package ob0;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f223818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f223819b;

    public e(String itemId, ArrayList currencies) {
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        Intrinsics.checkNotNullParameter(currencies, "currencies");
        this.f223818a = itemId;
        this.f223819b = currencies;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f223818a, eVar.f223818a) && this.f223819b.equals(eVar.f223819b);
    }

    public final int hashCode() {
        return this.f223819b.hashCode() + (this.f223818a.hashCode() * 31);
    }
}
