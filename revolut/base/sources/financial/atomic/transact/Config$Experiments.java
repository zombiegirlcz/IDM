package financial.atomic.transact;

import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import mlm.g;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"financial/atomic/transact/Config$Experiments", "", "Companion", "$serializer", "transact_release"}, k = 1, mv = {1, 8, 0})
@g
public final /* data */ class Config$Experiments {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f135482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Boolean f135483b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Boolean f135484c;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lfinancial/atomic/transact/Config$Experiments$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lfinancial/atomic/transact/Config$Experiments;", "serializer", "()Lkotlinx/serialization/KSerializer;", "transact_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer serializer() {
            return Config$Experiments$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ Config$Experiments(int i, Boolean bool, Boolean bool2, Boolean bool3) {
        if ((i & 1) == 0) {
            this.f135482a = null;
        } else {
            this.f135482a = bool;
        }
        if ((i & 2) == 0) {
            this.f135483b = null;
        } else {
            this.f135483b = bool2;
        }
        if ((i & 4) == 0) {
            this.f135484c = null;
        } else {
            this.f135484c = bool3;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof Config$Experiments)) {
            return false;
        }
        Config$Experiments config$Experiments = (Config$Experiments) obj2;
        return Intrinsics.f(this.f135482a, config$Experiments.f135482a) && Intrinsics.f(this.f135483b, config$Experiments.f135483b) && Intrinsics.f(this.f135484c, config$Experiments.f135484c);
    }

    public final int hashCode() {
        Boolean bool = this.f135482a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.f135483b;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f135484c;
        return iHashCode2 + (bool3 != null ? bool3.hashCode() : 0);
    }

    public final String toString() {
        return "Experiments(fractionalDeposits=" + this.f135482a + ", unemploymentCarousel=" + this.f135483b + ", manualFallback=" + this.f135484c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
