package ar0;

import as7.b0;
import as7.g;
import as7.h0;
import as7.j;
import auc.k0;
import auc.q0;
import auc.y;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsListDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.feature.apm.bills.tapi.impl.screen.transfer.review.TapiTransferReviewScreen;
import com.revolut.feature.crypto_investments.impl.ui.screens.transaction_filter.filters_by_type.FiltersByTypeScreen;
import com.revolut.feature.kyc.impl.document_collection.document_selection.DocumentSelectionController;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.airport_selection.AsftAirportSelectionScreen;
import java.lang.annotation.Annotation;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KClass;
import kotlin.reflect.KProperty;
import kotlinx.serialization.KSerializer;
import qlm.d1;
import zhm.f0;
import zr7.m;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8480a;

    public /* synthetic */ b(int i) {
        this.f8480a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f8480a) {
            case 0:
                return Unit.f186387a;
            case 1:
                return Unit.f186387a;
            case 2:
                TapiTransferReviewScreen.a aVar = TapiTransferReviewScreen.Companion;
                return new CounterTextDelegate();
            case 3:
                TapiTransferReviewScreen.a aVar2 = TapiTransferReviewScreen.Companion;
                return new CellDetailsDelegate();
            case 4:
                TapiTransferReviewScreen.a aVar3 = TapiTransferReviewScreen.Companion;
                return new CellDetailsActionDelegate();
            case 5:
                TapiTransferReviewScreen.a aVar4 = TapiTransferReviewScreen.Companion;
                return new CellDetailsNoteDelegate();
            case 6:
                TapiTransferReviewScreen.a aVar5 = TapiTransferReviewScreen.Companion;
                return new InputTextDelegate(null);
            case 7:
                TapiTransferReviewScreen.a aVar6 = TapiTransferReviewScreen.Companion;
                return new ListSubheaderDelegate();
            case 8:
                TapiTransferReviewScreen.a aVar7 = TapiTransferReviewScreen.Companion;
                return new RowDelegate(null, null, 7);
            case 9:
                TapiTransferReviewScreen.a aVar8 = TapiTransferReviewScreen.Companion;
                return new LargeActionButtonDelegate();
            case 10:
                g.Companion companion = as7.g.INSTANCE;
                p0 p0Var = o0.f186429a;
                return new mlm.f("com.revolut.feature.insurance_credit.impl.data.dto.action.ImageDto", p0Var.b(as7.g.class), new KClass[]{p0Var.b(g.b.class), p0Var.b(g.c.class)}, new KSerializer[]{g.b.a.f8837a, g.c.a.f8839a}, new Annotation[]{new as7.h()});
            case 11:
                return j.INSTANCE.serializer();
            case 12:
                j.Companion companion2 = j.INSTANCE;
                p0 p0Var2 = o0.f186429a;
                return new mlm.f("com.revolut.feature.insurance_credit.impl.data.dto.action.InsuranceActionDto.ActionTypeDto", p0Var2.b(j.class), new KClass[]{p0Var2.b(j.b.class), p0Var2.b(j.c.class)}, new KSerializer[]{new d1("SHOW_CANCELLATION_PROMPT", j.b.INSTANCE, new Annotation[]{new rlm.g() { // from class: as7.k
                    {
                        Intrinsics.checkNotNullParameter("type", "discriminator");
                    }

                    @Override // java.lang.annotation.Annotation
                    public final /* synthetic */ Class annotationType() {
                        return rlm.g.class;
                    }

                    @Override // rlm.g
                    public final /* synthetic */ String discriminator() {
                        return "type";
                    }

                    @Override // java.lang.annotation.Annotation
                    public final boolean equals(Object obj2) {
                        return (obj2 instanceof rlm.g) && "type".equals(((rlm.g) obj2).discriminator());
                    }

                    @Override // java.lang.annotation.Annotation
                    public final int hashCode() {
                        return 705071198;
                    }

                    @Override // java.lang.annotation.Annotation
                    public final String toString() {
                        return "@kotlinx.serialization.json.JsonClassDiscriminator(discriminator=type)";
                    }
                }}), new d1("UNKNOWN", j.c.INSTANCE, new Annotation[]{new rlm.g() { // from class: as7.k
                    {
                        Intrinsics.checkNotNullParameter("type", "discriminator");
                    }

                    @Override // java.lang.annotation.Annotation
                    public final /* synthetic */ Class annotationType() {
                        return rlm.g.class;
                    }

                    @Override // rlm.g
                    public final /* synthetic */ String discriminator() {
                        return "type";
                    }

                    @Override // java.lang.annotation.Annotation
                    public final boolean equals(Object obj2) {
                        return (obj2 instanceof rlm.g) && "type".equals(((rlm.g) obj2).discriminator());
                    }

                    @Override // java.lang.annotation.Annotation
                    public final int hashCode() {
                        return 705071198;
                    }

                    @Override // java.lang.annotation.Annotation
                    public final String toString() {
                        return "@kotlinx.serialization.json.JsonClassDiscriminator(discriminator=type)";
                    }
                }})}, new Annotation[]{new rlm.g() { // from class: as7.k
                    {
                        Intrinsics.checkNotNullParameter("type", "discriminator");
                    }

                    @Override // java.lang.annotation.Annotation
                    public final /* synthetic */ Class annotationType() {
                        return rlm.g.class;
                    }

                    @Override // rlm.g
                    public final /* synthetic */ String discriminator() {
                        return "type";
                    }

                    @Override // java.lang.annotation.Annotation
                    public final boolean equals(Object obj2) {
                        return (obj2 instanceof rlm.g) && "type".equals(((rlm.g) obj2).discriminator());
                    }

                    @Override // java.lang.annotation.Annotation
                    public final int hashCode() {
                        return 705071198;
                    }

                    @Override // java.lang.annotation.Annotation
                    public final String toString() {
                        return "@kotlinx.serialization.json.JsonClassDiscriminator(discriminator=type)";
                    }
                }});
            case 13:
                return new d1("SHOW_CANCELLATION_PROMPT", j.b.INSTANCE, new Annotation[]{new rlm.g() { // from class: as7.k
                    {
                        Intrinsics.checkNotNullParameter("type", "discriminator");
                    }

                    @Override // java.lang.annotation.Annotation
                    public final /* synthetic */ Class annotationType() {
                        return rlm.g.class;
                    }

                    @Override // rlm.g
                    public final /* synthetic */ String discriminator() {
                        return "type";
                    }

                    @Override // java.lang.annotation.Annotation
                    public final boolean equals(Object obj2) {
                        return (obj2 instanceof rlm.g) && "type".equals(((rlm.g) obj2).discriminator());
                    }

                    @Override // java.lang.annotation.Annotation
                    public final int hashCode() {
                        return 705071198;
                    }

                    @Override // java.lang.annotation.Annotation
                    public final String toString() {
                        return "@kotlinx.serialization.json.JsonClassDiscriminator(discriminator=type)";
                    }
                }});
            case 14:
                return new d1("UNKNOWN", j.c.INSTANCE, new Annotation[]{new rlm.g() { // from class: as7.k
                    {
                        Intrinsics.checkNotNullParameter("type", "discriminator");
                    }

                    @Override // java.lang.annotation.Annotation
                    public final /* synthetic */ Class annotationType() {
                        return rlm.g.class;
                    }

                    @Override // rlm.g
                    public final /* synthetic */ String discriminator() {
                        return "type";
                    }

                    @Override // java.lang.annotation.Annotation
                    public final boolean equals(Object obj2) {
                        return (obj2 instanceof rlm.g) && "type".equals(((rlm.g) obj2).discriminator());
                    }

                    @Override // java.lang.annotation.Annotation
                    public final int hashCode() {
                        return 705071198;
                    }

                    @Override // java.lang.annotation.Annotation
                    public final String toString() {
                        return "@kotlinx.serialization.json.JsonClassDiscriminator(discriminator=type)";
                    }
                }});
            case 15:
                return as7.g.INSTANCE.serializer();
            case 16:
                return new qlm.e(h0.f8843a);
            case 17:
                return new qlm.e(b0.f8825a);
            case 18:
                return new qlm.e(m.INSTANCE.serializer());
            case 19:
                return f0.f322471a;
            case 20:
                return new qlm.e(k0.f9742a);
            case 21:
                return new qlm.e(q0.f9781a);
            case 22:
                return new qlm.e(y.f9799a);
            case 23:
                KProperty[] kPropertyArr = AsftAirportSelectionScreen.R;
                return new RowDelegate(null, null, 7);
            case 24:
                KProperty[] kPropertyArr2 = AsftAirportSelectionScreen.R;
                return new FullScreenStateDelegate();
            case 25:
                KProperty[] kPropertyArr3 = FiltersByTypeScreen.c0;
                return new InputChecklistDelegate();
            case 26:
                KProperty[] kPropertyArr4 = FiltersByTypeScreen.c0;
                return new SelectableDelegate(new RowDelegate(null, null, 7));
            case 27:
                DocumentSelectionController.a aVar9 = DocumentSelectionController.Companion;
                return new InputTextDelegate(null);
            case 28:
                DocumentSelectionController.a aVar10 = DocumentSelectionController.Companion;
                return new SelectableDelegate(new CellDetailsListDelegate());
            default:
                DocumentSelectionController.a aVar11 = DocumentSelectionController.Companion;
                return new FullScreenStateDelegate();
        }
    }
}
