package gti;

import android.content.Context;
import android.provider.Settings;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import gr2.j0;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yhm.j;
import yhm.k;

/* JADX INFO: loaded from: classes10.dex */
public final class h {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f146619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f146620b;

    public h(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f146619a = context;
        this.f146620b = j.c(k.NONE, new j0(this));
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
    public static final e a(h hVar) {
        Integer numB = hVar.b("screen_brightness");
        if (numB == null) {
            return null;
        }
        int iIntValue = numB.intValue();
        f fVar = Companion;
        int iIntValue2 = ((Number) hVar.f146620b.getValue()).intValue();
        fVar.getClass();
        float fC = BitmapDescriptorFactory.HUE_RED;
        if (iIntValue2 > 0) {
            fC = rim.d.c(kotlin.ranges.f.f(iIntValue / iIntValue2, BitmapDescriptorFactory.HUE_RED, 1.0f) * 100.0f) / 100.0f;
        }
        Integer numB2 = hVar.b("screen_brightness_mode");
        return new e(fC, (numB2 != null && numB2.intValue() == 0) ? d.MANUAL : (numB2 != null && numB2.intValue() == 1) ? d.AUTOMATIC : d.UNKNOWN);
    }

    public final Integer b(String str) {
        try {
            return Integer.valueOf(Settings.System.getInt(this.f146619a.getContentResolver(), str));
        } catch (Settings.SettingNotFoundException unused) {
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.b(rd0.c.DEBUG, "AsftScreenBrightnessObserver", p.a.p("System setting ", str, " is not available"), null, null, 16);
            return null;
        }
    }
}
