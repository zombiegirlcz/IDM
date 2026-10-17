package uo;

import android.media.MediaDrm;
import androidx.media3.common.C;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import yhm.m;

/* JADX INFO: loaded from: classes17.dex */
public final class a0 {
    public final String a() {
        Object objA;
        try {
            m.Companion companion = yhm.m.INSTANCE;
            UUID uuid = C.WIDEVINE_UUID;
            if (MediaDrm.isCryptoSchemeSupported(uuid)) {
                MediaDrm mediaDrm = new MediaDrm(uuid);
                byte[] propertyByteArray = mediaDrm.getPropertyByteArray("deviceUniqueId");
                Intrinsics.checkNotNullExpressionValue(propertyByteArray, "getPropertyByteArray(...)");
                objA = new String(propertyByteArray, Charsets.UTF_8);
                mediaDrm.close();
            } else {
                objA = "-1";
            }
        } catch (Throwable th10) {
            m.Companion companion2 = yhm.m.INSTANCE;
            objA = yhm.o.a(th10);
        }
        Throwable thA = yhm.m.a(objA);
        if (thA != null) {
            zhm.h0 h0Var = zhm.h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.WARNING, null, null, thA, h0Var);
        }
        return (String) (objA instanceof yhm.n ? "-1" : objA);
    }
}
