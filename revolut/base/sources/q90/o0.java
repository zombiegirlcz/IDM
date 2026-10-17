package q90;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\u0004R\u001a\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\u0004R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0012\u001a\u0004\b\n\u0010\u0013R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00158\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u001b\u001a\u0004\b\r\u0010\u001c¨\u0006\u001e"}, d2 = {"Lq90/o0;", "Lq90/b2;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "id", "hint", "c", "e", "searchHint", "d", "f", "searchTitle", "", "Lq90/p0;", "Ljava/util/List;", "()Ljava/util/List;", "options", "Lq90/q3;", "Lq90/q3;", "g", "()Lq90/q3;", "value", "", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "required", "core_backend_flow_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@yhm.d
public final /* data */ class o0 extends b2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("hint")
    @NotNull
    private final String hint;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("searchHint")
    @NotNull
    private final String searchHint;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("searchTitle")
    @NotNull
    private final String searchTitle;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("options")
    @NotNull
    private final List<p0> options;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("value")
    private final q3 value;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("required")
    private final Boolean required;

    public o0(String id10, String hint, String searchHint, String searchTitle, ArrayList options, q3 q3Var, Boolean bool) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(hint, "hint");
        Intrinsics.checkNotNullParameter(searchHint, "searchHint");
        Intrinsics.checkNotNullParameter(searchTitle, "searchTitle");
        Intrinsics.checkNotNullParameter(options, "options");
        this.id = id10;
        this.hint = hint;
        this.searchHint = searchHint;
        this.searchTitle = searchTitle;
        this.options = options;
        this.value = q3Var;
        this.required = bool;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getHint() {
        return this.hint;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final List getOptions() {
        return this.options;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Boolean getRequired() {
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
        if (!(obj2 instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj2;
        return Intrinsics.f(this.id, o0Var.id) && Intrinsics.f(this.hint, o0Var.hint) && Intrinsics.f(this.searchHint, o0Var.searchHint) && Intrinsics.f(this.searchTitle, o0Var.searchTitle) && Intrinsics.f(this.options, o0Var.options) && Intrinsics.f(this.value, o0Var.value) && Intrinsics.f(this.required, o0Var.required);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getSearchTitle() {
        return this.searchTitle;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final q3 getValue() {
        return this.value;
    }

    public final int hashCode() {
        int iD = p.a.d(p.a.c(p.a.c(p.a.c(this.id.hashCode() * 31, 31, this.hint), 31, this.searchHint), 31, this.searchTitle), 31, this.options);
        q3 q3Var = this.value;
        int iHashCode = (iD + (q3Var == null ? 0 : q3Var.hashCode())) * 31;
        Boolean bool = this.required;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }
}
