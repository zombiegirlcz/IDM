package financial.atomic.transact;

import ch.qos.logback.core.CoreConstants;
import j6.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import mlm.g;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"financial/atomic/transact/Config$Customer", "", "Companion", "$serializer", "transact_release"}, k = 1, mv = {1, 8, 0})
@g
public final /* data */ class Config$Customer {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f135475a;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lfinancial/atomic/transact/Config$Customer$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lfinancial/atomic/transact/Config$Customer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "transact_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer serializer() {
            return Config$Customer$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ Config$Customer(int i, String str) {
        if ((i & 1) == 0) {
            this.f135475a = null;
        } else {
            this.f135475a = str;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof Config$Customer) && Intrinsics.f(this.f135475a, ((Config$Customer) obj2).f135475a);
    }

    public final int hashCode() {
        String str = this.f135475a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return a.u(new StringBuilder("Customer(name="), this.f135475a, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
