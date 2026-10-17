package w1m;

import ch.qos.logback.core.CoreConstants;
import com.trustdockekyc.core.backend.domain.model.AppError;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class c implements Serializable {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f293889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Throwable f293890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f293891c;
    public final String d;
    public final List e;

    public c(String str, Throwable th10, Integer num, String str2, List list) {
        this.f293889a = str;
        this.f293890b = th10;
        this.f293891c = num;
        this.d = str2;
        this.e = list;
    }

    public static c a(c cVar, AppError.NetworkResponseError networkResponseError) {
        String str = cVar.f293889a;
        Integer num = cVar.f293891c;
        String str2 = cVar.d;
        List list = cVar.e;
        cVar.getClass();
        return new c(str, networkResponseError, num, str2, list);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f293889a, cVar.f293889a) && Intrinsics.f(this.f293890b, cVar.f293890b) && Intrinsics.f(this.f293891c, cVar.f293891c) && Intrinsics.f(this.d, cVar.d) && Intrinsics.f(this.e, cVar.e);
    }

    public final int hashCode() {
        String str = this.f293889a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Throwable th10 = this.f293890b;
        int iHashCode2 = (iHashCode + (th10 == null ? 0 : th10.hashCode())) * 31;
        Integer num = this.f293891c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.e;
        return iHashCode4 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder("AppErrorDetail(debugDescription=");
        sb6.append(this.f293889a);
        sb6.append(", reason=");
        sb6.append(this.f293890b);
        sb6.append(", httpStatusCode=");
        sb6.append(this.f293891c);
        sb6.append(", message=");
        sb6.append(this.d);
        sb6.append(", errorParameters=");
        return m72.b.p(CoreConstants.RIGHT_PARENTHESIS_CHAR, this.e, sb6);
    }

    public /* synthetic */ c(int i, String str, String str2, Throwable th10) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : th10, null, (i & 8) != 0 ? null : str2, null);
    }
}
