package puj;

import java.time.LocalDateTime;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDateTime f239904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f239905b;

    public a(LocalDateTime date, ArrayList items) {
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f239904a = date;
        this.f239905b = items;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f239904a, aVar.f239904a) && this.f239905b.equals(aVar.f239905b);
    }

    public final int hashCode() {
        return this.f239905b.hashCode() + (this.f239904a.hashCode() * 31);
    }
}
