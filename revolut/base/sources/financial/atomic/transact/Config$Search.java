package financial.atomic.transact;

import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import mlm.g;
import org.jetbrains.annotations.NotNull;
import qlm.e;
import qlm.v1;
import zhm.e0;
import zhm.f0;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"financial/atomic/transact/Config$Search", "", "Companion", "$serializer", "transact_release"}, k = 1, mv = {1, 8, 0})
@g
public final /* data */ class Config$Search {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public static final KSerializer[] e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f0 f135488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f0 f135489b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f135490c;
    public final List d;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lfinancial/atomic/transact/Config$Search$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lfinancial/atomic/transact/Config$Search;", "serializer", "()Lkotlinx/serialization/KSerializer;", "transact_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer serializer() {
            return Config$Search$$serializer.INSTANCE;
        }
    }

    static {
        v1 v1Var = v1.f247718a;
        e = new KSerializer[]{new e(v1Var), new e(v1Var)};
    }

    public Config$Search(List list, int i, List list2) {
        f0 f0Var = f0.f322471a;
        this.f135488a = f0Var;
        this.f135489b = f0Var;
        this.f135490c = (i & 1) == 0 ? new ArrayList() : list;
        if ((i & 2) == 0) {
            this.d = new ArrayList();
        } else {
            this.d = list2;
        }
        f0Var.getClass();
        e0 e0Var = e0.f322469a;
        e0Var.getClass();
        e0Var.getClass();
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof Config$Search)) {
            return false;
        }
        Config$Search config$Search = (Config$Search) obj2;
        return Intrinsics.f(this.f135488a, config$Search.f135488a) && Intrinsics.f(this.f135489b, config$Search.f135489b);
    }

    public final int hashCode() {
        this.f135488a.getClass();
        this.f135489b.getClass();
        return 32;
    }

    public final String toString() {
        return "Search(tags=" + this.f135488a + ", excludedTags=" + this.f135489b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
