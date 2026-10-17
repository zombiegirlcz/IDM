package lfk;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0012\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u000e\u001a\u0004\b\r\u0010\u0010R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0018"}, d2 = {"Llfk/f;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "id", "b", "familyId", "expirationDate", "Llfk/c;", "d", "Llfk/c;", "e", "()Llfk/c;", "member", "inviter", "", "f", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "reinvite", "feature_retail_pricing_plans_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("familyId")
    @NotNull
    private final String familyId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("expirationDate")
    @NotNull
    private final String expirationDate;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("member")
    @NotNull
    private final c member;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("inviter")
    @NotNull
    private final c inviter;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("reinvite")
    private final Boolean reinvite;

    public f(String id10, String familyId, String expirationDate, c member, c inviter, Boolean bool) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(familyId, "familyId");
        Intrinsics.checkNotNullParameter(expirationDate, "expirationDate");
        Intrinsics.checkNotNullParameter(member, "member");
        Intrinsics.checkNotNullParameter(inviter, "inviter");
        this.id = id10;
        this.familyId = familyId;
        this.expirationDate = expirationDate;
        this.member = member;
        this.inviter = inviter;
        this.reinvite = bool;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getExpirationDate() {
        return this.expirationDate;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getFamilyId() {
        return this.familyId;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final c getInviter() {
        return this.inviter;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final c getMember() {
        return this.member;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.id, fVar.id) && Intrinsics.f(this.familyId, fVar.familyId) && Intrinsics.f(this.expirationDate, fVar.expirationDate) && Intrinsics.f(this.member, fVar.member) && Intrinsics.f(this.inviter, fVar.inviter) && Intrinsics.f(this.reinvite, fVar.reinvite);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Boolean getReinvite() {
        return this.reinvite;
    }

    public final int hashCode() {
        int iHashCode = (this.inviter.hashCode() + ((this.member.hashCode() + p.a.c(p.a.c(this.id.hashCode() * 31, 31, this.familyId), 31, this.expirationDate)) * 31)) * 31;
        Boolean bool = this.reinvite;
        return iHashCode + (bool == null ? 0 : bool.hashCode());
    }
}
