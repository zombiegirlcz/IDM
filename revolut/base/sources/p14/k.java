package p14;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R&\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lp14/k;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getCurrentStepId", "currentStepId", "", "b", "Ljava/util/Map;", "getAnswers", "()Ljava/util/Map;", "answers", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("currentStep")
    @NotNull
    private final String currentStepId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("answers")
    @NotNull
    private final Map<String, Object> answers;

    public k(LinkedHashMap answers, String currentStepId) {
        Intrinsics.checkNotNullParameter(currentStepId, "currentStepId");
        Intrinsics.checkNotNullParameter(answers, "answers");
        this.currentStepId = currentStepId;
        this.answers = answers;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.currentStepId, kVar.currentStepId) && Intrinsics.f(this.answers, kVar.answers);
    }

    public final int hashCode() {
        return this.answers.hashCode() + (this.currentStepId.hashCode() * 31);
    }
}
