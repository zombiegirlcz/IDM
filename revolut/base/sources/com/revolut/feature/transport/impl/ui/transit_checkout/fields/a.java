package com.revolut.feature.transport.impl.ui.transit_checkout.fields;

import aw0.ma;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.delegates.g5;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.address.common.api.flow.AddressFlowContract$InputData;
import com.revolut.feature.address.common.api.flow.AddressFlowContract$OutputData;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.picker.PickerController;
import com.revolut.feature.transport.impl.ui.transit_checkout.date_input.DateInputScreen;
import com.revolut.feature.transport.impl.ui.transit_checkout.date_input.DateInputScreenContract$InputData;
import com.revolut.feature.transport.impl.ui.transit_checkout.fields.TransitCheckoutFieldValue;
import com.revolut.feature.transport.models.fields.TransportCheckoutAddressField;
import com.revolut.feature.transport.models.fields.TransportCheckoutDateOfBirthField;
import com.revolut.feature.transport.models.fields.TransportCheckoutDatePickerField;
import com.revolut.feature.transport.models.fields.TransportCheckoutDateTimePickerField;
import com.revolut.feature.transport.models.fields.TransportCheckoutDropdownField;
import com.revolut.feature.transport.models.fields.TransportCheckoutField;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.common.ui.R$string;
import ip0.cl0;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.text.a0;
import kotlinx.coroutines.flow.StateFlow;
import l80.e;
import nvf.i;
import nvf.j;
import rd0.c;
import rd0.d;
import rp0.t;
import rp0.y;
import s6e.v;
import s7a.c0;
import s7a.x;
import swf.b;
import swf.f;
import vkm.j2;
import vkm.q;
import yji.n;
import ywf.g;
import zhm.f0;
import zhm.h0;
import zhm.q0;
import zhm.r0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final g f92578l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final i f92579m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final j60.a f92580n;
    public final e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final j2 f92581p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public List f92582q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Pair f92583r;

    public a(g transportCheckoutFieldValidator, i transportCheckoutFieldMapper, j60.a bottomExpandableDialog, e dateProvider) {
        Intrinsics.checkNotNullParameter(transportCheckoutFieldValidator, "transportCheckoutFieldValidator");
        Intrinsics.checkNotNullParameter(transportCheckoutFieldMapper, "transportCheckoutFieldMapper");
        Intrinsics.checkNotNullParameter(bottomExpandableDialog, "bottomExpandableDialog");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f92578l = transportCheckoutFieldValidator;
        this.f92579m = transportCheckoutFieldMapper;
        this.f92580n = bottomExpandableDialog;
        this.o = dateProvider;
        f.Companion.getClass();
        this.f92581p = q.c(f.f266209c);
        this.f92582q = f0.f322471a;
    }

    @Override // yji.n
    public final void D2() {
        n.j2(this, q.q(new v(this.f92581p, this, 16)), null, new sek.q(this, null, 24), 3);
    }

    @Override // swf.b
    public final StateFlow Z2() {
        return this.f92581p;
    }

    @Override // swf.b
    public final void b3(LocalDate date, TransportCheckoutField field) {
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(field, "field");
        if (!(field instanceof TransportCheckoutDateTimePickerField)) {
            if (field instanceof TransportCheckoutDatePickerField) {
                k3(((TransportCheckoutDatePickerField) field).f92608a, date);
            }
        } else {
            Map map = ((f) this.f92581p.getValue()).f266210a;
            String str = ((TransportCheckoutDateTimePickerField) field).f92611a;
            TransitCheckoutFieldValue transitCheckoutFieldValue = (TransitCheckoutFieldValue) map.get(str);
            l3(str, transitCheckoutFieldValue instanceof TransitCheckoutFieldValue.DateTimeField ? new TransitCheckoutFieldValue.DateTimeField(date, ((TransitCheckoutFieldValue.DateTimeField) transitCheckoutFieldValue).f92576b) : new TransitCheckoutFieldValue.DateTimeField(date, null));
            j60.a.v(this.f92580n, true, null, 2);
        }
    }

    @Override // swf.b
    public final void c3(TransportCheckoutField field, String listId) {
        LocalTime localTimeNow;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(field, "field");
        if ((field instanceof TransportCheckoutDateTimePickerField ? (TransportCheckoutDateTimePickerField) field : null) != null) {
            if (a0.H(listId, "DATE_PREFIX_", false)) {
                j3(field, listId);
                return;
            }
            if (a0.H(listId, "TIME_PREFIX_", false)) {
                TransportCheckoutDateTimePickerField transportCheckoutDateTimePickerField = (TransportCheckoutDateTimePickerField) field;
                Pair pair = this.f92583r;
                if (pair == null || (localTimeNow = (LocalTime) pair.f186385a) == null) {
                    localTimeNow = LocalTime.now();
                }
                Intrinsics.h(localTimeNow);
                this.f92583r = new Pair(localTimeNow, transportCheckoutDateTimePickerField);
                cl0 cl0Var = new cl0("TIME_PICKER_ID", localTimeNow, ma.TIME_24H, transportCheckoutDateTimePickerField);
                LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model("TIME_PICKER_BUTTON_ID", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R$string.common_action_confirm, null, null, 14), false, null, null, transportCheckoutDateTimePickerField, null, 744);
                yp0.b.r(model, 0, R$attr.uikit_dp16, 0, 0, 13);
                this.f92580n.x(new y(zhm.v.k(cl0Var, model), null, null, null, null, null, 1022));
            }
        }
    }

    @Override // swf.b
    public final void d3(SelectableDelegate.Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        if (a0.H(model.f53304a, "ID_DROPDOWN_", false)) {
            j60.a.v(this.f92580n, false, null, 3);
            Object obj2 = model.k;
            Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.feature.transport.impl.mapper.TransportCheckoutFieldMapper.DropdownItemData");
            j jVar = (j) obj2;
            l3(jVar.f219587a, new TransitCheckoutFieldValue.TextField(jVar.f219588b));
        }
    }

    @Override // swf.b
    public final void e3(InputTextDelegate.TextData model) {
        Intrinsics.checkNotNullParameter(model, "model");
        l3(model.f52597a, new TransitCheckoutFieldValue.TextField(model.f52598b.toString()));
    }

    @Override // swf.b
    public final void f3(final ruf.e model) {
        LocalDate localDate;
        Object next;
        Address address;
        Address address2;
        ZonedDateTime zonedDateTimeAtZone;
        String str = model.f257546a;
        Intrinsics.checkNotNullParameter(model, "model");
        Iterator it8 = this.f92582q.iterator();
        while (true) {
            localDate = null;
            localDate = null;
            if (it8.hasNext()) {
                next = it8.next();
                if (Intrinsics.f(((TransportCheckoutField) next).getF92620a(), str)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        TransportCheckoutField transportCheckoutField = (TransportCheckoutField) next;
        if (transportCheckoutField == null) {
            IllegalStateException illegalStateException = new IllegalStateException(j6.a.q("Click on unrecognised field: ", str));
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
            d.a(c.ERROR, null, null, illegalStateException, h0Var);
            return;
        }
        boolean z = transportCheckoutField instanceof TransportCheckoutDropdownField;
        ModalDestination.Style.POPUP popup = ModalDestination.Style.POPUP.f98311a;
        j2 j2Var = this.f92581p;
        if (z) {
            TransportCheckoutDropdownField transportCheckoutDropdownField = (TransportCheckoutDropdownField) transportCheckoutField;
            TransitCheckoutFieldValue transitCheckoutFieldValue = (TransitCheckoutFieldValue) ((f) j2Var.getValue()).f266210a.get(transportCheckoutDropdownField.f92614a);
            List list = transportCheckoutDropdownField.f92617g;
            int size = list.size();
            i iVar = this.f92579m;
            if (size > 5) {
                PickerController pickerController = new PickerController(new x(new TextClause(transportCheckoutDropdownField.f92616c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, null, false, null, null, null, null, false, null, null, null, null, false, null, null, null, null, null, 2147483646), new vwf.a(iVar, transportCheckoutDropdownField, transitCheckoutFieldValue != null ? transitCheckoutFieldValue.getF92577a() : null));
                final int i = 2;
                N2(pickerController, popup, new Function1(this) { // from class: swf.c

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ com.revolut.feature.transport.impl.ui.transit_checkout.fields.a f266206b;

                    {
                        this.f266206b = this;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        switch (i) {
                            case 0:
                                rwf.f result = (rwf.f) obj2;
                                Intrinsics.checkNotNullParameter(result, "result");
                                if (result instanceof rwf.e) {
                                    this.f266206b.k3(model.f257546a, ((rwf.e) result).f257899a);
                                }
                                break;
                            case 1:
                                AddressFlowContract$OutputData result2 = (AddressFlowContract$OutputData) obj2;
                                Intrinsics.checkNotNullParameter(result2, "result");
                                this.f266206b.l3(model.f257546a, new TransitCheckoutFieldValue.AddressField(result2.f60942c, result2.f60940a));
                                break;
                            default:
                                s7a.a0 data = (s7a.a0) obj2;
                                Intrinsics.checkNotNullParameter(data, "data");
                                c0 c0Var = data.f260599a;
                                vwf.d dVar = c0Var instanceof vwf.d ? (vwf.d) c0Var : null;
                                if (dVar != null) {
                                    if (dVar instanceof vwf.c) {
                                        this.f266206b.l3(model.f257546a, new TransitCheckoutFieldValue.TextField(((vwf.c) dVar).f292716a.f92618a));
                                    }
                                }
                                break;
                        }
                        return Unit.f186387a;
                    }
                });
                return;
            }
            String f92577a = transitCheckoutFieldValue != null ? transitCheckoutFieldValue.getF92577a() : null;
            List<TransportCheckoutDropdownField.Option> list2 = list;
            ArrayList arrayList = new ArrayList(w.t(list2, 10));
            for (TransportCheckoutDropdownField.Option option : list2) {
                iVar.getClass();
                arrayList.add(i.b(transportCheckoutDropdownField, option, f92577a));
            }
            yp0.b.k(arrayList, 0, 0, 0, 0, 31);
            this.f92580n.x(new y(arrayList, new t(new TextClause(transportCheckoutDropdownField.f92616c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 30), null, null, null, null, 1020));
            return;
        }
        if (transportCheckoutField instanceof TransportCheckoutDatePickerField) {
            j3(transportCheckoutField, str);
            return;
        }
        if (transportCheckoutField instanceof TransportCheckoutDateOfBirthField) {
            TransportCheckoutDateOfBirthField transportCheckoutDateOfBirthField = (TransportCheckoutDateOfBirthField) transportCheckoutField;
            Object obj2 = ((f) j2Var.getValue()).f266210a.get(str);
            TransitCheckoutFieldValue.DateField dateField = obj2 instanceof TransitCheckoutFieldValue.DateField ? (TransitCheckoutFieldValue.DateField) obj2 : null;
            Instant instantOfEpochMilli = dateField != null ? Instant.ofEpochMilli(dateField.f92572a) : null;
            e eVar = this.o;
            if (instantOfEpochMilli != null && (zonedDateTimeAtZone = instantOfEpochMilli.atZone(ZoneId.of(((l80.f) eVar).a()))) != null) {
                localDate = zonedDateTimeAtZone.toLocalDate();
            }
            DateInputScreen dateInputScreen = new DateInputScreen(new DateInputScreenContract$InputData(transportCheckoutDateOfBirthField.f92607c, localDate), eVar);
            final int i2 = 0;
            N2(dateInputScreen, popup, new Function1(this) { // from class: swf.c

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.revolut.feature.transport.impl.ui.transit_checkout.fields.a f266206b;

                {
                    this.f266206b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj22) {
                    switch (i2) {
                        case 0:
                            rwf.f result = (rwf.f) obj22;
                            Intrinsics.checkNotNullParameter(result, "result");
                            if (result instanceof rwf.e) {
                                this.f266206b.k3(model.f257546a, ((rwf.e) result).f257899a);
                            }
                            break;
                        case 1:
                            AddressFlowContract$OutputData result2 = (AddressFlowContract$OutputData) obj22;
                            Intrinsics.checkNotNullParameter(result2, "result");
                            this.f266206b.l3(model.f257546a, new TransitCheckoutFieldValue.AddressField(result2.f60942c, result2.f60940a));
                            break;
                        default:
                            s7a.a0 data = (s7a.a0) obj22;
                            Intrinsics.checkNotNullParameter(data, "data");
                            c0 c0Var = data.f260599a;
                            vwf.d dVar = c0Var instanceof vwf.d ? (vwf.d) c0Var : null;
                            if (dVar != null) {
                                if (dVar instanceof vwf.c) {
                                    this.f266206b.l3(model.f257546a, new TransitCheckoutFieldValue.TextField(((vwf.c) dVar).f292716a.f92618a));
                                }
                            }
                            break;
                    }
                    return Unit.f186387a;
                }
            });
            return;
        }
        if (transportCheckoutField instanceof TransportCheckoutAddressField) {
            TransportCheckoutAddressField transportCheckoutAddressField = (TransportCheckoutAddressField) transportCheckoutField;
            Object obj3 = ((f) j2Var.getValue()).f266210a.get(transportCheckoutAddressField.f92602a);
            TransitCheckoutFieldValue.AddressField addressField = obj3 instanceof TransitCheckoutFieldValue.AddressField ? (TransitCheckoutFieldValue.AddressField) obj3 : null;
            TextClause textClause = new TextClause(transportCheckoutAddressField.f92604c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            if (addressField == null || (address2 = addressField.f92569a) == null) {
                wi0.b.Companion.getClass();
                address = new Address(null, null, null, null, null, "PL", null, null, null, null, null, null, null, null, null, 32735, null);
            } else {
                address = address2;
            }
            final int i3 = 1;
            n.P2(this, o2(new th1.a(new AddressFlowContract$InputData(address, textClause, null, false, null, null, null, null, false, null, 2097148), null, null, 6)), null, new Function1(this) { // from class: swf.c

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.revolut.feature.transport.impl.ui.transit_checkout.fields.a f266206b;

                {
                    this.f266206b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj22) {
                    switch (i3) {
                        case 0:
                            rwf.f result = (rwf.f) obj22;
                            Intrinsics.checkNotNullParameter(result, "result");
                            if (result instanceof rwf.e) {
                                this.f266206b.k3(model.f257546a, ((rwf.e) result).f257899a);
                            }
                            break;
                        case 1:
                            AddressFlowContract$OutputData result2 = (AddressFlowContract$OutputData) obj22;
                            Intrinsics.checkNotNullParameter(result2, "result");
                            this.f266206b.l3(model.f257546a, new TransitCheckoutFieldValue.AddressField(result2.f60942c, result2.f60940a));
                            break;
                        default:
                            s7a.a0 data = (s7a.a0) obj22;
                            Intrinsics.checkNotNullParameter(data, "data");
                            c0 c0Var = data.f260599a;
                            vwf.d dVar = c0Var instanceof vwf.d ? (vwf.d) c0Var : null;
                            if (dVar != null) {
                                if (dVar instanceof vwf.c) {
                                    this.f266206b.l3(model.f257546a, new TransitCheckoutFieldValue.TextField(((vwf.c) dVar).f292716a.f92618a));
                                }
                            }
                            break;
                    }
                    return Unit.f186387a;
                }
            }, 1);
        }
    }

    @Override // swf.b
    public final void g3(LocalTime time, TransportCheckoutField field) {
        Intrinsics.checkNotNullParameter(time, "time");
        Intrinsics.checkNotNullParameter(field, "field");
        this.f92583r = new Pair(time, field);
    }

    @Override // swf.b
    public final void h3(TransportCheckoutField field) {
        TransitCheckoutFieldValue.DateTimeField dateTimeField;
        Intrinsics.checkNotNullParameter(field, "field");
        TransitCheckoutFieldValue transitCheckoutFieldValue = (TransitCheckoutFieldValue) ((f) this.f92581p.getValue()).f266210a.get(field.getF92620a());
        if (transitCheckoutFieldValue instanceof TransitCheckoutFieldValue.DateTimeField) {
            TransitCheckoutFieldValue.DateTimeField dateTimeField2 = (TransitCheckoutFieldValue.DateTimeField) transitCheckoutFieldValue;
            Pair pair = this.f92583r;
            dateTimeField = new TransitCheckoutFieldValue.DateTimeField(dateTimeField2.f92575a, pair != null ? (LocalTime) pair.f186385a : null);
        } else {
            Pair pair2 = this.f92583r;
            dateTimeField = new TransitCheckoutFieldValue.DateTimeField(null, pair2 != null ? (LocalTime) pair2.f186385a : null);
        }
        l3(field.getF92620a(), dateTimeField);
        j60.a.v(this.f92580n, true, null, 2);
    }

    @Override // swf.b
    public final void i3(List fields, Map values) {
        Intrinsics.checkNotNullParameter(fields, "fields");
        Intrinsics.checkNotNullParameter(values, "values");
        this.f92582q = fields;
        if (values.isEmpty()) {
            List list = fields;
            int iB = q0.b(w.t(list, 10));
            if (iB < 16) {
                iB = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                String f92620a = ((TransportCheckoutField) it8.next()).getF92620a();
                m70.a.c(t0.f186434a);
                linkedHashMap.put(f92620a, new TransitCheckoutFieldValue.TextField(""));
            }
            values = linkedHashMap;
        }
        f fVar = new f(values, f0.f322471a);
        j2 j2Var = this.f92581p;
        j2Var.getClass();
        j2Var.g(null, fVar);
    }

    public final void j3(TransportCheckoutField transportCheckoutField, String str) {
        Object obj2 = ((f) this.f92581p.getValue()).f266210a.get(str);
        TransitCheckoutFieldValue.DateField dateField = obj2 instanceof TransitCheckoutFieldValue.DateField ? (TransitCheckoutFieldValue.DateField) obj2 : null;
        LocalDate localDateE = dateField != null ? dateField.f92573b : null;
        e eVar = this.o;
        LocalDate localDateE2 = localDateE == null ? ((l80.f) eVar).e() : localDateE;
        if (localDateE == null) {
            localDateE = ((l80.f) eVar).e();
        }
        this.f92580n.x(new y(u.c(new g5("DATE_PICKER_ID", localDateE2, localDateE, true, null, null, null, null, null, transportCheckoutField, 0, 0, 1015792)), new t(new TextClause(transportCheckoutField.getF92622c(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 30), null, null, null, null, 1020));
    }

    public final void k3(String str, LocalDate localDate) {
        ZoneId zoneIdOf = ZoneId.of(((l80.f) this.o).a());
        Intrinsics.checkNotNullExpressionValue(zoneIdOf, "of(...)");
        l3(str, new TransitCheckoutFieldValue.DateField(oc.c.E(localDate, zoneIdOf), localDate));
        j60.a.v(this.f92580n, true, null, 2);
    }

    public final void l3(String str, TransitCheckoutFieldValue transitCheckoutFieldValue) {
        j2 j2Var = this.f92581p;
        f fVarA = f.a((f) j2Var.getValue(), r0.q(((f) j2Var.getValue()).f266210a, new Pair(str, transitCheckoutFieldValue)), null, 2);
        j2Var.getClass();
        j2Var.g(null, fVarA);
    }
}
