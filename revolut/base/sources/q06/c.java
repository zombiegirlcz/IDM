package q06;

import com.revolut.feature.rev10_main_screen.api.MainContainerScreenDestination;
import com.revolut.kompot.common.transition.AccountCreationTransitionAnimation;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public interface c {
    default MainContainerScreenDestination a() {
        if (this instanceof b) {
            b bVar = (b) this;
            return new MainContainerScreenDestination.JustShow(bVar.f241167a, bVar.f241168b, (AccountCreationTransitionAnimation) null, 12);
        }
        if (this instanceof a) {
            return new MainContainerScreenDestination.Action(((a) this).f241166a);
        }
        throw new NoWhenBranchMatchedException();
    }
}
