package k50;

import com.revolut.chat.ui.flow.RatingSupportType;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class y implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z30.e f181290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z30.j f181291b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f181292c;
    public final String d;
    public final RatingSupportType e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f181293g;

    public y(z30.e eVar, z30.j chatRatingOptions, Set chosenTags, String additionalComment, RatingSupportType ratingSupportType, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(chatRatingOptions, "chatRatingOptions");
        Intrinsics.checkNotNullParameter(chosenTags, "chosenTags");
        Intrinsics.checkNotNullParameter(additionalComment, "additionalComment");
        Intrinsics.checkNotNullParameter(ratingSupportType, "ratingSupportType");
        this.f181290a = eVar;
        this.f181291b = chatRatingOptions;
        this.f181292c = chosenTags;
        this.d = additionalComment;
        this.e = ratingSupportType;
        this.f = z;
        this.f181293g = z3;
    }

    public static y a(y yVar, z30.e eVar, Set set, String str, int i) {
        if ((i & 1) != 0) {
            eVar = yVar.f181290a;
        }
        z30.e eVar2 = eVar;
        z30.j chatRatingOptions = yVar.f181291b;
        if ((i & 4) != 0) {
            set = yVar.f181292c;
        }
        Set chosenTags = set;
        if ((i & 8) != 0) {
            str = yVar.d;
        }
        String additionalComment = str;
        RatingSupportType ratingSupportType = yVar.e;
        boolean z = yVar.f;
        yVar.getClass();
        boolean z3 = (i & 128) != 0 ? yVar.f181293g : true;
        yVar.getClass();
        Intrinsics.checkNotNullParameter(chatRatingOptions, "chatRatingOptions");
        Intrinsics.checkNotNullParameter(chosenTags, "chosenTags");
        Intrinsics.checkNotNullParameter(additionalComment, "additionalComment");
        Intrinsics.checkNotNullParameter(ratingSupportType, "ratingSupportType");
        return new y(eVar2, chatRatingOptions, chosenTags, additionalComment, ratingSupportType, z, z3);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y)) {
            return false;
        }
        y yVar = (y) obj2;
        return Intrinsics.f(this.f181290a, yVar.f181290a) && Intrinsics.f(this.f181291b, yVar.f181291b) && Intrinsics.f(this.f181292c, yVar.f181292c) && Intrinsics.f(this.d, yVar.d) && this.e == yVar.e && this.f == yVar.f && this.f181293g == yVar.f181293g;
    }

    public final int hashCode() {
        z30.e eVar = this.f181290a;
        return Boolean.hashCode(this.f181293g) + j6.a.c(j6.a.c((this.e.hashCode() + p.a.c(p.a.f((this.f181291b.hashCode() + ((eVar == null ? 0 : eVar.hashCode()) * 31)) * 31, 31, this.f181292c), 31, this.d)) * 31, 31, this.f), 31, false);
    }
}
