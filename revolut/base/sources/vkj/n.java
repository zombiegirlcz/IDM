package vkj;

import cli.y;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPortingAttribute;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.dynamic_form.business_details.EsimMobilePlanDynamicFormBusinessDetailsScreenContract$InputData;
import dej.u0;
import dfj.q1;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kxk.o;
import wli.x;
import zhm.q0;
import zhm.w;

/* JADX INFO: loaded from: classes11.dex */
public final class n extends oki.h implements h {
    public final EsimMobilePlanDynamicFormBusinessDetailsScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final q1 f289980p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final alj.a f289981q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final zkj.a f289982r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final skj.a f289983s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final x f289984t;
    public final y u;

    public n(o stateMapper, EsimMobilePlanDynamicFormBusinessDetailsScreenContract$InputData inputData, q1 phoneNumberPortingInteractor, alj.a dynamicFormAttributesValidator, zkj.a dynamicFormPortInRequestMapper, skj.a portingStatusDialogConfig, x deeplinkHandler) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(phoneNumberPortingInteractor, "phoneNumberPortingInteractor");
        Intrinsics.checkNotNullParameter(dynamicFormAttributesValidator, "dynamicFormAttributesValidator");
        Intrinsics.checkNotNullParameter(dynamicFormPortInRequestMapper, "dynamicFormPortInRequestMapper");
        Intrinsics.checkNotNullParameter(portingStatusDialogConfig, "portingStatusDialogConfig");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        this.o = inputData;
        this.f289980p = phoneNumberPortingInteractor;
        this.f289981q = dynamicFormAttributesValidator;
        this.f289982r = dynamicFormPortInRequestMapper;
        this.f289983s = portingStatusDialogConfig;
        this.f289984t = deeplinkHandler;
        List list = inputData.d;
        ArrayList<EsimPhoneNumberPortingAttribute> arrayList = new ArrayList();
        for (Object obj2 : list) {
            u0 u0Var = ((EsimPhoneNumberPortingAttribute) obj2).e;
            if (u0Var == u0.TEXT || u0Var == u0.NUMBER) {
                arrayList.add(obj2);
            }
        }
        int iB = q0.b(w.t(arrayList, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB < 16 ? 16 : iB);
        for (EsimPhoneNumberPortingAttribute esimPhoneNumberPortingAttribute : arrayList) {
            linkedHashMap.put(esimPhoneNumberPortingAttribute.f100338a, new zkj.b(null, esimPhoneNumberPortingAttribute.f100341g));
        }
        this.u = mra.d.b(this, new e(linkedHashMap), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.u;
    }
}
