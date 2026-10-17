package xvi;

import android.content.Context;
import android.provider.Settings;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yhm.j;
import yhm.k;

/* JADX INFO: loaded from: classes10.dex */
public final class g {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f309281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f309282b;

    public g(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f309281a = context;
        this.f309282b = j.c(k.NONE, new xsf.c(this));
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
    public static final e a(g gVar) {
        Integer numB = gVar.b("screen_brightness");
        if (numB == null) {
            return null;
        }
        int iIntValue = numB.intValue();
        f fVar = Companion;
        int iIntValue2 = ((Number) gVar.f309282b.getValue()).intValue();
        fVar.getClass();
        float fC = BitmapDescriptorFactory.HUE_RED;
        if (iIntValue2 > 0) {
            fC = rim.d.c(kotlin.ranges.f.f(iIntValue / iIntValue2, BitmapDescriptorFactory.HUE_RED, 1.0f) * 100.0f) / 100.0f;
        }
        Integer numB2 = gVar.b("screen_brightness_mode");
        return new e(fC, (numB2 != null && numB2.intValue() == 0) ? d.MANUAL : (numB2 != null && numB2.intValue() == 1) ? d.AUTOMATIC : d.UNKNOWN);
    }

    public final Integer b(String str) {
        try {
            return Integer.valueOf(Settings.System.getInt(this.f309281a.getContentResolver(), str));
        } catch (Settings.SettingNotFoundException unused) {
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.b(rd0.c.DEBUG, "AirportLoungesScreenBrightnessObserver", p.a.p("System setting ", str, " is not available"), null, null, 16);
            return null;
        }
    }
}
