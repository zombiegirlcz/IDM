package financial.atomic.transact;

import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import mlm.g;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"financial/atomic/transact/Config$Theme", "", "Companion", "$serializer", "transact_release"}, k = 1, mv = {1, 8, 0})
@g
public final /* data */ class Config$Theme {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f135497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f135498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Boolean f135499c;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lfinancial/atomic/transact/Config$Theme$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lfinancial/atomic/transact/Config$Theme;", "serializer", "()Lkotlinx/serialization/KSerializer;", "transact_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer serializer() {
            return Config$Theme$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ Config$Theme(int i, Boolean bool, String str, String str2) {
        if ((i & 1) == 0) {
            this.f135497a = null;
        } else {
            this.f135497a = str;
        }
        if ((i & 2) == 0) {
            this.f135498b = null;
        } else {
            this.f135498b = str2;
        }
        if ((i & 4) == 0) {
            this.f135499c = null;
        } else {
            this.f135499c = bool;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof Config$Theme)) {
            return false;
        }
        Config$Theme config$Theme = (Config$Theme) obj2;
        return Intrinsics.f(this.f135497a, config$Theme.f135497a) && Intrinsics.f(this.f135498b, config$Theme.f135498b) && Intrinsics.f(this.f135499c, config$Theme.f135499c);
    }

    public final int hashCode() {
        String str = this.f135497a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f135498b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.f135499c;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "Theme(brandColor=" + this.f135497a + ", overlayColor=" + this.f135498b + ", dark=" + this.f135499c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public Config$Theme(Boolean bool) {
        this.f135497a = null;
        this.f135498b = null;
        this.f135499c = bool;
    }
}
