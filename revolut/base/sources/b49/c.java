package b49;

import android.location.Address;
import android.location.Geocoder;
import android.os.Build;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;
import rd0.d;
import zhm.h0;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    @NotNull
    private static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Geocoder f12205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f12206b;

    public c(n80.b buildInfo, Geocoder geoCoder, a blacklistConfig) {
        Intrinsics.checkNotNullParameter(buildInfo, "buildInfo");
        Intrinsics.checkNotNullParameter(geoCoder, "geoCoder");
        Intrinsics.checkNotNullParameter(blacklistConfig, "blacklistConfig");
        this.f12205a = geoCoder;
        this.f12206b = blacklistConfig;
    }

    public final Address a(String address) {
        Intrinsics.checkNotNullParameter(address, "address");
        if (Geocoder.isPresent() && !d0.W(address)) {
            List list = this.f12206b.f12204a;
            ArrayList arrayList = new ArrayList(w.t(list, 10));
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                String lowerCase = ((String) it8.next()).toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                arrayList.add(lowerCase);
            }
            String MODEL = Build.MODEL;
            Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
            String lowerCase2 = MODEL.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
            if (arrayList.contains(lowerCase2)) {
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
                d.a(rd0.c.ERROR, "GeocoderService", p.a.p("Skipping geocoding address: model '", lowerCase2, "' is blacklisted"), null, h0Var);
                return null;
            }
            try {
                List<Address> fromLocationName = this.f12205a.getFromLocationName(address, 1);
                if (fromLocationName != null) {
                    return (Address) zhm.d0.d0(fromLocationName);
                }
            } catch (IOException e) {
                h0 h0Var2 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList2 = d.f253311a;
                d.a(rd0.c.ERROR, null, null, e, h0Var2);
            }
        }
        return null;
    }
}
