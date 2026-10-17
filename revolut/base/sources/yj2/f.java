package yj2;

import android.location.Location;
import com.revolut.feature.atm.api.model.Atm;
import com.revolut.feature.atm.api.model.AtmAddress;
import com.revolut.feature.atm.api.model.AtmFees;
import com.revolut.feature.atm.api.model.AtmLocation;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qd0.b f314387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lazy f314388b;

    public f(qd0.b languageProvider) {
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        this.f314387a = languageProvider;
        this.f314388b = yhm.j.b(new y99.c(this, 16));
    }

    public static Atm a(Atm atm, AtmLocation location) {
        Intrinsics.checkNotNullParameter(atm, "atm");
        Intrinsics.checkNotNullParameter(location, "location");
        float[] fArr = new float[1];
        Location.distanceBetween(location.f63138a, location.f63139b, atm.e, atm.f, fArr);
        float f = fArr[0];
        int i = atm.f63117a;
        String name = atm.f63118b;
        AtmAddress address = atm.f63119c;
        double d = atm.e;
        double d5 = atm.f;
        boolean z = atm.f63120g;
        sj2.h wheelchairAccess = atm.f63121h;
        List withdrawalBanknotes = atm.i;
        List depositBanknotes = atm.f63122j;
        String str = atm.k;
        List openingHours = atm.f63123l;
        List features = atm.f63124m;
        sj2.g activeState = atm.f63125n;
        sj2.f network = atm.o;
        sj2.e localityType = atm.f63126p;
        AtmFees atmFees = atm.f63127q;
        String str2 = atm.f63128r;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(wheelchairAccess, "wheelchairAccess");
        Intrinsics.checkNotNullParameter(withdrawalBanknotes, "withdrawalBanknotes");
        Intrinsics.checkNotNullParameter(depositBanknotes, "depositBanknotes");
        Intrinsics.checkNotNullParameter(openingHours, "openingHours");
        Intrinsics.checkNotNullParameter(features, "features");
        Intrinsics.checkNotNullParameter(activeState, "activeState");
        Intrinsics.checkNotNullParameter(network, "network");
        Intrinsics.checkNotNullParameter(localityType, "localityType");
        return new Atm(i, name, address, f, d, d5, z, wheelchairAccess, withdrawalBanknotes, depositBanknotes, str, openingHours, features, activeState, network, localityType, atmFees, str2);
    }
}
