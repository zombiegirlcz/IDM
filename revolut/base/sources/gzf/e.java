package gzf;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lgzf/e;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getQuestionId", "questionId", "b", "getAnswer", "answer", "c", "getUnitId", "unitId", "", "d", "Ljava/lang/Integer;", "getVisitorIndex", "()Ljava/lang/Integer;", "visitorIndex", "feature_travel_experiences_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("questionId")
    private final String questionId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("answer")
    @NotNull
    private final String answer;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("unitId")
    private final String unitId;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("visitorIndex")
    private final Integer visitorIndex;

    public e(Integer num, String str, String answer, String str2) {
        Intrinsics.checkNotNullParameter(answer, "answer");
        this.questionId = str;
        this.answer = answer;
        this.unitId = str2;
        this.visitorIndex = num;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.questionId, eVar.questionId) && Intrinsics.f(this.answer, eVar.answer) && Intrinsics.f(this.unitId, eVar.unitId) && Intrinsics.f(this.visitorIndex, eVar.visitorIndex);
    }

    public final int hashCode() {
        String str = this.questionId;
        int iC = p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.answer);
        String str2 = this.unitId;
        int iHashCode = (iC + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.visitorIndex;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }
}
