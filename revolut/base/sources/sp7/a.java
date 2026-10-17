package sp7;

import com.revolut.feature.insurance_car.impl.data.model.Answer;
import kotlin.jvm.internal.Intrinsics;
import y7a.w;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Answer f264901a;

    public a(Answer answer) {
        Intrinsics.checkNotNullParameter(answer, "answer");
        this.f264901a = answer;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f264901a, ((a) obj2).f264901a);
    }

    public final int hashCode() {
        return this.f264901a.hashCode();
    }
}
