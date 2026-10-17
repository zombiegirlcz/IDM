package jfj;

import com.revolut.retail.feature.esim.impl.network.EsimConfigurationService;
import kotlin.NotImplementedError;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class a implements EsimConfigurationService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f173881a = new a();

    private a() {
    }

    @Override // com.revolut.retail.feature.esim.impl.network.EsimConfigurationService
    public final Object getConfiguration(Continuation continuation) {
        Intrinsics.checkNotNullParameter("eSim feature has not yet been implemented", "message");
        throw new NotImplementedError("eSim feature has not yet been implemented");
    }
}
