package financial.atomic.transact;

import ch.qos.logback.core.CoreConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import m72.b;
import mlm.g;
import org.jetbrains.annotations.NotNull;
import qlm.e;
import qlm.j1;
import qlm.v1;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0083\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"financial/atomic/transact/Config$TaskData", "", "Companion", "$serializer", "transact_release"}, k = 1, mv = {1, 8, 0})
@g
public final /* data */ class Config$TaskData {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public static final KSerializer[] e = {null, null, null, new e(v1.f247718a)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f135494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Config$Distribution f135495b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f135496c;
    public final List d;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lfinancial/atomic/transact/Config$TaskData$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lfinancial/atomic/transact/Config$TaskData;", "serializer", "()Lkotlinx/serialization/KSerializer;", "transact_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer serializer() {
            return Config$TaskData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ Config$TaskData(int i, String str, Config$Distribution config$Distribution, String str2, List list) {
        if (1 != (i & 1)) {
            j1.f(Config$TaskData$$serializer.INSTANCE.getDescriptor(), i, 1);
            throw null;
        }
        this.f135494a = str;
        if ((i & 2) == 0) {
            this.f135495b = null;
        } else {
            this.f135495b = config$Distribution;
        }
        if ((i & 4) == 0) {
            this.f135496c = null;
        } else {
            this.f135496c = str2;
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
        if (!(obj2 instanceof Config$TaskData)) {
            return false;
        }
        Config$TaskData config$TaskData = (Config$TaskData) obj2;
        return Intrinsics.f(this.f135494a, config$TaskData.f135494a) && Intrinsics.f(this.f135495b, config$TaskData.f135495b) && Intrinsics.f(this.f135496c, config$TaskData.f135496c) && Intrinsics.f(this.d, config$TaskData.d);
    }

    public final int hashCode() {
        int iHashCode = this.f135494a.hashCode() * 31;
        Config$Distribution config$Distribution = this.f135495b;
        int iHashCode2 = (iHashCode + (config$Distribution == null ? 0 : config$Distribution.hashCode())) * 31;
        String str = this.f135496c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.d;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder("TaskData(product=");
        sb6.append(this.f135494a);
        sb6.append(", distribution=");
        sb6.append(this.f135495b);
        sb6.append(", operation=");
        sb6.append(this.f135496c);
        sb6.append(", forms=");
        return b.p(CoreConstants.RIGHT_PARENTHESIS_CHAR, this.d, sb6);
    }

    public Config$TaskData(String product, Config$Distribution config$Distribution, String str, List list) {
        Intrinsics.checkNotNullParameter(product, "product");
        this.f135494a = product;
        this.f135495b = config$Distribution;
        this.f135496c = str;
        this.d = list;
    }
}
