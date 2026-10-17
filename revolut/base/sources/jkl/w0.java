package jkl;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0005\b\u0080\b\u0018\u0000 \u000f2\u00020\u0001:\u0002\b\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR(\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\f\u001a\u0004\b\u0006\u0010\r¨\u0006\u0010"}, d2 = {"Ljkl/w0;", "", "", "toString", "()Ljava/lang/String;", "Ljkl/w0$b;", "a", "Ljkl/w0$b;", "b", "()Ljkl/w0$b;", "default", "", "Ljava/util/Map;", "()Ljava/util/Map;", "countryOverrides", "Companion", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("default")
    @NotNull
    private final b default;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("countryOverrides")
    private final Map<String, b> countryOverrides;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0080\b\u0018\u0000 \n2\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0006\u001a\u0004\b\b\u0010\u0004¨\u0006\u000b"}, d2 = {"Ljkl/w0$b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "backgroundColor", "b", "backgroundUrl", "Companion", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("backgroundColor")
        @NotNull
        private final String backgroundColor;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("backgroundUrl")
        @NotNull
        private final String backgroundUrl;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getBackgroundUrl() {
            return this.backgroundUrl;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof b)) {
                return false;
            }
            b bVar = (b) obj2;
            return Intrinsics.f(this.backgroundColor, bVar.backgroundColor) && Intrinsics.f(this.backgroundUrl, bVar.backgroundUrl);
        }

        public final int hashCode() {
            return this.backgroundUrl.hashCode() + (this.backgroundColor.hashCode() * 31);
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Map getCountryOverrides() {
        return this.countryOverrides;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final b getDefault() {
        return this.default;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj2;
        return Intrinsics.f(this.default, w0Var.default) && Intrinsics.f(this.countryOverrides, w0Var.countryOverrides);
    }

    public final int hashCode() {
        int iHashCode = this.default.hashCode() * 31;
        Map<String, b> map = this.countryOverrides;
        return iHashCode + (map == null ? 0 : map.hashCode());
    }
}
