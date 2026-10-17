package mp;

import akl.s;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import aw0.l6;
import com.appsflyer.AppsFlyerConversionListener;
import com.google.android.gms.internal.mlkit_vision_barcode.zzpi;
import com.google.android.gms.internal.mlkit_vision_barcode.zzpj;
import com.google.android.gms.internal.mlkit_vision_barcode.zzpl;
import com.google.android.gms.internal.mlkit_vision_barcode.zzqa;
import com.google.android.gms.internal.mlkit_vision_barcode.zztm;
import com.google.android.gms.internal.mlkit_vision_barcode.zztw;
import com.google.android.gms.internal.mlkit_vision_barcode.zzua;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import com.revolut.core.data.db.migration.MigrationRequiredException;
import com.revolut.feature.cards_troubleshooter.impl.network.CardsTroubleshooterService;
import com.revolut.feature.credit.loan.api.models.rev10.LoanDocument;
import com.revolut.feature.credit.loan.api.models.rev10.LoanDocuments;
import com.revolut.kompot.entry_point.fragment.KompotFragment;
import com.revolut.retail.common.ui.R$string;
import com.youTransactor.uCube.rpc.Constants;
import e8.e0;
import efm.f0;
import g48.r0;
import ie.c0;
import java.lang.reflect.Field;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeoutException;
import kotlin.jvm.internal.Intrinsics;
import m1b.b;
import net.zetetic.database.sqlcipher.SQLiteConnection;
import net.zetetic.database.sqlcipher.SQLiteDatabaseHook;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.json.JSONException;
import org.json.JSONObject;
import yhm.m;
import zhm.h0;
import zhm.w;

