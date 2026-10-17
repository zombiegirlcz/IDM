package ha1;

import com.revolut.feature.acquiring.card_reader.data.impl.data.network.CardReaderService;
import kotlin.jvm.internal.Intrinsics;
import te0.w;

/* JADX INFO: loaded from: classes20.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CardReaderService f150372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ca1.a f150373b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ia1.c f150374c;
    public final ia1.b d;
    public final kg.o e;

    public n(CardReaderService service, ca1.a cardReaderRepository, ia1.c pairingInfoDomainMapper, ia1.b firmwareBinaryDomainMapper, kg.o gson) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(cardReaderRepository, "cardReaderRepository");
        Intrinsics.checkNotNullParameter(pairingInfoDomainMapper, "pairingInfoDomainMapper");
        Intrinsics.checkNotNullParameter(firmwareBinaryDomainMapper, "firmwareBinaryDomainMapper");
        Intrinsics.checkNotNullParameter(gson, "gson");
        this.f150372a = service;
        this.f150373b = cardReaderRepository;
        this.f150374c = pairingInfoDomainMapper;
        this.d = firmwareBinaryDomainMapper;
        this.e = gson;
    }

    public static pfm.r a(n nVar, String terminalId, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            str3 = null;
        }
        if ((i & 16) != 0) {
            str4 = null;
        }
        if ((i & 32) != 0) {
            str5 = null;
        }
        if ((i & 64) != 0) {
            str6 = null;
        }
        String str8 = (i & 128) != 0 ? null : str7;
        nVar.getClass();
        Intrinsics.checkNotNullParameter(terminalId, "terminalId");
        String str9 = str6;
        String str10 = str5;
        efm.b bVarConfirmUpdates = nVar.f150372a.confirmUpdates(terminalId, new ga1.s(str, str2, str3, str4, str10, str9, str8));
        ihm.f fVar = ea1.b.f124050a;
        return w.g0(ea1.b.c(bVarConfirmUpdates, "POST: Updating hashes", fa1.k.INFO));
    }
}
