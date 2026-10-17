package ap0;

import com.revolut.core.ui_kit.chat.prompt.ChatPromptSuggestion;
import com.revolut.core.ui_kit.chat.prompt.ChatSuggestionRowDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class d implements koi.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChatPromptSuggestion f8024a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8025b;

    public d(ChatPromptSuggestion suggestion) {
        Intrinsics.checkNotNullParameter(suggestion, "suggestion");
        this.f8024a = suggestion;
        this.f8025b = suggestion.f51531a;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new ChatSuggestionRowDelegate();
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF53867a() {
        return this.f8025b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f8024a, ((d) obj2).f8024a);
    }

    public final int hashCode() {
        return this.f8024a.hashCode();
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        d dVar = oldItem instanceof d ? (d) oldItem : null;
        if (dVar == null || Intrinsics.f(this.f8024a, dVar.f8024a)) {
            return null;
        }
        return new e();
    }
}
