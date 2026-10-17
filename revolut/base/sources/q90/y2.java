package q90;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u000f\u0010\u0004R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0011\u0010\u0004R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\"\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0016\u001a\u0004\b\u0005\u0010\u0017R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00198\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001c¨\u0006\u001e"}, d2 = {"Lq90/y2;", "Lq90/b2;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "d", "id", "", "b", "Z", "e", "()Z", "required", "c", "hint", "f", "searchHint", "dropdownHint", "", "Lq90/y2$a;", "Ljava/util/List;", "()Ljava/util/List;", "countries", "Lq90/z2;", "g", "Lq90/z2;", "()Lq90/z2;", "value", "core_backend_flow_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class y2 extends b2 {

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
    private final String searchHint;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("dropdownHint")
    private final String dropdownHint;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("regions")
    private final List<a> countries;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("value")
    private final z2 value;

    /* JADX INFO: loaded from: classes19.dex */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u0006\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\f\u001a\u0004\b\u000b\u0010\u0004¨\u0006\u000f"}, d2 = {"Lq90/y2$a;", "", "", "toString", "()Ljava/lang/String;", "", "a", "I", "c", "()I", "phoneCode", "b", "Ljava/lang/String;", "countryCode", "description", "core_backend_flow_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("code")
        private final int phoneCode;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("countryCode")
        @NotNull
        private final String countryCode;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("description")
        private final String description;

        public a(int i, String countryCode, String str) {
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            this.phoneCode = i;
            this.countryCode = countryCode;
            this.description = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getCountryCode() {
            return this.countryCode;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getPhoneCode() {
            return this.phoneCode;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return this.phoneCode == aVar.phoneCode && Intrinsics.f(this.countryCode, aVar.countryCode) && Intrinsics.f(this.description, aVar.description);
        }

        public final int hashCode() {
            int iC = p.a.c(Integer.hashCode(this.phoneCode) * 31, 31, this.countryCode);
            String str = this.description;
            return iC + (str == null ? 0 : str.hashCode());
        }
    }

    public y2(String id10, boolean z, String str, String str2, String str3, ArrayList arrayList, z2 z2Var) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.id = id10;
        this.required = z;
        this.hint = str;
        this.searchHint = str2;
        this.dropdownHint = str3;
        this.countries = arrayList;
        this.value = z2Var;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getCountries() {
        return this.countries;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getDropdownHint() {
        return this.dropdownHint;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getHint() {
        return this.hint;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getRequired() {
        return this.required;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y2)) {
            return false;
        }
        y2 y2Var = (y2) obj2;
        return Intrinsics.f(this.id, y2Var.id) && this.required == y2Var.required && Intrinsics.f(this.hint, y2Var.hint) && Intrinsics.f(this.searchHint, y2Var.searchHint) && Intrinsics.f(this.dropdownHint, y2Var.dropdownHint) && Intrinsics.f(this.countries, y2Var.countries) && Intrinsics.f(this.value, y2Var.value);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getSearchHint() {
        return this.searchHint;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final z2 getValue() {
        return this.value;
    }

    public final int hashCode() {
        int iC = j6.a.c(this.id.hashCode() * 31, 31, this.required);
        String str = this.hint;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.searchHint;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.dropdownHint;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<a> list = this.countries;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        z2 z2Var = this.value;
        return iHashCode4 + (z2Var != null ? z2Var.hashCode() : 0);
    }
}
