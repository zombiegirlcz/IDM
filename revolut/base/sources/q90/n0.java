package q90;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\r\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u000f\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000e\u0010\fR \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0012\u001a\u0004\b\u0005\u0010\u0013R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u001a"}, d2 = {"Lq90/n0;", "Lq90/v;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "id", "", "Z", "d", "()Z", "required", "c", "mutuallyExclusive", "", "Lq90/n0$a;", "Ljava/util/List;", "()Ljava/util/List;", "chips", "Lq90/m0;", "e", "Lq90/m0;", "()Lq90/m0;", "value", "core_backend_flow_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class n0 extends v {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("required")
    private final boolean required;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("mutuallyExclusive")
    private final boolean mutuallyExclusive;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("toggles")
    @NotNull
    private final List<a> chips;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("value")
    private final m0 value;

    /* JADX INFO: loaded from: classes19.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0006\u001a\u0004\b\b\u0010\u0004¨\u0006\n"}, d2 = {"Lq90/n0$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "id", "b", "label", "core_backend_flow_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("id")
        @NotNull
        private final String id;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("label")
        @NotNull
        private final String label;

        public a(String id10, String label) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(label, "label");
            this.id = id10;
            this.label = label;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.id, aVar.id) && Intrinsics.f(this.label, aVar.label);
        }

        public final int hashCode() {
            return this.label.hashCode() + (this.id.hashCode() * 31);
        }
    }

    public n0(String id10, boolean z, boolean z3, ArrayList chips, m0 m0Var) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(chips, "chips");
        this.id = id10;
        this.required = z;
        this.mutuallyExclusive = z3;
        this.chips = chips;
        this.value = m0Var;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getChips() {
        return this.chips;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getMutuallyExclusive() {
        return this.mutuallyExclusive;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getRequired() {
        return this.required;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final m0 getValue() {
        return this.value;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj2;
        return Intrinsics.f(this.id, n0Var.id) && this.required == n0Var.required && this.mutuallyExclusive == n0Var.mutuallyExclusive && Intrinsics.f(this.chips, n0Var.chips) && Intrinsics.f(this.value, n0Var.value);
    }

    public final int hashCode() {
        int iD = p.a.d(j6.a.c(j6.a.c(this.id.hashCode() * 31, 31, this.required), 31, this.mutuallyExclusive), 31, this.chips);
        m0 m0Var = this.value;
        return iD + (m0Var == null ? 0 : m0Var.hashCode());
    }
}
