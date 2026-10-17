package q90;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0007\u001a\u0004\b\u000b\u0010\bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\r\u001a\u0004\b\u000e\u0010\u0004R\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\r\u001a\u0004\b\n\u0010\u0004¨\u0006\u0011"}, d2 = {"Lq90/a1;", "Lq90/w3;", "", "toString", "()Ljava/lang/String;", "", "a", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "maxLength", "b", "c", "minLength", "Ljava/lang/String;", "d", "pattern", "message", "core_backend_flow_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@yhm.d
public final /* data */ class a1 extends w3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("maxLength")
    private final Integer maxLength;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("minLength")
    private final Integer minLength;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("pattern")
    private final String pattern;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("message")
    @NotNull
    private final String message;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Integer getMaxLength() {
        return this.maxLength;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Integer getMinLength() {
        return this.minLength;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getPattern() {
        return this.pattern;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a1)) {
            return false;
        }
        a1 a1Var = (a1) obj2;
        return Intrinsics.f(this.maxLength, a1Var.maxLength) && Intrinsics.f(this.minLength, a1Var.minLength) && Intrinsics.f(this.pattern, a1Var.pattern) && Intrinsics.f(this.message, a1Var.message);
    }

    public final int hashCode() {
        Integer num = this.maxLength;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.minLength;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.pattern;
        return this.message.hashCode() + ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31);
    }
}
