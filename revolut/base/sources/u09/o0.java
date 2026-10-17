package u09;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f276139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f276140b;

    public o0(String questionId, List answersIds) {
        Intrinsics.checkNotNullParameter(questionId, "questionId");
        Intrinsics.checkNotNullParameter(answersIds, "answersIds");
        this.f276139a = questionId;
        this.f276140b = answersIds;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj2;
        return Intrinsics.f(this.f276139a, o0Var.f276139a) && Intrinsics.f(this.f276140b, o0Var.f276140b);
    }

    public final int hashCode() {
        return this.f276140b.hashCode() + (this.f276139a.hashCode() * 31);
    }
}