/* JADX INFO: loaded from: classes.dex */
public final class r implements SQLiteDatabaseHook, f0, OnSuccessListener, ge.b, he.b, zztw, in.b, AppsFlyerConversionListener, c8.i, kfm.o, kfm.g, OnCompleteListener, eq0.b, q8.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f207712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f207713b;

    public r(bo.c function) {
        this.f207712a = 21;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f207713b = function;
    }

    public static void j(byte b4, byte b5, int i, long j2) throws jk.b {
        if (b4 == 3) {
            throw new jk.b("unsynchronized server");
        }
        if (b5 != 4 && b5 != 5) {
            throw new jk.b(a0.d.n("untrusted mode: ", b5));
        }
        if (i == 0 || i > 15) {
            throw new jk.b(a0.d.n("untrusted stratum: ", i));
        }
        if (j2 == 0) {
            throw new jk.b("zero transmitTime");
        }
    }

    public static long n(byte[] bArr, int i) {
        int i2 = bArr[i];
        int i3 = bArr[i + 1];
        int i5 = bArr[i + 2];
        int i6 = bArr[i + 3];
        if ((i2 & 128) == 128) {
            i2 = (i2 & CertificateBody.profileType) + 128;
        }
        if ((i3 & 128) == 128) {
            i3 = (i3 & CertificateBody.profileType) + 128;
        }
        if ((i5 & 128) == 128) {
            i5 = (i5 & CertificateBody.profileType) + 128;
        }
        if ((i6 & 128) == 128) {
            i6 = (i6 & CertificateBody.profileType) + 128;
        }
        return (((long) i2) << 24) + (((long) i3) << 16) + (((long) i5) << 8) + ((long) i6);
    }

    public static long o(int i, byte[] bArr) {
        long jN = n(bArr, i);
        return ((n(bArr, i + 4) * 1000) / 4294967296L) + ((jN - 2208988800L) * 1000);
    }

    public static String q(Bundle bundle, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : bundle.keySet()) {
            jSONObject2.put(str2, bundle.get(str2));
        }
        jSONObject.put("name", str);
        jSONObject.put("parameters", jSONObject2);
        return jSONObject.toString();
    }

    @Override // net.zetetic.database.sqlcipher.SQLiteDatabaseHook
    public void a(SQLiteConnection connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        if (((bl0.f) this.f207713b).e()) {
            return;
        }
        try {
            connection.h("PRAGMA cipher_use_hmac = OFF;", null, null);
        } catch (Exception e) {
            gom.e.f145194a.e(e, "Disabling hmac validation failed", new Object[0]);
        }
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        ((kfm.g) this.f207713b).accept(efm.p.a((Throwable) obj2));
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object obj2) {
        switch (this.f207712a) {
            case 21:
                return ((bo.c) this.f207713b).invoke(obj2);
            case 22:
                Object[] objArr = (Object[]) obj2;
                if (objArr.length == 2) {
                    return ((kfm.c) this.f207713b).apply(objArr[0], objArr[1]);
                }
                throw new IllegalArgumentException("Array of size 2 expected but got " + objArr.length);
            case 23:
            case 24:
            case 25:
            default:
                return ((bo.c) this.f207713b).invoke(obj2);
            case 26:
                return ((bo.c) this.f207713b).invoke(obj2);
        }
    }

    @Override // c8.i
    public void b(byte[] bArr, Object obj2, MessageDigest messageDigest) {
        Long l2 = (Long) obj2;
        messageDigest.update(bArr);
        synchronized (((ByteBuffer) this.f207713b)) {
            ((ByteBuffer) this.f207713b).position(0);
            messageDigest.update(((ByteBuffer) this.f207713b).putLong(l2.longValue()).array());
        }
    }

    @Override // he.b
    public void c(he.a aVar) {
        this.f207713b = aVar;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
        }
    }

    @Override // q8.a
    public e0 d(e0 e0Var, c8.k kVar) {
        return l8.c.b((Resources) this.f207713b, e0Var);
    }

    @Override // ge.b
    public void g(Bundle bundle, String str) {
        he.a aVar = (he.a) this.f207713b;
        if (aVar != null) {
            try {
                ((ie.o) aVar).a("$A$:" + q(bundle, str));
            } catch (JSONException unused) {
            }
        }
    }

    @Override // eq0.b
    public boolean h(l6 product) {
        Intrinsics.checkNotNullParameter(product, "product");
        return ((eq0.a) this.f207713b).h(product);
    }

    @Override // net.zetetic.database.sqlcipher.SQLiteDatabaseHook
    public void i(SQLiteConnection connection) throws MigrationRequiredException {
        Intrinsics.checkNotNullParameter(connection, "connection");
        bl0.f fVar = (bl0.f) this.f207713b;
        if (fVar.g()) {
            throw new MigrationRequiredException(a0.d.r(fVar.b(), " requires migration"));
        }
    }

    public npi.d k(String dialogId) {
        Intrinsics.checkNotNullParameter(dialogId, "dialogId");
        int i = R$string.error_generic;
        t70.g gVar = (t70.g) this.f207713b;
        return new npi.d(dialogId, uc0.b.g(i, gVar), null, uc0.b.g(R$string.common_action_ok, gVar), null, null, Constants.TAG_F4);
    }

    public void l(fc.g gVar, Thread thread, Throwable th10) {
        ie.n nVar = (ie.n) this.f207713b;
        synchronized (nVar) {
            String str = "Handling uncaught exception \"" + th10 + "\" from thread " + thread.getName();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            }
            try {
                c0.a(nVar.e.f173167a.c(new ie.l(nVar, System.currentTimeMillis(), th10, thread, gVar)));
            } catch (TimeoutException unused) {
            } catch (Exception e) {
            }
        }
    }

    public qe.b m(JSONObject jSONObject) throws JSONException {
        qe.d bVar;
        int i = jSONObject.getInt("settings_version");
        if (i != 3) {
            String str = "Could not determine SettingsJsonTransform for settings version " + i + ". Using default settings values.";
            bVar = new dfm.c(11);
        } else {
            bVar = new qf.b(11);
        }
        return bVar.a((ch.b) this.f207713b, jSONObject);
    }

    @Override // com.appsflyer.AppsFlyerConversionListener
    public void onAppOpenAttribution(Map attributionData) {
        Intrinsics.checkNotNullParameter(attributionData, "attributionData");
    }

    @Override // com.appsflyer.AppsFlyerConversionListener
    public void onAttributionFailure(String str) {
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        ufm.a aVar = (ufm.a) this.f207713b;
        Intrinsics.checkNotNullParameter(task, "task");
        try {
            Object objS = rd0.e.s(task);
            if (objS == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            aVar.b(objS);
        } catch (Exception e) {
            if (aVar.isDisposed()) {
                return;
            }
            aVar.a(e);
        }
    }

    @Override // com.appsflyer.AppsFlyerConversionListener
    public void onConversionDataFail(String str) {
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, "AppsFlyerDeeplinkObserver", j6.a.q("ConversionListener onConversionDataFail, errorMessage: ", str), null, h0Var);
    }

    @Override // com.appsflyer.AppsFlyerConversionListener
    public void onConversionDataSuccess(Map conversionData) {
        m1b.b aVar;
        m1b.b bVar;
        String strA;
        l1b.g gVar = (l1b.g) this.f207713b;
        Intrinsics.checkNotNullParameter(conversionData, "conversionData");
        String lowerCase = String.valueOf(conversionData.get("af_status")).toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        if (Intrinsics.f(lowerCase, "non-organic") && String.valueOf(conversionData.get("is_first_launch")).equals("true") && gVar.k.compareAndSet(false, true)) {
            n1b.c cVar = gVar.d;
            cVar.getClass();
            Intrinsics.checkNotNullParameter(conversionData, "conversionData");
            try {
                l1b.i iVar = cVar.f211308b;
                iVar.getClass();
                Intrinsics.checkNotNullParameter(conversionData, "conversionData");
                Object obj2 = conversionData.get("deep_link_value");
                String str = obj2 instanceof String ? (String) obj2 : null;
                Object obj3 = conversionData.get("deep_link_sub1");
                strA = iVar.a(str, obj3 instanceof String ? (String) obj3 : null);
            } catch (Exception e) {
                aVar = new m1b.a(e);
            }
            if (strA == null) {
                bVar = b.a.f201328a;
                gVar.k3(bVar);
            } else {
                aVar = new m1b.c(strA, cVar.a(strA));
                bVar = aVar;
                gVar.k3(bVar);
            }
        }
    }

    @Override // efm.f0
    public void onError(Throwable th10) {
        skm.l lVar = (skm.l) this.f207713b;
        m.Companion aVar = yhm.m.INSTANCE;
        lVar.resumeWith(yhm.o.a(th10));
    }

    @Override // efm.f0
    public void onSubscribe(ifm.c cVar) {
        ((skm.l) this.f207713b).r(new s(cVar, 5));
    }

    @Override // efm.f0
    public void onSuccess(Object obj2) {
        switch (this.f207712a) {
            case 5:
                skm.l lVar = (skm.l) this.f207713b;
                m.Companion aVar = yhm.m.INSTANCE;
                lVar.resumeWith(obj2);
                break;
            default:
                ((ei0.f) this.f207713b).invoke(obj2);
                break;
        }
    }

    public jk.c p(Long l2, String host) throws Throwable {
        DatagramSocket datagramSocket = null;
        try {
            Intrinsics.checkNotNullParameter(host, "host");
            InetAddress address = InetAddress.getByName(host);
            Intrinsics.checkNotNullExpressionValue(address, "InetAddress.getByName(host)");
            DatagramSocket datagramSocket2 = new DatagramSocket();
            try {
                datagramSocket2.setSoTimeout(l2.intValue());
                byte[] buffer = new byte[48];
                Intrinsics.checkNotNullParameter(buffer, "buffer");
                Intrinsics.checkNotNullParameter(address, "address");
                DatagramPacket datagramPacket = new DatagramPacket(buffer, 48, address, 123);
                buffer[0] = Ascii.ESC;
                long jCurrentTimeMillis = System.currentTimeMillis();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                long j2 = jCurrentTimeMillis / 1000;
                long j3 = jCurrentTimeMillis - (j2 * 1000);
                buffer[40] = (byte) (r13 >> 24);
                buffer[41] = (byte) (r13 >> 16);
                buffer[42] = (byte) (r13 >> 8);
                buffer[43] = (byte) (j2 + 2208988800L);
                long j5 = (j3 * 4294967296L) / 1000;
                buffer[44] = (byte) (j5 >> 24);
                buffer[45] = (byte) (j5 >> 16);
                buffer[46] = (byte) (j5 >> 8);
                buffer[47] = (byte) (Math.random() * 255.0d);
                datagramSocket2.send(datagramPacket);
                byte[] buffer2 = Arrays.copyOf(buffer, 48);
                Intrinsics.checkNotNullParameter(buffer2, "buffer");
                datagramSocket2.receive(new DatagramPacket(buffer2, buffer2.length));
                long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                long j16 = (jElapsedRealtime2 - jElapsedRealtime) + jCurrentTimeMillis;
                byte b4 = buffer2[0];
                int i = buffer2[1] & UnsignedBytes.MAX_VALUE;
                long jO = o(24, buffer2);
                long jO2 = o(32, buffer2);
                long jO3 = o(40, buffer2);
                j((byte) ((b4 >> 6) & 3), (byte) (b4 & 7), i, jO3);
                try {
                    jk.c cVar = new jk.c(j16, jElapsedRealtime2, ((jO3 - j16) + (jO2 - jO)) / 2, (dfm.c) this.f207713b);
                    datagramSocket2.close();
                    return cVar;
                } catch (Throwable th10) {
                    th = th10;
                    datagramSocket = datagramSocket2;
                    if (datagramSocket != null) {
                        datagramSocket.close();
                    }
                    throw th;
                }
            } catch (Throwable th11) {
                th = th11;
            }
        } catch (Throwable th12) {
            th = th12;
        }
    }

    public LoanDocuments r(i55.k documents, String loanId) {
        Intrinsics.checkNotNullParameter(documents, "documents");
        Intrinsics.checkNotNullParameter(loanId, "loanId");
        zhm.f0 f0Var = zhm.f0.f322471a;
        List listA = documents.getDocuments();
        ArrayList arrayList = new ArrayList(w.t(listA, 10));
        for (Iterator it8 = listA.iterator(); it8.hasNext(); it8 = it8) {
            i55.j jVar = (i55.j) it8.next();
            String strC = jVar.getId();
            String strD = jVar.getName();
            String strB = jVar.getDescription();
            ZonedDateTime zonedDateTime = ZonedDateTime.parse(jVar.getCreatedDate());
            Intrinsics.checkNotNullExpressionValue(zonedDateTime, "parse(...)");
            arrayList.add(new LoanDocument(pu7.a.I(zonedDateTime), jVar.getRank(), strC, strD, strB, com.google.android.gms.internal.mlkit_vision_face.a.p(((ij0.a) this.f207713b).getBaseUrl(), "/disbursals/documents/", jVar.getId(), "?loanId=", loanId)));
        }
        zhm.f0 f0Var2 = zhm.f0.f322471a;
        return new LoanDocuments(f0Var, arrayList, f0Var2, f0Var2);
    }

    public String toString() {
        switch (this.f207712a) {
            case 18:
                return ((Field) this.f207713b).toString();
            default:
                return super.toString();
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zztw
    public zztm zza() {
        zzpj zzpjVar = (zzpj) this.f207713b;
        zzpl zzplVar = new zzpl();
        zzplVar.zze(hh.b.c() ? zzpi.TYPE_THICK : zzpi.TYPE_THIN);
        zzqa zzqaVar = new zzqa();
        zzqaVar.zzb(zzpjVar);
        zzplVar.zzh(zzqaVar.zzc());
        return zzua.zzf(zzplVar);
    }

    public r(bo.c function, byte b4) {
        this.f207712a = 26;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f207713b = function;
    }

    public r(bo.c function, char c2) {
        this.f207712a = 27;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f207713b = function;
    }

    public r(ei0.f function) {
        this.f207712a = 7;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f207713b = function;
    }

    public /* synthetic */ r(Object obj2, int i) {
        this.f207712a = i;
        this.f207713b = obj2;
    }

    public r(b70.e accessibilityDataProvider) {
        this.f207712a = 12;
        Intrinsics.checkNotNullParameter(accessibilityDataProvider, "accessibilityDataProvider");
        this.f207713b = accessibilityDataProvider;
    }

    public r(ufm.a emitter) {
        this.f207712a = 24;
        Intrinsics.checkNotNullParameter(emitter, "emitter");
        this.f207713b = emitter;
    }

    public r(CardsTroubleshooterService troubleshooterService) {
        this.f207712a = 1;
        Intrinsics.checkNotNullParameter(troubleshooterService, "troubleshooterService");
        this.f207713b = troubleshooterService;
    }

    public r(y91.b accountsProductFeatureChecker) {
        this.f207712a = 9;
        Intrinsics.checkNotNullParameter(accountsProductFeatureChecker, "accountsProductFeatureChecker");
        this.f207713b = accountsProductFeatureChecker;
    }

    public r(eq0.a mutableInteractor) {
        this.f207712a = 25;
        Intrinsics.checkNotNullParameter(mutableInteractor, "mutableInteractor");
        this.f207713b = mutableInteractor;
    }

    public r(ij0.a networkConfiguration) {
        this.f207712a = 3;
        Intrinsics.checkNotNullParameter(networkConfiguration, "networkConfiguration");
        this.f207713b = networkConfiguration;
    }

    public r(lm.c coldStartDetectionDelegate) {
        this.f207712a = 0;
        Intrinsics.checkNotNullParameter(coldStartDetectionDelegate, "coldStartDetectionDelegate");
        this.f207713b = coldStartDetectionDelegate;
    }

    public r(r0 jointAccountsInteractor) {
        this.f207712a = 14;
        Intrinsics.checkNotNullParameter(jointAccountsInteractor, "jointAccountsInteractor");
        this.f207713b = jointAccountsInteractor;
    }

    public r(t70.g localisation) {
        this.f207712a = 16;
        Intrinsics.checkNotNullParameter(localisation, "localisation");
        this.f207713b = localisation;
    }

    public r(bl0.f databaseEncryptionMigrator) {
        this.f207712a = 4;
        Intrinsics.checkNotNullParameter(databaseEncryptionMigrator, "databaseEncryptionMigrator");
        this.f207713b = databaseEncryptionMigrator;
    }

    public r(KompotFragment fragment) {
        this.f207712a = 2;
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.f207713b = fragment;
    }

    public r(Field field) {
        this.f207712a = 18;
        Objects.requireNonNull(field);
        this.f207713b = field;
    }

    public r(int i) {
        this.f207712a = i;
        switch (i) {
            case 20:
                this.f207713b = ByteBuffer.allocate(8);
                break;
        }
    }

    public r(dfm.c cVar, jk.a aVar, jk.a aVar2) {
        this.f207712a = 17;
        this.f207713b = cVar;
    }
}
