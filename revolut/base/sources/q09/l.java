package q09;

import com.revolut.data.model.Data;
import ip0.dj0;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class l implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f241192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f241193b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0 f241194c;

    public l(Data data, Map quizAnswers, dj0 subtitlesTrackSelection) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(quizAnswers, "quizAnswers");
        Intrinsics.checkNotNullParameter(subtitlesTrackSelection, "subtitlesTrackSelection");
        this.f241192a = data;
        this.f241193b = quizAnswers;
        this.f241194c = subtitlesTrackSelection;
    }

    public static l a(l lVar, Data data, Map quizAnswers, dj0 subtitlesTrackSelection, int i) {
        if ((i & 1) != 0) {
            data = lVar.f241192a;
        }
        if ((i & 2) != 0) {
            quizAnswers = lVar.f241193b;
        }
        if ((i & 4) != 0) {
            subtitlesTrackSelection = lVar.f241194c;
        }
        lVar.getClass();
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(quizAnswers, "quizAnswers");
        Intrinsics.checkNotNullParameter(subtitlesTrackSelection, "subtitlesTrackSelection");
        return new l(data, quizAnswers, subtitlesTrackSelection);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f241192a, lVar.f241192a) && Intrinsics.f(this.f241193b, lVar.f241193b) && Intrinsics.f(this.f241194c, lVar.f241194c);
    }

    public final int hashCode() {
        return this.f241194c.hashCode() + p.a.e(this.f241192a.hashCode() * 31, 31, this.f241193b);
    }
}
