package jkl;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u0000 &2\u00020\u0001:\u0002\n\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0016\u0010\u0004R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0019\u001a\u0004\b\u0015\u0010\u001aR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010 \u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001e\u001a\u0004\b\u0010\u0010\u001fR\u001c\u0010%\u001a\u0004\u0018\u00010!8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\"\u0010$¨\u0006'"}, d2 = {"Ljkl/w;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "f", "id", "Ljkl/i;", "b", "Ljkl/i;", "g", "()Ljkl/i;", "method", "Ljkl/w$a;", "c", "Ljkl/w$a;", "i", "()Ljkl/w$a;", "state", "d", "e", "hint", "", "Ljava/lang/Long;", "()Ljava/lang/Long;", "expiresAt", "code", "Ljkl/v;", "Ljkl/v;", "()Ljkl/v;", "details", "Ljkl/l2;", "h", "Ljkl/l2;", "()Ljkl/l2;", "operation", "Companion", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("method")
    @NotNull
    private final i method;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("state")
    private final a state;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("hint")
    private final String hint;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("expiresAt")
    private final Long expiresAt;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("code")
    private final String code;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("details")
    private final v details;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("operation")
    private final l2 operation;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: classes12.dex */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Ljkl/w$a;", "", "PREPARED", "UNDER_VERIFICATION", "UNKNOWN", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;

        @lg.b("PREPARED")
        public static final a PREPARED;

        @lg.b("UNDER_VERIFICATION")
        public static final a UNDER_VERIFICATION;

        @he0.b
        public static final a UNKNOWN;

        static {
            a aVar = new a("PREPARED", 0);
            PREPARED = aVar;
            a aVar2 = new a("UNDER_VERIFICATION", 1);
            UNDER_VERIFICATION = aVar2;
            a aVar3 = new a("UNKNOWN", 2);
            UNKNOWN = aVar3;
            a[] aVarArr = {aVar, aVar2, aVar3};
            $VALUES = aVarArr;
            $ENTRIES = vc.s.n(aVarArr);
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    public w(String str, i method, a aVar, String str2, Long l2, String str3, v vVar, l2 l2Var) {
        Intrinsics.checkNotNullParameter(method, "method");
        this.id = str;
        this.method = method;
        this.state = aVar;
        this.hint = str2;
        this.expiresAt = l2;
        this.code = str3;
        this.details = vVar;
        this.operation = l2Var;
    }

    public static w a(w wVar, v vVar, l2 l2Var) {
        String str = wVar.id;
        i method = wVar.method;
        a aVar = wVar.state;
        String str2 = wVar.hint;
        Long l2 = wVar.expiresAt;
        String str3 = wVar.code;
        Intrinsics.checkNotNullParameter(method, "method");
        return new w(str, method, aVar, str2, l2, str3, vVar, l2Var);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final v getDetails() {
        return this.details;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Long getExpiresAt() {
        return this.expiresAt;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getHint() {
        return this.hint;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w)) {
            return false;
        }
        w wVar = (w) obj2;
        return Intrinsics.f(this.id, wVar.id) && this.method == wVar.method && this.state == wVar.state && Intrinsics.f(this.hint, wVar.hint) && Intrinsics.f(this.expiresAt, wVar.expiresAt) && Intrinsics.f(this.code, wVar.code) && Intrinsics.f(this.details, wVar.details) && Intrinsics.f(this.operation, wVar.operation);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final i getMethod() {
        return this.method;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final l2 getOperation() {
        return this.operation;
    }

    public final int hashCode() {
        String str = this.id;
        int iHashCode = (this.method.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31;
        a aVar = this.state;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str2 = this.hint;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l2 = this.expiresAt;
        int iHashCode4 = (iHashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str3 = this.code;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        v vVar = this.details;
        int iHashCode6 = (iHashCode5 + (vVar == null ? 0 : vVar.hashCode())) * 31;
        l2 l2Var = this.operation;
        return iHashCode6 + (l2Var != null ? l2Var.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final a getState() {
        return this.state;
    }
}
