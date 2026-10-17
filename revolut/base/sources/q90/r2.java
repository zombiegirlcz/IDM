package q90;

import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\u0006\u0010\u0004¨\u0006\r"}, d2 = {"Lq90/r2;", "Lq90/y;", "", "toString", "()Ljava/lang/String;", "", "a", "Ljava/util/Set;", "b", "()Ljava/util/Set;", "selected", "Ljava/lang/String;", "customAnswer", "core_backend_flow_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class r2 extends y {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("optionIds")
    @NotNull
    private final Set<String> selected;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("customOption")
    private final String customAnswer;

    public r2(String str, Set selected) {
        Intrinsics.checkNotNullParameter(selected, "selected");
        this.selected = selected;
        this.customAnswer = str;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCustomAnswer() {
        return this.customAnswer;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Set getSelected() {
        return this.selected;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r2)) {
            return false;
        }
        r2 r2Var = (r2) obj2;
        return Intrinsics.f(this.selected, r2Var.selected) && Intrinsics.f(this.customAnswer, r2Var.customAnswer);
    }

    public final int hashCode() {
        int iHashCode = this.selected.hashCode() * 31;
        String str = this.customAnswer;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
