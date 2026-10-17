package mkb;

import elm.f;
import ipa.h;
import ipa.j;
import ipa.k;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import rd0.d;
import skm.e0;
import skm.p0;
import zhm.h0;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements hpa.a {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ugc.a f206213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CoroutineScope f206214b;

    public c(ugc.a savingsChallengeInteractor, CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(savingsChallengeInteractor, "savingsChallengeInteractor");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f206213a = savingsChallengeInteractor;
        this.f206214b = scope;
    }

    @Override // hpa.a
    public final boolean b(j message) {
        Intrinsics.checkNotNullParameter(message, "message");
        h hVarL = k.l(message);
        String str = (String) message.get("savings_challenge_account_id");
        if (b.f206212a[hVarL.ordinal()] == 1) {
            if (str != null) {
                p0 p0Var = p0.f264001a;
                e0.C(this.f206214b, f.f127540b, null, new mhd.p0(this, str, null, 4), 2);
                return true;
            }
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("SavingsChallengeAccountId is not found in push message category=" + hVarL);
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
            d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
        }
        return false;
    }
}
