package gsf;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011¨\u0006\u0017"}, d2 = {"Lgsf/s;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getCatalogue", "catalogue", "b", "getOperation", "operation", "", "Lgsf/e;", "c", "Ljava/util/List;", "getAdditionalInfo", "()Ljava/util/List;", "additionalInfo", "Lgsf/n;", "d", "getValues", "values", "feature_transfer_reasons_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("catalogue")
    @NotNull
    private final String catalogue;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("operation")
    @NotNull
    private final String operation;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("additionalInfo")
    @NotNull
    private final List<e> additionalInfo;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("values")
    @NotNull
    private final List<n> values;

    public s(String catalogue, String operation, List additionalInfo, List values) {
        Intrinsics.checkNotNullParameter(catalogue, "catalogue");
        Intrinsics.checkNotNullParameter(operation, "operation");
        Intrinsics.checkNotNullParameter(additionalInfo, "additionalInfo");
        Intrinsics.checkNotNullParameter(values, "values");
        this.catalogue = catalogue;
        this.operation = operation;
        this.additionalInfo = additionalInfo;
        this.values = values;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.catalogue, sVar.catalogue) && Intrinsics.f(this.operation, sVar.operation) && Intrinsics.f(this.additionalInfo, sVar.additionalInfo) && Intrinsics.f(this.values, sVar.values);
    }

    public final int hashCode() {
        return this.values.hashCode() + p.a.d(p.a.c(this.catalogue.hashCode() * 31, 31, this.operation), 31, this.additionalInfo);
    }
}
