package pp6;

import com.revolut.data.model.Data;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f238278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CharSequence f238279b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yo6.e f238280c;
    public final Set d;

    public b(Data feedbackConfig, CharSequence comment, yo6.e eVar, Set chosenTags) {
        Intrinsics.checkNotNullParameter(feedbackConfig, "feedbackConfig");
        Intrinsics.checkNotNullParameter(comment, "comment");
        Intrinsics.checkNotNullParameter(chosenTags, "chosenTags");
        this.f238278a = feedbackConfig;
        this.f238279b = comment;
        this.f238280c = eVar;
        this.d = chosenTags;
    }

    public static b a(b bVar, Data feedbackConfig, CharSequence comment, yo6.e eVar, Set chosenTags, int i) {
        if ((i & 1) != 0) {
            feedbackConfig = bVar.f238278a;
        }
        if ((i & 2) != 0) {
            comment = bVar.f238279b;
        }
        if ((i & 4) != 0) {
            eVar = bVar.f238280c;
        }
        if ((i & 8) != 0) {
            chosenTags = bVar.d;
        }
        bVar.getClass();
        Intrinsics.checkNotNullParameter(feedbackConfig, "feedbackConfig");
        Intrinsics.checkNotNullParameter(comment, "comment");
        Intrinsics.checkNotNullParameter(chosenTags, "chosenTags");
        return new b(feedbackConfig, comment, eVar, chosenTags);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f238278a, bVar.f238278a) && Intrinsics.f(this.f238279b, bVar.f238279b) && this.f238280c == bVar.f238280c && Intrinsics.f(this.d, bVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.f238279b.hashCode() + (this.f238278a.hashCode() * 31)) * 31;
        yo6.e eVar = this.f238280c;
        return this.d.hashCode() + ((iHashCode + (eVar == null ? 0 : eVar.hashCode())) * 31);
    }
}
