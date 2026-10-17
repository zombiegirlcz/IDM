package q90;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004R \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0014\u001a\u0004\b\u0005\u0010\u0015R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00178\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0006\u001a\u0004\b\u0018\u0010\u0004¨\u0006\u001e"}, d2 = {"Lq90/u0;", "Lq90/b2;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "id", "", "b", "Z", "d", "()Z", "required", "hint", "e", "searchHint", "", "Lq90/t0;", "Ljava/util/List;", "()Ljava/util/List;", "countries", "Lq90/q3;", "f", "Lq90/q3;", "g", "()Lq90/q3;", "value", "style", "core_backend_flow_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class u0 extends b2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("required")
    private final boolean required;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("hint")
    private final String hint;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("searchHint")
    @NotNull
    private final String searchHint;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("countries")
    @NotNull
    private final List<t0> countries;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("value")
    private final q3 value;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("style")
    private final String style;

    public u0(String id10, boolean z, String str, String searchHint, ArrayList countries, q3 q3Var, String str2) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(searchHint, "searchHint");
        Intrinsics.checkNotNullParameter(countries, "countries");
        this.id = id10;
        this.required = z;
        this.hint = str;
        this.searchHint = searchHint;
        this.countries = countries;
        this.value = q3Var;
        this.style = str2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getCountries() {
        return this.countries;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getHint() {
        return this.hint;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getRequired() {
        return this.required;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getSearchHint() {
        return this.searchHint;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj2;
        return Intrinsics.f(this.id, u0Var.id) && this.required == u0Var.required && Intrinsics.f(this.hint, u0Var.hint) && Intrinsics.f(this.searchHint, u0Var.searchHint) && Intrinsics.f(this.countries, u0Var.countries) && Intrinsics.f(this.value, u0Var.value) && Intrinsics.f(this.style, u0Var.style);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getStyle() {
        return this.style;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final q3 getValue() {
        return this.value;
    }

    public final int hashCode() {
        int iC = j6.a.c(this.id.hashCode() * 31, 31, this.required);
        String str = this.hint;
        int iD = p.a.d(p.a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.searchHint), 31, this.countries);
        q3 q3Var = this.value;
        int iHashCode = (iD + (q3Var == null ? 0 : q3Var.hashCode())) * 31;
        String str2 = this.style;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
