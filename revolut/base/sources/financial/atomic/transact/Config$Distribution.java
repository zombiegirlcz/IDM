package financial.atomic.transact;

import ch.qos.logback.core.CoreConstants;
import dam.b;
import dam.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import mlm.g;
import org.jetbrains.annotations.NotNull;
import qlm.b0;
import qlm.j1;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0002\u0005¨\u0006\u0006"}, d2 = {"financial/atomic/transact/Config$Distribution", "", "Companion", "$serializer", "dam/b", "dam/c", "transact_release"}, k = 1, mv = {1, 8, 0})
@g
public final /* data */ class Config$Distribution {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public static final KSerializer[] e = {new b0("financial.atomic.transact.Config.Distribution.Type", c.values()), null, new b0("financial.atomic.transact.Config.Distribution.Action", b.values()), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f135479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Double f135480b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f135481c;
    public final Boolean d;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lfinancial/atomic/transact/Config$Distribution$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lfinancial/atomic/transact/Config$Distribution;", "serializer", "()Lkotlinx/serialization/KSerializer;", "transact_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer serializer() {
            return Config$Distribution$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ Config$Distribution(int i, c cVar, Double d, b bVar, Boolean bool) {
        if (1 != (i & 1)) {
            j1.f(Config$Distribution$$serializer.INSTANCE.getDescriptor(), i, 1);
            throw null;
        }
        this.f135479a = cVar;
        if ((i & 2) == 0) {
            this.f135480b = null;
        } else {
            this.f135480b = d;
        }
        if ((i & 4) == 0) {
            this.f135481c = null;
        } else {
            this.f135481c = bVar;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = bool;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof Config$Distribution)) {
            return false;
        }
        Config$Distribution config$Distribution = (Config$Distribution) obj2;
        return this.f135479a == config$Distribution.f135479a && Intrinsics.f(this.f135480b, config$Distribution.f135480b) && this.f135481c == config$Distribution.f135481c && Intrinsics.f(this.d, config$Distribution.d);
    }

    public final int hashCode() {
        int iHashCode = this.f135479a.hashCode() * 31;
        Double d = this.f135480b;
        int iHashCode2 = (iHashCode + (d == null ? 0 : d.hashCode())) * 31;
        b bVar = this.f135481c;
        int iHashCode3 = (iHashCode2 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        Boolean bool = this.d;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "Distribution(type=" + this.f135479a + ", amount=" + this.f135480b + ", action=" + this.f135481c + ", canUpdate=" + this.d + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
