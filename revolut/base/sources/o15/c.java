package o15;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\r\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\u0014"}, d2 = {"Lo15/c;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "d", "title", "Lo15/a;", "b", "Lo15/a;", "()Lo15/a;", "contactSection", "Lo15/b;", "c", "Lo15/b;", "()Lo15/b;", "debtAdvice", "button", "feature_credit_help_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("title")
    @NotNull
    private final String title;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("contactSection")
    @NotNull
    private final a contactSection;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("debtAdvice")
    private final b debtAdvice;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("button")
    private final String button;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getButton() {
        return this.button;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final a getContactSection() {
        return this.contactSection;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final b getDebtAdvice() {
        return this.debtAdvice;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.title, cVar.title) && Intrinsics.f(this.contactSection, cVar.contactSection) && Intrinsics.f(this.debtAdvice, cVar.debtAdvice) && Intrinsics.f(this.button, cVar.button);
    }

    public final int hashCode() {
        int iHashCode = (this.contactSection.hashCode() + (this.title.hashCode() * 31)) * 31;
        b bVar = this.debtAdvice;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        String str = this.button;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }
}
