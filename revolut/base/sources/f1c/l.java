package f1c;

import com.revolut.data.model.Data;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import zhm.r0;

/* JADX INFO: loaded from: classes6.dex */
public final class l implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f131244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f131245b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f131246c;

    public l() {
        this(0);
    }

    public static l a(l lVar, Data wrappedCards, Map quizAnswers, Integer num, int i) {
        if ((i & 1) != 0) {
            wrappedCards = lVar.f131244a;
        }
        if ((i & 2) != 0) {
            quizAnswers = lVar.f131245b;
        }
        if ((i & 4) != 0) {
            num = lVar.f131246c;
        }
        lVar.getClass();
        Intrinsics.checkNotNullParameter(wrappedCards, "wrappedCards");
        Intrinsics.checkNotNullParameter(quizAnswers, "quizAnswers");
        return new l(wrappedCards, quizAnswers, num);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f131244a, lVar.f131244a) && Intrinsics.f(this.f131245b, lVar.f131245b) && Intrinsics.f(this.f131246c, lVar.f131246c);
    }

    public final int hashCode() {
        int iE = p.a.e(this.f131244a.hashCode() * 31, 31, this.f131245b);
        Integer num = this.f131246c;
        return iE + (num == null ? 0 : num.hashCode());
    }

    public l(Data wrappedCards, Map quizAnswers, Integer num) {
        Intrinsics.checkNotNullParameter(wrappedCards, "wrappedCards");
        Intrinsics.checkNotNullParameter(quizAnswers, "quizAnswers");
        this.f131244a = wrappedCards;
        this.f131245b = quizAnswers;
        this.f131246c = num;
    }

    public /* synthetic */ l(int i) {
        this(new Data(null, null, true, 3, null), r0.g(), null);
    }
}
