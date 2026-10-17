package zme;

import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import my8.r;
import org.jetbrains.annotations.NotNull;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes8.dex */
public final class i implements Serializable {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f323497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f323498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f323499c;
    public final Boolean d;

    public static final class a {
        private a() {
        }
    }

    public i() {
        this(null, null, null, null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f323497a == iVar.f323497a && Intrinsics.f(this.f323498b, iVar.f323498b) && Intrinsics.f(this.f323499c, iVar.f323499c) && Intrinsics.f(this.d, iVar.d);
    }

    public final int hashCode() {
        r rVar = this.f323497a;
        int iHashCode = (rVar == null ? 0 : rVar.hashCode()) * 31;
        List list = this.f323498b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        LocalDate localDate = this.f323499c;
        int iHashCode3 = (iHashCode2 + (localDate == null ? 0 : localDate.hashCode())) * 31;
        Boolean bool = this.d;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public i(r rVar, List list, LocalDate localDate, Boolean bool) {
        this.f323497a = rVar;
        this.f323498b = list;
        this.f323499c = localDate;
        this.d = bool;
    }
}
