package xkj;

import com.revolut.retail.feature.esim.impl.repositories.model.EsimPhoneNumberPortingDynamicFormRequest;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class h extends com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.dynamic_form.number_transfer_confirmation.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EsimPhoneNumberPortingDynamicFormRequest f306823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f306824b;

    public h(EsimPhoneNumberPortingDynamicFormRequest dynamicFormRequest, List attributes) {
        Intrinsics.checkNotNullParameter(dynamicFormRequest, "dynamicFormRequest");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        this.f306823a = dynamicFormRequest;
        this.f306824b = attributes;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f306823a, hVar.f306823a) && Intrinsics.f(this.f306824b, hVar.f306824b);
    }

    public final int hashCode() {
        return this.f306824b.hashCode() + (this.f306823a.hashCode() * 31);
    }
}
