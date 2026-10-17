package qu9;

import ang.f;
import com.revolut.feature.payments.messaging.data.api.model.Mention;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import qu4.s;
import yji.n;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends n {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final cl3.a f249278l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final f f249279m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final c f249280n;

    public b(cl3.a contactsInteractor, f userInteractor, c dialogMapper) {
        Intrinsics.checkNotNullParameter(contactsInteractor, "contactsInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(dialogMapper, "dialogMapper");
        this.f249278l = contactsInteractor;
        this.f249279m = userInteractor;
        this.f249280n = dialogMapper;
    }

    public final void Z2(ty0.a clickData) {
        Intrinsics.checkNotNullParameter(clickData, "clickData");
        if (Intrinsics.f(clickData.f275445a, "revtag_mention")) {
            Object obj2 = clickData.d;
            Continuation continuation = null;
            Mention mention = obj2 instanceof Mention ? (Mention) obj2 : null;
            if (mention == null) {
                return;
            }
            T2(new s(this, mention, continuation, 1), new qtb.c(this, 5));
        }
    }
}
