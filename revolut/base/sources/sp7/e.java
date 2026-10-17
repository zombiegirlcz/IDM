package sp7;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.insurance_car.impl.data.model.Answer;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Answer f264904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f264905b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f264906c;

    public e(Answer answer, Clause text, TextLocalisedClause textLocalisedClause) {
        Intrinsics.checkNotNullParameter(answer, "answer");
        Intrinsics.checkNotNullParameter(text, "text");
        this.f264904a = answer;
        this.f264905b = text;
        this.f264906c = textLocalisedClause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f264904a.equals(eVar.f264904a) && this.f264905b.equals(eVar.f264905b) && Intrinsics.f(this.f264906c, eVar.f264906c);
    }

    public final int hashCode() {
        int iB = p.a.b(this.f264904a.hashCode() * 31, 31, this.f264905b);
        Clause clause = this.f264906c;
        return iB + (clause == null ? 0 : clause.hashCode());
    }
}
