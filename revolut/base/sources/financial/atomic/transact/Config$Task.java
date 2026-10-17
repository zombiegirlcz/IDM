package financial.atomic.transact;

import ch.qos.logback.core.CoreConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import m72.b;
import mlm.g;
import org.jetbrains.annotations.NotNull;
import qlm.b0;
import qlm.e;
import qlm.j1;
import qlm.v1;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"financial/atomic/transact/Config$Task", "", "Companion", "$serializer", "transact_release"}, k = 1, mv = {1, 8, 0})
@g
public final /* data */ class Config$Task {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public static final KSerializer[] e = {new b0("financial.atomic.transact.Config.Product", dam.g.values()), null, new b0("financial.atomic.transact.Config.Product", dam.g.values()), new e(v1.f247718a)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dam.g f135491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Config$Distribution f135492b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dam.g f135493c;
    public final List d;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lfinancial/atomic/transact/Config$Task$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lfinancial/atomic/transact/Config$Task;", "serializer", "()Lkotlinx/serialization/KSerializer;", "transact_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer serializer() {
            return Config$Task$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ Config$Task(int i, dam.g gVar, Config$Distribution config$Distribution, dam.g gVar2, List list) {
        if (1 != (i & 1)) {
            j1.f(Config$Task$$serializer.INSTANCE.getDescriptor(), i, 1);
            throw null;
        }
        this.f135491a = gVar;
        if ((i & 2) == 0) {
            this.f135492b = null;
        } else {
            this.f135492b = config$Distribution;
        }
        if ((i & 4) == 0) {
            this.f135493c = null;
        } else {
            this.f135493c = gVar2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = list;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof Config$Task)) {
            return false;
        }
        Config$Task config$Task = (Config$Task) obj2;
        return this.f135491a == config$Task.f135491a && Intrinsics.f(this.f135492b, config$Task.f135492b) && this.f135493c == config$Task.f135493c && Intrinsics.f(this.d, config$Task.d);
    }

    public final int hashCode() {
        int iHashCode = this.f135491a.hashCode() * 31;
        Config$Distribution config$Distribution = this.f135492b;
        int iHashCode2 = (iHashCode + (config$Distribution == null ? 0 : config$Distribution.hashCode())) * 31;
        dam.g gVar = this.f135493c;
        int iHashCode3 = (iHashCode2 + (gVar == null ? 0 : gVar.hashCode())) * 31;
        List list = this.d;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder("Task(product=");
        sb6.append(this.f135491a);
        sb6.append(", distribution=");
        sb6.append(this.f135492b);
        sb6.append(", operation=");
        sb6.append(this.f135493c);
        sb6.append(", forms=");
        return b.p(CoreConstants.RIGHT_PARENTHESIS_CHAR, this.d, sb6);
    }

    public Config$Task(dam.g product) {
        Intrinsics.checkNotNullParameter(product, "product");
        this.f135491a = product;
        this.f135492b = null;
        this.f135493c = null;
        this.d = null;
    }
}
