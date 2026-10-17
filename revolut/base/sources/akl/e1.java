package akl;

import au0.x3;
import com.revolut.core.security.deviceId.impl.DeviceIdAccountManager$ScopedDeviceId;
import com.revolut.sso.api.models.UserInfo;
import com.revolut.sso.impl.network.services.UserInfoService;
import ip0.v7;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import jkl.o4;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class e1 implements o0 {

    @NotNull
    public static final r0 Companion = new r0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UserInfoService f6003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tjl.b f6004b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final tjl.d f6005c;
    public final ne0.j d;
    public final uil.a e;
    public final x80.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final dm0.d f6006g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final x3 f6007h;
    public final bjl.p0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final d4m.a f6008j;
    public final w4l.f k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final x4l.c f6009l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final x4l.c f6010m;

    public e1(UserInfoService userInfoService, tjl.b consentedClientDao, tjl.d userInfoAccountDao, ne0.j memoryCache, uil.a revolutAccountsManager, x80.a packageNameProvider, dm0.d deviceIdProvider, x3 pictureCompressor, bjl.p0 revolutSsoDependenciesProvider, d4m.a userInfoPictureFactory) {
        Intrinsics.checkNotNullParameter(userInfoService, "userInfoService");
        Intrinsics.checkNotNullParameter(consentedClientDao, "consentedClientDao");
        Intrinsics.checkNotNullParameter(userInfoAccountDao, "userInfoAccountDao");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(revolutAccountsManager, "revolutAccountsManager");
        Intrinsics.checkNotNullParameter(packageNameProvider, "packageNameProvider");
        Intrinsics.checkNotNullParameter(deviceIdProvider, "deviceIdProvider");
        Intrinsics.checkNotNullParameter(pictureCompressor, "pictureCompressor");
        Intrinsics.checkNotNullParameter(revolutSsoDependenciesProvider, "revolutSsoDependenciesProvider");
        Intrinsics.checkNotNullParameter(userInfoPictureFactory, "userInfoPictureFactory");
        this.f6003a = userInfoService;
        this.f6004b = consentedClientDao;
        this.f6005c = userInfoAccountDao;
        this.d = memoryCache;
        this.e = revolutAccountsManager;
        this.f = packageNameProvider;
        this.f6006g = deviceIdProvider;
        this.f6007h = pictureCompressor;
        this.i = revolutSsoDependenciesProvider;
        this.f6008j = userInfoPictureFactory;
        final int i = 0;
        final int i2 = 0;
        final int i3 = 1;
        final int i5 = 1;
        final int i6 = 2;
        this.k = new w4l.f(new Function2(this) { // from class: akl.p0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e1 f6071b;

            {
                this.f6071b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) throws Throwable {
                switch (i) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        s0 data = (s0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(data, "data");
                        break;
                    case 1:
                        s0 data2 = (s0) obj2;
                        UserInfo userInfo = (UserInfo) obj3;
                        Intrinsics.checkNotNullParameter(data2, "data");
                        Intrinsics.checkNotNullParameter(userInfo, "userInfo");
                        UserInfo.INSTANCE.getClass();
                        if (!Intrinsics.f(userInfo, UserInfo.k)) {
                            this.f6071b.d.f("USER_INFO_FOR_" + data2.f6087b, userInfo);
                        }
                        break;
                    case 2:
                        s0 data3 = (s0) obj2;
                        UserInfo userInfo2 = (UserInfo) obj3;
                        Intrinsics.checkNotNullParameter(data3, "data");
                        Intrinsics.checkNotNullParameter(userInfo2, "userInfo");
                        UserInfo.INSTANCE.getClass();
                        if (!Intrinsics.f(userInfo2, UserInfo.k)) {
                            skm.e0.E(kotlin.coroutines.g.f186406a, new a1a.b(this.f6071b, data3, userInfo2, null, 28));
                        }
                        break;
                    case 3:
                        List consentedClients = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(consentedClients, "consentedClients");
                        this.f6071b.d.f("CONSENTED_CLIENTS", consentedClients);
                        break;
                    default:
                        List userInfoAccounts = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(userInfoAccounts, "userInfoAccounts");
                        this.f6071b.d.f("USER_INFO_ACCOUNTS", userInfoAccounts);
                        break;
                }
                return Unit.f186387a;
            }
        }, new Function1(this) { // from class: akl.q0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e1 f6077b;

            {
                this.f6077b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i2) {
                    case 0:
                        s0 data = (s0) obj2;
                        Intrinsics.checkNotNullParameter(data, "data");
                        return (UserInfo) v7.r("USER_INFO_FOR_", data.f6087b, this.f6077b.d);
                    case 1:
                        s0 data2 = (s0) obj2;
                        Intrinsics.checkNotNullParameter(data2, "data");
                        return (UserInfo) skm.e0.E(kotlin.coroutines.g.f186406a, new ad4.c(this.f6077b, data2, null, 26));
                    case 2:
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        return (List) this.f6077b.d.get("CONSENTED_CLIENTS");
                    default:
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        return (List) this.f6077b.d.get("USER_INFO_ACCOUNTS");
                }
            }
        }, new Function2(this) { // from class: akl.p0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e1 f6071b;

            {
                this.f6071b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) throws Throwable {
                switch (i3) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        s0 data = (s0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(data, "data");
                        break;
                    case 1:
                        s0 data2 = (s0) obj2;
                        UserInfo userInfo = (UserInfo) obj3;
                        Intrinsics.checkNotNullParameter(data2, "data");
                        Intrinsics.checkNotNullParameter(userInfo, "userInfo");
                        UserInfo.INSTANCE.getClass();
                        if (!Intrinsics.f(userInfo, UserInfo.k)) {
                            this.f6071b.d.f("USER_INFO_FOR_" + data2.f6087b, userInfo);
                        }
                        break;
                    case 2:
                        s0 data3 = (s0) obj2;
                        UserInfo userInfo2 = (UserInfo) obj3;
                        Intrinsics.checkNotNullParameter(data3, "data");
                        Intrinsics.checkNotNullParameter(userInfo2, "userInfo");
                        UserInfo.INSTANCE.getClass();
                        if (!Intrinsics.f(userInfo2, UserInfo.k)) {
                            skm.e0.E(kotlin.coroutines.g.f186406a, new a1a.b(this.f6071b, data3, userInfo2, null, 28));
                        }
                        break;
                    case 3:
                        List consentedClients = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(consentedClients, "consentedClients");
                        this.f6071b.d.f("CONSENTED_CLIENTS", consentedClients);
                        break;
                    default:
                        List userInfoAccounts = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(userInfoAccounts, "userInfoAccounts");
                        this.f6071b.d.f("USER_INFO_ACCOUNTS", userInfoAccounts);
                        break;
                }
                return Unit.f186387a;
            }
        }, new Function1(this) { // from class: akl.q0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e1 f6077b;

            {
                this.f6077b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i5) {
                    case 0:
                        s0 data = (s0) obj2;
                        Intrinsics.checkNotNullParameter(data, "data");
                        return (UserInfo) v7.r("USER_INFO_FOR_", data.f6087b, this.f6077b.d);
                    case 1:
                        s0 data2 = (s0) obj2;
                        Intrinsics.checkNotNullParameter(data2, "data");
                        return (UserInfo) skm.e0.E(kotlin.coroutines.g.f186406a, new ad4.c(this.f6077b, data2, null, 26));
                    case 2:
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        return (List) this.f6077b.d.get("CONSENTED_CLIENTS");
                    default:
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        return (List) this.f6077b.d.get("USER_INFO_ACCOUNTS");
                }
            }
        }, new Function2(this) { // from class: akl.p0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e1 f6071b;

            {
                this.f6071b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) throws Throwable {
                switch (i6) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        s0 data = (s0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(data, "data");
                        break;
                    case 1:
                        s0 data2 = (s0) obj2;
                        UserInfo userInfo = (UserInfo) obj3;
                        Intrinsics.checkNotNullParameter(data2, "data");
                        Intrinsics.checkNotNullParameter(userInfo, "userInfo");
                        UserInfo.INSTANCE.getClass();
                        if (!Intrinsics.f(userInfo, UserInfo.k)) {
                            this.f6071b.d.f("USER_INFO_FOR_" + data2.f6087b, userInfo);
                        }
                        break;
                    case 2:
                        s0 data3 = (s0) obj2;
                        UserInfo userInfo2 = (UserInfo) obj3;
                        Intrinsics.checkNotNullParameter(data3, "data");
                        Intrinsics.checkNotNullParameter(userInfo2, "userInfo");
                        UserInfo.INSTANCE.getClass();
                        if (!Intrinsics.f(userInfo2, UserInfo.k)) {
                            skm.e0.E(kotlin.coroutines.g.f186406a, new a1a.b(this.f6071b, data3, userInfo2, null, 28));
                        }
                        break;
                    case 3:
                        List consentedClients = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(consentedClients, "consentedClients");
                        this.f6071b.d.f("CONSENTED_CLIENTS", consentedClients);
                        break;
                    default:
                        List userInfoAccounts = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(userInfoAccounts, "userInfoAccounts");
                        this.f6071b.d.f("USER_INFO_ACCOUNTS", userInfoAccounts);
                        break;
                }
                return Unit.f186387a;
            }
        }, null, null, new ifm.b(), 96);
        Continuation continuation = null;
        final int i21 = 2;
        final int i22 = 3;
        this.f6009l = new x4l.c(new a1(this, continuation, 1), new Function1(this) { // from class: akl.q0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e1 f6077b;

            {
                this.f6077b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i21) {
                    case 0:
                        s0 data = (s0) obj2;
                        Intrinsics.checkNotNullParameter(data, "data");
                        return (UserInfo) v7.r("USER_INFO_FOR_", data.f6087b, this.f6077b.d);
                    case 1:
                        s0 data2 = (s0) obj2;
                        Intrinsics.checkNotNullParameter(data2, "data");
                        return (UserInfo) skm.e0.E(kotlin.coroutines.g.f186406a, new ad4.c(this.f6077b, data2, null, 26));
                    case 2:
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        return (List) this.f6077b.d.get("CONSENTED_CLIENTS");
                    default:
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        return (List) this.f6077b.d.get("USER_INFO_ACCOUNTS");
                }
            }
        }, new Function2(this) { // from class: akl.p0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e1 f6071b;

            {
                this.f6071b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) throws Throwable {
                switch (i22) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        s0 data = (s0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(data, "data");
                        break;
                    case 1:
                        s0 data2 = (s0) obj2;
                        UserInfo userInfo = (UserInfo) obj3;
                        Intrinsics.checkNotNullParameter(data2, "data");
                        Intrinsics.checkNotNullParameter(userInfo, "userInfo");
                        UserInfo.INSTANCE.getClass();
                        if (!Intrinsics.f(userInfo, UserInfo.k)) {
                            this.f6071b.d.f("USER_INFO_FOR_" + data2.f6087b, userInfo);
                        }
                        break;
                    case 2:
                        s0 data3 = (s0) obj2;
                        UserInfo userInfo2 = (UserInfo) obj3;
                        Intrinsics.checkNotNullParameter(data3, "data");
                        Intrinsics.checkNotNullParameter(userInfo2, "userInfo");
                        UserInfo.INSTANCE.getClass();
                        if (!Intrinsics.f(userInfo2, UserInfo.k)) {
                            skm.e0.E(kotlin.coroutines.g.f186406a, new a1a.b(this.f6071b, data3, userInfo2, null, 28));
                        }
                        break;
                    case 3:
                        List consentedClients = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(consentedClients, "consentedClients");
                        this.f6071b.d.f("CONSENTED_CLIENTS", consentedClients);
                        break;
                    default:
                        List userInfoAccounts = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(userInfoAccounts, "userInfoAccounts");
                        this.f6071b.d.f("USER_INFO_ACCOUNTS", userInfoAccounts);
                        break;
                }
                return Unit.f186387a;
            }
        }, new b1(this, continuation, 1), new c1(this, continuation, 1));
        final int i32 = 3;
        final int i33 = 4;
        this.f6010m = new x4l.c(new a1(this, continuation, 0), new Function1(this) { // from class: akl.q0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e1 f6077b;

            {
                this.f6077b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i32) {
                    case 0:
                        s0 data = (s0) obj2;
                        Intrinsics.checkNotNullParameter(data, "data");
                        return (UserInfo) v7.r("USER_INFO_FOR_", data.f6087b, this.f6077b.d);
                    case 1:
                        s0 data2 = (s0) obj2;
                        Intrinsics.checkNotNullParameter(data2, "data");
                        return (UserInfo) skm.e0.E(kotlin.coroutines.g.f186406a, new ad4.c(this.f6077b, data2, null, 26));
                    case 2:
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        return (List) this.f6077b.d.get("CONSENTED_CLIENTS");
                    default:
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        return (List) this.f6077b.d.get("USER_INFO_ACCOUNTS");
                }
            }
        }, new Function2(this) { // from class: akl.p0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e1 f6071b;

            {
                this.f6071b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) throws Throwable {
                switch (i33) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        s0 data = (s0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(data, "data");
                        break;
                    case 1:
                        s0 data2 = (s0) obj2;
                        UserInfo userInfo = (UserInfo) obj3;
                        Intrinsics.checkNotNullParameter(data2, "data");
                        Intrinsics.checkNotNullParameter(userInfo, "userInfo");
                        UserInfo.INSTANCE.getClass();
                        if (!Intrinsics.f(userInfo, UserInfo.k)) {
                            this.f6071b.d.f("USER_INFO_FOR_" + data2.f6087b, userInfo);
                        }
                        break;
                    case 2:
                        s0 data3 = (s0) obj2;
                        UserInfo userInfo2 = (UserInfo) obj3;
                        Intrinsics.checkNotNullParameter(data3, "data");
                        Intrinsics.checkNotNullParameter(userInfo2, "userInfo");
                        UserInfo.INSTANCE.getClass();
                        if (!Intrinsics.f(userInfo2, UserInfo.k)) {
                            skm.e0.E(kotlin.coroutines.g.f186406a, new a1a.b(this.f6071b, data3, userInfo2, null, 28));
                        }
                        break;
                    case 3:
                        List consentedClients = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(consentedClients, "consentedClients");
                        this.f6071b.d.f("CONSENTED_CLIENTS", consentedClients);
                        break;
                    default:
                        List userInfoAccounts = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(userInfoAccounts, "userInfoAccounts");
                        this.f6071b.d.f("USER_INFO_ACCOUNTS", userInfoAccounts);
                        break;
                }
                return Unit.f186387a;
            }
        }, new b1(this, continuation, 0), new c1(this, continuation, 0));
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005a, code lost:
    
        if (r11 == r13) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0086, code lost:
    
        if (r11 == r13) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008d, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.f(r11, r8) != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a5, code lost:
    
        if (r11 == r13) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a7, code lost:
    
        return r13;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0086 -> B:27:0x0089). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(akl.e1 r11, java.lang.String r12, gim.c r13) {
        /*
            uil.a r0 = r11.e
            boolean r1 = r13 instanceof akl.u0
            if (r1 == 0) goto L15
            r1 = r13
            akl.u0 r1 = (akl.u0) r1
            int r2 = r1.A
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.A = r2
            goto L1a
        L15:
            akl.u0 r1 = new akl.u0
            r1.<init>(r11, r13)
        L1a:
            java.lang.Object r11 = r1.f6099y
            fim.a r13 = fim.a.COROUTINE_SUSPENDED
            int r2 = r1.A
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            r7 = 0
            if (r2 == 0) goto L4c
            if (r2 == r5) goto L46
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            yhm.o.b(r11)
            goto La8
        L32:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L3a:
            int r12 = r1.f6098x
            java.lang.Object r2 = r1.f6097w
            java.util.Iterator r5 = r1.v
            java.lang.String r8 = r1.u
            yhm.o.b(r11)
            goto L89
        L46:
            java.lang.String r12 = r1.u
            yhm.o.b(r11)
            goto L5d
        L4c:
            yhm.o.b(r11)
            r1.u = r12
            r1.A = r5
            r11 = r0
            pjl.z0 r11 = (pjl.z0) r11
            java.lang.Object r11 = r11.h(r1)
            if (r11 != r13) goto L5d
            goto La7
        L5d:
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.Iterator r11 = r11.iterator()
            r5 = r11
            r8 = r12
            r12 = r6
        L66:
            boolean r11 = r5.hasNext()
            if (r11 == 0) goto L90
            java.lang.Object r2 = r5.next()
            r11 = r2
            com.revolut.sso.api.accounts.RevolutAccount r11 = (com.revolut.sso.api.accounts.RevolutAccount) r11
            r1.u = r8
            r1.v = r5
            r1.f6097w = r2
            r1.f6098x = r12
            r1.A = r4
            r9 = r0
            pjl.z0 r9 = (pjl.z0) r9
            java.lang.String r10 = "com.revolut.sso.session"
            java.io.Serializable r11 = r9.k(r11, r1, r10)
            if (r11 != r13) goto L89
            goto La7
        L89:
            boolean r11 = kotlin.jvm.internal.Intrinsics.f(r11, r8)
            if (r11 == 0) goto L66
            goto L91
        L90:
            r2 = r7
        L91:
            com.revolut.sso.api.accounts.RevolutAccount r2 = (com.revolut.sso.api.accounts.RevolutAccount) r2
            if (r2 == 0) goto Lab
            r1.u = r7
            r1.v = r7
            r1.f6097w = r7
            r1.f6098x = r6
            r1.A = r3
            pjl.z0 r0 = (pjl.z0) r0
            java.lang.Object r11 = r0.l(r2, r1)
            if (r11 != r13) goto La8
        La7:
            return r13
        La8:
            com.revolut.sso.api.models.UserInfo r11 = (com.revolut.sso.api.models.UserInfo) r11
            return r11
        Lab:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: akl.e1.b(akl.e1, java.lang.String, gim.c):java.lang.Object");
    }

    public static final UserInfo c(e1 e1Var, o4 o4Var, String str, Integer num) {
        e1Var.getClass();
        UUID uuidD = o4Var.getIdentityId();
        dm0.d dVar = e1Var.f6006g;
        String str2 = dVar.b().d;
        UUID uuidFromString = str2 != null ? UUID.fromString(str2) : null;
        Set setB = zhm.y0.b(new DeviceIdAccountManager$ScopedDeviceId(dVar.b().f115814c, dVar.a(), e1Var.f.a()));
        String strE = o4Var.getLegalName();
        String strG = o4Var.getPhone();
        String strB = o4Var.getEmail();
        String strC = o4Var.getGoogleId();
        return new UserInfo(uuidD, setB, uuidFromString, strE, strG, strB, Boolean.valueOf(!(strC == null || kotlin.text.d0.W(strC))), o4Var.getPasscodeHint(), str, num);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.lang.String r9, java.lang.String r10, java.lang.Integer r11, gim.c r12) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r12 instanceof akl.t0
            if (r0 == 0) goto L13
            r0 = r12
            akl.t0 r0 = (akl.t0) r0
            int r1 = r0.f6095x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6095x = r1
            goto L18
        L13:
            akl.t0 r0 = new akl.t0
            r0.<init>(r8, r12)
        L18:
            java.lang.Object r12 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f6095x
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            java.lang.String r10 = r0.u
            yhm.o.b(r12)
            r4 = r8
            goto L4d
        L2a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L32:
            yhm.o.b(r12)
            r0.u = r10
            r0.f6095x = r3
            kotlinx.coroutines.d r12 = skm.p0.f264003c
            akl.w0 r2 = new akl.w0
            r7 = 0
            r4 = r8
            r6 = r9
            r3 = r10
            r5 = r11
            r2.<init>(r3, r4, r5, r6, r7)
            java.lang.Object r12 = skm.e0.J(r12, r2, r0)
            if (r12 != r1) goto L4c
            return r1
        L4c:
            r10 = r3
        L4d:
            com.revolut.sso.api.models.UserInfo r12 = (com.revolut.sso.api.models.UserInfo) r12
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r11 = "USER_INFO_FOR_"
            r9.<init>(r11)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            ne0.j r10 = r4.d
            r10.f(r9, r12)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: akl.e1.d(java.lang.String, java.lang.String, java.lang.Integer, gim.c):java.lang.Object");
    }

    public final akg.n e(String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "$v$c$com-revolut-feature-identity-auth-domain-model-RegisteredIdentityId$-id$0");
        return nim.a.v(this.f6010m.b(Unit.f186387a, z ? w4l.i.f294643c : w4l.h.f294642c), new ak7.g(str, 3));
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x006b, code lost:
    
        if (g(r9, r8, null, r0) == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(com.revolut.sso.api.accounts.RevolutAccount r7, gim.c r8, java.lang.String r9) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof akl.y0
            if (r0 == 0) goto L13
            r0 = r8
            akl.y0 r0 = (akl.y0) r0
            int r1 = r0.f6117x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6117x = r1
            goto L18
        L13:
            akl.y0 r0 = new akl.y0
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f6117x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r8)
            goto L6e
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            java.lang.String r9 = r0.u
            yhm.o.b(r8)
            goto L4c
        L38:
            yhm.o.b(r8)
            r0.u = r9
            r0.f6117x = r4
            uil.a r8 = r6.e
            pjl.z0 r8 = (pjl.z0) r8
            java.lang.String r2 = "com.revolut.sso.session"
            java.io.Serializable r8 = r8.k(r7, r0, r2)
            if (r8 != r1) goto L4c
            goto L6d
        L4c:
            java.lang.String r8 = (java.lang.String) r8
            if (r8 != 0) goto L62
            java.util.concurrent.CopyOnWriteArrayList r7 = rd0.d.f253311a
            rd0.c r0 = rd0.c.WARNING
            r4 = 0
            r5 = 16
            java.lang.String r1 = "RevolutAccountUserInfoRepository"
            java.lang.String r2 = "No session token for provided Revolut account: user info is not updated"
            r3 = 0
            rd0.d.b(r0, r1, r2, r3, r4, r5)
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        L62:
            r7 = 0
            r0.u = r7
            r0.f6117x = r3
            java.lang.Object r7 = r6.g(r9, r8, r7, r0)
            if (r7 != r1) goto L6e
        L6d:
            return r1
        L6e:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: akl.e1.f(com.revolut.sso.api.accounts.RevolutAccount, gim.c, java.lang.String):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(java.lang.String r5, java.lang.String r6, java.lang.Integer r7, gim.c r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof akl.z0
            if (r0 == 0) goto L13
            r0 = r8
            akl.z0 r0 = (akl.z0) r0
            int r1 = r0.f6125x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6125x = r1
            goto L18
        L13:
            akl.z0 r0 = new akl.z0
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f6125x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.String r6 = r0.u
            yhm.o.b(r8)
            goto L4a
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r8)
            akl.s0 r8 = new akl.s0
            r8.<init>(r5, r7, r6)
            w4l.f r5 = r4.k
            efm.b r5 = r5.g(r8, r3)
            r0.u = r6
            r0.f6125x = r3
            java.lang.Object r5 = nim.a.a(r5, r0)
            if (r5 != r1) goto L4a
            return r1
        L4a:
            ne0.j r5 = r4.d
            java.lang.String r7 = "USER_INFO_FOR_"
            java.lang.Object r5 = ip0.v7.r(r7, r6, r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: akl.e1.g(java.lang.String, java.lang.String, java.lang.Integer, gim.c):java.lang.Object");
    }
}
