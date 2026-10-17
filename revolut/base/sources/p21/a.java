package p21;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\f\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000b¨\u0006\r"}, d2 = {"Lp21/a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "iban", "", "b", "Z", "()Z", "submitted", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("iban")
    @NotNull
    private final String iban;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("submitted")
    private final boolean submitted;

    public a(String iban, boolean z) {
        Intrinsics.checkNotNullParameter(iban, "iban");
        this.iban = iban;
        this.submitted = z;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getIban() {
        return this.iban;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getSubmitted() {
        return this.submitted;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.iban, aVar.iban) && this.submitted == aVar.submitted;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.submitted) + (this.iban.hashCode() * 31);
    }
}
