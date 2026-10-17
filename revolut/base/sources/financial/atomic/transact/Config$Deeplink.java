package financial.atomic.transact;

import ch.qos.logback.core.CoreConstants;
import dam.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import mlm.g;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0002\u0004¨\u0006\u0005"}, d2 = {"financial/atomic/transact/Config$Deeplink", "", "Companion", "$serializer", "dam/a", "transact_release"}, k = 1, mv = {1, 8, 0})
@g
public final /* data */ class Config$Deeplink {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f135476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f135477b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f135478c;
    public final String d;
    public final String e;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lfinancial/atomic/transact/Config$Deeplink$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lfinancial/atomic/transact/Config$Deeplink;", "serializer", "()Lkotlinx/serialization/KSerializer;", "transact_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer serializer() {
            return Config$Deeplink$$serializer.INSTANCE;
        }
    }

    public Config$Deeplink(int i, String str, String str2, String str3, String str4) {
        a aVar = a.EMPTY;
        this.f135476a = aVar;
        if ((i & 1) == 0) {
            this.f135477b = null;
        } else {
            this.f135477b = str;
        }
        if ((i & 2) == 0) {
            this.f135478c = null;
        } else {
            this.f135478c = str2;
        }
        if ((i & 4) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
        if ((i & 8) == 0) {
            this.e = aVar.f112551a;
        } else {
            this.e = str4;
        }
        this.e = aVar.f112551a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof Config$Deeplink)) {
            return false;
        }
        Config$Deeplink config$Deeplink = (Config$Deeplink) obj2;
        return this.f135476a == config$Deeplink.f135476a && Intrinsics.f(this.f135477b, config$Deeplink.f135477b) && Intrinsics.f(this.f135478c, config$Deeplink.f135478c) && Intrinsics.f(this.d, config$Deeplink.d);
    }

    public final int hashCode() {
        int iHashCode = this.f135476a.hashCode() * 31;
        String str = this.f135477b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f135478c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder("Deeplink(step=");
        sb6.append(this.f135476a);
        sb6.append(", companyId=");
        sb6.append(this.f135477b);
        sb6.append(", connectorId=");
        sb6.append(this.f135478c);
        sb6.append(", companyName=");
        return j6.a.u(sb6, this.d, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
