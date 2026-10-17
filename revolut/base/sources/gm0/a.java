package gm0;

import com.revolut.core.security.deviceId.impl.DeviceIdAccountManager$ScopedDeviceId;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import qlm.i0;

/* JADX INFO: loaded from: classes19.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ a f144735a = new a();

    private a() {
    }

    public static String a(Set ids) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        rlm.b bVar = Json.d;
        bVar.getClass();
        return bVar.c(new i0(DeviceIdAccountManager$ScopedDeviceId.INSTANCE.serializer(), 1), ids);
    }

    public static Set b(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        rlm.b bVar = Json.d;
        bVar.getClass();
        return (Set) bVar.b(new i0(DeviceIdAccountManager$ScopedDeviceId.INSTANCE.serializer(), 1), value);
    }
}
