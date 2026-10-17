package er3;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u0005\u0010\u000b¨\u0006\r"}, d2 = {"Ler3/c;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "preference", "", "Ljava/util/List;", "()Ljava/util/List;", "availableOptions", "feature_credit_application_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("preference")
    private final String preference;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("availableOptions")
    @NotNull
    private final List<String> availableOptions;

    public c(String str, ArrayList availableOptions) {
        Intrinsics.checkNotNullParameter(availableOptions, "availableOptions");
        this.preference = str;
        this.availableOptions = availableOptions;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getAvailableOptions() {
        return this.availableOptions;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getPreference() {
        return this.preference;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.preference, cVar.preference) && Intrinsics.f(this.availableOptions, cVar.availableOptions);
    }

    public final int hashCode() {
        String str = this.preference;
        return this.availableOptions.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
