package ma1;

import com.revolut.feature.acquiring.card_reader.data.api.domain.model.CardReaderDevice;
import efm.d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qfm.j0;

/* JADX INFO: loaded from: classes20.dex */
public final class t implements da1.d {

    @NotNull
    public static final s Companion = new s();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sa1.d f203904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f203905b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ca1.a f203906c;

    public t(sa1.d sdkAdapter, e bleRequirementsChecker, ca1.a cardReaderRepository) {
        Intrinsics.checkNotNullParameter(sdkAdapter, "sdkAdapter");
        Intrinsics.checkNotNullParameter(bleRequirementsChecker, "bleRequirementsChecker");
        Intrinsics.checkNotNullParameter(cardReaderRepository, "cardReaderRepository");
        this.f203904a = sdkAdapter;
        this.f203905b = bleRequirementsChecker;
        this.f203906c = cardReaderRepository;
    }

    public static String d(CardReaderDevice cardReaderDevice) {
        return j6.a.s("CardReaderDevice(name=", cardReaderDevice.getName(), ", address=", cardReaderDevice.getAddress(), ")");
    }

    public final pfm.h a(CardReaderDevice cardReader) {
        Intrinsics.checkNotNullParameter(cardReader, "cardReader");
        Intrinsics.checkNotNullParameter(cardReader, "cardReader");
        efm.r rVarDefer = efm.r.defer(new m1i.t(this, cardReader, 2));
        Intrinsics.checkNotNullExpressionValue(rVarDefer, "defer(...)");
        efm.b bVarFlatMapCompletable = rVarDefer.filter(new m78.e(new m9l.d(10), 23)).flatMapCompletable(new m78.e(new m9l.d(11), 24));
        pfm.h hVar = new pfm.h(new j0(bVarFlatMapCompletable.B(), new m78.e(new m9l.d(12), 25), 2), 3);
        Intrinsics.checkNotNullExpressionValue(hVar, "retryWhen(...)");
        return hVar;
    }

    public final d0 b() {
        if (!c()) {
            return d0.m(Boolean.TRUE);
        }
        sa1.q qVar = (sa1.q) this.f203904a;
        qVar.getClass();
        ufm.b bVar = new ufm.b(new sa1.k(qVar), 0);
        Intrinsics.checkNotNullExpressionValue(bVar, "create(...)");
        return bVar;
    }

    public final boolean c() {
        return ((sa1.q) this.f203904a).b().isConnected();
    }
}
