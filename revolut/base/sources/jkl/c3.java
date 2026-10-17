package jkl;

import java.time.ZonedDateTime;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\"\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\r\u001a\u0004\b\u0006\u0010\u000eR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00108\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0011\u0010\u0004¨\u0006\u0019"}, d2 = {"Ljkl/c3;", "Ljkl/i4;", "", "toString", "()Ljava/lang/String;", "Ljava/time/ZonedDateTime;", "a", "Ljava/time/ZonedDateTime;", "b", "()Ljava/time/ZonedDateTime;", "cooldown", "", "Ljkl/a3;", "Ljava/util/Set;", "()Ljava/util/Set;", "actions", "", "c", "Ljava/lang/Integer;", "getCode", "()Ljava/lang/Integer;", "code", "d", "Ljava/lang/String;", "message", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class c3 implements i4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("cooldown")
    private final ZonedDateTime cooldown;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("availableActions")
    private final Set<a3> actions;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("code")
    private final Integer code;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("message")
    private final String message;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Set getActions() {
        return this.actions;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final ZonedDateTime getCooldown() {
        return this.cooldown;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c3)) {
            return false;
        }
        c3 c3Var = (c3) obj2;
        return Intrinsics.f(this.cooldown, c3Var.cooldown) && Intrinsics.f(this.actions, c3Var.actions) && Intrinsics.f(this.code, c3Var.code) && Intrinsics.f(this.message, c3Var.message);
    }

    public final int hashCode() {
        ZonedDateTime zonedDateTime = this.cooldown;
        int iHashCode = (zonedDateTime == null ? 0 : zonedDateTime.hashCode()) * 31;
        Set<a3> set = this.actions;
        int iHashCode2 = (iHashCode + (set == null ? 0 : set.hashCode())) * 31;
        Integer num = this.code;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.message;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }
}
