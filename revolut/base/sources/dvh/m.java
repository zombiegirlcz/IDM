package dvh;

import com.revolut.shared.feature.workflow.engine.api.models.EligibilityDataPointValue;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import zhm.w;

/* JADX INFO: loaded from: classes10.dex */
public abstract class m {
    public static final b a(EligibilityDataPointValue.AcceptedTermsDataPointValue.AcceptedTermsValue acceptedTermsValue) {
        Intrinsics.checkNotNullParameter(acceptedTermsValue, "<this>");
        ArrayList<EligibilityDataPointValue.AcceptedTermsDataPointValue.AcceptedTermsReference> arrayList = acceptedTermsValue.f105386a;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        for (EligibilityDataPointValue.AcceptedTermsDataPointValue.AcceptedTermsReference acceptedTermsReference : arrayList) {
            Intrinsics.checkNotNullParameter(acceptedTermsReference, "<this>");
            arrayList2.add(new a(acceptedTermsReference.f105383a, acceptedTermsReference.f105384b, acceptedTermsReference.f105385c));
        }
        return new b(acceptedTermsValue.f105387b, arrayList2);
    }

    public static final n b(EligibilityDataPointValue.NameDataPointValue nameDataPointValue) {
        Intrinsics.checkNotNullParameter(nameDataPointValue, "<this>");
        String str = nameDataPointValue.f105398a;
        String str2 = nameDataPointValue.f105398a;
        String str3 = nameDataPointValue.f105399b;
        return ((Intrinsics.f(str, "NATIVE_NAME") && Intrinsics.f(str3, "FULL_NAME")) || Intrinsics.f(str2, "ALIAS")) ? new n("FULL_NAME", null, null, null, null, null, null, nameDataPointValue.i) : (Intrinsics.f(str2, "NATIVE_NAME") && Intrinsics.f(str3, "NATIVE_NAME")) ? new n(nameDataPointValue.f105399b, nameDataPointValue.f105400c, nameDataPointValue.d, null, null, null, null, null) : new n(nameDataPointValue.f105399b, nameDataPointValue.f105400c, nameDataPointValue.d, nameDataPointValue.e, nameDataPointValue.f, nameDataPointValue.f105401g, nameDataPointValue.f105402h, nameDataPointValue.i);
    }
}
