package gyi;

import com.revolut.core.ui_kit.models.AnimationRequest;
import com.revolut.data.model.Data;
import com.revolut.retail.feature.airportlounges.api.model.AirportLoungesDisclaimer;
import kotlin.jvm.internal.Intrinsics;
import svi.d1;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f147862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f147863b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f147864c;
    public final d1 d;
    public final AirportLoungesDisclaimer e;
    public final AnimationRequest f;

    public a(Data passesData, Data pricingPlanData, String str, d1 d1Var, AirportLoungesDisclaimer airportLoungesDisclaimer, AnimationRequest animationRequest) {
        Intrinsics.checkNotNullParameter(passesData, "passesData");
        Intrinsics.checkNotNullParameter(pricingPlanData, "pricingPlanData");
        this.f147862a = passesData;
        this.f147863b = pricingPlanData;
        this.f147864c = str;
        this.d = d1Var;
        this.e = airportLoungesDisclaimer;
        this.f = animationRequest;
    }

    public static a a(a aVar, Data data, Data data2, String str, d1 d1Var, AirportLoungesDisclaimer airportLoungesDisclaimer, AnimationRequest animationRequest, int i) {
        if ((i & 1) != 0) {
            data = aVar.f147862a;
        }
        Data passesData = data;
        if ((i & 2) != 0) {
            data2 = aVar.f147863b;
        }
        Data pricingPlanData = data2;
        if ((i & 4) != 0) {
            str = aVar.f147864c;
        }
        String str2 = str;
        if ((i & 8) != 0) {
            d1Var = aVar.d;
        }
        d1 d1Var2 = d1Var;
        if ((i & 16) != 0) {
            airportLoungesDisclaimer = aVar.e;
        }
        AirportLoungesDisclaimer airportLoungesDisclaimer2 = airportLoungesDisclaimer;
        if ((i & 32) != 0) {
            animationRequest = aVar.f;
        }
        aVar.getClass();
        Intrinsics.checkNotNullParameter(passesData, "passesData");
        Intrinsics.checkNotNullParameter(pricingPlanData, "pricingPlanData");
        return new a(passesData, pricingPlanData, str2, d1Var2, airportLoungesDisclaimer2, animationRequest);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f147862a, aVar.f147862a) && Intrinsics.f(this.f147863b, aVar.f147863b) && Intrinsics.f(this.f147864c, aVar.f147864c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e) && Intrinsics.f(this.f, aVar.f);
    }

    public final int hashCode() {
        int iC = kii.e.c(this.f147863b, this.f147862a.hashCode() * 31, 31);
        String str = this.f147864c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        d1 d1Var = this.d;
        int iHashCode2 = (iHashCode + (d1Var == null ? 0 : d1Var.hashCode())) * 31;
        AirportLoungesDisclaimer airportLoungesDisclaimer = this.e;
        int iHashCode3 = (iHashCode2 + (airportLoungesDisclaimer == null ? 0 : airportLoungesDisclaimer.hashCode())) * 31;
        AnimationRequest animationRequest = this.f;
        return iHashCode3 + (animationRequest != null ? animationRequest.hashCode() : 0);
    }
}
