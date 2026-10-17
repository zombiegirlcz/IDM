package oyd;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0014\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0013\u0010\u0004R\u001a\u0010\u001a\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Loyd/f;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getFrom", "from", "b", "getTo", "to", "", "c", "Ljava/util/List;", "getAccountIds", "()Ljava/util/List;", "accountIds", "d", "getFormat", "format", "", "e", "Z", "getEmailNotification", "()Z", "emailNotification", "retail_feature_statements_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("from")
    @NotNull
    private final String from;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("to")
    @NotNull
    private final String to;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("accountIds")
    @NotNull
    private final List<String> accountIds;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("format")
    @NotNull
    private final String format;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("emailNotification")
    private final boolean emailNotification;

    public f(String from, String to6, String format, ArrayList accountIds, boolean z) {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(to6, "to");
        Intrinsics.checkNotNullParameter(accountIds, "accountIds");
        Intrinsics.checkNotNullParameter(format, "format");
        this.from = from;
        this.to = to6;
        this.accountIds = accountIds;
        this.format = format;
        this.emailNotification = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.from, fVar.from) && Intrinsics.f(this.to, fVar.to) && Intrinsics.f(this.accountIds, fVar.accountIds) && Intrinsics.f(this.format, fVar.format) && this.emailNotification == fVar.emailNotification;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.emailNotification) + p.a.c(p.a.d(p.a.c(this.from.hashCode() * 31, 31, this.to), 31, this.accountIds), 31, this.format);
    }
}
