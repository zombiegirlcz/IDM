package financial.atomic.transact;

import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import mlm.g;
import org.jetbrains.annotations.NotNull;
import p.a;
import qlm.j1;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"financial/atomic/transact/Config$Platform", "", "Companion", "$serializer", "transact_release"}, k = 1, mv = {1, 8, 0})
@g
public final /* data */ class Config$Platform {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f135485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f135486b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f135487c;
    public final String d;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lfinancial/atomic/transact/Config$Platform$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lfinancial/atomic/transact/Config$Platform;", "serializer", "()Lkotlinx/serialization/KSerializer;", "transact_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer serializer() {
            return Config$Platform$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ Config$Platform(int i, String str, String str2, String str3, String str4) {
        if (15 != (i & 15)) {
            j1.f(Config$Platform$$serializer.INSTANCE.getDescriptor(), i, 15);
            throw null;
        }
        this.f135485a = str;
        this.f135486b = str2;
        this.f135487c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof Config$Platform)) {
            return false;
        }
        Config$Platform config$Platform = (Config$Platform) obj2;
        return Intrinsics.f(this.f135485a, config$Platform.f135485a) && Intrinsics.f(this.f135486b, config$Platform.f135486b) && Intrinsics.f(this.f135487c, config$Platform.f135487c) && Intrinsics.f(this.d, config$Platform.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + a.c(a.c(this.f135485a.hashCode() * 31, 31, this.f135486b), 31, this.f135487c);
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder("Platform(name=");
        sb6.append(this.f135485a);
        sb6.append(", sdkVersion=");
        sb6.append(this.f135486b);
        sb6.append(", version=");
        sb6.append(this.f135487c);
        sb6.append(", systemVersion=");
        return j6.a.u(sb6, this.d, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    public Config$Platform(String version, String systemVersion) {
        Intrinsics.checkNotNullParameter("android", "name");
        Intrinsics.checkNotNullParameter("3.3.2-21", "sdkVersion");
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(systemVersion, "systemVersion");
        this.f135485a = "android";
        this.f135486b = "3.3.2-21";
        this.f135487c = version;
        this.d = systemVersion;
    }
}
