package com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.dynamic_form.number_transfer_confirmation;

import aw0.o9;
import cli.n;
import cli.y;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.esim.api.model.EsimCheckoutPortingSteps;
import com.revolut.retail.feature.esim.api.model.EsimDescriptorValue;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPortingAttribute;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPortingContractType;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPortingDynamicForm;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPortingOwnerAccountType;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPortingScheduleOption;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.dynamic_form.number_transfer_confirmation.EsimMobilePlanDynamicFormNumberTransferConfirmationScreenContract$ModalStep;
import dej.s0;
import dej.u0;
import dfj.a1;
import dfj.q1;
import dfj.z0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import qhj.e;
import rd0.c;
import vkm.q;
import wli.x;
import xec.c0;
import xif.k;
import xkj.g;
import xkj.j;
import yji.l;
import zhm.d0;
import zhm.h0;
import zhm.q0;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends h implements j {
    public final EsimMobilePlanDynamicFormNumberTransferConfirmationScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final q1 f101279p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final zkj.a f101280q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final skj.a f101281r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final x f101282s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final z0 f101283t;
    public final e u;
    public final ugc.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Object f101284w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final y f101285x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f101286y;

    public b(n stateMapper, EsimMobilePlanDynamicFormNumberTransferConfirmationScreenContract$InputData inputData, q1 phoneNumberPortingInteractor, zkj.a dynamicFormPortInRequestMapper, skj.a portingStatusDialogConfig, x deeplinkHandler, z0 internalDeepLinkInteractor, e phoneNumberFormatter, ugc.a giftRecipientNameResolver) {
        EsimPhoneNumberPortingScheduleOption esimPhoneNumberPortingScheduleOption;
        EsimPhoneNumberPortingContractType esimPhoneNumberPortingContractType;
        EsimPhoneNumberPortingContractType esimPhoneNumberPortingContractType2;
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(phoneNumberPortingInteractor, "phoneNumberPortingInteractor");
        Intrinsics.checkNotNullParameter(dynamicFormPortInRequestMapper, "dynamicFormPortInRequestMapper");
        Intrinsics.checkNotNullParameter(portingStatusDialogConfig, "portingStatusDialogConfig");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(internalDeepLinkInteractor, "internalDeepLinkInteractor");
        Intrinsics.checkNotNullParameter(phoneNumberFormatter, "phoneNumberFormatter");
        Intrinsics.checkNotNullParameter(giftRecipientNameResolver, "giftRecipientNameResolver");
        this.o = inputData;
        this.f101279p = phoneNumberPortingInteractor;
        this.f101280q = dynamicFormPortInRequestMapper;
        this.f101281r = portingStatusDialogConfig;
        this.f101282s = deeplinkHandler;
        this.f101283t = internalDeepLinkInteractor;
        this.u = phoneNumberFormatter;
        this.v = giftRecipientNameResolver;
        Map mapJ2 = J2(inputData.e.f100356l);
        this.f101284w = mapJ2;
        EsimPhoneNumberPortingDynamicForm esimPhoneNumberPortingDynamicForm = inputData.e;
        List list = esimPhoneNumberPortingDynamicForm.i;
        List list2 = null;
        EsimPhoneNumberPortingContractType esimPhoneNumberPortingContractType3 = list != null ? (EsimPhoneNumberPortingContractType) d0.M0(list) : null;
        List list3 = esimPhoneNumberPortingDynamicForm.f100355j;
        if (list3 == null || (esimPhoneNumberPortingScheduleOption = (EsimPhoneNumberPortingScheduleOption) d0.M0(list3)) == null) {
            List list4 = esimPhoneNumberPortingDynamicForm.i;
            if (list4 == null || (esimPhoneNumberPortingContractType = (EsimPhoneNumberPortingContractType) d0.M0(list4)) == null) {
                esimPhoneNumberPortingScheduleOption = null;
            } else {
                EsimPhoneNumberPortingScheduleOption esimPhoneNumberPortingScheduleOption2 = (EsimPhoneNumberPortingScheduleOption) d0.M0(esimPhoneNumberPortingContractType.d);
                esimPhoneNumberPortingScheduleOption = esimPhoneNumberPortingScheduleOption2;
            }
        } else {
            esimPhoneNumberPortingScheduleOption = esimPhoneNumberPortingScheduleOption2;
        }
        List list5 = esimPhoneNumberPortingDynamicForm.f100354h;
        EsimPhoneNumberPortingOwnerAccountType esimPhoneNumberPortingOwnerAccountType = list5 != null ? (EsimPhoneNumberPortingOwnerAccountType) d0.d0(list5) : null;
        List list6 = esimPhoneNumberPortingDynamicForm.i;
        if (list6 != null && (esimPhoneNumberPortingContractType2 = (EsimPhoneNumberPortingContractType) d0.M0(list6)) != null) {
            list2 = esimPhoneNumberPortingContractType2.e;
        }
        this.f101285x = d.b(this, new g(null, esimPhoneNumberPortingContractType3, esimPhoneNumberPortingScheduleOption, null, esimPhoneNumberPortingOwnerAccountType, mapJ2, I2(list2)), stateMapper, null, false, 12);
        this.f101286y = hx7.e.a(this, new k(this, 4));
    }

    public static Map J2(List list) {
        LinkedHashMap linkedHashMap = null;
        if (list != null) {
            ArrayList<EsimPhoneNumberPortingAttribute> arrayList = new ArrayList();
            for (Object obj2 : list) {
                u0 u0Var = ((EsimPhoneNumberPortingAttribute) obj2).e;
                if (u0Var == u0.TEXT || u0Var == u0.NUMBER) {
                    arrayList.add(obj2);
                }
            }
            int iB = q0.b(w.t(arrayList, 10));
            if (iB < 16) {
                iB = 16;
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(iB);
            for (EsimPhoneNumberPortingAttribute esimPhoneNumberPortingAttribute : arrayList) {
                linkedHashMap2.put(esimPhoneNumberPortingAttribute.f100338a, new zkj.b(null, esimPhoneNumberPortingAttribute.f100341g));
            }
            linkedHashMap = linkedHashMap2;
        }
        return linkedHashMap == null ? r0.g() : linkedHashMap;
    }

    public static void K2(String str) {
        IllegalStateException illegalStateException = new IllegalStateException(str);
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(c.ERROR, "EsimMobilePlanDynamicFormNumberTransferConfirmationScreenModel", null, illegalStateException, h0Var);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    public final Map I2(List list) {
        Map mapJ2 = J2(list);
        Set setH0 = d0.h0(mapJ2.keySet(), this.f101284w.keySet());
        if (!setH0.isEmpty()) {
            K2("Contract type attributes collide with additionalRequiredInformation keys: " + setH0);
        }
        return mapJ2;
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f101286y;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void L2(Object obj2) {
        Object[] objArr = 0;
        if (!(obj2 instanceof EsimDescriptorValue.Action)) {
            if (obj2 instanceof EsimDescriptorValue.Link) {
                l2(new c0(this, obj2, objArr == true ? 1 : 0, 25), new yi5.b(26));
            }
        } else if (((EsimDescriptorValue.Action) obj2).f100252a == s0.TRACK_PORTABILITY) {
            EsimCheckoutPortingSteps esimCheckoutPortingSteps = this.o.d;
            if (esimCheckoutPortingSteps == null) {
                K2("Porting progress is null");
                return;
            }
            TextClause textClause = new TextClause(esimCheckoutPortingSteps.f100193a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            String str = esimCheckoutPortingSteps.f100194b;
            h.v2(this.f101286y, new EsimMobilePlanDynamicFormNumberTransferConfirmationScreenContract$ModalStep.TrackPortabilityStatus(textClause, str != null ? new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, esimCheckoutPortingSteps.f100195c), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        }
    }

    @Override // yji.l
    public final void T1(long j2) {
        l.b1(this, q.g(((a1) this.f101283t).f113903a), null, new xjl.g(this, (Continuation) null, 3), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f101285x;
    }
}
