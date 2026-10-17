package jfj;

import com.revolut.retail.feature.esim.impl.network.EsimInstructionsService;
import kotlin.NotImplementedError;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class b implements EsimInstructionsService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f173882a = new b();

    private b() {
    }

    @Override // com.revolut.retail.feature.esim.impl.network.EsimInstructionsService
    public final Object getInstructions(String str, String str2, String str3, Continuation continuation) {
        Intrinsics.checkNotNullParameter("eSim feature has not yet been implemented", "message");
        throw new NotImplementedError("eSim feature has not yet been implemented");
    }
}
