package q90;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\r\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\u000f\u0010\u0004R\u001a\u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0011\u0010\u0004R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u000e\u0010\u0004R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00158\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u001a"}, d2 = {"Lq90/e0;", "Lq90/b2;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "id", "", "b", "Z", "f", "()Z", "required", "c", "d", "mode", "e", "presentedDate", "minSelectableDate", "maxSelectableDate", "Lq90/y0;", "g", "Lq90/y0;", "()Lq90/y0;", "value", "core_backend_flow_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class e0 extends b2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("required")
    private final boolean required;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("mode")
    @NotNull
    private final String mode;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("presentedDate")
    @NotNull
    private final String presentedDate;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("minSelectableDate")
    private final String minSelectableDate;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("maxSelectableDate")
    private final String maxSelectableDate;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("value")
    private final y0 value;

    public e0(String id10, boolean z, String mode, String presentedDate, String str, String str2, y0 y0Var) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(presentedDate, "presentedDate");
        this.id = id10;
        this.required = z;
        this.mode = mode;
        this.presentedDate = presentedDate;
        this.minSelectableDate = str;
        this.maxSelectableDate = str2;
        this.value = y0Var;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getMaxSelectableDate() {
        return this.maxSelectableDate;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getMinSelectableDate() {
        return this.minSelectableDate;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getMode() {
        return this.mode;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getPresentedDate() {
        return this.presentedDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj2;
        return Intrinsics.f(this.id, e0Var.id) && this.required == e0Var.required && Intrinsics.f(this.mode, e0Var.mode) && Intrinsics.f(this.presentedDate, e0Var.presentedDate) && Intrinsics.f(this.minSelectableDate, e0Var.minSelectableDate) && Intrinsics.f(this.maxSelectableDate, e0Var.maxSelectableDate) && Intrinsics.f(this.value, e0Var.value);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getRequired() {
        return this.required;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final y0 getValue() {
        return this.value;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(j6.a.c(this.id.hashCode() * 31, 31, this.required), 31, this.mode), 31, this.presentedDate);
        String str = this.minSelectableDate;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.maxSelectableDate;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        y0 y0Var = this.value;
        return iHashCode2 + (y0Var != null ? y0Var.hashCode() : 0);
    }
}
