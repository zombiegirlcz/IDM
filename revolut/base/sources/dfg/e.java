package dfg;

import cli.j;
import com.revolut.data.model.Data;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;

/* JADX INFO: loaded from: classes9.dex */
public final class e implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final afi.a f113892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f113893b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f113894c;
    public final Boolean d;

    public e() {
        this(0);
    }

    public static e a(e eVar, afi.a aVar, Data bookingDetails, LinkedHashSet linkedHashSet, Boolean bool, int i) {
        if ((i & 1) != 0) {
            aVar = eVar.f113892a;
        }
        if ((i & 2) != 0) {
            bookingDetails = eVar.f113893b;
        }
        Set focusedInputIds = linkedHashSet;
        if ((i & 4) != 0) {
            focusedInputIds = eVar.f113894c;
        }
        if ((i & 8) != 0) {
            bool = eVar.d;
        }
        eVar.getClass();
        Intrinsics.checkNotNullParameter(bookingDetails, "bookingDetails");
        Intrinsics.checkNotNullParameter(focusedInputIds, "focusedInputIds");
        return new e(aVar, bookingDetails, focusedInputIds, bool);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f113892a, eVar.f113892a) && Intrinsics.f(this.f113893b, eVar.f113893b) && Intrinsics.f(this.f113894c, eVar.f113894c) && Intrinsics.f(this.d, eVar.d);
    }

    public final int hashCode() {
        afi.a aVar = this.f113892a;
        int iF = p.a.f(kii.e.c(this.f113893b, (aVar == null ? 0 : aVar.hashCode()) * 31, 31), 31, this.f113894c);
        Boolean bool = this.d;
        return iF + (bool != null ? bool.hashCode() : 0);
    }

    public e(afi.a aVar, Data bookingDetails, Set focusedInputIds, Boolean bool) {
        Intrinsics.checkNotNullParameter(bookingDetails, "bookingDetails");
        Intrinsics.checkNotNullParameter(focusedInputIds, "focusedInputIds");
        this.f113892a = aVar;
        this.f113893b = bookingDetails;
        this.f113894c = focusedInputIds;
        this.d = bool;
    }

    public e(int i) {
        this(null, new Data(null, null, true, 3, null), h0.f322473a, null);
    }
}
