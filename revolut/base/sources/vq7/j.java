package vq7;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.insurance_car.impl.R$string;
import com.revolut.feature.insurance_car.impl.ui.screen.policy.telematic_device.delivery.DeviceDeliveryScreenContract$InputData;
import java.time.LocalDate;
import jki.p;
import kl7.f2;
import kl7.g2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import ll7.e0;
import ll7.v;
import rp0.y;
import vfg.m;
import xl7.n;
import zhm.u;

/* JADX INFO: loaded from: classes4.dex */
public final class j extends jki.g implements h {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final DeviceDeliveryScreenContract$InputData f291352p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final v f291353q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final tr7.a f291354r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final j60.a f291355s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final a f291356t;
    public final e u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(p stateMapper, DeviceDeliveryScreenContract$InputData inputData, v policyRepository, tr7.a copyToClipboardHelper, j60.a bottomDialogExtension, a deviceDeliveryPopupFactory) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(policyRepository, "policyRepository");
        Intrinsics.checkNotNullParameter(copyToClipboardHelper, "copyToClipboardHelper");
        Intrinsics.checkNotNullParameter(bottomDialogExtension, "bottomDialogExtension");
        Intrinsics.checkNotNullParameter(deviceDeliveryPopupFactory, "deviceDeliveryPopupFactory");
        this.f291352p = inputData;
        this.f291353q = policyRepository;
        this.f291354r = copyToClipboardHelper;
        this.f291355s = bottomDialogExtension;
        this.f291356t = deviceDeliveryPopupFactory;
        this.u = new e(new Data(null, null, true, 3, null));
    }

    @Override // yji.l
    public final void I1() {
        String policyId = this.f291352p.f75678a;
        e0 e0Var = (e0) this.f291353q;
        e0Var.getClass();
        Intrinsics.checkNotNullParameter(policyId, "policyId");
        yji.l.a1(this, rd0.e.b(e0Var.f196618p.f(policyId, true)), null, null, new m(this, null, 25), 3);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.u;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void y2(Object obj2, String listId) {
        g2 g2Var;
        LocalDate localDate;
        int i;
        Object obj3 = obj2;
        Intrinsics.checkNotNullParameter(listId, "listId");
        int iHashCode = listId.hashCode();
        j60.a aVar = this.f291355s;
        switch (iHashCode) {
            case -2041497756:
                if (listId.equals("ACTIVATE_YOUR_DEVICE_ID") && (g2Var = (g2) ((e) t2()).f291349a.getContent()) != null && (localDate = g2Var.f185325a) != null) {
                    v2(new f(localDate));
                }
                break;
            case -1554792887:
                if (listId.equals("TRACKING_NUMBER_ID")) {
                    if (!(obj3 instanceof f2)) {
                        obj3 = null;
                    }
                    f2 number = (f2) obj3;
                    if (number != null) {
                        String str = number.f185317a;
                        if (str != null ? !d0.W(str) : false) {
                            this.f291356t.getClass();
                            Intrinsics.checkNotNullParameter(number, "number");
                            rp0.l lVar = rp0.l.WINDOW;
                            aim.e eVarB = u.b();
                            String str2 = number.f185318b;
                            if (str2 != null) {
                                i = 15;
                                eVarB.add(new RowDelegate.Model("TRACK_DELIVERY_ID", n.k(R$drawable.uikit_icn_24_location_pin, false, null, 15), new TextLocalisedClause(R$string.car_insurance_telematics_device_delivery_popup_track_delivery, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, str2, null, 0, 0, 0, 0, 532676600));
                            } else {
                                i = 15;
                            }
                            if (str != null) {
                                eVarB.add(new RowDelegate.Model("COPY_TRACK_NUMBER_ID", n.k(R$drawable.uikit_icn_24_copy, false, null, i), new TextLocalisedClause(R$string.car_insurance_telematics_device_delivery_popup_copy_tracking_number, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, str, null, 0, 0, 0, 0, 532676600));
                            }
                            aim.e eVarA = u.a(eVarB);
                            yp0.b.k(eVarA, 0, 0, 0, 0, 31);
                            aVar.x(new y(eVarA, null, lVar, null, null, null, 1018));
                        }
                        break;
                    }
                }
                break;
            case -1453564878:
                if (listId.equals("TRACK_DELIVERY_ID")) {
                    if (!(obj3 instanceof String)) {
                        obj3 = null;
                    }
                    String str3 = (String) obj3;
                    if (str3 != null) {
                        j60.a.v(aVar, false, null, 3);
                        C1(sl7.b.a(str3));
                        break;
                    }
                }
                break;
            case -1324288304:
                if (listId.equals("GET_HELP_ID")) {
                    C1(sl7.c.a("topic.telematics"));
                    break;
                }
                break;
            case -80504077:
                if (listId.equals("COPY_TRACK_NUMBER_ID")) {
                    if (!(obj3 instanceof String)) {
                        obj3 = null;
                    }
                    String str4 = (String) obj3;
                    if (str4 != null) {
                        tr7.a.b(this.f291354r, str4, null, 6);
                        j60.a.v(aVar, false, null, 3);
                        break;
                    }
                }
                break;
        }
    }
}
