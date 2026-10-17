package t04;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\t\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\u0005R\u001a\u0010\u000f\u001a\u00020\n8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\u00020\n8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\r\u0010\f\u001a\u0004\b\u0010\u0010\u000eR\u001a\u0010\u0013\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010\u0007\u001a\u0004\b\u0012\u0010\u0005R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0007\u001a\u0004\b\u0006\u0010\u0005R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0007\u001a\u0004\b\u000b\u0010\u0005¨\u0006\u001a"}, d2 = {"Lt04/c;", "Lt04/f;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "d", "id", "", "b", "Z", "c", "()Z", "editable", "f", "mandatory", "e", "label", "Ljava/lang/Long;", "g", "()Ljava/lang/Long;", "value", "currency", "description", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class c implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("editable")
    private final boolean editable;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("mandatory")
    private final boolean mandatory;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("label")
    @NotNull
    private final String label;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("value")
    private final Long value;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("currency")
    @NotNull
    private final String currency;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("description")
    private final String description;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getEditable() {
        return this.editable;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.id, cVar.id) && this.editable == cVar.editable && this.mandatory == cVar.mandatory && Intrinsics.f(this.label, cVar.label) && Intrinsics.f(this.value, cVar.value) && Intrinsics.f(this.currency, cVar.currency) && Intrinsics.f(this.description, cVar.description);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getMandatory() {
        return this.mandatory;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Long getValue() {
        return this.value;
    }

    public final int hashCode() {
        int iC = p.a.c(j6.a.c(j6.a.c(this.id.hashCode() * 31, 31, this.editable), 31, this.mandatory), 31, this.label);
        Long l2 = this.value;
        int iC2 = p.a.c((iC + (l2 == null ? 0 : l2.hashCode())) * 31, 31, this.currency);
        String str = this.description;
        return iC2 + (str != null ? str.hashCode() : 0);
    }
}
