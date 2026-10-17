package gm0;

import android.accounts.Account;
import android.accounts.AccountManager;
import com.revolut.core.security.deviceId.impl.DeviceIdAccountManager$ScopedDeviceId;
import e8.r;
import ghk.t;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KProperty;
import kotlin.text.Charsets;
import kotlin.text.a0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class m implements dm0.d {

    @NotNull
    public static final l Companion;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f144745j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x80.a f144746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AccountManager f144747b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f144748c;
    public final i90.b d;
    public final cpi.g e;
    public final p f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ue0.c f144749g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final r f144750h;
    public final r i;

    static {
        h0 h0Var = new h0(m.class, "hardwareId", "getHardwareId()Ljava/lang/String;", 0);
        p0 p0Var = o0.f186429a;
        f144745j = new KProperty[]{p0Var.j(h0Var), p.a.y(m.class, "deviceId", "getDeviceId()Ljava/lang/String;", 0, p0Var)};
        Companion = new l();
    }

    public m(dm0.c deviceIdConfig, x80.a packageNameProvider, AccountManager accountManager, o deviceIdStorage, i90.b uuidUtils, cpi.g adsIdGenerator, p xorDeviceIdEncoder, ue0.c storage) {
        Intrinsics.checkNotNullParameter(deviceIdConfig, "deviceIdConfig");
        Intrinsics.checkNotNullParameter(packageNameProvider, "packageNameProvider");
        Intrinsics.checkNotNullParameter(accountManager, "accountManager");
        Intrinsics.checkNotNullParameter(deviceIdStorage, "deviceIdStorage");
        Intrinsics.checkNotNullParameter(uuidUtils, "uuidUtils");
        Intrinsics.checkNotNullParameter(adsIdGenerator, "adsIdGenerator");
        Intrinsics.checkNotNullParameter(xorDeviceIdEncoder, "xorDeviceIdEncoder");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f144746a = packageNameProvider;
        this.f144747b = accountManager;
        this.f144748c = deviceIdStorage;
        this.d = uuidUtils;
        this.e = adsIdGenerator;
        this.f = xorDeviceIdEncoder;
        this.f144749g = storage;
        final int i = 0;
        this.f144750h = new r(new Function0(this) { // from class: gm0.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m f144744b;

            {
                this.f144744b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:25:0x0078  */
            @Override // kotlin.jvm.functions.Function0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke() {
                /*
                    Method dump skipped, instruction units count: 512
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: gm0.k.invoke():java.lang.Object");
            }
        });
        final int i2 = 1;
        this.i = new r(new Function0(this) { // from class: gm0.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m f144744b;

            {
                this.f144744b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:25:0x0078  */
            @Override // kotlin.jvm.functions.Function0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke() {
                /*
                    Method dump skipped, instruction units count: 512
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: gm0.k.invoke():java.lang.Object");
            }
        });
    }

    public static ArrayList c(Account[] accountArr) {
        ArrayList arrayList = new ArrayList();
        for (Account account : accountArr) {
            String type = account.type;
            Intrinsics.checkNotNullExpressionValue(type, "type");
            if (a0.H(type, "com.revolut.", false)) {
                arrayList.add(account);
            }
        }
        return arrayList;
    }

    public static void d(String str, String str2, String str3) {
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.c cVar = rd0.c.INFO;
        StringBuilder sbM = v0.a.m("deviceId is provided:", str2, "\nSource: ", str, "\nReason: ");
        sbM.append(str3);
        rd0.d.b(cVar, "DeviceIdSource", sbM.toString(), null, null, 16);
    }

    public static void e(String str, String str2, String str3) {
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.c cVar = rd0.c.INFO;
        StringBuilder sbM = v0.a.m("hardwareId is provided:", str2, "\nSource: ", str, "\nReason: ");
        sbM.append(str3);
        rd0.d.b(cVar, "HardwareIdSource", sbM.toString(), null, null, 16);
    }

    public static final boolean g(m mVar, String str, Account account) {
        AccountManager accountManager = mVar.f144747b;
        try {
            if (Intrinsics.f(accountManager.getUserData(account, "com.revolut.USER_DATA_DEVICE_ID"), str)) {
                return true;
            }
            String userData = accountManager.getUserData(account, "com.revolut.USER_DATA_SCOPED_DEVICE_IDS");
            if (userData != null) {
                d.Companion.getClass();
                Set setB = a.b(userData);
                if (setB != null) {
                    Set set = setB;
                    if (!(set instanceof Collection) || !set.isEmpty()) {
                        Iterator it8 = set.iterator();
                        while (it8.hasNext()) {
                            if (Intrinsics.f(((DeviceIdAccountManager$ScopedDeviceId) it8.next()).getF51452a(), str)) {
                                return true;
                            }
                        }
                    }
                }
            }
            return false;
        } catch (Throwable th10) {
            zhm.h0 h0Var = zhm.h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, th10, h0Var);
            return false;
        }
    }

    @Override // dm0.d
    public final c a() {
        return c.GLOBAL;
    }

    @Override // dm0.d
    public final dm0.b b() {
        KProperty[] kPropertyArr = f144745j;
        KProperty kProperty = kPropertyArr[1];
        r rVar = this.i;
        String uuid = (String) rVar.b(kProperty);
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        UUID value = UUID.fromString(uuid);
        Intrinsics.checkNotNullExpressionValue(value, "fromString(...)");
        Intrinsics.checkNotNullParameter(value, "value");
        KProperty kProperty2 = kPropertyArr[0];
        r rVar2 = this.f144750h;
        String uuid2 = (String) rVar2.b(kProperty2);
        Intrinsics.checkNotNullParameter(uuid2, "uuid");
        UUID value2 = UUID.fromString(uuid2);
        Intrinsics.checkNotNullExpressionValue(value2, "fromString(...)");
        Intrinsics.checkNotNullParameter(value2, "value");
        ue0.c cVar = this.f144749g;
        Class cls = Integer.TYPE;
        Integer num = (Integer) cVar.T2("PREF_KEY_CURRENT_DEVICE_ID_VERSION", cls);
        int i = (num != null && num.intValue() == 2) ? 2 : 3;
        Intrinsics.checkNotNullParameter(value, "$v$c$com-revolut-core-security-deviceId-DeviceAgentId$-deviceAgentId$0");
        Intrinsics.checkNotNullParameter(value2, "$v$c$com-revolut-core-security-deviceId-HardwareId$-hardwareId$0");
        tim.c.INSTANCE.getClass();
        int iC = tim.c.f271589b.c();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(100);
        Intrinsics.checkNotNullExpressionValue(byteBufferAllocate, "allocate(...)");
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[8]);
        byteBufferWrap.putLong(((long) i) * ((long) iC));
        byte[] bArrArray = byteBufferWrap.array();
        Intrinsics.checkNotNullExpressionValue(bArrArray, "array(...)");
        ByteBuffer byteBufferPut = byteBufferAllocate.put(bArrArray);
        Intrinsics.checkNotNullExpressionValue(byteBufferPut, "put(...)");
        ByteBuffer byteBufferPutInt = p.a(byteBufferPut, 4).putInt(iC);
        Intrinsics.checkNotNullExpressionValue(byteBufferPutInt, "putInt(...)");
        ByteBuffer byteBufferB = p.b(p.a(p.a(p.b(p.a(byteBufferPutInt, 4), iC, value), 12), 4), iC, value2);
        tl0.a aVar = this.f.f144752a;
        byte[] bArrArray2 = byteBufferB.array();
        Intrinsics.checkNotNullExpressionValue(bArrArray2, "array(...)");
        String str = new String(aVar.b(bArrArray2), Charsets.UTF_8);
        Integer num2 = (Integer) cVar.T2("PREF_KEY_CURRENT_DEVICE_ID_VERSION", cls);
        return new dm0.b(str, (num2 != null && num2.intValue() == 2) ? 2 : 3, (String) rVar.b(kPropertyArr[1]), (String) rVar2.b(kPropertyArr[0]));
    }

    @Override // dm0.d
    public final boolean clear() {
        return f((String) this.i.b(f144745j[1]));
    }

    public final boolean f(String str) {
        r.d(this.i, new t(this, str, 5), 1);
        Account[] accounts = this.f144747b.getAccounts();
        Intrinsics.checkNotNullExpressionValue(accounts, "getAccounts(...)");
        ArrayList arrayListC = c(accounts);
        if (!arrayListC.isEmpty()) {
            Iterator it8 = arrayListC.iterator();
            while (it8.hasNext()) {
                if (g(this, str, (Account) it8.next())) {
                    return false;
                }
            }
        }
        return true;
    }
}
