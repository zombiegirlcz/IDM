package ccf;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.eac.CertificateBody;

/* JADX INFO: loaded from: classes8.dex */
public final class q implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f23080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f23081b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qbf.i f23082c;
    public final Data d;
    public final String e;
    public final Data f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f23083g;

    public q() {
        this(false, CertificateBody.profileType);
    }

    public static q a(q qVar, Data data, Data data2, qbf.i iVar, Data data3, String str, Data data4, int i) {
        if ((i & 1) != 0) {
            data = qVar.f23080a;
        }
        Data addOn = data;
        if ((i & 2) != 0) {
            data2 = qVar.f23081b;
        }
        Data user = data2;
        if ((i & 4) != 0) {
            iVar = qVar.f23082c;
        }
        qbf.i iVar2 = iVar;
        if ((i & 8) != 0) {
            data3 = qVar.d;
        }
        Data downgradeSurveyConfig = data3;
        if ((i & 16) != 0) {
            str = qVar.e;
        }
        String feedback = str;
        if ((i & 32) != 0) {
            data4 = qVar.f;
        }
        boolean z = qVar.f23083g;
        qVar.getClass();
        Intrinsics.checkNotNullParameter(addOn, "addOn");
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(downgradeSurveyConfig, "downgradeSurveyConfig");
        Intrinsics.checkNotNullParameter(feedback, "feedback");
        return new q(addOn, user, iVar2, downgradeSurveyConfig, feedback, data4, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f23080a, qVar.f23080a) && Intrinsics.f(this.f23081b, qVar.f23081b) && this.f23082c == qVar.f23082c && Intrinsics.f(this.d, qVar.d) && Intrinsics.f(this.e, qVar.e) && Intrinsics.f(this.f, qVar.f) && this.f23083g == qVar.f23083g;
    }

    public final int hashCode() {
        int iC = kii.e.c(this.f23081b, this.f23080a.hashCode() * 31, 31);
        qbf.i iVar = this.f23082c;
        int iC2 = p.a.c(kii.e.c(this.d, (iC + (iVar == null ? 0 : iVar.hashCode())) * 31, 31), 31, this.e);
        Data data = this.f;
        return Boolean.hashCode(this.f23083g) + ((iC2 + (data != null ? data.hashCode() : 0)) * 31);
    }

    public q(Data addOn, Data user, qbf.i iVar, Data downgradeSurveyConfig, String feedback, Data data, boolean z) {
        Intrinsics.checkNotNullParameter(addOn, "addOn");
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(downgradeSurveyConfig, "downgradeSurveyConfig");
        Intrinsics.checkNotNullParameter(feedback, "feedback");
        this.f23080a = addOn;
        this.f23081b = user;
        this.f23082c = iVar;
        this.d = downgradeSurveyConfig;
        this.e = feedback;
        this.f = data;
        this.f23083g = z;
    }

    public /* synthetic */ q(boolean z, int i) {
        this(new Data(null, null, false, 7, null), new Data(null, null, false, 7, null), null, new Data(null, null, false, 7, null), "", null, (i & 64) != 0 ? false : z);
    }
}
