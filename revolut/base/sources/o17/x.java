package o17;

import com.google.common.primitives.UnsignedBytes;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.data.model.Data;
import com.revolut.feature.location.api.domain.models.location.LocationDomain;
import ip0.pb0;
import ip0.um0;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.text.a0;
import o29.w;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class x implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f221341a;

    public /* synthetic */ x(int i) {
        this.f221341a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Data data;
        h19.d dVar;
        int i = this.f221341a;
        od0.i iVar = od0.i.f224256b;
        switch (i) {
            case 0:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return (List) getDefaultLoadingItems.invoke();
            case 1:
                q1a.d it8 = (q1a.d) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return it8.f241413a;
            case 2:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return iii.c.c(1);
            case 3:
                o23.w update = (o23.w) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return o23.w.a(update, null, null, null, null, null, true, null, null, null, null, false, null, 32703);
            case 4:
                o23.w update2 = (o23.w) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                m70.a.c(t0.f186434a);
                return o23.w.a(update2, null, null, "", null, null, false, null, null, null, null, false, null, 32759);
            case 5:
                o23.w update3 = (o23.w) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return o23.w.a(update3, null, null, null, null, null, false, null, null, null, null, false, null, 24575);
            case 6:
                vu3.p content = (vu3.p) obj2;
                Intrinsics.checkNotNullParameter(content, "content");
                vu3.s header = content.f292237c;
                if (header == null) {
                    data = new Data(null, new IllegalStateException("Discover content header must not be null"), false, 5, null);
                } else {
                    od0.h hVar = od0.i.Companion;
                    Intrinsics.checkNotNullParameter(header, "header");
                    q25.a aVar = new q25.a(header.f292242a, header.f292243b, header.f292244c, header.d);
                    hVar.getClass();
                    data = new Data(od0.h.a(aVar), null, false, 6, null);
                }
                return new go.g(data, 2);
            case 7:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                od0.i.Companion.getClass();
                return iVar;
            case 8:
                ArrayList arrayListP = kii.e.p((Function0) obj2, "it", 2);
                for (int i2 = 0; i2 < 2; i2++) {
                    pb0 pb0Var = new pb0(a0.d.n("LOADING_STATE_ID_", i2));
                    yp0.b.l(pb0Var, 0, 0, 0, 0, null, false, 63);
                    arrayListP.add(pb0Var);
                }
                return arrayListP;
            case 9:
                um0 it9 = (um0) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return Boolean.valueOf(Intrinsics.f(it9.f166695a, "CORPORATE_EVENTS_TWIN_BUTTON_ID"));
            case 10:
                Object obj3 = ((CellDetailsDelegate.Model) obj2).o;
                kp3.a aVar2 = obj3 instanceof kp3.a ? (kp3.a) obj3 : null;
                if (aVar2 != null) {
                    return aVar2.f188164a;
                }
                return null;
            case 11:
                LargeActionButtonDelegate.Model it10 = (LargeActionButtonDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return Boolean.valueOf(Intrinsics.f(it10.f52613a, "CORPORATE_EVENTS_EARNING_CALL_BUTTON_ID"));
            case 12:
                Object obj4 = ((LargeActionButtonDelegate.Model) obj2).i;
                kp3.a aVar3 = obj4 instanceof kp3.a ? (kp3.a) obj4 : null;
                iel.a aVar4 = aVar3 != null ? aVar3.f188164a : null;
                iel.h hVar2 = aVar4 instanceof iel.h ? (iel.h) aVar4 : null;
                if (hVar2 != null) {
                    return oi0.d.i(hVar2);
                }
                return null;
            case 13:
                CellDetailsDelegate.Model it11 = (CellDetailsDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return Boolean.valueOf(a0.H(it11.f51832a, "CORPORATE_EVENT_TRANSCRIPT_ID_", false));
            case 14:
                Object obj5 = ((CellDetailsDelegate.Model) obj2).o;
                kp3.a aVar5 = obj5 instanceof kp3.a ? (kp3.a) obj5 : null;
                iel.a aVar6 = aVar5 != null ? aVar5.f188164a : null;
                iel.h hVar3 = aVar6 instanceof iel.h ? (iel.h) aVar6 : null;
                if (hVar3 != null) {
                    return hVar3.i;
                }
                return null;
            case 15:
                um0 it12 = (um0) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return Boolean.valueOf(Intrinsics.f(it12.f166695a, "CORPORATE_EVENTS_TWIN_BUTTON_ID"));
            case 16:
                Object obj6 = ((um0) obj2).d;
                kp3.a aVar7 = obj6 instanceof kp3.a ? (kp3.a) obj6 : null;
                iel.a aVar8 = aVar7 != null ? aVar7.f188164a : null;
                iel.h hVar4 = aVar8 instanceof iel.h ? (iel.h) aVar8 : null;
                if (hVar4 != null) {
                    return oi0.d.i(hVar4);
                }
                return null;
            case 17:
                Object obj7 = ((um0) obj2).d;
                kp3.a aVar9 = obj7 instanceof kp3.a ? (kp3.a) obj7 : null;
                iel.a aVar10 = aVar9 != null ? aVar9.f188164a : null;
                iel.h hVar5 = aVar10 instanceof iel.h ? (iel.h) aVar10 : null;
                if (hVar5 != null) {
                    return hVar5.d;
                }
                return null;
            case 18:
                LargeActionButtonDelegate.Model it13 = (LargeActionButtonDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return Boolean.valueOf(Intrinsics.f(it13.f52613a, "CORPORATE_EVENTS_DESCRIPTION_BUTTON_ID"));
            case 19:
                Object obj8 = ((LargeActionButtonDelegate.Model) obj2).i;
                if (obj8 instanceof String) {
                    return (String) obj8;
                }
                return null;
            case 20:
                CellDetailsDelegate.Model it14 = (CellDetailsDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return Boolean.valueOf(a0.H(it14.f51832a, "CORPORATE_EVENT_DESCRIPTION_ID_", false));
            case 21:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return Boolean.FALSE;
            case 22:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return Boolean.FALSE;
            case 23:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return Boolean.FALSE;
            case 24:
                h29.k products = (h29.k) obj2;
                Intrinsics.checkNotNullParameter(products, "products");
                ArrayList arrayList = new ArrayList();
                List<h29.h> list = products.f148753b;
                ArrayList arrayList2 = new ArrayList();
                for (h29.h hVar6 : list) {
                    h29.f fVar = hVar6.f148748b;
                    if (fVar instanceof h29.d) {
                        dVar = new h19.d(hVar6.f148747a, ((h29.d) fVar).f148743a, hVar6.f148749c, hVar6.d);
                    } else {
                        if (!(fVar instanceof h29.e)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        arrayList.add(((h29.e) fVar).f148744a);
                        dVar = null;
                    }
                    if (dVar != null) {
                        arrayList2.add(dVar);
                    }
                }
                if (!arrayList.isEmpty()) {
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.b(rd0.c.WARNING, "LifestyleHomeProducts", "Dropped unsupported lifestyle home products: " + arrayList, null, null, 16);
                }
                return new h19.g(products.f148752a, arrayList2);
            case 25:
                LocationDomain lastLocation = (LocationDomain) obj2;
                Intrinsics.checkNotNullParameter(lastLocation, "lastLocation");
                od0.i.Companion.getClass();
                return od0.h.a(lastLocation);
            case 26:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                od0.i.Companion.getClass();
                return iVar;
            case 27:
                yhm.r rVar = (yhm.r) obj2;
                Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                return Boolean.valueOf(((Boolean) rVar.f314201a).booleanValue() || ((Boolean) rVar.f314202b).booleanValue() || ((Boolean) rVar.f314203c).booleanValue());
            case 28:
                return a0.d.v(new Object[]{Integer.valueOf(((Byte) obj2).byteValue() & UnsignedBytes.MAX_VALUE)}, 1, "%02x", "format(...)");
            default:
                byte bByteValue = ((Byte) obj2).byteValue();
                w.a aVar11 = o29.w.Companion;
                return a0.d.v(new Object[]{Integer.valueOf(bByteValue & UnsignedBytes.MAX_VALUE)}, 1, "%02x", "format(...)");
        }
    }
}
