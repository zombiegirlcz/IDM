package d4j;

import d3j.j;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f111339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f111340b;

    public c(j beneficiarySuggestionsInteractor, b beneficiarySuggestionRequestParamsProvider) {
        Intrinsics.checkNotNullParameter(beneficiarySuggestionsInteractor, "beneficiarySuggestionsInteractor");
        Intrinsics.checkNotNullParameter(beneficiarySuggestionRequestParamsProvider, "beneficiarySuggestionRequestParamsProvider");
        this.f111339a = beneficiarySuggestionsInteractor;
        this.f111340b = beneficiarySuggestionRequestParamsProvider;
    }
}
