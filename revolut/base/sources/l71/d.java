package l71;

import com.revolut.domain.models.user.UserCompanyRegion;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class d {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f192498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f192499b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f192500c;

    public d(String name, List features, String region) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(features, "features");
        Intrinsics.checkNotNullParameter(region, "region");
        this.f192498a = name;
        this.f192499b = features;
        this.f192500c = region;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final UserCompanyRegion a() {
        String str = this.f192500c;
        switch (str.hashCode()) {
            case 2084:
                if (str.equals("AE")) {
                    return UserCompanyRegion.AE;
                }
                break;
            case 2099:
                if (str.equals("AT")) {
                    return UserCompanyRegion.AT;
                }
                break;
            case 2100:
                if (str.equals("AU")) {
                    return UserCompanyRegion.AU;
                }
                break;
            case 2115:
                if (str.equals("BE")) {
                    return UserCompanyRegion.BE;
                }
                break;
            case 2128:
                if (str.equals("BR")) {
                    return UserCompanyRegion.BR;
                }
                break;
            case 2142:
                if (str.equals("CA")) {
                    return UserCompanyRegion.CA;
                }
                break;
            case 2149:
                if (str.equals("CH")) {
                    return UserCompanyRegion.CH;
                }
                break;
            case 2156:
                if (str.equals("CO")) {
                    return UserCompanyRegion.CO;
                }
                break;
            case 2177:
                if (str.equals("DE")) {
                    return UserCompanyRegion.DE;
                }
                break;
            case 2183:
                if (str.equals("DK")) {
                    return UserCompanyRegion.DK;
                }
                break;
            case 2222:
                if (str.equals("ES")) {
                    return UserCompanyRegion.ES;
                }
                break;
            case 2243:
                if (str.equals("FI")) {
                    return UserCompanyRegion.FI;
                }
                break;
            case 2252:
                if (str.equals("FR")) {
                    return UserCompanyRegion.FR;
                }
                break;
            case 2267:
                if (str.equals("GB")) {
                    return UserCompanyRegion.GB;
                }
                break;
            case 2283:
                if (str.equals("GR")) {
                    return UserCompanyRegion.GR;
                }
                break;
            case 2317:
                if (str.equals("HU")) {
                    return UserCompanyRegion.HU;
                }
                break;
            case 2332:
                if (str.equals("IE")) {
                    return UserCompanyRegion.IE;
                }
                break;
            case 2339:
                if (str.equals("IL")) {
                    return UserCompanyRegion.IL;
                }
                break;
            case 2341:
                if (str.equals("IN")) {
                    return UserCompanyRegion.IN;
                }
                break;
            case 2347:
                if (str.equals("IT")) {
                    return UserCompanyRegion.IT;
                }
                break;
            case 2374:
                if (str.equals("JP")) {
                    return UserCompanyRegion.JP;
                }
                break;
            case 2440:
                if (str.equals("LT")) {
                    return UserCompanyRegion.LT;
                }
                break;
            case 2475:
                if (str.equals("MX")) {
                    return UserCompanyRegion.MX;
                }
                break;
            case 2494:
                if (str.equals("NL")) {
                    return UserCompanyRegion.NL;
                }
                break;
            case 2497:
                if (str.equals("NO")) {
                    return UserCompanyRegion.NO;
                }
                break;
            case 2508:
                if (str.equals("NZ")) {
                    return UserCompanyRegion.NZ;
                }
                break;
            case 2556:
                if (str.equals("PL")) {
                    return UserCompanyRegion.PL;
                }
                break;
            case 2564:
                if (str.equals("PT")) {
                    return UserCompanyRegion.PT;
                }
                break;
            case 2621:
                if (str.equals("RO")) {
                    return UserCompanyRegion.RO;
                }
                break;
            case 2642:
                if (str.equals("SE")) {
                    return UserCompanyRegion.SE;
                }
                break;
            case 2644:
                if (str.equals("SG")) {
                    return UserCompanyRegion.SG;
                }
                break;
            case 2718:
                if (str.equals("US")) {
                    return UserCompanyRegion.US;
                }
                break;
            case 68513:
                if (str.equals("EEA")) {
                    return UserCompanyRegion.EEA;
                }
                break;
        }
        return UserCompanyRegion.OTHER;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0139, code lost:
    
        if (r0.equals("Revolut Bank UK Ltd") == false) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x013f, code lost:
    
        return l71.a.h0.f192478a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x00ee, code lost:
    
        if (r0.equals("Revolut NewCo UK Ltd") == false) goto L175;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final l71.a b() {
        /*
            Method dump skipped, instruction units count: 602
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l71.d.b():l71.a");
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f192498a, dVar.f192498a) && Intrinsics.f(this.f192499b, dVar.f192499b) && Intrinsics.f(this.f192500c, dVar.f192500c);
    }

    public final int hashCode() {
        return this.f192500c.hashCode() + p.a.d(this.f192498a.hashCode() * 31, 31, this.f192499b);
    }
}
