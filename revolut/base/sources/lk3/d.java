package lk3;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR \u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\u000b\u0010\b¨\u0006\r"}, d2 = {"Llk3/d;", "", "", "toString", "()Ljava/lang/String;", "", "a", "Ljava/util/List;", "()Ljava/util/List;", "countries", "Llk3/b;", "b", "fields", "feature_configuration_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("countries")
    private final List<String> countries;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("fields")
    @NotNull
    private final List<b> fields;

    public d(ArrayList arrayList, ArrayList fields) {
        Intrinsics.checkNotNullParameter(fields, "fields");
        this.countries = arrayList;
        this.fields = fields;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getCountries() {
        return this.countries;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getFields() {
        return this.fields;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.countries, dVar.countries) && Intrinsics.f(this.fields, dVar.fields);
    }

    public final int hashCode() {
        List<String> list = this.countries;
        return this.fields.hashCode() + ((list == null ? 0 : list.hashCode()) * 31);
    }
}
