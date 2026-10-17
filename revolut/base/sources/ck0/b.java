package ck0;

import java.util.ArrayList;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.a0;
import org.jetbrains.annotations.NotNull;
import pn0.c;
import yhm.j;
import zhm.r0;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();
    public static final Regex f = new Regex("^(\\d+\\.)*\\d+");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Map f24734g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f24735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x80.a f24736b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ij0.a f24737c;
    public final rj0.a d;
    public final Lazy e;

    static {
        Map mapK = r0.k(new Pair("9C:9B:E0:71:35:E9:72:78:02:82:C2:E5:D2:7D:A0:6E:CB:8E:E3:AD:FC:75:30:39:17:DD:F6:6D:6F:AA:EF:A4", "07:26:6A:AC:A9:3B:3F:AA:8A:53:5C:3D:7A:EC:4C:1F"), new Pair("11:F2:5B:D6:30:60:CE:B4:EF:EC:48:7C:C8:1F:6D:3D:D0:3A:75:C3:E9:D2:C5:32:3D:69:55:9D:C1:7F:6A:23", "5E:83:5C:9A:DD:7B:51:50:36:4B:8B:88:7C:C5:84:F3"), new Pair("9C:9B:E0:71:35:E9:72:78:02:82:C2:E5:D2:7D:A0:6E:CB:8E:E3:AD:FC:75:30:39:17:DD:F6:6D:6F:AA:EF:A4", "07:26:6A:AC:A9:3B:3F:AA:8A:53:5C:3D:7A:EC:4C:1F"), new Pair("90:35:09:91:37:4B:95:C3:3B:9C:49:CC:CB:79:BB:24:EE:2C:C2:4F:C1:0E:19:12:4A:F1:9C:F0:95:36:03:00", "BB:8A:6D:49:52:B5:B2:C1:4C:FD:AC:15:23:0B:65:45"), new Pair("9C:9B:E0:71:35:E9:72:78:02:82:C2:E5:D2:7D:A0:6E:CB:8E:E3:AD:FC:75:30:39:17:DD:F6:6D:6F:AA:EF:A4", "07:26:6A:AC:A9:3B:3F:AA:8A:53:5C:3D:7A:EC:4C:1F"), new Pair("9F:07:80:54:0F:3A:C9:6F:D7:26:02:8A:37:C5:CD:48:DB:A3:67:EE:2D:93:B3:9D:DE:51:BC:F2:2E:7F:B1:88", "02:42:98:B1:30:9F:5B:23:17:F2:64:0D:39:82:61:DB"), new Pair("17:3A:31:D3:16:9B:64:6B:8A:A0:79:77:04:1E:74:E4:DB:96:39:4A:D9:89:CA:D3:56:7E:A9:AA:45:9B:D5:62", "24:9B:28:DA:AF:8D:CF:45:C8:0A:1A:4D:B7:72:D3:87"), new Pair("9C:9B:E0:71:35:E9:72:78:02:82:C2:E5:D2:7D:A0:6E:CB:8E:E3:AD:FC:75:30:39:17:DD:F6:6D:6F:AA:EF:A4", "07:26:6A:AC:A9:3B:3F:AA:8A:53:5C:3D:7A:EC:4C:1F"), new Pair("15:01:2B:E8:25:6D:35:AB:AA:8F:30:E7:96:3E:56:B8:DE:2C:97:A4:23:D4:27:1A:92:87:04:04:4D:F0:86:C6", "9A:82:2D:E3:CD:AA:B7:D7:08:6D:C3:F9:E6:3B:54:98"), new Pair("E0:2B:5B:6F:3E:DE:50:58:BD:48:51:C3:E5:AC:89:BC:A2:39:D8:CC:5D:AD:DA:5C:1C:15:E7:7C:3A:CF:D7:4E", "9E:AC:DF:11:C1:44:02:E9:48:27:9C:ED:E2:CF:40:2C"), new Pair("9C:9B:E0:71:35:E9:72:78:02:82:C2:E5:D2:7D:A0:6E:CB:8E:E3:AD:FC:75:30:39:17:DD:F6:6D:6F:AA:EF:A4", "07:26:6A:AC:A9:3B:3F:AA:8A:53:5C:3D:7A:EC:4C:1F"), new Pair("90:EC:5D:75:11:4E:67:B7:F1:3F:C0:D0:57:85:9B:78:0D:A0:BA:49:E2:22:4C:60:42:7E:D2:EA:00:84:D1:B7", "24:E1:A2:C4:FA:50:D5:81:E1:8C:F9:3D:35:CB:A7:52"));
        ArrayList arrayList = new ArrayList(mapK.size());
        for (Map.Entry entry : mapK.entrySet()) {
            arrayList.add(new Pair(a0.D((String) entry.getKey(), ":", "", false), a0.D((String) entry.getValue(), ":", "", false)));
        }
        f24734g = r0.t(arrayList);
    }

    public b(n80.b buildInfo, gi0.a mobileServicesProvider, c signatureProvider, x80.a packageNameProvider, ij0.a configuration, rj0.a networkFeatureTogglesProvider) {
        Intrinsics.checkNotNullParameter(buildInfo, "buildInfo");
        Intrinsics.checkNotNullParameter(mobileServicesProvider, "mobileServicesProvider");
        Intrinsics.checkNotNullParameter(signatureProvider, "signatureProvider");
        Intrinsics.checkNotNullParameter(packageNameProvider, "packageNameProvider");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(networkFeatureTogglesProvider, "networkFeatureTogglesProvider");
        this.f24735a = signatureProvider;
        this.f24736b = packageNameProvider;
        this.f24737c = configuration;
        this.d = networkFeatureTogglesProvider;
        this.e = j.b(new bvb.a(this, 22));
    }
}
