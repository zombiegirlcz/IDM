package rld;

import com.revolut.feature.slot_manager.api.model.prompt.SlotDefaultPrompt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class h implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SlotDefaultPrompt f255018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f255019b;

    public h(SlotDefaultPrompt prompt, String actionToken) {
        Intrinsics.checkNotNullParameter(prompt, "prompt");
        Intrinsics.checkNotNullParameter(actionToken, "actionToken");
        this.f255018a = prompt;
        this.f255019b = actionToken;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f255018a, hVar.f255018a) && Intrinsics.f(this.f255019b, hVar.f255019b);
    }

    public final int hashCode() {
        return this.f255019b.hashCode() + (this.f255018a.hashCode() * 31);
    }
}
