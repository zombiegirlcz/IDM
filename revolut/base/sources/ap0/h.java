package ap0;

import com.revolut.core.ui_kit.chat.prompt.ChatSuggestionsBlockDelegate;
import com.revolut.core.ui_kit.models.AnimationRequest;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class h implements koi.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f8031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AnimationRequest f8032b;

    public h(List suggestions, AnimationRequest animationRequest) {
        Intrinsics.checkNotNullParameter("chat_suggestions_block", "listId");
        Intrinsics.checkNotNullParameter(suggestions, "suggestions");
        this.f8031a = suggestions;
        this.f8032b = animationRequest;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new ChatSuggestionsBlockDelegate();
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF55135b() {
        return "chat_suggestions_block";
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f8031a, hVar.f8031a) && Intrinsics.f(this.f8032b, hVar.f8032b);
    }

    public final int hashCode() {
        int iC = j6.a.c(p.a.d(-485884758, 31, this.f8031a), 31, false);
        AnimationRequest animationRequest = this.f8032b;
        return iC + (animationRequest != null ? animationRequest.hashCode() : 0);
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        h hVar = oldItem instanceof h ? (h) oldItem : null;
        if (hVar != null) {
            return new i(!Intrinsics.f(this.f8031a, hVar.f8031a), this.f8032b != hVar.f8032b);
        }
        return null;
    }
}
