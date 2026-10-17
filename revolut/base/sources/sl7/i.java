package sl7;

import com.revolut.feature.topup_screen.api.config.TopUpConfig;
import com.revolut.feature.topup_screen.api.destination.InitTopUpDestination;

/* JADX INFO: loaded from: classes4.dex */
public abstract class i {
    public static final InitTopUpDestination a(dj0.d dVar) {
        if (dVar == null || !dVar.f(dj0.d.e)) {
            dVar = null;
        }
        return new InitTopUpDestination(dVar != null ? TopUpConfig.Companion.a(TopUpConfig.INSTANCE, dVar, null, null, 30) : TopUpConfig.Companion.c(TopUpConfig.INSTANCE, null, null, null, null, 31));
    }
}
