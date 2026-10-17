package xt9;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\r\u001a\u0004\b\u0005\u0010\u000eR\u001a\u0010\u0014\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\t\u0010\u0013¨\u0006\u0016"}, d2 = {"Lxt9/i;", "Lxt9/c;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getFormatType", "formatType", "b", "c", "provider", "Ljo3/a;", "Ljo3/a;", "()Ljo3/a;", "amount", "Lxt9/d;", "d", "Lxt9/d;", "()Lxt9/d;", "extraFields", "Companion", "retail_feature_payments_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class i extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("formatType")
    @NotNull
    private final String formatType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("provider")
    @NotNull
    private final String provider;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("amount")
    private final jo3.a amount;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("extraFields")
    @NotNull
    private final d extraFields;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final jo3.a getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final d getExtraFields() {
        return this.extraFields;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getProvider() {
        return this.provider;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.formatType, iVar.formatType) && Intrinsics.f(this.provider, iVar.provider) && Intrinsics.f(this.amount, iVar.amount) && Intrinsics.f(this.extraFields, iVar.extraFields);
    }

    public final int hashCode() {
        int iC = p.a.c(this.formatType.hashCode() * 31, 31, this.provider);
        jo3.a aVar = this.amount;
        return this.extraFields.hashCode() + ((iC + (aVar == null ? 0 : aVar.hashCode())) * 31);
    }
}
