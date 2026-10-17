package j55;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nx4.e1;
import nx4.m0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001a\u0010\u000f\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\f\u001a\u0004\b\u0010\u0010\u000eR \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0014\u001a\u0004\b\u000b\u0010\u0015¨\u0006\u0017"}, d2 = {"Lj55/c;", "", "", "toString", "()Ljava/lang/String;", "Lnx4/e1;", "a", "Lnx4/e1;", "()Lnx4/e1;", "header", "Lj55/a;", "b", "Lj55/a;", "c", "()Lj55/a;", "primaryButton", "d", "secondaryButton", "", "Lnx4/m0;", "Ljava/util/List;", "()Ljava/util/List;", "items", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("header")
    @NotNull
    private final e1 header;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("primaryButton")
    @NotNull
    private final a primaryButton;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("secondaryButton")
    private final a secondaryButton;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("items")
    @NotNull
    private final List<m0> items;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final e1 getHeader() {
        return this.header;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getItems() {
        return this.items;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final a getPrimaryButton() {
        return this.primaryButton;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final a getSecondaryButton() {
        return this.secondaryButton;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.header, cVar.header) && Intrinsics.f(this.primaryButton, cVar.primaryButton) && Intrinsics.f(this.secondaryButton, cVar.secondaryButton) && Intrinsics.f(this.items, cVar.items);
    }

    public final int hashCode() {
        int iHashCode = (this.primaryButton.hashCode() + (this.header.hashCode() * 31)) * 31;
        a aVar = this.secondaryButton;
        return this.items.hashCode() + ((iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31);
    }
}
