package q90;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0016\u0010\u0004R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00188\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010!\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u001f\u001a\u0004\b\n\u0010 R\u001c\u0010&\u001a\u0004\u0018\u00010\"8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b\u0019\u0010%R\u001c\u0010*\u001a\u0004\u0018\u00010'8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010(\u001a\u0004\b\u0005\u0010)R\u001c\u0010-\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010+\u001a\u0004\b#\u0010,R\"\u0010/\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0012\u001a\u0004\b\u0011\u0010\u0014¨\u00060"}, d2 = {"Lq90/q2;", "Lq90/b2;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "d", "id", "", "b", "Z", "h", "()Z", "required", "", "Lq90/h3;", "c", "Ljava/util/List;", "f", "()Ljava/util/List;", "options", "i", "searchHint", "Lq90/r2;", "e", "Lq90/r2;", "j", "()Lq90/r2;", "value", "Lq90/f3;", "Lq90/f3;", "()Lq90/f3;", "customOption", "Lq90/t2;", "g", "Lq90/t2;", "()Lq90/t2;", "noneApplyOption", "Lq90/e;", "Lq90/e;", "()Lq90/e;", "allApplyOption", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "requireAll", "Lq90/g3;", "groups", "core_backend_flow_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class q2 extends b2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("required")
    private final boolean required;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("options")
    @NotNull
    private final List<h3> options;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("searchHint")
    private final String searchHint;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("value")
    private final r2 value;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("customOption")
    private final f3 customOption;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("noneApplyOption")
    private final t2 noneApplyOption;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("allApplyOption")
    private final e allApplyOption;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("requiredAllOptionsSelected")
    private final Boolean requireAll;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("groups")
    private final List<g3> groups;

    public q2(String id10, boolean z, ArrayList options, String str, r2 r2Var, f3 f3Var, t2 t2Var, e eVar, Boolean bool, ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(options, "options");
        this.id = id10;
        this.required = z;
        this.options = options;
        this.searchHint = str;
        this.value = r2Var;
        this.customOption = f3Var;
        this.noneApplyOption = t2Var;
        this.allApplyOption = eVar;
        this.requireAll = bool;
        this.groups = arrayList;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final e getAllApplyOption() {
        return this.allApplyOption;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final f3 getCustomOption() {
        return this.customOption;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final List getGroups() {
        return this.groups;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final t2 getNoneApplyOption() {
        return this.noneApplyOption;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q2)) {
            return false;
        }
        q2 q2Var = (q2) obj2;
        return Intrinsics.f(this.id, q2Var.id) && this.required == q2Var.required && Intrinsics.f(this.options, q2Var.options) && Intrinsics.f(this.searchHint, q2Var.searchHint) && Intrinsics.f(this.value, q2Var.value) && Intrinsics.f(this.customOption, q2Var.customOption) && Intrinsics.f(this.noneApplyOption, q2Var.noneApplyOption) && Intrinsics.f(this.allApplyOption, q2Var.allApplyOption) && Intrinsics.f(this.requireAll, q2Var.requireAll) && Intrinsics.f(this.groups, q2Var.groups);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final List getOptions() {
        return this.options;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Boolean getRequireAll() {
        return this.requireAll;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getRequired() {
        return this.required;
    }

    public final int hashCode() {
        int iD = p.a.d(j6.a.c(this.id.hashCode() * 31, 31, this.required), 31, this.options);
        String str = this.searchHint;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        r2 r2Var = this.value;
        int iHashCode2 = (iHashCode + (r2Var == null ? 0 : r2Var.hashCode())) * 31;
        f3 f3Var = this.customOption;
        int iHashCode3 = (iHashCode2 + (f3Var == null ? 0 : f3Var.hashCode())) * 31;
        t2 t2Var = this.noneApplyOption;
        int iHashCode4 = (iHashCode3 + (t2Var == null ? 0 : t2Var.hashCode())) * 31;
        e eVar = this.allApplyOption;
        int iHashCode5 = (iHashCode4 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        Boolean bool = this.requireAll;
        int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        List<g3> list = this.groups;
        return iHashCode6 + (list != null ? list.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getSearchHint() {
        return this.searchHint;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final r2 getValue() {
        return this.value;
    }
}
