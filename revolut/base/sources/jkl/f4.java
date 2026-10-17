package jkl;

import java.time.ZonedDateTime;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR\"\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0006\u0010\u0014R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00168\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0012\u0010\u0004¨\u0006\u001e"}, d2 = {"Ljkl/f4;", "Ljkl/i4;", "", "toString", "()Ljava/lang/String;", "Ljkl/i;", "a", "Ljkl/i;", "d", "()Ljkl/i;", "method", "Ljava/time/ZonedDateTime;", "b", "Ljava/time/ZonedDateTime;", "()Ljava/time/ZonedDateTime;", "cooldown", "", "Ljkl/a3;", "c", "Ljava/util/Set;", "()Ljava/util/Set;", "actions", "", "Ljava/lang/Integer;", "getCode", "()Ljava/lang/Integer;", "code", "e", "Ljava/lang/String;", "message", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class f4 implements i4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("method")
    private final i method;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("cooldown")
    private final ZonedDateTime cooldown;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("availableActions")
    private final Set<a3> actions;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("code")
    private final Integer code;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
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

    /* JADX INFO: renamed from: d, reason: from getter */
    public final i getMethod() {
        return this.method;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f4)) {
            return false;
        }
        f4 f4Var = (f4) obj2;
        return this.method == f4Var.method && Intrinsics.f(this.cooldown, f4Var.cooldown) && Intrinsics.f(this.actions, f4Var.actions) && Intrinsics.f(this.code, f4Var.code) && Intrinsics.f(this.message, f4Var.message);
    }

    public final int hashCode() {
        i iVar = this.method;
        int iHashCode = (iVar == null ? 0 : iVar.hashCode()) * 31;
        ZonedDateTime zonedDateTime = this.cooldown;
        int iHashCode2 = (iHashCode + (zonedDateTime == null ? 0 : zonedDateTime.hashCode())) * 31;
        Set<a3> set = this.actions;
        int iHashCode3 = (iHashCode2 + (set == null ? 0 : set.hashCode())) * 31;
        Integer num = this.code;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.message;
        return iHashCode4 + (str != null ? str.hashCode() : 0);
    }
}
