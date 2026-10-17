package pwa;

import com.revolut.feature.referrals.common.data.api.domain.model.common.ActiveOrPastInvitesRewardInfo;
import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f240360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f240361b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f240362c;
    public final i d;
    public final b e;
    public final o f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f240363g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final f f240364h;
    public final ActiveOrPastInvitesRewardInfo i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Instant f240365j;
    public final Instant k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f240366l;

    public j(String id10, String firstName, String lastName, i type, b status, o rewardType, String str, f fVar, ActiveOrPastInvitesRewardInfo activeOrPastInvitesRewardInfo, Instant instant, Instant createdDate, String str2) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(rewardType, "rewardType");
        Intrinsics.checkNotNullParameter(createdDate, "createdDate");
        this.f240360a = id10;
        this.f240361b = firstName;
        this.f240362c = lastName;
        this.d = type;
        this.e = status;
        this.f = rewardType;
        this.f240363g = str;
        this.f240364h = fVar;
        this.i = activeOrPastInvitesRewardInfo;
        this.f240365j = instant;
        this.k = createdDate;
        this.f240366l = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f240360a, jVar.f240360a) && Intrinsics.f(this.f240361b, jVar.f240361b) && Intrinsics.f(this.f240362c, jVar.f240362c) && this.d == jVar.d && this.e == jVar.e && this.f == jVar.f && Intrinsics.f(this.f240363g, jVar.f240363g) && Intrinsics.f(this.f240364h, jVar.f240364h) && Intrinsics.f(this.i, jVar.i) && Intrinsics.f(this.f240365j, jVar.f240365j) && Intrinsics.f(this.k, jVar.k) && Intrinsics.f(this.f240366l, jVar.f240366l);
    }

    public final int hashCode() {
        int iHashCode = (this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + p.a.c(p.a.c(this.f240360a.hashCode() * 31, 31, this.f240361b), 31, this.f240362c)) * 31)) * 31)) * 31;
        String str = this.f240363g;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        f fVar = this.f240364h;
        int iHashCode3 = (iHashCode2 + (fVar == null ? 0 : fVar.hashCode())) * 31;
        ActiveOrPastInvitesRewardInfo activeOrPastInvitesRewardInfo = this.i;
        int iHashCode4 = (iHashCode3 + (activeOrPastInvitesRewardInfo == null ? 0 : activeOrPastInvitesRewardInfo.hashCode())) * 31;
        Instant instant = this.f240365j;
        int iC = r6.b.c((iHashCode4 + (instant == null ? 0 : instant.hashCode())) * 31, 31, this.k);
        String str2 = this.f240366l;
        return iC + (str2 != null ? str2.hashCode() : 0);
    }
}
