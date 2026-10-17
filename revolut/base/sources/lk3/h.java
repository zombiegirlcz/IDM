package lk3;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\f\u001a\u0004\b\u0006\u0010\rR \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u000f\u0010\rR \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u0011\u0010\r¨\u0006\u0013"}, d2 = {"Llk3/h;", "", "", "toString", "()Ljava/lang/String;", "", "a", "Z", "b", "()Z", "countryChangeAllowed", "", "Ljava/util/List;", "()Ljava/util/List;", "automated", "c", "manual", "d", "unsupported", "feature_configuration_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("countryChangeAllowed")
    private final boolean countryChangeAllowed;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("automated")
    @NotNull
    private final List<String> automated;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("manual")
    @NotNull
    private final List<String> manual;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("unsupported")
    @NotNull
    private final List<String> unsupported;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getAutomated() {
        return this.automated;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getCountryChangeAllowed() {
        return this.countryChangeAllowed;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final List getManual() {
        return this.manual;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final List getUnsupported() {
        return this.unsupported;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.countryChangeAllowed == hVar.countryChangeAllowed && Intrinsics.f(this.automated, hVar.automated) && Intrinsics.f(this.manual, hVar.manual) && Intrinsics.f(this.unsupported, hVar.unsupported);
    }

    public final int hashCode() {
        return this.unsupported.hashCode() + p.a.d(p.a.d(Boolean.hashCode(this.countryChangeAllowed) * 31, 31, this.automated), 31, this.manual);
    }
}
