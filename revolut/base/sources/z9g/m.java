package z9g;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\u0010"}, d2 = {"Lz9g/m;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "queryParam", "", "Lz9g/j;", "b", "Ljava/util/List;", "()Ljava/util/List;", "options", "defaultOption", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("queryParam")
    @NotNull
    private final String queryParam;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("options")
    @NotNull
    private final List<j> options;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("defaultOption")
    private final String defaultOption;

    public m(String queryParam, String str, ArrayList options) {
        Intrinsics.checkNotNullParameter(queryParam, "queryParam");
        Intrinsics.checkNotNullParameter(options, "options");
        this.queryParam = queryParam;
        this.options = options;
        this.defaultOption = str;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getDefaultOption() {
        return this.defaultOption;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getOptions() {
        return this.options;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getQueryParam() {
        return this.queryParam;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.queryParam, mVar.queryParam) && Intrinsics.f(this.options, mVar.options) && Intrinsics.f(this.defaultOption, mVar.defaultOption);
    }

    public final int hashCode() {
        int iD = p.a.d(this.queryParam.hashCode() * 31, 31, this.options);
        String str = this.defaultOption;
        return iD + (str == null ? 0 : str.hashCode());
    }
}
