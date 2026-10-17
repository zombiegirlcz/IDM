package q90;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\r\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\u000e\u0010\u0004R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0012\u001a\u0004\b\u0005\u0010\u0013R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00158\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u001a"}, d2 = {"Lq90/w0;", "Lq90/b2;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "id", "", "Z", "c", "()Z", "required", "d", "searchHint", "", "Lq90/v0;", "Ljava/util/List;", "()Ljava/util/List;", "currencies", "Lq90/q3;", "e", "Lq90/q3;", "()Lq90/q3;", "value", "core_backend_flow_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class w0 extends b2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("required")
    private final boolean required;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("searchHint")
    @NotNull
    private final String searchHint;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("currencies")
    @NotNull
    private final List<v0> currencies;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("value")
    private final q3 value;

    public w0(String id10, boolean z, String searchHint, ArrayList currencies, q3 q3Var) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(searchHint, "searchHint");
        Intrinsics.checkNotNullParameter(currencies, "currencies");
        this.id = id10;
        this.required = z;
        this.searchHint = searchHint;
        this.currencies = currencies;
        this.value = q3Var;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getCurrencies() {
        return this.currencies;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getRequired() {
        return this.required;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getSearchHint() {
        return this.searchHint;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final q3 getValue() {
        return this.value;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj2;
        return Intrinsics.f(this.id, w0Var.id) && this.required == w0Var.required && Intrinsics.f(this.searchHint, w0Var.searchHint) && Intrinsics.f(this.currencies, w0Var.currencies) && Intrinsics.f(this.value, w0Var.value);
    }

    public final int hashCode() {
        int iD = p.a.d(p.a.c(j6.a.c(this.id.hashCode() * 31, 31, this.required), 31, this.searchHint), 31, this.currencies);
        q3 q3Var = this.value;
        return iD + (q3Var == null ? 0 : q3Var.hashCode());
    }
}
