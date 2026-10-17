package rn2;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\u0006\u0010\tR\u001a\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\u0004R \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\r\u0010\u0014¨\u0006\u0018"}, d2 = {"Lrn2/h;", "", "", "toString", "()Ljava/lang/String;", "Lrn2/a;", "a", "Lrn2/a;", "e", "()Lrn2/a;", "toBank", "b", "fromBank", "c", "Ljava/lang/String;", "personRequesting", "", "Lrn2/b0;", "d", "Ljava/util/List;", "()Ljava/util/List;", "terms", "Lrn2/c;", "sections", "feature_bank_account_switching_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("toBank")
    @NotNull
    private final a toBank;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("fromBank")
    @NotNull
    private final a fromBank;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("personRequesting")
    @NotNull
    private final String personRequesting;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("terms")
    @NotNull
    private final List<b0> terms;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("sections")
    @NotNull
    private final List<c> sections;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final a getFromBank() {
        return this.fromBank;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getPersonRequesting() {
        return this.personRequesting;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final List getSections() {
        return this.sections;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final List getTerms() {
        return this.terms;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final a getToBank() {
        return this.toBank;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.toBank, hVar.toBank) && Intrinsics.f(this.fromBank, hVar.fromBank) && Intrinsics.f(this.personRequesting, hVar.personRequesting) && Intrinsics.f(this.terms, hVar.terms) && Intrinsics.f(this.sections, hVar.sections);
    }

    public final int hashCode() {
        return this.sections.hashCode() + p.a.d(p.a.c((this.fromBank.hashCode() + (this.toBank.hashCode() * 31)) * 31, 31, this.personRequesting), 31, this.terms);
    }
}
