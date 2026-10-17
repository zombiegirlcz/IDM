package gsc;

import com.revolut.feature.sca_prompt.impl.data.service.CryptoScaPromptService;
import com.revolut.feature.sca_prompt.impl.data.service.TradingScaPromptService;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Retrofit;
import vc.s;
import xe0.f;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f146373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f146374b;

    public b(c cVar, int i) {
        this.f146373a = cVar;
        this.f146374b = i;
    }

    @Override // phm.a
    public final Object get() {
        c cVar = this.f146373a;
        ee0.a aVar = cVar.f146375a;
        nj0.a aVar2 = cVar.f146377c;
        int i = this.f146374b;
        switch (i) {
            case 0:
                return new csc.b();
            case 1:
                je0.d mapper = aVar.d();
                s.j(mapper);
                yk0.a databaseSessionProvider = cVar.f146376b.b();
                s.j(databaseSessionProvider);
                f storageFactory = aVar.f();
                s.j(storageFactory);
                yrc.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(mapper, "mapper");
                Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
                Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
                return f.f(storageFactory, databaseSessionProvider, "crypto_sca_prompt", mapper, 1, null, 48);
            case 2:
                return new ne0.d();
            case 3:
                CryptoScaPromptService cryptoScaPromptService = (CryptoScaPromptService) com.google.android.gms.internal.mlkit_vision_face.a.i((Retrofit) cVar.f146380j.get(), "retrofit", CryptoScaPromptService.class, "create(...)");
                s.k(cryptoScaPromptService);
                return cryptoScaPromptService;
            case 4:
                ik0.b retrofitFactory = ((nj0.d) aVar2).m();
                s.j(retrofitFactory);
                ek.a converterFactory = ((nj0.d) aVar2).d();
                Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
                Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
                Retrofit retrofitA = ik0.b.a(retrofitFactory, null, null, converterFactory, null, 27);
                s.k(retrofitA);
                return retrofitA;
            case 5:
                return new bsc.c((TradingScaPromptService) cVar.f146381l.get());
            case 6:
                TradingScaPromptService tradingScaPromptService = (TradingScaPromptService) com.google.android.gms.internal.mlkit_vision_face.a.i((Retrofit) cVar.f146380j.get(), "retrofit", TradingScaPromptService.class, "create(...)");
                s.k(tradingScaPromptService);
                return tradingScaPromptService;
            default:
                throw new AssertionError(i);
        }
    }
}
