package com.revolut.core.ui_kit.internal.delegates;

import com.revolut.core.ui_kit.delegates.SuggestionsBarDelegate;
import com.revolut.core.ui_kit.internal.delegates.SuggestionDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class a extends SuggestionDelegate.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SuggestionsBarDelegate.Suggestion f55849a;

    public a(SuggestionsBarDelegate.Suggestion suggestion) {
        Intrinsics.checkNotNullParameter(suggestion, "suggestion");
        this.f55849a = suggestion;
    }

    @Override // com.revolut.core.ui_kit.internal.delegates.SuggestionDelegate.b
    public final SuggestionsBarDelegate.Suggestion a() {
        return this.f55849a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f55849a, ((a) obj2).f55849a);
    }

    public final int hashCode() {
        return this.f55849a.hashCode();
    }
}
