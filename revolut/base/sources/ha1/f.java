package ha1;

import com.google.gson.reflect.TypeToken;
import com.revolut.feature.acquiring.card_reader.data.api.domain.model.CardReaderDevice;
import com.revolut.feature.acquiring.card_reader.data.api.domain.model.PairingInfo;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class f implements ca1.a {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Type f150352c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ue0.c f150353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f150354b;

    static {
        Type type = new TypeToken<List<? extends CardReaderDevice>>() { // from class: com.revolut.feature.acquiring.card_reader.data.impl.data.repository.CardReaderRepositoryImpl$Companion$CARD_READERS_TYPE$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        f150352c = type;
    }

    public f(ne0.j memoryCache, ue0.c storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f150353a = storage;
        this.f150354b = memoryCache;
    }

    public final String a() {
        Object obj2 = this.f150354b.get("KEY_BLUETOOTH_FIRMWARE_VERSION");
        if (obj2 != null) {
            return (String) obj2;
        }
        throw new IllegalArgumentException("Bluetooth firmware version is required");
    }

    public final CardReaderDevice b() {
        return (CardReaderDevice) this.f150353a.T2("KEY_CARD_READER_DEVICE", CardReaderDevice.class);
    }

    public final PairingInfo c() {
        return (PairingInfo) this.f150354b.get("KEY_PAIRING_INFO");
    }

    public final String d() {
        Object obj2 = this.f150354b.get("KEY_SVPP_FIRMWARE_VERSION");
        if (obj2 != null) {
            return (String) obj2;
        }
        throw new IllegalArgumentException("SVPP firmware version is required");
    }

    public final void e() {
        this.f150354b.clear();
        ue0.c cVar = this.f150353a;
        cVar.I0("KEY_CARD_READER_DEVICE");
        cVar.I0("KEY_TERMINAL_ID");
    }
}
