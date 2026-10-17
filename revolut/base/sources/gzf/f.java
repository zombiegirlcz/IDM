package gzf;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0015\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0006\u001a\u0004\b\u001d\u0010\u0004R\u001c\u0010!\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0006\u001a\u0004\b \u0010\u0004¨\u0006\""}, d2 = {"Lgzf/f;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getBookingToken", "bookingToken", "", "Lgzf/e;", "b", "Ljava/util/List;", "getAnswers", "()Ljava/util/List;", "answers", "Lgzf/b;", "c", "Lgzf/b;", "getContactDetails", "()Lgzf/b;", "contactDetails", "Lgzf/j;", "d", "Lgzf/j;", "getLanguage", "()Lgzf/j;", "language", "e", "getPointsRedeemToken", "pointsRedeemToken", "f", "getPocketId", "pocketId", "feature_travel_experiences_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("bookingToken")
    @NotNull
    private final String bookingToken;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("answers")
    @NotNull
    private final List<e> answers;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("contactDetails")
    @NotNull
    private final b contactDetails;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("language")
    private final j language;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("pointsRedeemToken")
    private final String pointsRedeemToken;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("pocketId")
    private final String pocketId;

    public f(String bookingToken, ArrayList answers, b contactDetails, j jVar, String str, String str2) {
        Intrinsics.checkNotNullParameter(bookingToken, "bookingToken");
        Intrinsics.checkNotNullParameter(answers, "answers");
        Intrinsics.checkNotNullParameter(contactDetails, "contactDetails");
        this.bookingToken = bookingToken;
        this.answers = answers;
        this.contactDetails = contactDetails;
        this.language = jVar;
        this.pointsRedeemToken = str;
        this.pocketId = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.bookingToken, fVar.bookingToken) && Intrinsics.f(this.answers, fVar.answers) && Intrinsics.f(this.contactDetails, fVar.contactDetails) && Intrinsics.f(this.language, fVar.language) && Intrinsics.f(this.pointsRedeemToken, fVar.pointsRedeemToken) && Intrinsics.f(this.pocketId, fVar.pocketId);
    }

    public final int hashCode() {
        int iHashCode = (this.contactDetails.hashCode() + p.a.d(this.bookingToken.hashCode() * 31, 31, this.answers)) * 31;
        j jVar = this.language;
        int iHashCode2 = (iHashCode + (jVar == null ? 0 : jVar.hashCode())) * 31;
        String str = this.pointsRedeemToken;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.pocketId;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }
}
