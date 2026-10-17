package ha1;

import com.revolut.feature.acquiring.card_reader.data.api.domain.model.PairingInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import le.u1;
import zhm.w;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f150361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f150362b;

    public /* synthetic */ i(n nVar, int i) {
        this.f150361a = i;
        this.f150362b = nVar;
    }

    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, java.util.Map] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f150361a) {
            case 0:
                ga1.d it8 = (ga1.d) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return this.f150362b.d.a(it8);
            case 1:
                ga1.d it9 = (ga1.d) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return this.f150362b.d.a(it9);
            case 2:
                ga1.l dto = (ga1.l) obj2;
                Intrinsics.checkNotNullParameter(dto, "it");
                this.f150362b.f150374c.getClass();
                Intrinsics.checkNotNullParameter(dto, "dto");
                String terminalId = dto.getTerminalId();
                List plainEmvTags = dto.getPlainEmvTags();
                ArrayList arrayList = new ArrayList(w.t(plainEmvTags, 10));
                Iterator it10 = plainEmvTags.iterator();
                while (it10.hasNext()) {
                    arrayList.add(Integer.valueOf(Integer.parseInt((String) it10.next(), CharsKt.checkRadix(16))));
                }
                List encryptedEmvTags = dto.getEncryptedEmvTags();
                ArrayList arrayList2 = new ArrayList(w.t(encryptedEmvTags, 10));
                Iterator it11 = encryptedEmvTags.iterator();
                while (it11.hasNext()) {
                    arrayList2.add(Integer.valueOf(Integer.parseInt((String) it11.next(), CharsKt.checkRadix(16))));
                }
                boolean dekUpdate = dto.getDekUpdate();
                boolean pekUpdate = dto.getPekUpdate();
                boolean contactParamsUpdate = dto.getContactParamsUpdate();
                boolean contactlessParamsUpdate = dto.getContactlessParamsUpdate();
                boolean firmwareUpdate = dto.getFirmwareUpdate();
                boolean bluetoothFirmwareUpdate = dto.getBluetoothFirmwareUpdate();
                boolean terminalParamsUpdate = dto.getTerminalParamsUpdate();
                String locale = dto.getLocale();
                int updateBinaryBlocksCount = dto.getUpdateBinaryBlocksCount();
                fa1.e eVar = fa1.f.Companion;
                String captureMode = dto.getCaptureMode();
                eVar.getClass();
                fa1.f fVarA = fa1.e.a(captureMode);
                long jC = dto.getTransactionLimit().c();
                xi0.a aVar = xi0.b.Companion;
                String strD = dto.getTransactionLimit().d();
                aVar.getClass();
                return new PairingInfo(terminalId, arrayList, arrayList2, dekUpdate, pekUpdate, contactParamsUpdate, contactlessParamsUpdate, firmwareUpdate, terminalParamsUpdate, bluetoothFirmwareUpdate, locale, updateBinaryBlocksCount, fVarA, new dj0.d(jC, xi0.a.a(strD)), (fa1.k) u1.t(dto.getLogLevel(), fa1.k.WARNING, ia1.a.f159925a));
            default:
                Throwable exception = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(exception, "exception");
                return ua1.b.a(this.f150362b.e, exception, qa1.k.NO_ACTIVE_PAYMENT_PROVIDER, new h43.b(10));
        }
    }
}
