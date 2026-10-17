package p99;

import a0.d;
import com.revolut.feature.onboarding.api.esignature.models.ESignatureWorkflowConfiguration;
import com.revolut.feature.onboarding.impl.esignature.data.network.ESignatureService;
import com.youTransactor.uCube.rpc.Constants;
import efm.d0;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ne0.j;
import od0.i;
import org.jetbrains.annotations.NotNull;
import p5a.m;
import w4l.f;

/* JADX INFO: loaded from: classes5.dex */
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f234286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ESignatureService f234287b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f234288c;

    public c(j memoryCache, ESignatureService service) {
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(service, "service");
        this.f234286a = memoryCache;
        this.f234287b = service;
        final int i = 0;
        final int i2 = 1;
        this.f234288c = new f(new Function2(this) { // from class: p99.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f234285b;

            {
                this.f234285b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                y89.a aVar;
                switch (i) {
                    case 0:
                        f DataObservableDelegate = (f) obj2;
                        i params = (i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        ESignatureWorkflowConfiguration eSignatureWorkflowConfiguration = (ESignatureWorkflowConfiguration) params.f224257a;
                        ESignatureService eSignatureService = this.f234285b.f234287b;
                        String strName = null;
                        String str = eSignatureWorkflowConfiguration != null ? eSignatureWorkflowConfiguration.f78149a : null;
                        if (eSignatureWorkflowConfiguration != null && (aVar = eSignatureWorkflowConfiguration.f78150b) != null) {
                            strName = aVar.name();
                        }
                        d0<List<q99.b>> consents = eSignatureService.getConsents(str, strName);
                        p8k.b bVar = new p8k.b(1, new m(14));
                        consents.getClass();
                        ufm.i iVar = new ufm.i(consents, bVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    default:
                        i params2 = (i) obj2;
                        List consents2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(consents2, "consents");
                        this.f234285b.f234286a.f(c.a((ESignatureWorkflowConfiguration) params2.f224257a), consents2);
                        return Unit.f186387a;
                }
            }
        }, new oxd.m(this, 27), new Function2(this) { // from class: p99.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f234285b;

            {
                this.f234285b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                y89.a aVar;
                switch (i2) {
                    case 0:
                        f DataObservableDelegate = (f) obj2;
                        i params = (i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        ESignatureWorkflowConfiguration eSignatureWorkflowConfiguration = (ESignatureWorkflowConfiguration) params.f224257a;
                        ESignatureService eSignatureService = this.f234285b.f234287b;
                        String strName = null;
                        String str = eSignatureWorkflowConfiguration != null ? eSignatureWorkflowConfiguration.f78149a : null;
                        if (eSignatureWorkflowConfiguration != null && (aVar = eSignatureWorkflowConfiguration.f78150b) != null) {
                            strName = aVar.name();
                        }
                        d0<List<q99.b>> consents = eSignatureService.getConsents(str, strName);
                        p8k.b bVar = new p8k.b(1, new m(14));
                        consents.getClass();
                        ufm.i iVar = new ufm.i(consents, bVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    default:
                        i params2 = (i) obj2;
                        List consents2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(consents2, "consents");
                        this.f234285b.f234286a.f(c.a((ESignatureWorkflowConfiguration) params2.f224257a), consents2);
                        return Unit.f186387a;
                }
            }
        }, null, null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
    }

    public static String a(ESignatureWorkflowConfiguration eSignatureWorkflowConfiguration) {
        String str;
        y89.a aVar;
        String strName;
        String str2 = "none";
        if (eSignatureWorkflowConfiguration == null || (str = eSignatureWorkflowConfiguration.f78149a) == null) {
            str = "none";
        }
        if (eSignatureWorkflowConfiguration != null && (aVar = eSignatureWorkflowConfiguration.f78150b) != null && (strName = aVar.name()) != null) {
            str2 = strName;
        }
        return d.s("consents_", str, ":", str2);
    }
}
