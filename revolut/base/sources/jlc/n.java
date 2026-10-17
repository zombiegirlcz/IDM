package jlc;

import com.revolut.feature.wealth.models.robo.PortfolioGoal;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes6.dex */
public interface n {
    default PortfolioGoal a() {
        if (this instanceof m) {
            return ((m) this).f175693b;
        }
        if (this instanceof l) {
            return null;
        }
        if (this instanceof k) {
            return ((k) this).f175688b;
        }
        if (this instanceof g) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
