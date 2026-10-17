package kve;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\r\u0010\nR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R\"\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\b\u001a\u0004\b\u0014\u0010\n¨\u0006\u0016"}, d2 = {"Lkve/c;", "", "", "toString", "()Ljava/lang/String;", "", "Lkve/e;", "a", "Ljava/util/List;", "d", "()Ljava/util/List;", "storedMethods", "Lxue/f;", "b", "otherMethods", "Lxue/e;", "c", "Lxue/e;", "()Lxue/e;", "promoBanner", "e", "supportedCurrencyCodes", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("storedMethods")
    @NotNull
    private final List<e> storedMethods;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("otherMethods")
    @NotNull
    private final List<xue.f> otherMethods;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("promoBanner")
    private final xue.e promoBanner;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("supportedCurrencyCodes")
    private final List<String> supportedCurrencyCodes;

    public c(ArrayList storedMethods, List otherMethods, xue.e eVar, List list) {
        Intrinsics.checkNotNullParameter(storedMethods, "storedMethods");
        Intrinsics.checkNotNullParameter(otherMethods, "otherMethods");
        this.storedMethods = storedMethods;
        this.otherMethods = otherMethods;
        this.promoBanner = eVar;
        this.supportedCurrencyCodes = list;
    }

    public static c a(c cVar, ArrayList storedMethods) {
        List<xue.f> otherMethods = cVar.otherMethods;
        xue.e eVar = cVar.promoBanner;
        List<String> list = cVar.supportedCurrencyCodes;
        Intrinsics.checkNotNullParameter(storedMethods, "storedMethods");
        Intrinsics.checkNotNullParameter(otherMethods, "otherMethods");
        return new c(storedMethods, otherMethods, eVar, list);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getOtherMethods() {
        return this.otherMethods;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final xue.e getPromoBanner() {
        return this.promoBanner;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final List getStoredMethods() {
        return this.storedMethods;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final List getSupportedCurrencyCodes() {
        return this.supportedCurrencyCodes;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.storedMethods, cVar.storedMethods) && Intrinsics.f(this.otherMethods, cVar.otherMethods) && Intrinsics.f(this.promoBanner, cVar.promoBanner) && Intrinsics.f(this.supportedCurrencyCodes, cVar.supportedCurrencyCodes);
    }

    public final int hashCode() {
        int iD = p.a.d(this.storedMethods.hashCode() * 31, 31, this.otherMethods);
        xue.e eVar = this.promoBanner;
        int iHashCode = (iD + (eVar == null ? 0 : eVar.hashCode())) * 31;
        List<String> list = this.supportedCurrencyCodes;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }
}
