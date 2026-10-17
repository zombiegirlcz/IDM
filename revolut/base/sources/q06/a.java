package q06;

import com.revolut.feature.rev10_main_screen.api.action.MainScreenContainerActionData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MainScreenContainerActionData f241166a;

    public a(MainScreenContainerActionData actionData) {
        Intrinsics.checkNotNullParameter(actionData, "actionData");
        this.f241166a = actionData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f241166a, ((a) obj2).f241166a);
    }

    public final int hashCode() {
        return this.f241166a.hashCode();
    }
}
