package u1m;

import ch.qos.logback.core.CoreConstants;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kp0.w0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class q implements Serializable {

    @NotNull
    public static final p Companion = new p();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f276496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f276497b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f276498c;
    public final x2m.f d;
    public final ArrayList e;

    public q(String transactionToken, String str, String projectId, x2m.f settings, ArrayList processOptionsList) {
        Intrinsics.checkNotNullParameter(transactionToken, "transactionToken");
        Intrinsics.checkNotNullParameter(projectId, "projectId");
        Intrinsics.checkNotNullParameter(settings, "settings");
        Intrinsics.checkNotNullParameter(processOptionsList, "processOptionsList");
        this.f276496a = transactionToken;
        this.f276497b = str;
        this.f276498c = projectId;
        this.d = settings;
        this.e = processOptionsList;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f276496a, qVar.f276496a) && Intrinsics.f(this.f276497b, qVar.f276497b) && Intrinsics.f(this.f276498c, qVar.f276498c) && Intrinsics.f(this.d, qVar.d) && this.e.equals(qVar.e);
    }

    public final int hashCode() {
        int iHashCode = this.f276496a.hashCode() * 31;
        String str = this.f276497b;
        return this.e.hashCode() + ((this.d.hashCode() + w0.a(this.f276498c, (iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        return "CoreEkycParams(transactionToken=" + ((Object) w1m.m.a(this.f276496a)) + ", apiBaseUrl=" + this.f276497b + ", projectId=" + this.f276498c + ", settings=" + this.d + ", processOptionsList=" + this.e + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
