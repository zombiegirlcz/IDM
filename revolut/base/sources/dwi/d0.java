package dwi;

import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class d0 implements qvi.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hwi.w f120416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hwi.j0 f120417b;

    public d0(hwi.w loungePassesRepository, hwi.j0 passWelcomeRepository) {
        Intrinsics.checkNotNullParameter(loungePassesRepository, "loungePassesRepository");
        Intrinsics.checkNotNullParameter(passWelcomeRepository, "passWelcomeRepository");
        this.f120416a = loungePassesRepository;
        this.f120417b = passWelcomeRepository;
    }

    public final efm.r a(svi.z zVar) {
        ue0.c cVar = this.f120417b.f156226a;
        Type type = new TypeToken<Boolean>() { // from class: com.revolut.retail.feature.airportlounges.impl.repository.AirportLoungesPassWelcomeRepositoryImpl$observePassWelcomeShown$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        efm.r map = rd0.e.c(cVar.C0("KEY_WELCOME_SHOWN", type), kotlin.coroutines.g.f186406a).map(new hw3.d(12, new hwf.b(11)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return nim.a.w(te0.w.f0(map), new dug.a(zVar, 11));
    }
}
