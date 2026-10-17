package xt9;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u0006\u0010\u000eR \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\f\u0010\u0013¨\u0006\u0015"}, d2 = {"Lxt9/d;", "", "", "toString", "()Ljava/lang/String;", "Lxt9/j;", "a", "Lxt9/j;", "c", "()Lxt9/j;", "ultimateDebtor", "Lxt9/g;", "b", "Lxt9/g;", "()Lxt9/g;", "recipient", "", "Lxt9/h;", "Ljava/util/List;", "()Ljava/util/List;", "referenceFields", "retail_feature_payments_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("ultimateDebtor")
    private final j ultimateDebtor;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("recipient")
    @NotNull
    private final g recipient;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("referenceFields")
    @NotNull
    private final List<h> referenceFields;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final g getRecipient() {
        return this.recipient;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getReferenceFields() {
        return this.referenceFields;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final j getUltimateDebtor() {
        return this.ultimateDebtor;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.ultimateDebtor, dVar.ultimateDebtor) && Intrinsics.f(this.recipient, dVar.recipient) && Intrinsics.f(this.referenceFields, dVar.referenceFields);
    }

    public final int hashCode() {
        j jVar = this.ultimateDebtor;
        return this.referenceFields.hashCode() + ((this.recipient.hashCode() + ((jVar == null ? 0 : jVar.hashCode()) * 31)) * 31);
    }
}
