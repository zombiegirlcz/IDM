package y7d;

import com.revolut.core.faq.domain.model.ai.SearchResult;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class l implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f311472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f311473b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f311474c;
    public final SearchResult d;
    public final Data e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f311475g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f311476h;
    public final Data i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f311477j;

    public l(String userInput, Data completions, k screenState, SearchResult searchResult, Data categories, String content, boolean z, boolean z3, Data feedback, long j2) {
        Intrinsics.checkNotNullParameter(userInput, "userInput");
        Intrinsics.checkNotNullParameter(completions, "completions");
        Intrinsics.checkNotNullParameter(screenState, "screenState");
        Intrinsics.checkNotNullParameter(categories, "categories");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(feedback, "feedback");
        this.f311472a = userInput;
        this.f311473b = completions;
        this.f311474c = screenState;
        this.d = searchResult;
        this.e = categories;
        this.f = content;
        this.f311475g = z;
        this.f311476h = z3;
        this.i = feedback;
        this.f311477j = j2;
    }

    public static l a(l lVar, String str, Data data, k kVar, SearchResult searchResult, Data data2, String str2, boolean z, boolean z3, Data data3, long j2, int i) {
        if ((i & 1) != 0) {
            str = lVar.f311472a;
        }
        String userInput = str;
        if ((i & 2) != 0) {
            data = lVar.f311473b;
        }
        Data completions = data;
        k screenState = (i & 4) != 0 ? lVar.f311474c : kVar;
        SearchResult searchResult2 = (i & 8) != 0 ? lVar.d : searchResult;
        Data categories = (i & 16) != 0 ? lVar.e : data2;
        String content = (i & 32) != 0 ? lVar.f : str2;
        boolean z4 = (i & 64) != 0 ? lVar.f311475g : z;
        boolean z6 = (i & 128) != 0 ? lVar.f311476h : z3;
        Data feedback = (i & 256) != 0 ? lVar.i : data3;
        long j3 = (i & 512) != 0 ? lVar.f311477j : j2;
        lVar.getClass();
        Intrinsics.checkNotNullParameter(userInput, "userInput");
        Intrinsics.checkNotNullParameter(completions, "completions");
        Intrinsics.checkNotNullParameter(screenState, "screenState");
        Intrinsics.checkNotNullParameter(categories, "categories");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(feedback, "feedback");
        return new l(userInput, completions, screenState, searchResult2, categories, content, z4, z6, feedback, j3);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f311472a, lVar.f311472a) && Intrinsics.f(this.f311473b, lVar.f311473b) && this.f311474c == lVar.f311474c && Intrinsics.f(this.d, lVar.d) && Intrinsics.f(this.e, lVar.e) && Intrinsics.f(this.f, lVar.f) && this.f311475g == lVar.f311475g && this.f311476h == lVar.f311476h && Intrinsics.f(this.i, lVar.i) && this.f311477j == lVar.f311477j;
    }

    public final int hashCode() {
        int iHashCode = (this.f311474c.hashCode() + kii.e.c(this.f311473b, this.f311472a.hashCode() * 31, 31)) * 31;
        SearchResult searchResult = this.d;
        return Long.hashCode(this.f311477j) + kii.e.c(this.i, j6.a.c(j6.a.c(p.a.c(kii.e.c(this.e, (iHashCode + (searchResult == null ? 0 : searchResult.hashCode())) * 31, 31), 31, this.f), 31, this.f311475g), 31, this.f311476h), 31);
    }
}
